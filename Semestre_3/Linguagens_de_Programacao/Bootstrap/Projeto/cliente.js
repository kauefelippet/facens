const link = 'https://67d0b74b825945773eb1b9fe.mockapi.io/cliente';
const clientes = [];
let clienteEditandoId = null;

function loading(status) {
    let divTable = document.getElementById('tabela-clientes-container');
    let divLoading = document.getElementById('loading');
    if (status) {
        divTable.style.visibility = 'hidden';
        divLoading.style.visibility = 'visible';
    } else {
        divTable.style.visibility = 'visible';
        divLoading.style.visibility = 'hidden';
    }
}

function renderizarTabela(lista) {
    const tabela = document.getElementById('tabela-clientes');
    tabela.innerHTML = `
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>E-mail</th>
                            <th>Telefone</th>
                            <th>Ações</th>
                        </tr>
                    </thead>
                    <tbody>
                        ${lista.length > 0 ? lista.map(cliente => `
                            <tr>
                                <td>${cliente.id}</td>
                                <td>${cliente.nome}</td>
                                <td>${cliente.email}</td>
                                <td>${cliente.telefone}</td>
                                <td class="text-center">
                                    <button class="btn btn-sm btn-warning" onclick="editarCliente(${cliente.id})">Editar</button>
                                    <button class="btn btn-sm btn-danger" onclick="deletarCliente(${cliente.id})">Deletar</button>
                                </td>
                            </tr>
                        `).join('') : `
                            <tr>
                                <td colspan="5" class="text-center">Nenhum cliente cadastrado.</td>
                            </tr>
                        `}
                    </tbody>
                `;
}

function carregarClientes() {
    loading(true);
    fetch(link)
        .then(response => response.json())
        .then(data => {
            clientes.push(...data);
            renderizarTabela(clientes);
        })
        .catch(error => console.error('Erro ao carregar clientes:', error))
        .finally(() => loading(false));
}

function editarCliente(id) {
    id = Number(id);
    const cliente = clientes.find(c => Number(c.id) === id);

    if (cliente) {
        clienteEditandoId = cliente.id;
        document.getElementById('nome').value = cliente.nome;
        document.getElementById('email').value = cliente.email;
        document.getElementById('telefone').value = cliente.telefone;
        const modal = new bootstrap.Modal(document.getElementById('modal-cliente'));
        document.getElementById('modalClienteLabel').textContent = 'Editar Cliente';
        modal.show();
    }
}

function novoCliente() {
    clienteEditandoId = null;
    document.getElementById('form-cliente').reset();
    document.getElementById('modalClienteLabel').textContent = 'Cadastro de Cliente';
}

function deletarCliente(id) {
    if (confirm('Você realmente deseja deletar este cliente?')) {
        const index = clientes.findIndex(c => String(c.id) === String(id));

        if (index !== -1) {
            clientes.splice(index, 1);
            renderizarTabela(clientes);
            fetch(`${link}/${id}`, {
                method: 'DELETE'
            })
                .then(response => response.json())
                .then(() => appendAlert('Cliente deletado com sucesso!', 'success'))
                .catch(error => console.error('Erro ao deletar cliente:', error));
        }
    }
}

function salvarCliente() {
    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const telefone = document.getElementById('telefone').value;
    const clienteData = { nome, email, telefone };

    if (clienteEditandoId) {
        // Atualizar cliente (PUT)
        fetch(`${link}/${clienteEditandoId}`, {
            method: 'PUT',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(clienteData)
        })
            .then(response => response.json())
            .then(clienteAtualizado => {
                // Atualiza o cliente no array local
                const idx = clientes.findIndex(c => String(c.id) === String(clienteEditandoId));
                if (idx !== -1) clientes[idx] = clienteAtualizado;
                renderizarTabela(clientes);
                document.getElementById('form-cliente').reset();
                clienteEditandoId = null;
                bootstrap.Modal.getInstance(document.getElementById('modal-cliente')).hide();
            })
            .then(() => appendAlert('Cliente atualizado com sucesso!', 'success'))
            .catch(error => console.error('Erro ao atualizar cliente:', error));
    } else {
        // Criar novo cliente (POST)
        fetch(link, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(clienteData)
        })
            .then(response => response.json())
            .then(cliente => {
                clientes.push(cliente);
                renderizarTabela(clientes);
                document.getElementById('form-cliente').reset();
                bootstrap.Modal.getInstance(document.getElementById('modal-cliente')).hide();
            })
            .then(() => appendAlert('Cliente adicionado com sucesso!', 'success'))
            .catch(error => console.error('Erro ao adicionar cliente:', error));
    }
}

function buscarCliente() {
    const nome = document.getElementById('nome-busca').value.toLowerCase();
    const resultados = clientes.filter(cliente => cliente.nome.toLowerCase().includes(nome));
    renderizarTabela(resultados);
}

const alertPlaceholder = document.getElementById('messages')
const appendAlert = (message, type) => {
    const wrapper = document.createElement('div')
    wrapper.innerHTML = [
        `<div class="alert alert-${type} alert-dismissible" role="alert">`,
        `   <div>${message}</div>`,
        '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
        '</div>'
    ].join('')

    alertPlaceholder.append(wrapper)
}

