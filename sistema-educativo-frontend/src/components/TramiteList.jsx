import React, { useEffect, useState } from 'react';
import tramiteService from '../services/tramiteService';

function TramiteList() {
  const [tramites, setTramites] = useState([]);

  useEffect(() => {
    tramiteService.obtenerTramites()
      .then(response => setTramites(response.data))
      .catch(error => console.error(error));
  }, []);

  return (
    <div>
      <h3>Lista de Trámites</h3>
      <ul>
        {tramites.map(tramite => (
          <li key={tramite.id}>{tramite.descripcion} - {tramite.estatus}</li>
        ))}
      </ul>
    </div>
  );
}

export default TramiteList;