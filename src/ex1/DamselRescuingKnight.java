package ex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author miticc06
 */

// Hiệp sĩ giải cứu 
public class DamselRescuingKnight {

    private RescueDamselQuest quest;
    
    public DamselRescuingKnight() {
        quest = new RescueDamselQuest();
    }
    
    public String embarkOnQuest() {
        return quest.embark();
    }
}
