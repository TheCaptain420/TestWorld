public class TitleGenerator {
    String[] object = {"system", "computer",
            "meat",
            "year",
            "thanks",
            "music",
            "person",
            "reading",
            "method",
            "data", "food", "understanding", "theory", "law", "bird", "literature", "problem", "software"};
    String[] place = {"Denmark", "Germany", " the toilet", "the city", "Japan", "Mars"};


    public void titelmangde(int antalTitler) {
        int i = 0;
        while (i < antalTitler) {
            int rand1 = (int) Math.random()* 18;
            int rand2 = (int) Math.random()* 6;
            System.out.println("The " + object[rand1] + " in " + place[rand2] + ".");
            i++;

        }


    }
}