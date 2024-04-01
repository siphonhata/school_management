import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { AdminModule, LoginComponent, ResetPasswordCard, StudentModule } from './components';

function App() {
  return (
    <Router>
      <Routes>
        <Route  path="/" element={<LoginComponent />} />
        <Route path="/reset_password" element={<ResetPasswordCard />} />
        <Route path="/admin/home" element={<AdminModule />} />
        <Route path="/student/home" element={<StudentModule />} />
        </Routes>
    </Router>
  );
}

export default App;
