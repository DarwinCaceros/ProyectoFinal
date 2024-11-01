import axios from 'axios';

const API_URL = 'http://localhost:8080/api/usuarios';

const usuarioService = {
    obtenerUsuarios: () => axios.get(API_URL),
    obtenerUsuariosPorId: (id) => axios.get(`${API_URL}/${id}`),
    crearUsuario: (usuario) => axios.post(API_URL, usuario),
    actualizarUsuario: (id, usuario) => axios.put(`${API_URL}/${id}`, usuario),
  eliminarUsuario: (id) => axios.delete(`${API_URL}/${id}`)
};

export default usuarioService;
