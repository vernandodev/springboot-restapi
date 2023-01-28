import React from 'react';
import { Link } from 'react-router-dom';

function Product() {
  return (
    <div className="home">
      <h1>Product</h1>
      <Link to={'/'}>back</Link>
    </div>
  );
}

export default Product;
