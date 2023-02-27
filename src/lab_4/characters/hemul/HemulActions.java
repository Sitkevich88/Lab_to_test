package lab_4.characters.hemul;

import lab_4.enums.Adverbs;
import lab_4.enums.Location;
import lab_4.characters.Pole;
import lab_4.characters.SunRay;
import lab_4.characters.Barometer;
import lab_4.characters.hatifnatt.HatifnattActions;

public interface HemulActions{
    void goTo(Location location);
    void walk(Location location);
    void lookForPlants(Adverbs adverb);
    void lookUp();
    void crashInto(Pole pole);
    void see(HatifnattActions hatifnatt);
    void think(String text);
    void think(String text, Adverbs adverb);
    void lookAround(Adverbs adverb);
    void inspect(Object o);
    void click(Object o);
    void squint(SunRay sunRay);

    void coward();
    void lookAround(Pole pole);
    void lookForEscape(Pole pole);
    void pickUpSkirts();
    void climb(Pole pole);
    void sitDown();
    void shiver();
    void holdOnTo(Barometer barometer);
}
