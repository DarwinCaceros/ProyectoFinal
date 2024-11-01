import React, { useEffect, useState } from 'react';
import pagoService from '../services/pagoService';

const PagoList = () => {
  const [pagos, setPagos] = useState([]);

  const fetchPagos = async () => {
    const response = await pagoService.getPagos();
    setPagos(response.data);
  };

  useEffect(() => {
    fetchPagos();
  }, []);

  return (
    <div>
      <h2>Lista de Pagos</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Monto</th>
            <th>Fecha</th>
            <th>ID Estudiante</th>
          </tr>
        </thead>
        <tbody>
          {pagos.map((pago) => (
            <tr key={pago._id}>
              <td>{pago._id}</td>
              <td>{pago.monto}</td>
              <td>{new Date(pago.fecha).toLocaleDateString()}</td>
              <td>{pago.estudianteId}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default PagoList;