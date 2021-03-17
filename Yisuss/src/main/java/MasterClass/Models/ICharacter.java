package MasterClass.Models;
import MasterClass.Utils.TimelineFailedException;

public interface ICharacter {

    public int dealDamage();
    public int receiveDamage(int damage, int enemyVel);
    public void heal(int healedPv);
    public boolean isAlive() throws TimelineFailedException;
    public void levelUp(int expGained);
}
