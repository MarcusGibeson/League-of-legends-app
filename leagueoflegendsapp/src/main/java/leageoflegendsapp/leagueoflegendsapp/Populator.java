package leageoflegendsapp.leagueoflegendsapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import leageoflegendsapp.leagueoflegendsapp.Models.Champion;
import leageoflegendsapp.leagueoflegendsapp.Services.ChampionService;

@Component
public class Populator implements CommandLineRunner{
    
    private final ChampionService championService;

    public Populator(ChampionService championService){
        this.championService = championService;
    }

    @Override
    public void run(String... args) throws Exception {

        //Champion List
        Champion Aatrox = new Champion(
            "Aatrox",
            "the Darkin Blade", 
            "Deathbringer Stance",
            "INNATE: Periodically, Aatrox empowers his next basic attack to gain bonus range and deal bonus magic damage of the target's maximum health, capped at 100 against monsters. Aatrox heals for 80% of the post-mitigation bonus damage dealt, reduced to 25% against Minion icon minions. Whenever Aatrox hits at least one enemy champion or monster with a basic attack on-hit or an ability, the cooldown of Deathbringer Stance is reduced by 2 seconds, modified to 4 if he hits with the Sweetspot of The Darkin Blade.",
            "/images/Champions/Aatrox/Aatrox_Passive.webp",
            "The Darkin Blade",
            "Aatrox can activate The Darkin Blade three times before the ability goes on cooldown, with a 1-second static cooldown between casts. If Aatrox does not recast the ability within 4 seconds of the previous cast, it goes on cooldown.",
            "/images/Champions/Aatrox/Aatrox_Q.webp",
            "Infernal Chains",
            "ACTIVE: Aatrox sends a chain in the target direction that deals magic damage to the first enemy hit, doubled against minions, and slowing them for 1.5 seconds.",
            "/images/Champions/Aatrox/Aatrox_W.webp",
            "Umbral Dash",
            "PASSIVE: Aatrox heals for a portion of the damage he deals against enemy champions, increased during World Ender. ACTIVE: Aatrox Dash dashes in the target direction. Umbral Dash resets Aatrox's basic attack timer and can be cast during his other abilities without cancelling them and vice versa.",
            "/images/Champions/Aatrox/Aatrox_E.webp",
            "World Ender",
            "ACTIVE: Aatrox unleashes his true form for 10 seconds, fearing nearby enemy minions and monsters for 3 seconds, during which they are gradually slowed by up to 99% over the duration. He also gains ghosting and bonus movement speed that decays by 10% of the current bonus every 0.25 seconds, lasting until World Ender has ended. Whenever Aatrox scores a champion takedown, he extends the duration by 5 seconds and becomes unleashed again.During World Ender, Aatrox gains Attack bonus attack damage and 5% increased size, and receives increased self-healing from all sources.",
            "/images/Champions/Aatrox/Aatrox_R.webp",
            "/images/Champions/Aatrox/Aatrox.webp",
            null
        );

        Champion Ahri = new Champion(
            "Ahri",
            "the Nine-Tailed Fox",
            "Essence Theft",
            "INNATE: Ahri generates a stack of Essence Fragment whenever she kills a Minion icon minion or Monster icon monster. At 9 stacks, she consumes them to Heal power icon heal herself for 35 − 95 (based on level) (+ 20% AP).Additionally, whenever Ahri scores a champion Damage rating takedown within 3 seconds of damaging them, she consumes their essence to heal herself"
        )




        championService.save(Aatrox);


    }
}
