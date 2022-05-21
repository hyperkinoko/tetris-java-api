package net.kinokodata.tetrisapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RankingController {
    @Autowired
    private RankingRepository rankingRepository;
    
    @GetMapping("/ranking")
    public Iterable<Ranking> doGetScore(@RequestParam("score") int score, @RequestParam String name) {
        Ranking ranking = new Ranking();
        ranking.setScore(score);
        ranking.setName(name);
        rankingRepository.save(ranking);
        return rankingRepository.findFirst10ByOrderByScoreDescIdDesc();
    }
}
