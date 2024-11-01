
import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import UsuarioForm from './components/UsuarioForm';
import UsuarioList from './components/UsuarioList';
import EstudianteForm from './components/EstudianteForm';
import EstudianteList from './components/EstudianteList';
import CursoForm from './components/CursoForm';
import CursoList from './components/CursoList';
import TramiteForm from './components/TramiteForm';
import TramiteList from './components/TramiteList';
import PagoForm from './components/PagoForm';
import PagoList from './components/PagoList';
import './App.css'; 

const App = () => {
  return (
    <Router>
      <div>
        <h1>Sistema De Gestion Educativo</h1>
        <h2>Bienvenido</h2>
        <h3>Elija una opcion para continuar</h3>
        <nav>
          <ul>
            <li>
              <Link to="/usuarios">Listado de Usuarios</Link>
            </li>
            <li>
              <Link to="/usuarios/nuevo">Usuario Nuevo</Link>
            </li>
            <li>
              <Link to="/estudiantes">Listado de Estudiantes</Link>
            </li>
            <li>
              <Link to="/estudiantes/nuevo">Estudiante Nuevo</Link>
            </li>
            <li>
              <Link to="/cursos">Gestiones Para Cursos</Link>
            </li>
            <li>
              <Link to="/cursos/nuevo">Curso Nuevo</Link>
            </li>
            <li>
              <Link to="/tramites">Tramites</Link>
            </li>
            <li>
              <Link to="/tramites/nuevo">Tramites Nuevos</Link>
            </li>
            <li>
              <Link to="/pagos">Historial De Pagos</Link>
            </li>
            <li>
              <Link to="/pagos/nuevo">Pago Nuevo</Link>
            </li>
          </ul>
        </nav>
        <Routes>
          <Route path="/usuarios" element={<UsuarioList />} />
          <Route path="/usuarios/nuevo" element={<UsuarioForm />} />
          <Route path="/estudiantes" element={<EstudianteList />} />
          <Route path="/estudiantes/nuevo" element={<EstudianteForm />} />
          <Route path="/cursos" element={<CursoList />} />
          <Route path="/cursos/nuevo" element={<CursoForm />} />
          <Route path="/tramites" element={<TramiteList />} />
          <Route path="/tramites/nuevo" element={<TramiteForm />} />
          <Route path="/pagos" element={<PagoList />} />
          <Route path="/pagos/nuevo" element={<PagoForm />} />
        </Routes>
      </div>
    </Router>
  );
};

export default App;
