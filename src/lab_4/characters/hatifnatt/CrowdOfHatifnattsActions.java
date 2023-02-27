package lab_4.characters.hatifnatt;

import lab_4.characters.hemul.Hemul;
import lab_4.enums.Location;
import lab_4.exceptions.ImpossibleNumberException;

public interface CrowdOfHatifnattsActions extends HatifnattActions {
    void swarm();
    void surround(Hemul hemul);
    void flash(Location loc, int loudness) throws ImpossibleNumberException;
    void move(Hemul hemul, int loudness) throws ImpossibleNumberException;
}
