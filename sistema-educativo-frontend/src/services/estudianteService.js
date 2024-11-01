import axios from 'axios';

const API_URL = 'http://localhost:8080/api/estudiantes';

const estudianteService = {
    obtenerEstudiantes: ()  => axios.get(API_URL),
    obtenerEstudiantesPorId: (id) => axios.get(`${API_URL}/${id}`),
    crearEstudiante: (estudiante) => axios.post(API_URL, estudiante),
     actualizarEstudiante: (id, estudiante) => axios.put(`${API_URL}/${id}`, estudiante),
    eliminarEstudiante: (id) => axios.delete(`${API_URL}/${id}`)
};

export default estudianteService;