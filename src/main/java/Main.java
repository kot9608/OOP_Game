public class Main {


    public static void main(String[] args) {
        Monk monah = new Monk("Monah");//создал персонажа Монах, с именем переменной monah
        System.out.println(monah.hp);
        System.out.println(monah.manaSize);
        Peasant krestyanin = new Peasant("Krestyanin");//создал персонажа Крестьянин, с именем переменной krestyanin
        System.out.println(krestyanin.name);
        System.out.println(krestyanin.industriousness);
        Robber razboynik = new Robber("Razboynik");//создал персонажа разбойник с именем razboynik
        System.out.println(razboynik.name);
        System.out.println(razboynik.danger);
        Sniper sniper = new Sniper("Sniper");
        System.out.println(sniper.powerShot);
        Spearman kopeyshik = new Spearman("Kopeyshik");
        System.out.println(kopeyshik.name);
        System.out.println(kopeyshik.hp);
        Witch koldun = new Witch("Koldun");
        System.out.println(koldun.name);
        System.out.println(koldun.manaMaxSize);
        Сrossbowman arbaletchik = new Сrossbowman("Arbaletchik");
        System.out.println(arbaletchik.name);
        System.out.println(arbaletchik.getInfo());
    }

}
