package intec.brussel.extraoefening;

import java.util.Scanner;

public class Holiday {
    Countries countries;

    public Holiday(Countries countries) {
        this.countries = countries;
    }

    public Holiday() {

    }

    public void buildTravel(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country where you want travel: ");

        Countries con = Countries.valueOf(scanner.nextLine().toUpperCase());

        switch(con) {
            case CHINA:
                System.out.println("I want to travel to: " + con);
                break;
            case USA:
                System.out.println("I want to travel to: " + con);
                break;
            case ITALY:
                System.out.println("I want to travel to: " + con);
                break;
            case FRANCE:
                System.out.println("I want to travel to: " + con);
                break;
            case RUSSIA:
                System.out.println("I want to travel to: " + con);
                break;
            case SPAIN:
                System.out.println("I want to travel to: " + con);
                break;
            case SWEDEN:
                System.out.println("I want to travel to: " + con);
                break;
            case GERMANY:
                System.out.println("I want to travel to: " + con);
                break;
            case SOUTHKOREA:
                System.out.println("I want to travel to: " + con);
                break;
            case KAZAKHSTAN:
                System.out.println("I want to travel to: " + con);
                break;
            case BELGIE:
                System.out.println("I want to travel to: " + con);
                break;
            default:
                System.out.println("I don't know where I want to travel.");
                break;
        }
    }
}
