

import java.util.ArrayList;

public class Place extends IPlace {


    public Place() {
    }

    public Place(String name) {
        super(name);
        this.name = name;
        System.out.println(" " + this.name);
    }

    public Place(String name, Double x, Double y) {
        super(name, x, y);
        this.name = name;
        this.x = x;
        this.y = y;
        System.out.println(this.name + " " + "с координатами" + " " + this.x + " " + "|" + " " + this.y);
    }


    public void add(Character c) {
        people.add(c);
    }                                // добавляем человека в место

    ArrayList<Character> people = new ArrayList<Character>();


    public ArrayList<Character> getPeople() {
        return this.people;                     //список людей в этом месте
    }


}
