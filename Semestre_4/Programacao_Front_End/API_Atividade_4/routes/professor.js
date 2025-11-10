const express = require('express');
const router = express.Router();
const professorController = require('../controllers/professorController');

router.get('/professores', professorController.getAllProfessores);
router.get('/professores/:id', professorController.getProfessorById);
router.get('/professores/:id/turmas', professorController.getTurmasByProfessorId);
router.put('/professores/:id', professorController.updateProfessor);
router.post('/professores/:id/turmas', professorController.addTurmaToProfessor);
router.get('/professores/departamento/:departamento', professorController.getProfessoresByDepartamento);
router.delete('/professores/:id', professorController.deleteProfessor);

module.exports = router;

