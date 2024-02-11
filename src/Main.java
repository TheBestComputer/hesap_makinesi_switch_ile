
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ilk sayiyi giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = scanner.nextInt();
        
        System.out.println("1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme");
        System.out.print("Seciniz : ");
        select = scanner.nextInt();
        
        switch(select){
            case 1:
                System.out.println("Toplam : " + (n1+n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1-n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1*n2));
                break;
            case 4:
                switch(n2){
                    case 0:
                        System.out.println("Bir sayi sifir ile bolunemez!!!");
                        break;
                    default:
                        System.out.println("Bolme : " + (n1/n2));
                }
            default:
                System.out.println("Hatali giris yaptiniz!!!");
        }
        
    }
}
