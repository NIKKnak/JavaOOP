package OOP.herous;

import java.util.ArrayList;

public class Mag extends BaseHero{

    protected static int magic;


    public Mag(String name, Point point) {
        super(name, 12, -5, -5, 30, 9, 1, magic, pointXY);
    }

    @Override
    public String getInfo() {
        return "Колдун " + name + " (" + "Защита - " + defense + ", Урон - " + minDamage + "-"
                + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Магия - " + magic + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Колдун " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
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
