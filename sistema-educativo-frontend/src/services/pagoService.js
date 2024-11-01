import axios from 'axios';

const API_URL = 'http://localhost:8080/api/pagos';

const pagoService = {
    obtenerPagos: () => axios.get(API_URL),
    obtenerPagoPorId: (id) => axios.get(`${API_URL}/${id}`),
    crearPago: (pago) => axios.post(API_URL, pago),
    actualizarPago: (id, pago) => axios.put(`${API_URL}/${id}`, pago),
    eliminarPago: (id) => axios.delete(`${API_URL}/${id}`)
};

export default pagoService;