package src.app;

public class AdviseForDay implements Advise {

    public void advise (Day day) {
        switch (day) {

            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("Try to do your best!");

            case FRIDAY -> System.out.println("Happy friday!");

            case SATURDAY, SUNDAY -> System.out.println("Relax, have some fun, go to bar and meet with your friends!!!");

            default -> System.out.println("Where are you from?");
        }

    }
}
    
    
