import React from 'react';
import { Link } from 'react-router-dom';

export const LoginComponent = () => {
  return (
    <div className="relative h-screen text-white">
      {/* Background image */}
      <div
        className="absolute inset-0 bg-cover bg-center"
        style={{ backgroundImage: 'url(now.jpg)' }}
      ></div>
      
      {/* Overlay */}
      <div className="absolute inset-0 bg-black opacity-50"></div>

      {/* Login card */}
      <div className="absolute top-1/2 left-1/2 transform -translate-x-1/2 -translate-y-1/2 bg-gray-500 bg-opacity-75 shadow-md rounded px-10 py-8 w-96 ">
        <h2 className="text-2xl font-bold mb-6 text-center">Login</h2>
        <div className="mb-2">
          <label className="block  text-sm font-bold mb-2" htmlFor="username">
            Username
          </label>
          <input
            className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
            id="username"
            type="text"
            placeholder="Enter ID as username"
          />
        </div>
        <div className="mb-2">
          <label className="block  text-sm font-bold mb-2" htmlFor="password">
            Password
          </label>
          <input
            className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
            id="password"
            type="password"
            placeholder="Password"
          />
        </div>
        <Link to='/reset_password'><p className='underline text-xs cursor-pointer'>Forgot password</p></Link>
        <div className="flex items-center justify-center">
          <Link to='/admin/home'>
            <button
              className="bg-green-900 hover:bg-green-700 text-white font-bold py-2 px-4 rounded-full focus:outline-none focus:shadow-outline"
              type="button"
            >
              Sign In
            </button>
          </Link>
        </div>
      </div>
    </div>
  );
};
