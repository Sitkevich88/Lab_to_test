package lab_4.exceptions;

public class NotEnoughEnergyException extends RuntimeException {
    public NotEnoughEnergyException(String text){
        super(text);
    }
}
