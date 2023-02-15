package lab_4;

public class NotEnoughEnergyException extends RuntimeException {
    NotEnoughEnergyException(String text){
        super(text);
    }
}
