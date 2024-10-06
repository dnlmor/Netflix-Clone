import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import { fetchMovieDetails } from '../api'; // Adjust the function accordingly
import Loader from '../components/Loader';
import './MovieDetails.css'; // Create a CSS file for styling

const MovieDetails = () => {
  const { id } = useParams();
  const [movie, setMovie] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadMovie = async () => {
      try {
        const data = await fetchMovieDetails(id);
        setMovie(data);
      } catch (error) {
        console.error("Error fetching movie details:", error);
      } finally {
        setLoading(false);
      }
    };

    loadMovie();
  }, [id]);

  if (loading) {
    return <Loader />;
  }

  return (
    <div className="movie-details">
      <h1>{movie.title}</h1>
      <img src={movie.poster} alt={movie.title} />
      <p>{movie.description}</p>
    </div>
  );
};

export default MovieDetails;
