package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tbl_gamer")
public class Gamer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Profile profile;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Powerups> powerups;
    @OneToOne(cascade = CascadeType.ALL)
    private VIPCard vipCard;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<GameNews> gameNews;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Powerups> getPowerups() {
        return powerups;
    }

    public void setPowerups(List<Powerups> powerups) {
        this.powerups = powerups;
    }

    public VIPCard getVipCard() {
        return vipCard;
    }

    public void setVipCard(VIPCard vipCard) {
        this.vipCard = vipCard;
    }

    public List<GameNews> getGameNews() {
        return gameNews;
    }

    public void setGameNews(List<GameNews> gameNews) {
        this.gameNews = gameNews;
    }
}
