import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import { LoginComponent, ResetPasswordCard } from './components';

function App() {
  return (
    <Router>
      <Routes>
        <Route  path="/" element={<LoginComponent />} />
        <Route path="/reset_password" element={<ResetPasswordCard />} />
        </Routes>
    </Router>
  );
}

export default App;
