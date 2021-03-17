package MasterClass.Models;

public abstract class Character implements ICharacter {

    int pv = 0;
    int attack = 0;
    int attackBonus = 0;
    int vel = 0;
    int defense = 0;
    float dash = 0;
    int level = 0;
    int exp = 0;
    String name = "";

    public Character(int pv, int attack, int attackBonus, int vel, int defense, float dash, int exp, String name) {
        this.pv = pv;
        this.attack = attack;
        this.attackBonus = attackBonus;
        this.vel = vel;
        this.defense = defense;
        this.dash = dash;
        this.exp = exp;
        this.name = name;
    }

    public abstract String getStats();

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public float getDash() {
        return dash;
    }

    public void setDash(float dash) {
        this.dash = dash;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.exp = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }
}
