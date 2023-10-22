package me.dio.controller;

import me.dio.domain.model.Gamer;
import me.dio.domain.service.GamerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/gamers")
public class GamerController {

    private final GamerService gamerService;

    public GamerController(GamerService gamerService){
        this.gamerService = gamerService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Gamer> findById(@PathVariable(value = "id") Long id){
        var gamer = gamerService.findById(id);
        return ResponseEntity.ok(gamer);
    }

    @PostMapping
    public ResponseEntity<Gamer> create(@RequestBody Gamer gamerToCreate){
        var gamerCreated = gamerService.create(gamerToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(gamerCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(gamerCreated);
    }
}
