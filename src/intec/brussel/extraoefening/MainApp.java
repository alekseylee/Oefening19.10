package intec.brussel.extraoefening;

public class MainApp {
    public static void main(String[] args) {

        Holiday myHoliday = new Holiday();
        myHoliday.buildTravel();

        Countries[] myConArr = Countries.values();
        for (Countries con : myConArr) {
            System.out.println(con + " with index " + con.ordinal());
        }
    }
}
