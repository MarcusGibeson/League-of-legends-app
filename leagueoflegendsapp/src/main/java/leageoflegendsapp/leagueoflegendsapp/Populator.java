package leageoflegendsapp.leagueoflegendsapp;

import org.springframework.stereotype.Component;

import leageoflegendsapp.leagueoflegendsapp.Models.Champion;
import leageoflegendsapp.leagueoflegendsapp.Services.ChampionService;

@Component
public class Populator {
    
    private final ChampionService championService;

    public Populator(ChampionService championService){
        this.championService = championService;
    }

    @Override
    public void run(String... args) throws Exception {

        //Champion List
        Champion Aatrox = new Champion("Aatrox","the Darkin Blade", 
        "Deathbringer Stance",
        "INNATE: Periodically, Aatrox empowers his next basic attack to gain Range icon 50 bonus range and deal bonus magic damage equal to 4% to 12% (based on level) of the target's maximum health, capped at 100 against Monster icon monsters. Aatrox Heal power icon heals for 80% of the post-mitigation bonus damage dealt, reduced to 25% against Minion icon minions. Whenever Aatrox hits at least one enemy Champion icon champion or large Monster icon monster with a basic attack On-hit icon on-hit or an ability, the Cooldown icon cooldown of Deathbringer Stance is reduced by 2 seconds, modified to 4 if he hits with the Sweetspot of The Darkin Blade The Darkin Blade.",
        "The Darkin Blade",
        "Aatrox can activate The Darkin Blade three times before the ability goes on cooldown, with a 1-second static cooldown between casts. If Aatrox does not recast the ability within 4 seconds of the previous cast, it goes on cooldown.",
        "Infernal Chains",
        "ACTIVE: Aatrox sends a chain in the target direction that deals magic damage to the first enemy hit, doubled against Minion icon minions, and Slow icon slowing them for 1.5 seconds.",
        "Umbral Dash",
        "PASSIVE: Aatrox Heal power icon heals for a portion of the non-Blaze persistent post-mitigation damage he deals against enemy champions, increased during World Ender. ACTIVE: Aatrox Dash dashes in the target direction. Umbral Dash resets Aatrox's basic attack timer and can be cast during his other abilities without cancelling them and vice versa.",
        "World Ender",
        "ACTIVE: Aatrox unleashes his true form for 10 seconds, Flee icon fearing nearby enemy Minion icon minions and Monster icon monsters for 3 seconds, during which they are gradually Slow icon slowed by up to 99% over the duration. He also gains Ghost ghosting and Movement speed icon bonus movement speed that decays by 10% of the current bonus every 0.25 seconds, lasting until World Ender has ended. Whenever Aatrox scores a champion Damage rating takedown, he extends the duration by 5 seconds and becomes unleashed again.During World Ender, Aatrox gains Attack damage icon bonus attack damage and 5% increased size, and receives increased Heal power icon self-healing from all sources.",
        
                )


    }
}
