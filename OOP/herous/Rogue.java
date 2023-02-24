package OOP.herous;

import java.util.ArrayList;

public class Rogue extends BaseHero {



    private String attack;

    public Rogue(String name, Point point) {
        super(name, 3, 2, 4, 10, 6, 8, pointXY);
    }

    @Override
    public String getInfo() {
        return "Бандит " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Бандит " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }

    @Override
    public void Step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Step'");
    }

    @Override
    public String GetInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetInfo'");
    }
}