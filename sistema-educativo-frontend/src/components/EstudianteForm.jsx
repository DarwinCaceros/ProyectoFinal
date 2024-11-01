import React, {useState} from 'react';
import estudianteService from '../services/estudianteService';

    function EstudianteForm(){
        const [nombre, setNombre] = useState('');
        const [carrera, setCarrera] = useState('');

        const handleSubmit = async (e) => {
            e.preventDefault();
            try{
                await estudianteService.crearEstudiante({ nombre, carrera});
                alert('Estudiante fue creado con exito');

            }catch (error){
                console.error(error);
            }
        };

            return (
                <form onSubmit={handleSubmit}>
                    <h3> Crear Estudiante Nuevo</h3>
                    <input
                        type = "text"
                        placeholder='Nombre'
                        value={nombre}
                        onChange={(e) => setNombre(e.target.value)}
                        required
                />
                <input
                    type='text'
                    placeholder='Carrera'
                    value={carrera}
                    onChange={(e) => setCarrera(e.target.value)}
                    required
                    />
                        <button type = "submit">Guardar</button>
                </form>
            );
    }

        export default EstudianteForm;