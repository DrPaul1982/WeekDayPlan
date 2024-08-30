package src.app;

public class Main {


    public static void main(String[] args) {

        GetData getData = new GetData();

        Day wrotenDay = getData.getDay();

        AdviseForDay adviseForDay = new AdviseForDay();

        adviseForDay.advise(wrotenDay);

    }
}
