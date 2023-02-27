package itmo.hatifnatts.characters.hatifnatt;

import itmo.hatifnatts.enums.Location;
import itmo.hatifnatts.exceptions.ImpossibleNumberException;
import itmo.hatifnatts.characters.hemul.Hemul;

public interface CrowdOfHatifnattsActions extends HatifnattActions {
    void swarm();
    void surround(Hemul hemul);
    void flash(Location loc, int loudness) throws ImpossibleNumberException;
    void move(Hemul hemul, int loudness) throws ImpossibleNumberException;
}
