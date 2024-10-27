package uk.movie.WatchService.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Table(name = "watches")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Watch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "created_at")
    private Timestamp createdAt;
}
