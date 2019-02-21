package items;

public enum HealingItem {
    POTIONOFHEALING(8),
    HEALROOT(6),
    CURELIGHTWOUNDS(7),
    STIMPACK(12);

    int healingPower;

    HealingItem (int healingPower){
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }
}
