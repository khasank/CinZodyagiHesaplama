import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumYili, bolumdenKalan; // Değişkenler tanımlanıyor. 
        Scanner input = new Scanner(System.in); // Scanner sınıfı değişken tanımlanıyor. 
        
        // Kullanıcıdan veriler alınıyor. 
        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumYili = input.nextInt();
        // Hesaplamalar yapılıyor. 
        bolumdenKalan = dogumYili % 12;
        System.out.println("Kalan : " + bolumdenKalan);
        // Ekrana çıktı veriliyor. 
        switch (bolumdenKalan) {
            case 0 -> System.out.println("Çin Zonyağı Burcunuz  : Maymun");
            case 1 -> System.out.println("Çin Zonyağı Burcunuz  : Horoz");
            case 2 -> System.out.println("Çin Zonyağı Burcunuz  : Köpek");
            case 3 -> System.out.println("Çin Zonyağı Burcunuz  : Domuz");
            case 4 -> System.out.println("Çin Zonyağı Burcunuz  : Fare");
            case 5 -> System.out.println("Çin Zonyağı Burcunuz  : Öküz");
            case 6 -> System.out.println("Çin Zonyağı Burcunuz  : Kaplan");
            case 7 -> System.out.println("Çin Zonyağı Burcunuz  : Tavşan");
            case 8 -> System.out.println("Çin Zonyağı Burcunuz  : Ejderha");
            case 9 -> System.out.println("Çin Zonyağı Burcunuz  : Yılan");
            case 10 -> System.out.println("Çin Zonyağı Burcunuz  : At");
            case 11 -> System.out.println("Çin Zonyağı Burcunuz  : Koyun");
        }
    }
}
