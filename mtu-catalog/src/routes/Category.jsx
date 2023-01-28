import React from 'react';
import { Link } from 'react-router-dom';

function Category() {
  return (
    <div className="home">
      <h1>Category</h1>
      <Link to={'/'}>back</Link>
    </div>
  );
}

export default Category;
