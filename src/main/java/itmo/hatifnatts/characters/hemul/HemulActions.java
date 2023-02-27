package itmo.hatifnatts.characters.hemul;

import itmo.hatifnatts.characters.Barometer;
import itmo.hatifnatts.characters.Pole;
import itmo.hatifnatts.characters.SunRay;
import itmo.hatifnatts.characters.hatifnatt.HatifnattActions;
import itmo.hatifnatts.enums.Adverbs;
import itmo.hatifnatts.enums.Location;

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
