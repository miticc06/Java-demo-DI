/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodi;

import ex2.BraveKnight;
import ex2.RescueDamsel_Quest;
import ex2.SlayDragon_Quest;

/**
 *
 * @author miticc06
 */
public class DemoDI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DamselRescuingKnight damselRescuingKnight = new DamselRescuingKnight();
//        System.out.println("ex1: " + damselRescuingKnight.embarkOnQuest());


        System.out.println("ex2");
        
        SlayDragon_Quest questSlayDragon = new SlayDragon_Quest();
        RescueDamsel_Quest questRescueDamsel = new RescueDamsel_Quest();
        

        BraveKnight knight1 = new BraveKnight(questSlayDragon);
        System.out.println("knight1: " + knight1.embarkOnQuest());
        
        BraveKnight knight2 = new BraveKnight(questSlayDragon);
        System.out.println("knight2: " + knight2.embarkOnQuest());


        BraveKnight knight3 = new BraveKnight(questRescueDamsel);
        System.out.println("knight3: " + knight3.embarkOnQuest());
    }

}
