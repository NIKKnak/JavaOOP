package OOP.herous;

import java.util.ArrayList;

public class Arbalester extends BaseHero {

    private String shots;
    private String attack;

    public Arbalester(String name, Point pointXY) {
        super(name, 3, 2, 3, 10, 4, 6, 16, pointXY);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Дальность выстрела - "
                + shots + ", Урон - " + minDamage + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed
                + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Арбалетчик " + name + " (" + "Скорость - " + speed + ", Здоровье - " + hp + ")";
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