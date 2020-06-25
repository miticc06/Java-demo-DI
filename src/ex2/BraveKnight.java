/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author miticc06
 */
public class BraveKnight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    
    public String embarkOnQuest() {
        return quest.embark();
    }       
}
