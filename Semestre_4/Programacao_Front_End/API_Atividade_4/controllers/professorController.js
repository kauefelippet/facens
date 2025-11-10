let professores = [
    {
        "id": "1",
        "nome": "Prof. Carlos",
        "idade": 40,
        "departamento": "Matemática",
        "turmas": [
            { "codigo": "9A", "disciplina": "MAT101", "alunos": ["João", "Maria", "Pedro"] },
            { "codigo": "10A", "disciplina": "MAT201", "alunos": ["Ana", "Luiz"] }
        ]
    },
    {
        "id": "2",
        "nome": "Prof. Ana",
        "idade": 35,
        "departamento": "História",
        "turmas": [
            { "codigo": "9A", "disciplina": "HIS101", "alunos": ["João", "Pedro"] },
            { "codigo": "10B", "disciplina": "HIS201", "alunos": ["Maria", "Carlos", "Luiza"] }
        ]
    },
    {
        "id": "3",
        "nome": "Prof. João",
        "idade": 50,
        "departamento": "Ciências",
        "turmas": [
            { "codigo": "9A", "disciplina": "CIE101", "alunos": ["João", "Maria"] },
            { "codigo": "9B", "disciplina": "CIE101", "alunos": ["Pedro", "Luiz"] }
        ]
    }
];

exports.getAllProfessores = (req, res) => {
    res.json(professores);
};

exports.getProfessorById = (req, res) => {
    const { id } = req.params;
    const professor = professores.find(prof => prof.id === id);
    if (professor) {
        res.json(professor);
    } else {
        res.status(404).json({ message: "Professor não encontrado" });
    }
};

exports.getTurmasByProfessorId = (req, res) => {
    const { id } = req.params;
    const professor = professores.find(prof => prof.id === id);
    if (professor) {
        res.json(professor.turmas);
    } else {
        res.status(404).json({ message: "Professor não encontrado" });
    }
};

exports.updateProfessor = (req, res) => {
    const { id } = req.params;
    const { nome, idade, departamento } = req.body;
    const professorIndex = professores.findIndex(prof => prof.id === id);
    if (professorIndex !== -1) {
        professores[professorIndex] = { ...professores[professorIndex], nome, idade, departamento };
        res.json({ message: "Professor atualizado com sucesso", professor: professores[professorIndex] });
    } else {
        res.status(404).json({ message: "Professor não encontrado" });
    }
};

exports.addTurmaToProfessor = (req, res) => {
    const { id } = req.params;
    const { codigo, disciplina, alunos } = req.body;
    const professor = professores.find(prof => prof.id === id);
    if (professor) {
        const newTurma = { codigo, disciplina, alunos };
        professor.turmas.push(newTurma);
        res.status(201).json({ message: "Turma adicionada com sucesso", turma: newTurma });
    } else {
        res.status(404).json({ message: "Professor não encontrado" });
    }
};

exports.getProfessoresByDepartamento = (req, res) => {
    const { departamento } = req.params;
    const filteredProfessores = professores.filter(prof => prof.departamento.toLowerCase() === departamento.toLowerCase());
    res.json(filteredProfessores);
};

exports.deleteProfessor = (req, res) => {
    const { id } = req.params;
    const professorIndex = professores.findIndex(prof => prof.id === id);
    if (professorIndex !== -1) {
        professores.splice(professorIndex, 1);
        res.json({ message: "Professor deletado com sucesso" });
    } else {
        res.status(404).json({ message: "Professor não encontrado" });
    }
};
