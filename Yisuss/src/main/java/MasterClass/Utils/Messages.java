package MasterClass.Utils;

import java.util.HashMap;

public class Messages {

    private HashMap<String, String> messagesMap = new HashMap<String, String>();

    public Messages() {
        this.messagesMap.put("damageDealt", "Has hecho %% de daño al enemigo.");
        this.messagesMap.put("damageReceived", "Has sufrido %% de daño.");
        this.messagesMap.put("damageDashed", "Has esquivado el ataque.");
        this.messagesMap.put("enemyDashed", "El enemigo esquivó tu ataque.");
        this.messagesMap.put("death", "... he dicho mis últimas palabras ...");
        this.messagesMap.put("levelUp", "¡Ahora soy mas fuerte!");
        this.messagesMap.put("healed", "Me siento mas aliviado.");
    }

    public void getMessage(String key, String value, String name) {
        System.out.println(name + ": " + this.messagesMap.get(key).replaceAll("%%", value));
    }
}
