const express = require('express');
const app = express();
const PORT = 8081;

app.use(express.json());

const professorRoutes = require('./routes/professor');
app.use('/api', professorRoutes);

app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});
