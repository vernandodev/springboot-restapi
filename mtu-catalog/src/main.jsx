import React from 'react';
import ReactDOM from 'react-dom/client';
import { createBrowserRouter, RouterProvider, Route } from 'react-router-dom';
import Category from './routes/Category';
import Product from './routes/Product';
import Home from './routes/Home';
import Supplier from './routes/Supplier';
import './css/App.css';

// import Navbar from './components/Navbar';

// const AppLayout = () => (
//   <>
//     <Navbar />
//     <Outlet />
//   </>
// );

// const router = createBrowserRouter([
//   {
//     element: <AppLayout />,
//     children: [
//       {
//         path: '/',
//         element: <Home />,
//       },
//       {
//         path: '/product',
//         element: <Product />,
//       },
//       {
//         path: '/category',
//         element: <Category />,
//       },
//       {
//         path: '/supplier',
//         element: <Supplier />,
//       },
//     ],
//   },
// ]);

const router = createBrowserRouter([
  {
    path: '/',
    element: <Home />,
  },
  {
    path: '/product',
    element: <Product />,
  },
  {
    path: '/category',
    element: <Category />,
  },
  {
    path: '/supplier',
    element: <Supplier />,
  },
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
