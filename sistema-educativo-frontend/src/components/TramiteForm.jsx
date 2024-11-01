import React, { useState } from 'react';
import tramiteService from '../services/tramiteService';

function TramiteForm() {
  const [descripcion, setDescripcion] = useState('');
  const [estatus, setEstatus] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await tramiteService.crearTramite({ descripcion, estatus });
      alert('Trámite creado exitosamente');
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h3>Crear Trámite</h3>
      <input 
        type="text" 
        placeholder="Descripción" 
        value={descripcion} 
        onChange={(e) => setDescripcion(e.target.value)} 
        required
      />
      <input 
        type="text" 
        placeholder="Estatus" 
        value={estatus} 
        onChange={(e) => setEstatus(e.target.value)} 
        required
      />
      <button type="submit">Guardar</button>
    </form>
  );
}

export default TramiteForm;