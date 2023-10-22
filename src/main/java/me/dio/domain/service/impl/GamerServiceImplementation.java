package me.dio.domain.service.impl;

import me.dio.domain.model.Gamer;
import me.dio.domain.model.repository.GamerRepository;
import me.dio.domain.service.GamerService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class GamerServiceImplementation implements GamerService {

    private final GamerRepository gamerRepository;

    public GamerServiceImplementation(GamerRepository gamerRepository){
        this.gamerRepository = gamerRepository;
    }

    @Override
    public Gamer findById(Long id) {
        return  gamerRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Gamer create(Gamer gamerToCreate) {
        if (gamerRepository.existsByProfileNameTag(gamerToCreate.getProfile().getNameTag())){
            throw new IllegalArgumentException("This Profile gamer tag already exists.");
        }
        return gamerRepository.save(gamerToCreate);
    }
}
