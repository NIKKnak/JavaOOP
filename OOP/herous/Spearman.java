package OOP.herous;

import java.util.ArrayList;

public class Spearman extends BaseHero {



    private String attack;

    public Spearman(String name, Point point) {
        super(name, 5, 1, 3, 10, 4, 4, pointXY);
    }

    @Override
    public String getInfo() {
        return "Копейщик " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Копейщик " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
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