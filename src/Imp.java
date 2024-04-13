import java.util.HashMap;

public class Imp extends Monster{

    public Imp(Integer xp, Integer maxHP, HashMap<String, Integer> items) {
        super(xp, maxHP, items);
    }

    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }
}
