package dev.sharad.movies.repository;

import dev.sharad.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    /**
     * Finds movie using ImdbId
     *
     * @param imdbId Pass the imdbId
     * @return movie data if present else null
     */
    // Framework is smart enough to generate function definition based on function name.
    Optional<Movie> findMovieByImdbId(String imdbId);
}
