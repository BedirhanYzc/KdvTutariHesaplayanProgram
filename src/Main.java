import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri belirleyelim

        double fiyat, kdvOrani1, kdvOrani2;
        kdvOrani1 = 0.18;
        kdvOrani2 = 0.08;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri alalım

        System.out.print("Fiyatı giriniz: ");
        fiyat = input.nextDouble();

        //Koşulları belirleyelim

        double str = fiyat <= 1000 ? fiyat * kdvOrani1 : fiyat * kdvOrani2;
        System.out.println("KDV'li Fiyat: " + str);
        String str2 = fiyat <= 1000 ? "KDV oranı: %18" : "KDV oranı: %8";
        System.out.println(str2);
        System.out.println("KDV Tutarı: " + str);


    }
}
