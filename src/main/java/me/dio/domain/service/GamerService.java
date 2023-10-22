package me.dio.domain.service;

import me.dio.domain.model.Gamer;

public interface GamerService {
    Gamer findById(Long id);

    Gamer create(Gamer gamerToCreate);
}
