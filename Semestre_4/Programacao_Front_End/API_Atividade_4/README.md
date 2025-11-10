# Atividade 4: API com Node.js

Desenvolvido por Kauê Felippe Tiburcio - RA 247721 - AS403TSN3

---

A API tem como objetivo centralizar o controle das informações de professores, turmas, disciplinas e alunos em uma escola, permitindo consultas, atualizações e organização de dados de forma eficiente.

#### Principais recursos da API:

**GET** `/professores` → Lista todos os professores e suas informações.

**GET** `/professores/:id` → Retorna os dados de um professor específico.

**GET** `/professores/:id/turmas` → Exibe todas as turmas ministradas por um professor.

**PUT** `/professores/:id` → Atualiza os dados de um professor.

**POST** `/professores/:id/turmas` → Adiciona uma nova turma a um professor.

**GET** `/professores/departamento/:departamento` → Filtra professores por departamento.

**DELETE** `/professores/:id` → Remove um professor do sistema.

## Testes via Postman

Os testes dos endpoints foram executados pela ferramenta Postman.

### Variável de ambiente
Foi utilizada a variável de ambiente `{{api}}`, da qual possui o valor `http://localhost:8081/api`

### Evidências

**GET** `/professores` → Lista todos os professores e suas informações.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/c2e078f3-153a-4a55-891d-1253da8b78a1" />

---

**GET** `/professores/:id` → Retorna os dados de um professor específico.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/e4143cf0-0aac-4efc-8615-089245932f44" />

---

**GET** `/professores/:id/turmas` → Exibe todas as turmas ministradas por um professor.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/e6b721c1-48a9-4bd5-b48e-1c6a80023e61" />

---

**PUT** `/professores/:id` → Atualiza os dados de um professor.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/5dd709d5-5985-44d9-9f72-7ec62d04c79d" />

<img width="1917" height="1079" alt="image" src="https://github.com/user-attachments/assets/472ce5c6-53ff-497e-ad38-dee2b1f85ec8" />

---

**POST** `/professores/:id/turmas` → Adiciona uma nova turma a um professor.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/9a6319ec-5b88-448e-befa-fbbdea7e055a" />

---

**GET** `/professores/departamento/:departamento` → Filtra professores por departamento.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/5b677f0d-3e98-450f-9e46-f893e131529c" />

---

**DELETE** `/professores/:id` → Remove um professor do sistema.

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/586c88ef-fdcc-4a20-99b2-731df7839b7e" />

<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/f4ac0b2f-3e95-4446-b03f-4e7e990450da" />


