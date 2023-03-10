package OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import OOP.herous.*;

public class Game {
    public static void main(String[] args) {

        ArrayList<BaseHero> light = new ArrayList<>();
        ArrayList<BaseHero> dark = new ArrayList<>();
        ArrayList<BaseHero> queueForAMove = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    light.add(new Spearman(Spearman.getName(), new Point(1, i + 1)));
                    break;
                case 1:
                    light.add(new Arbalester(Arbalester.getName(), new Point(1, i + 1)));
                    break;
                case 2:
                    light.add(new prist(prist.getName(), new Point(1, i + 1)));
                    break;
                case 3:
                    light.add(new Villager(Villager.getName(), new Point(1, i + 1)));
                    break;
                default:
                    break;
            }
        }

        for (int i = 0; i < 10; i++) {

            switch (new Random().nextInt(4)) {
                case 0:
                    dark.add(new Rogue(Rogue.getName(),  new Point(10, i+1)));
                    break;
                case 1:
                    dark.add(new Sniper(Sniper.getName(),  new Point(10, i+1)));
                    break;
                case 2:
                    dark.add(new Mag(Mag.getName(),  new Point(10, i+1)));
                    break;
                case 3:
                    dark.add(new Villager(Villager.getName(),  new Point(10, i+1)));
                    break;
                default:
                    break;
            }
        }

        
        System.out.println("___Свет___");
        light.forEach(n -> System.out.println(n.GetInfo()));
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("___Тьма___");
        dark.forEach(n -> System.out.println(n.GetInfo()));
        System.out.println("--------------------------------------------------------------------------");

        queueForAMove.addAll(light);
        queueForAMove.addAll(dark);

        queueForAMove.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero hero1, BaseHero hero2) {
                if (hero2.getSpeed() == hero1.getSpeed())
                    return hero2.getHp() - hero1.getHp();
                else {
                    return hero2.getSpeed() - hero1.getSpeed();
                }
            }
        });

        System.out.println("___Очередь для хода___");
        queueForAMove.forEach(n -> n.Step(light, dark));



    }
}