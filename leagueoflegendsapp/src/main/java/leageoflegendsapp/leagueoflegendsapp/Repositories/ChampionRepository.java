package leageoflegendsapp.leagueoflegendsapp.Repositories;

import org.springframework.data.repository.CrudRepository;

import leageoflegendsapp.leagueoflegendsapp.Models.Champion;

public interface ChampionRepository extends CrudRepository<Champion, Long>{
    Champion findById(long id);
    Champion findByName(String name);
}
