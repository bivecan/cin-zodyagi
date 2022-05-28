import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Dogum yilinizi girin");
        int yil = girdi.nextInt();

        int sonuc = yil%12;

        String burc = "";
        switch(sonuc) {
            case 0:
                burc="Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Kopek";
                break;
            case 3:
                burc="Domuz";
                break;
            case 4:
                burc="Fare";
                break;
            case 5:
                burc="Okuz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavsan";
                break;
            case 8:
                burc="Ejderha";
                break;
            case 10:
                burc="At";
                break;
            case 11:
                burc="Koyun";
                break;
            default:
                System.out.println("Dogum yilini yanlıs girdiniz");

        }

        System.out.println("Cin Zodyagi burcunuz: " + burc);
    }
}
