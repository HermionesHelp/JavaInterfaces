package com.company;

public class Weapon extends Item{

    private Integer damage;
    private Integer condition;
    private boolean usable;

    public Weapon (String name, String description, Integer quantity, Integer buyPrice, Integer damage){
        super(name, description, quantity, buyPrice);
        this.damage = damage;
        this.condition = 100;
        this.usable = true;
    }

    public Integer getDamage() {
        return damage;
    }

    public boolean isUsable() {
        return usable;
    }

    @Override
    public String toString(){
        return this.getName() + "\n Description: " + this.getDescription() + "\n I have " + this.getQuantity() + " it does "
                + this.getDamage() + " points of damage. " + "they cost " + this.getBuyPrice() + " gold.\n";
    }

    public String takeDamage(Integer damageTaken) {
        Integer currentCondition = this.condition - damageTaken;
        if (this.condition <= 0){
            this.destroyItem();
        }
        return "Your " + this.getName() + " has taken " + damageTaken + " points damage. It's current condition is " + currentCondition + "%";
    }


    public String destroyItem(){
        return "Your " + this.getName() + "has been destroyed.";
    }

    public String removeItem() {
        return "You used " + this.getName() + ". It has been removed from your inventory..";
    }

    public String determineSellPrice(Integer shopMarkdown) {
        Integer sellPrice = this.getBuyPrice()/shopMarkdown;
        return "Your " + this.getName() + " is worth " + sellPrice + " gold.";
    }
}
