package net.kinokodata.tetrisapi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ScoreRepository extends CrudRepository<Score, Integer> {
    List<Score> findFirst10ByOrderByScoreDesc();
}
