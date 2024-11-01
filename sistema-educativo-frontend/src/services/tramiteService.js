import axios from 'axios';

const API_URL = 'http://localhost:8080/api/tramites';

const tramiteService = {
    obtenerTramites: ()  => axios.get(API_URL),
    obtenerTramitePorId: (id) => axios.get(`${API_URL}/${id}`),
    creatTramite: (tramite) => axios.post(API_URL, tramite),
    actualizarTramite: (id, tramite) => axios.put(`${API_URL}/${id}`, tramite),
    eliminarTramite: (id) => axios.delete(`${API_URL}/${id}`)
};

export default tramiteService;