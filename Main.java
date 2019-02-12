import java.io.*;
import java.util.HashSet;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Main {
    private static HashSet<Character> character;

    public static void main(String[] args) {

       /* try {
            String inputFile;
            if (args.length >= 0) {
                inputFile = args[0];
            } else {
                inputFile = new File(".") + "character_info.json";

            }
            String input = read(new File(inputFile));

        }*/
    }

    public static String read(File Gson) {

        String s = "";

        try {
            BufferedInputStream fileInput = new BufferedInputStream(new FileInputStream(Gson));
            String currentLine = "";
            int i;
            while ((i = fileInput.read()) != -1) {
                char c = (char) i;
                if ((i != 10) && (i != 32))
                    s += c;
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!");
        } catch (IOException e) {
            System.err.println("Ошибка");
        }

        return s.trim();

    }



    private static void runJson(File json) {

        JSONParser parser = new JSONParser();

        try {

            Obje ct obj = parser.parse(new FileReader(
                    "character_info.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String name = (String) jsonObject.get("name");
            String info = (String) jsonObject.get("info");


            System.out.println("name: " + name);
            System.out.println("info: " + info);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}




       /* Character man = new Character("Герой",new Scanner(System.in));
        Class c = man.getClass();

        man.used_to();
        man.feel(Feelings.HORROR);
        man.walk();
        man.watch();

        Place place = new Place("Препятствие", 123.05, 12.1);
        Place place1 = new Place();
        StarHeads Head = new StarHeads("Почивший Звездоголовый", new Scanner(System.in));
        Head.skill();
        Head.reason(Situation.RUN);
        StarHeads alive = new StarHeads() { //анонимный класс
            public void skill() {
                System.out.println("Выживший Звездоголовый прячется неподалеку и выжидает удобный момент, чтобы напасть на Храброго Героя");
            }
        };
        alive.skill();


        Penguin.Number number = new Penguin.Number();
        number.much();
        Penguin bird = new Penguin("Пингвин");
        bird.behavior();
        bird.beak();
        FlashLight flashlight = new FlashLight();
        flashlight.flash(true);
        FlashLight.Danger dangerous = new FlashLight().new Danger();
        dangerous.danger(false);
        man.setPlace(place1);

        //json parsing




    }
}



/*public class JavaApplication1 {
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("c:\\character.json"));

            JSONObject jsonObject =  (JSONObject) obj;

            String name = (String) jsonObject.get("name");
            System.out.println(name);

            String city = (String) jsonObject.get("city");
            System.out.println(city);

            String job = (String) jsonObject.get("job");
            System.out.println(job);

            // loop array
            JSONArray cars = (JSONArray) jsonObject.get("cars");
            Iterator<String> iterator = cars.iterator();
            while (iterator.hasNext()) {
             System.out.println(iterator.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */


