package uk.movie.WatchService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.movie.WatchService.entities.Watch;

import java.util.List;
import java.util.Optional;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Long> {
    List<Watch> findWatchesByMovieId(Long movieId);

    List<Watch> findWatchesByUserId(Long userId);

    Optional<Watch> findByMovieIdAndUserId(Long movieId, Long userId);
}
