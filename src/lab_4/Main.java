package lab_4;



public class Main{
    public static void main(String[] args) throws ImpossibleNumberException {
        Pole pole = new Pole(true, true);
        Hemul hemul = new Hemul(Location.GLADE_OF_HATIFNATTS, 7);
        //Hatifnatt hatifnatt = new Hatifnatt(Location.GLADE_OF_HATIFNATTS, 2);
        CrowdOfHatifnatts crowd = new CrowdOfHatifnatts(new Hatifnatt(Location.GLADE_OF_HATIFNATTS, 2), 123);
        Barometer barometer = new Barometer(Location.ON_TOP_OF_THE_POLE, Colour.RED, Material.WOODEN);
        Barometer.ClockHand clockHand = barometer.new ClockHand();

        hemul.goTo(Location.GLADE_OF_HATIFNATTS);
        hemul.walk(Location.GLADE_OF_HATIFNATTS);
        hemul.lookForPlants(Adverbs.ZEALOUSLY);
        hemul.crashInto(pole);
        hemul.lookUp();
        hemul.lookAround(Adverbs.WITH_AMAZEMENT);
        hemul.see(crowd);
        hemul.think("I haven't ever seen so many Hatifnatts!");
        crowd.swarm();
        crowd.lookAt(hemul);
        hemul.think("I wonder if they are evil");
        hemul.think("Yes, they are little but there is a whole crowd of them");
        hemul.inspect(pole);
        hemul.inspect(barometer);
        clockHand.show(true,true);
        hemul.squint(new SunRay());
        hemul.click(barometer);
        clockHand.fall(Adverbs.HARD);
        crowd.hiss(Adverbs.TERRIBLY);
        crowd.takeAStepTowards(hemul, HatifnattStatus.LINE_AFTER_LINE);
        crowd.hear(false);
        crowd.takeAStepTowards(hemul, HatifnattStatus.LINE_AFTER_LINE);
        crowd.hiss(Adverbs.TERRIBLY);
        crowd.swingPaws();
        hemul.coward();
        hemul.lookAround(pole);
        crowd.surround(hemul);
        crowd.flash(Location.BETWEEN_THE_TREES, 0);
        crowd.move(hemul,0);
        hemul.pickUpSkirts();
        hemul.climb(pole);
        hemul.sitDown();
        hemul.shiver();
        hemul.holdOnTo(barometer);
        crowd.approach(hemul);
        hemul.think("Imagine what happens If I fall");
        hemul.shiver();
    }
}
