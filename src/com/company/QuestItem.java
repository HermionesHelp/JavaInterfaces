package com.company;

public class QuestItem extends Item {

    private String itemEffect;

    public QuestItem (String name, String description, Integer quantity, Integer buyPrice){
        super(name, description, quantity, buyPrice);
    }

    public String getItemEffect() {
        return itemEffect;
    }

    public String removeItem() {
        return "You used " + this.getName() + ". It has been removed from your inventory..";
    }

    public String affectCharacter(){
        return "You used " + this.getName() + ". It has " + this.getItemEffect() + this.removeItem();
    }
}
