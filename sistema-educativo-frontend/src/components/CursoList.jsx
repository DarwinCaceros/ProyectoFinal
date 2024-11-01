import React, { useEffect, useState } from 'react';
import cursoService from '../services/cursoService';

function CursoList() {
  const [cursos, setCursos] = useState([]);

  useEffect(() => {
    cursoService.obtenerCursos()
      .then(response => setCursos(response.data))
      .catch(error => console.error(error));
  }, []);

  return (
    <div>
      <h3>Lista de Cursos</h3>
      <ul>
        {cursos.map(curso => (
          <li key={curso.id}>{curso.nombre} - {curso.codigo}</li>
        ))}
      </ul>
    </div>
  );
}

export default CursoList;