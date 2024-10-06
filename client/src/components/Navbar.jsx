import React from 'react';
import { Link } from 'react-router-dom';
import './Navbar.css'; // You can style this component as needed

const Navbar = () => {
  return (
    <nav className="navbar">
      <div className="logo">Netflix Clone</div>
      <ul className="nav-links">
        <li>
          <Link to="/">Home</Link>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;
