import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz : ");
        double price = input.nextDouble();
        System.out.print("Kart no giriniz : ");
        String cardNumber = input.next();
        System.out.print("Son kullanım tarihini giriniz : ");
        String expiryDate = input.next();
        System.out.print("Güvenlik kodunu giriniz : ");
        String cvc = input.next();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.print("Banka Seçiniz : ");
        int selectBank = input.nextInt();

        switch (selectBank){
            case 1:
                ABank aBank = new ABank("A Bankası","123456","1111");
                aBank.connect("127.1.1.1");
                aBank.payment(price,cardNumber,expiryDate,cvc);
                break;
            case 2:
                BBank bBank = new BBank("B Bankası","654321","8888");
                bBank.connect("127.2.2.2");
                bBank.payment(price,cardNumber,expiryDate,cvc);
                break;
            default:
                System.out.println("Lütfen geçerli bir banka adı giriniz.");
        }
    }
}
