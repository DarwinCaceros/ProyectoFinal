import React, {useEffect, useState} from 'react';
import estudianteService from '../services/estudianteService';

function EstudianteList(){
    const [estudiantes, setEstudiantes]= useState([]);

    useEffect(() => {
        estudianteService.obtenerEstudiantes()
        .then(response => setEstudiantes(response.data))
        .catch(error => console.error(error));

    }, []);

    return(
        <div>
            <h3>Lista de Estudiantes</h3>
            <ul>
                {estudiantes.map(estudiante => (
                    <li key={estudiante.id}>{estudiante.nombre} - {estudiante.carrera}</li>

                ))}
            </ul>
        </div>
    );
}

export default EstudianteList;