import axios from 'axios';

const API_URL = 'http://localhost:8080/api/movies'; // Adjust as necessary

export const fetchMovies = async () => {
  const response = await axios.get(API_URL);
  return response.data; // Adjust based on the backend response structure
};

export const fetchMovieDetails = async (id) => {
  const response = await axios.get(`${API_URL}/${id}`);
  return response.data; // Adjust based on the backend response structure
};
