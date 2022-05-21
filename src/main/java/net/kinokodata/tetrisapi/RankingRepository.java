package net.kinokodata.tetrisapi;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface RankingRepository extends CrudRepository<Ranking, Integer> {
    List<Ranking> findFirst10ByOrderByScoreDescIdDesc();
}
