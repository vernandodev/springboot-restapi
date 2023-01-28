import React from 'react';
import * as FaIcons from 'react-icons/fa';
import * as AiIcons from 'react-icons/ai';
import * as IoIcons from 'react-icons/io';

export const SidebarData = [
  {
    title: 'Home',
    path: '/',
    icons: <AiIcons.AiFillHome />,
    cName: 'nav-text',
  },
  {
    title: 'Product',
    path: '/product',
    icons: <IoIcons.IoIosPaper />,
    cName: 'nav-text',
  },
  {
    title: 'Category',
    path: '/category',
    icons: <FaIcons.FaCartPlus />,
    cName: 'nav-text',
  },
  {
    title: 'Supplier',
    path: '/supplier',
    icons: <IoIcons.IoIosPeople />,
    cName: 'nav-text',
  },
];
