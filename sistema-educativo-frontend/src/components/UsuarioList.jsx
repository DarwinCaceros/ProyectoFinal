import React, { useEffect, useState } from 'react';
import usuarioService from '../services/usuarioService';

const UsuarioList = () => {
  const [usuarios, setUsuarios] = useState([]);

  useEffect(() => {
    const fetchUsuarios = async () => {
      const response = await usuarioService.obtenerUsuarios();
      setUsuarios(response.data);
    };

    fetchUsuarios();
  }, []);

  return (
    <div>
      <h2>Lista de Usuarios</h2>
      <ul>
        {usuarios.map(usuario => (
          <li key={usuario._id}>{usuario.nombre} - {usuario.email}</li>
        ))}
      </ul>
    </div>
  );
};

export default UsuarioList;
