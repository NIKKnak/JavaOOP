package OOP.herous;

import java.util.ArrayList;

public class Villager extends BaseHero{

    protected int delivery;
    private String attack;

    public Villager(String name, Point point) {
        super(name, 1, 1, 1, 1, 3, 1, pointXY);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return "Крестьянин " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Урон - " + minDamage
                + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed + ", Доставка - " + delivery + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Крестьянин " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
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