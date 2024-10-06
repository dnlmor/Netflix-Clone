import React, { useEffect, useState } from 'react';
import MovieCard from '../components/MovieCard';
import Loader from '../components/Loader';
import { fetchMovies } from '../api'; // Make sure to import the fetch function

const Home = () => {
  const [movies, setMovies] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadMovies = async () => {
      try {
        const data = await fetchMovies();
        setMovies(data);
      } catch (error) {
        console.error("Error fetching movies:", error);
      } finally {
        setLoading(false);
      }
    };

    loadMovies();
  }, []);

  if (loading) {
    return <Loader />;
  }

  return (
    <div className="home">
      <h1>Trending Movies</h1>
      <div className="movie-list">
        {movies.map(movie => (
          <MovieCard
            key={movie.id}
            movie={movie}
            onClick={() => window.location.href = `/movies/${movie.id}`} // Navigate to movie details
          />
        ))}
      </div>
    </div>
  );
};

export default Home;
