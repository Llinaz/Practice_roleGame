public abstract class Character {
    private String name;
    private int healthUnits;
    private int strength;
    private int dexterity;
    private int experience;
    private int gold;

    public Character(String name, int healthUnits, int strength, int dexterity, int experience, int gold) {
        this.name = name;
        this.healthUnits = healthUnits;
        this.strength = strength;
        this.dexterity = dexterity;
        this.experience = experience;
        this.gold = gold;
    }
    public int attack() {
        if (dexterity * 3 > getRandomValue()) {
            if (getRandomValue() == 100 || getRandomValue() == 1) {
                healthUnits -= strength * 2;
            } else {
                healthUnits -= strength;
            }
        } else {
            return 0;
        }
        return 0;
    }
    private int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealthUnits() {
        return healthUnits;
    }
    public void setHealthUnits(int healthUnits) {
        this.healthUnits = healthUnits;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    @Override
    public String toString() {
        return String.format("%s здоровье:%d", name, healthUnits);
    }
}
