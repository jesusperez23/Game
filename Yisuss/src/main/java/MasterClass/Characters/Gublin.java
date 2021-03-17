package MasterClass.Characters;
import MasterClass.Models.Character;
import MasterClass.Utils.Messages;
import MasterClass.Utils.TimelineFailedException;
import java.util.logging.*;
public class Gublin extends Character{

    private Messages messageManager  = new Messages();
    private Logger logger = Logger.getLogger(Gublin.class.getName());

    public Gublin(int pv, int attack, int attackBonus, int vel, int defense, int dash, int exp, String name) {
        super(pv, attack, attackBonus, vel, defense, dash, exp, name);
    }

    @Override
    public String getStats() {
        return String.format("%s: %d de vida, %d de ataque, %d de bonus, %d de velocidad, %d de defensa, %f de dash, %d de experiencia.",
                this.getName(), this.getPv(), this.getAttack(), this.getAttackBonus(),
                this.getVel(), this.getDefense(), this.getDash(), this.getExp());
    }

    private int randomNumber(int max  , int min){
        return (int)(Math.random() * (max - min + 1) + min);
    }

    @Override
    public int dealDamage() {
        if (this.randomNumber(5 ,1) == 1){
            logger.log(Level.INFO, "El gublin fallo y golpeo el suelo.");
        }else {
            return this.getAttack() + this.getAttackBonus();
        }
        return 0;
    }


    @Override
    public int receiveDamage(int damage, int enemyVel) {
        int dashChance = (int) (Math.random() * (10 - this.getDash() + 1) + this.getDash());
        int damageReceived = (dashChance > enemyVel) ? damage - this.getDefense() : 0;

        if (damageReceived == 0) {
            this.messageManager.getMessage("damageDashed", "", this.getName());
        } else {
            if (randomNumber(5 , 1) == 1) {
                logger.log(Level.WARNING , "El gublin se asusto y se curo.");
                heal(randomNumber(5,1));
            }
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
        return this.getPv() > 0;
    }

    @Override
    public void levelUp(int expGained) {

    }
}
