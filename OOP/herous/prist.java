package OOP.herous;

import java.util.ArrayList;

public class prist extends BaseHero {

    protected int magic;

    public prist(String name, Point point) {
        super(name, 7, -4, -4, 30, 5, 1, pointXY);
    }

    @Override
    public String getInfo() {
        return "Монах " + name + " (" + "Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Магия - " + magic + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Монах " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
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