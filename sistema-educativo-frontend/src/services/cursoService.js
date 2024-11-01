import axios from 'axios';

const API_URL = 'http://localhost:8080/api/cursos';

const cursoService = {
        obtenerCursos: () => axios.get(API_URL),
        obtenerCursoPorId: (id) => axios.get(`${API_URL}/${id}`),
        crearCurso: (curso) => axios.post(API_URL, curso),
        actualizarCurso: (id, curso) => axios.put(`${API_URL}/${id}`, curso),
        eliminarCurso: (id) => axios.delete(`${API_URL}/${id}`)
};

export default cursoService;