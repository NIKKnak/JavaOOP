package OOP.herous;

import java.util.ArrayList;

public class Sniper extends BaseHero {
    
    protected int shot;
    private String attack;
    private String shots;

    public Sniper(String name,int xCoord,int yCoord){
        super(name, 10, 8, 10, 15, 9, 12, 32, pointXY);
    }



    @Override
    public String getInfo() {
        return "Снайпер " + name + " (" + "Атака - " + attack + ", Защита - " + defense + ", Дальность выстрела - "
                + shots + ", Урон - " + minDamage + "-" + maxDamage + ", Здоровье - " + hp + ", Скорость - " + speed
                + ")";
    }

    @Override
    public String getInfoForQueue() {
        return "Снайпер " + name + " (" + "Скорость - " + speed  + ", Здоровье - " + hp + ")";
    }

    @Override
    public void Step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Step'");
    }



    public static String GetName() {
        return null;
    }

    @Override
    public String GetInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GetInfo'");
    }
}