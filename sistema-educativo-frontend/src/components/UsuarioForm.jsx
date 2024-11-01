import React, { useState} from 'react';
import usuarioService from '../services/usuarioService';

function UsuarioForm(){
    const [nombre, setNombre] = useState('');
    const [rol, setRol] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();
        try{
            await usuarioService.crearUsuario({nombre, rol});
            alert('Usuaro a sido creado con exito');
        } catch (error){
            console.error(error);
        }
    };

            return (
                <form onSubmit={handleSubmit}>
                    <h3>Crear un usuario</h3>
                    <input
                        type="text"
                        placeholder="Nombre"
                        value={nombre}
                        onChange={(e) => setNombre(e.target.value)}
                        required
                        />
                        <input
                        type="text"
                        placeholder="Rol"
                        value={rol}
                        onChange={(e) => setRol(e.target.value)}
                        required
                        />
                        <button type = "submit">Guarda Datos</button>
                </form>
            );
}

export default UsuarioForm;