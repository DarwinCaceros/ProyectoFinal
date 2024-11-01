import React, {useState} from "react";
import pagoService from '../services/pagoService';


function PagoForm(){
    const [monto, setMonto] = useState('');
    const [metodo, setMetodo] = useState('');

    const handleSubmit = async (e) => {
        e.preventDefault();
        try{
            await pagoService.crearPago({monto, metodo});
            alert('Su pago fue realizado con exito, gracias');

        }catch(error){
            console.error(error);
        }
    
};

                return (
                    <form onSubmit={handleSubmit}>
                        <h3>Registrar un Pago</h3>
                        <input
                            type="number"
                            placeholder="Monto"
                            value={monto}
                            onChange={(e) => setMonto(e.target.value)}
                            required
                            />
                        <input  
                            type="text"
                            placeholder="Metodo de pago"
                            value={metodo}
                            onChange={(e) => setMetodo(e.target.value)}
                            required
                            />

                                <button type="submit">Guardar</button>
                    </form>
                );
            }

                    export default PagoForm;