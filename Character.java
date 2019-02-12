import java.util.Scanner;
import java.util.HashSet;

import com.google.gson.JsonSyntaxException;
import com.google.gson.Gson;


public class Character extends Creature implements Skills {




    Place place;
    String info;


    public Character() {
    }

    Character(String name) {
        super(name);
        this.name = name;

    }

    public String getinfo(){
        return info;
    }


    public void used_to() {
        System.out.println(this.name + " " + "должен привыкнуть спокойнее реагировать, но");
    }


    public void feel(Feelings Fl) {
        String s = " ";
        switch (Fl) {
            case WORRY:
                s = "переживания, которые  ранят его и без того покалеченное сердце ";
                break;
            case PAIN:
                s = "боль";
            case HORROR:
                s = "ужааас";
                break;
        }


        System.out.println( " " + this.name + " " + "испытывает" + " " + s);

    }

    public void walk() {
        System.out.println( " " + this.name + " " + "подошел поближе");
        class Timeless {
            public void go() {                                                     //локальный класс
                System.out.println("Из-за недостатка времени продолжил путь");

            }

        }
        Timeless timeless = new Timeless();
        timeless.go();

    }

    public void watch() {

        System.out.println(this.name + " " + "увидел препятствие");


    }




    public Place getPlace() {
        return this.place;


    }

    public void setPlace(Place p) {
        this.place = p;
        p.add(this);


    }


    public static int Num(Scanner in) throws AgeException {
        System.out.print("Введите возраст героя - ");
        int num = 9;
        String n = in.next();
        num = Integer.parseInt(n);

        if (num <=10) throw new AgeException(num);

        System.out.printf("Герою %d   \n", num);
        return num;

    }

    public Character(String name, Scanner in) {
        super(name);
        this.name = name;
        boolean flag = true;
        while (flag) {

            try {
                Num(in);
                flag = false;
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
    }



}
