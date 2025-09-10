import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class oppgaveO2 {
    public static void main(String[] args) {

        String rTxt = showInputDialog("Skriv inn poengscore");
        double poeng = parseDouble(rTxt);

        String karakter;
        if (poeng >= 90) {
            karakter =  "A";
        } else if (poeng >= 80) {
            karakter =  "B";
        } else if (poeng >= 60) {
            karakter =  "C";
        } else if(poeng >= 50) {
            karakter =  "D";
        } else if(poeng >= 40) {
            karakter =  "E";
        } else {
            karakter =  "F";
        }


        switch (karakter) {
            case "A":
                System.out.println("Karakter A");
                break;
            case "B":
                System.out.println("Karakter B");
                break;
            case "C":
                System.out.println("Karakter C");
                break;
            case "D":
                System.out.println("Karakter D");
                break;
            case "E":
                System.out.println("Karakter E");
                break;
            default:
                System.out.println("ikke bestått");
                break;
        }

    System.exit(0);

    }
}
