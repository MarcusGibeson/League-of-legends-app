package leageoflegendsapp.leagueoflegendsapp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import leageoflegendsapp.leagueoflegendsapp.Models.Champion;
import leageoflegendsapp.leagueoflegendsapp.Repositories.ChampionRepository;

@Service
public class ChampionService {
    
    private final ChampionRepository championRepository;

    public ChampionService(ChampionRepository championRepository) {
        this.championRepository = championRepository;
    }

    public Champion save(Champion champion) {
        return championRepository.save(champion);
    }

    public Iterable<Champion> retrieveAllChampions() {
        return championRepository.findAll();
    }

    public Champion retrieveChampionById(long id) throws Exception {
        try {
            return championRepository.findById(id);
        } catch (Exception e) {
            throw new Exception("Champion could not be found");
        }
    }

    public Champion retrieveChampionByName(String name) throws Exception{
        try {
            Champion champion = championRepository.findByName(name);
            return champion;
        } catch (Exception e) {
            throw new Exception ("Champion could not be found by that name");
        }
    }
}
