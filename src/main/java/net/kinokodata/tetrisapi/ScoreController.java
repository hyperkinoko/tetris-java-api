package net.kinokodata.tetrisapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {
    @Autowired
    private ScoreRepository scoreRepository;
    
    @GetMapping("/scores")
    public Iterable<Score> doGetScore(@RequestParam("score") int scoreValue, @RequestParam String name) {
        Score score = new Score();
        score.setScore(scoreValue);
        score.setName(name);
        scoreRepository.save(score);
        return scoreRepository.findFirst10ByOrderByScoreDesc();
    }

    @PostMapping("/scores")
    public Score doPostScore(@RequestBody ScorePostRequest requestBody) {
        Score score = new Score();
        score.setScore(requestBody.getScore());
        score.setName(requestBody.getName());
        scoreRepository.save(score);
        return score;
    }
}
