package MasterClass.Characters;

import MasterClass.Models.Character;
import MasterClass.Utils.Messages;
import MasterClass.Utils.TimelineFailedException;
import java.util.logging.*;

public class Player extends Character{

    private Messages messageManager  = new Messages();
    private int expRequiredToLvlUp;

    public Player(int expRequired, String playerName) {
        super(50, 10 ,0 , 3, 2 ,1 ,0, playerName);
        this.expRequiredToLvlUp = expRequired;
    }




    @Override
    public String getStats() {
        // CODE HERE
        //Logger logger = Logger.getLogger(Player.class.getName());
        //logger.log(Level.INFO,"loger de prueba.");
        //logger.log(Level.SEVERE,"FALLASTE.");
        return String.format("%s: %d de vida, %d de ataque, %d de bonus, %d de velocidad, %d de defensa, %f de dash, %d de experiencia.",
                this.getName(), this.getPv(), this.getAttack(), this.getAttackBonus(),
                this.getVel(), this.getDefense(), this.getDash(), this.getExp());
    }

    @Override
    public int dealDamage() {
        return this.getAttack() + this.getAttackBonus();
    }

    @Override
    public int receiveDamage(int damage, int enemyVel) {
        int dashChance = (int) (Math.random() * (10 - this.getDash() + 1) + this.getDash());
        int damageReceived = (dashChance > enemyVel) ? damage - this.getDefense() : 0;

        if (damageReceived == 0) {
            this.messageManager.getMessage("damageDashed", "", this.getName());
        } else {
            this.messageManager.getMessage("damageReceived", String.valueOf(damageReceived), this.getName());
        }

        return damageReceived;
    }

    @Override
    public void heal(int healedPv) {
        this.setPv(this.getPv() + healedPv);
        this.messageManager.getMessage("healed", String.valueOf(healedPv), this.getName());
    }

    @Override
    public boolean isAlive() throws TimelineFailedException {
        boolean alive = this.getPv() > 0;
        if (!alive) {
            throw new TimelineFailedException();
        }
        return alive;
    }

    @Override
    public void levelUp(int expGained) {
        this.setExp(this.getExp() + expGained);
        if (this.getExp() > expRequiredToLvlUp) {
            this.setExp(this.getExp() - expRequiredToLvlUp);
            this.setLevel(this.getLevel() + 1);
        }
    }

}
