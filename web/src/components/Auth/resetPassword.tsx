import React from 'react';
import { Link } from 'react-router-dom';

export const ResetPasswordCard = () => {
  return (
    <div className="flex justify-center items-center h-screen bg-green-700 text-white">
      <div className="opacity-90 shadow-md rounded px-10 py-8 mb-4 w-96">
        <h2 className="text-2xl font-bold mb-6 text-center">Reset Password</h2>
        <div className="mb-2">
          <label className="block  text-sm font-bold mb-2" htmlFor="newPassword">
            New Password
          </label>
          <input
            className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight"
            id="newPassword"
            type="password"
            placeholder="Enter your new password"
          />
        </div>
        <div className="mb-2">
          <label className="block  text-sm font-bold mb-2" htmlFor="confirmPassword">
            Confirm Password
          </label>
          <input
            className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight"
            id="confirmPassword"
            type="password"
            placeholder="Confirm your new password"
          />
        </div>
      <Link to={'/'}><p className='underline text-xs cursor-pointer'>Back to Login</p></Link>
        <div className="flex items-center justify-center mt-4">
          <button
            className="bg-green-900 hover:bg-green-800 text-white font-bold py-2 px-4 rounded-full focus:outline-none focus:shadow-outline"
            type="button"
          >
            Reset Password
          </button>
        </div>
      </div>
    </div>
  );
};
