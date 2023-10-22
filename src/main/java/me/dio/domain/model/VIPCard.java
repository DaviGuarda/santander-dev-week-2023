package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tbl_vipcard")
public class VIPCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cardNumber;
    private Long rewardsPoints;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Long getRewardsPoints() {
        return rewardsPoints;
    }

    public void setRewardsPoints(Long rewardsPoints) {
        this.rewardsPoints = rewardsPoints;
    }
}
