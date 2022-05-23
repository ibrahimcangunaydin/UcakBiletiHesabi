import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTip;
        double normalTutar, yasIndirim = 0, toplamTutar = 0, mesafebasiucret = 0.10;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = inp.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş ):");
        yolculukTip = inp.nextInt();

        normalTutar = mesafe * mesafebasiucret;


        switch (yolculukTip) {
            case 1:
                if (yas > 0 && yas < 12) {
                    yasIndirim = normalTutar * 0.5;

                } else if (yas >= 12 && yas < 24) {
                    yasIndirim = normalTutar * 0.1;
                } else if (yas > 65) {
                    yasIndirim = normalTutar * 0.3;
                } else if (yas < 0) {
                    isError = true;
                }
                toplamTutar = (normalTutar - yasIndirim);
                break;
            case 2:
                if (yas > 0 && yas < 12) {
                    yasIndirim = normalTutar * 0.5;

                } else if (yas >= 12 && yas < 24) {
                    yasIndirim = normalTutar * 0.1;
                } else if (yas > 65) {
                    yasIndirim = normalTutar * 0.3;
                } else if (yas < 0) {
                    isError = true;
                }
                toplamTutar = ((normalTutar - yasIndirim) * 0.8) * 2;
                break;
            default:
                isError = true;
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar: " + toplamTutar);
        }

    }
}
