package me.dio.domain.model.repository;

import me.dio.domain.model.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepository extends JpaRepository<Gamer, Long> {
    boolean existsByProfileNameTag(String nameTag);
}
