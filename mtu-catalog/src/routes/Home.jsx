import React from 'react';
import { Link } from 'react-router-dom';

function Home() {
  return (
    <div className="home">
      <h1>Home</h1>
      <Link to="/product">Products</Link>
      <Link to="/category">Category</Link>
      <Link to="/supplier">Supplier</Link>
    </div>
  );
}

export default Home;
