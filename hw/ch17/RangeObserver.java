public class RangeObserver implements Observer {
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        String range;
        
        if (number >= 0 && number < 10) {
            range = "Low";
        } else if (number >= 10 && number < 20) {
            range = "Mid";
        } else {
            range = "High";
        }
        
        System.out.println("RangeObserver: [" + range + "] " + number);
    }
}