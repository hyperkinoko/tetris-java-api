package net.kinokodata.tetrisapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ranking")
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int score;
    private String name;
    
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }
}
