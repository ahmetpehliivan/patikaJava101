import java.util.Scanner;

public class Main {
    static int sum(int a,int b){                            //TOPLAMA İŞLEMİ
        int result = a+b;
        System.out.println("Toplam : "+result);
        return result;
    }
    static int minus(int a,int b){                          //ÇIKARMA İŞLEMİ
        int result = a-b;
        System.out.println("Çıkarma : "+result);
        return result;
    }
    static int times(int a,int b){                          //ÇARPMA İŞLEMİ
        int result = a*b;
        System.out.println("Çarpma : "+result);
        return result;
    }
    static int div(int a,int b){                            //BÖLME İŞLEMİ
        if (b==0){
            System.out.println("İkinci sayı 0'dan farklı olmalıdır.");
            return 0;
        }
        int result = a/b;
        System.out.println("Bölme : "+result);
        return result;
    }
    static int power(int a,int b){                          //ÜS ALMA İŞLEMİ
        int result=1;
        for (int i=1; i<=b; i++){
            result *=a;
        }
        return result;
    }
    static int mod(int a, int b){                           //MOD ALMA İŞLEMİ
        return a%b;
    }
    static int calcRectangle(int a,int b){                  //DİKDÖRTGEN ALAN VE ÇEVRE HESABI
        int circle =(2*(a+b));
        int area =(a*b);
        System.out.println("Çevresi : "+circle);
        System.out.println("Alanı : "+area);
        return circle+area;
    }



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "---------------------------------\n"
                + "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n"
                + "---------------------------------";

        System.out.println(menu);
        while(true) {

            System.out.println("Bir işlem seçiniz : ");
            select = scan.nextInt();
            if(select==0){
                break;
            }
            System.out.println("İki adet sayı giriniz : ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    div(a,b);
                    break;
                case 5:
                    System.out.println("Üslü değer : " +power(a,b));
                    break;
                case 6:
                    System.out.println("Mod işlemi : "+mod(a,b));
                    break;
                case 7:
                    calcRectangle(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz..");

            }
        }
        System.out.println("Güle Güle!");
    }
}
