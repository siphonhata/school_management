import React from 'react'
import { Link } from 'react-router-dom'

export const LoginComponent = () => {
  return (
    <div className="flex justify-center items-center h-screen">
    <div className="bg-gray-100 shadow-md rounded px-10 py-8 mb-4 w-96">
      <h2 className="text-2xl font-bold mb-6 text-center">Login</h2>
      <div className="mb-2">
        <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="username">
          Username
        </label>
        <input
          className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight"
          id="username"
          type="text"
          placeholder="Enter ID as username"
        />
      </div>
      <div className="mb-2">
        <label className="block text-gray-700 text-sm font-bold mb-2" htmlFor="password">
          Password
        </label>
        <input
          className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
          id="password"
          type="password"
          placeholder="Password"
        />
      </div>
      <Link to={'/reset_password'}><p className='underline text-xs cursor-pointer'>Forgot password</p></Link>
      <div className="flex items-center justify-center">
       <Link to={'/admin/home'} ><button
          className="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded-full focus:outline-none focus:shadow-outline"
          type="button"
        >
          Sign In
        </button></Link>
      </div>
    </div>
  </div>
  )
}
