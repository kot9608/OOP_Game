import units.*;
import units.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
//        Monk monah = new Monk("Monah", 0, 0);//создал персонажа Монах, с именем переменной monah
//        System.out.println(monah.hp);
////        System.out.println(monah.coordinates);
//        Peasant krestyanin = new Peasant("Krestyanin", 0, 1);//создал персонажа Крестьянин с именем переменной krestyanin
//        System.out.println(krestyanin.name);
////        System.out.println(krestyanin.coordinates);
//        Robber razboynik = new Robber("Razboynik", 0, 2);//создал персонажа Разбойник с именем переменной Razboynik
//        System.out.println(razboynik.name);
////        System.out.println(razboynik.coordinates);
//        System.out.println();
//        System.out.println(Arrays.toString(razboynik.coordinates.getCoordinates()));
        //Создать два списка в классе main.
//      В каждый из списков добавить по десять экземнляров наследников BaseHero.
//      Удалить ненужные методы из абстрактного класса, если такие есть.
//      В main пройти по спискам и вызвать у всех персонажей getInfo.
        ArrayList <units.Character> team1 = new ArrayList<units.Character>();
        ArrayList <Character> team2 = new ArrayList<units.Character>();
        for (int i = 0; i < 10; i++) {
            int random = new Random().nextInt(0,7);
            switch (random){
                case 0:
                    team1.add(new Monk("Monah",0,0));
                    team2.add(new Monk("Monah",9,0));
                    break;
                case 1:
                    team1.add(new Peasant("Krestyanin",0,1));
                    team2.add(new Peasant("Krestyanin",9,1));
                    break;
                case 2:
                    team1.add(new Robber("Razboynik",0,2));
                    team2.add(new Robber("Razboynik",9,2));
                    break;
                case 3:
                    team1.add(new Sniper("units.Sniper",0,3));
                    team2.add(new Sniper("units.Sniper",9,3));
                    break;
                case 4:
                    team1.add(new Spearman("Kopeyshik",0,4));
                    team2.add(new Spearman("Kopeyshik",9,4));
                    break;
                case 5:
                    team1.add(new Witch("Koldun",0,5));
                    team2.add(new Witch("Koldun",9,5));
                    break;
                case 6:
                    team1.add(new Сrossbowman("Arbaletchik",0,6));
                    team2.add(new Сrossbowman("Arbaletchik",9,6));
                    break;
            }
        }


        for (Character c:
                team1) {
            c.step(team2);
        }
        System.out.println("_____");
        for (Character c:
                team2) {
            c.step(team1);
        }
    }
}
