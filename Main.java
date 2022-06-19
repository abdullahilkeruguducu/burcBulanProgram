import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner in = new Scanner(System.in);
        System.out.print("Dogdugunuz ay :");
        month = in.nextInt();

        System.out.print("Dogdugunuz gun :");
        day = in.nextInt();

        if ((month <= 12) && (month >= 1)) {
            if (month == 1) {
                if ((day >= 1) && (day <= 21)) {
                    burc = "Oglak";
                } else if ((day >= 22) && (day <= 28)) {
                    burc = "Kova";
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if ((day >= 1) && (day <= 19)) {
                    burc = "Kova";
                } else if ((day >= 20) && (day <= 28)) {
                    burc = "Balik";
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if ((day >= 1) && (day <= 20)) {
                    burc = "Balik";
                } else if ((day >= 21) && (day <= 31)) {
                    burc = "Koc";
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if ((day >= 1) && (day <= 20)) {
                    burc = "Koc";
                } else if ((day >= 21) && (day <= 30)) {
                    burc = "Boga";
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if ((day >= 1) && (day <= 21)) {
                    burc = "Boga";
                } else if ((day >= 21) && (day <= 31)) {
                    burc = "Ikizler";
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if ((day >= 1) && (day <= 22)) {
                    burc = "Ikizler";
                } else if ((day >= 23) && (day <= 30)) {
                    burc = "Yengec";
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if ((day >= 1) && (day <= 22)) {
                    burc = "Yengec";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Aslan";
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if ((day >= 1) && (day <= 22)) {
                    burc = "Aslan";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Basak";
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if ((day >= 1) && (day <= 22)) {
                    burc = "Basak";
                } else if ((day >= 23) && (day <= 30)) {
                    burc = "Terazi";
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if ((day >= 1) && (day <= 22)) {
                    burc = "Terazi";
                } else if ((day >= 23) && (day <= 31)) {
                    burc = "Akrep";
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if ((day >= 1) && (day <= 21)) {
                    burc = "Akrep";
                } else if ((day >= 22) && (day <= 30)) {
                    burc = "Yay";
                } else {
                    isError = true;
                }
            } else if (month == 12) {
                if ((day >= 1) && (day <= 21)) {
                    burc = "Yay";
                } else if ((day >= 22) && (day <= 31)) {
                    burc = "Oglak";
                } else {
                    isError = true;
                }
            }
            if (isError) {
                System.out.println("Yanlis Gun girildi !");
            } else {
                System.out.println("Burcunuz :" + burc);
            }
        } else {
            System.out.println("Yanlis ay girildi !");
        }
    }
}