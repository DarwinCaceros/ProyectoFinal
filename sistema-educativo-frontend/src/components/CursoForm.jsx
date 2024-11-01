import React, { useState } from 'react';
import cursoService from '../services/cursoService';

function CursoForm() {
  const [nombre, setNombre] = useState('');
  const [codigo, setCodigo] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await cursoService.crearCurso({ nombre, codigo });
      alert('Curso creado exitosamente');
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h3>Crear Curso</h3>
      <input 
        type="text" 
        placeholder="Nombre del Curso" 
        value={nombre} 
        onChange={(e) => setNombre(e.target.value)} 
        required
      />
      <input 
        type="text" 
        placeholder="Código del Curso" 
        value={codigo} 
        onChange={(e) => setCodigo(e.target.value)} 
        required
      />
      <button type="submit">Guardar</button>
    </form>
  );
}

export default CursoForm;