package net.kinokodata.tetrisapi;

public class ScorePostRequest {
    private final int score;
    private final String name;
    
    
    public ScorePostRequest(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    
    public String getName() {
        return name;
    }    
}
