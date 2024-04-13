import java.util.HashMap;

public class Kobold extends Monster{

    public Kobold(Integer xp, Integer maxHP, HashMap<String, Integer> items) {
        super(xp, maxHP, items);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}