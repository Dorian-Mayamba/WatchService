package uk.movie.WatchService.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uk.movie.WatchService.entities.Watch;
import uk.movie.WatchService.repositories.WatchRepository;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WatchService {
    private final WatchRepository repository;

    public List<Watch> findByMovieId(Long movieId){
        return repository.findWatchesByMovieId(movieId);
    }
    public List<Watch> findByUserId(Long userId) {
        return repository.findWatchesByUserId(userId);
    }
    public void addOrRemoveWatch(Long movieId, Long userId) {
        repository.findByMovieIdAndUserId(movieId,userId)
                .ifPresentOrElse(watch -> {
                    repository.delete(watch);
                    //Send kafka message
                }, ()->{
                    Watch newWatch = Watch.builder()
                            .userId(userId)
                            .movieId(movieId)
                            .createdAt(Timestamp.from(Instant.now()))
                            .build();
                    repository.save(newWatch);
                    //Send kafka message
                });
    }
}
