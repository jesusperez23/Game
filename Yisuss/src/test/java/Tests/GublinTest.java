package Tests;
import static org.junit.Assert.assertEquals;

import MasterClass.Utils.TimelineFailedException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import MasterClass.Characters.Gublin;
import org.junit.jupiter.api.BeforeEach;

public class GublinTest {
    private Gublin gublincito;

    @Before
    public void init (){
        this.gublincito = new Gublin(100, 10, 2, 5, 2, 1, 0, "Gublin de relleno");
    }

    @Test
    public void getStats() {
        String resultadoEsperado = "Gublin de relleno: 100 de vida, 10 de ataque, 2 de bonus, " +
                "5 de velocidad, 2 de defensa, 1,000000 de dash, 0 de experiencia.";
        String result = this.gublincito.getStats();
        assertEquals(resultadoEsperado, result);
    }

    @Test
    public void dealDamage() {
        int espected = 12;
        int damageResult =  this.gublincito.dealDamage();

        Assert.assertEquals(espected,damageResult);

    }

    @Test
    public void receiveDamage() {
        int resultHit = 12;
        int resultFault = 0;

        int hitFalse = this.gublincito.receiveDamage(14,11);
        Assert.assertEquals(resultFault, hitFalse);

        int hitTrue = this.gublincito.receiveDamage(14,0);
        Assert.assertEquals(resultHit, hitTrue);

    }

    @Test
    public void heal() {
        int espected = 104;

        this.gublincito.heal(4);
        Assert.assertEquals(espected , this.gublincito.getPv());
    }

    @Test
    public void isAlive() throws TimelineFailedException {

        Assert.assertTrue( this.gublincito.isAlive());

        this.gublincito.heal(-100);
        Assert.assertFalse(this.gublincito.isAlive());

    }

}
