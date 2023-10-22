package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity(name = "tbl_profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nameTag;
    private String level;

    @Column(scale = 10, precision = 2)
    private BigDecimal expPoints;
    private Long gameCredits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTag() {
        return nameTag;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public BigDecimal getExpPoints() {
        return expPoints;
    }

    public void setExpPoints(BigDecimal expPoints) {
        this.expPoints = expPoints;
    }

    public Long getGameCredits() {
        return gameCredits;
    }

    public void setGameCredits(Long gameCredits) {
        this.gameCredits = gameCredits;
    }
}
