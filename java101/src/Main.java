import java.util.Scanner;

public class Main{
    public static void main(String[] args){

      int mat,fizik,turkce,kimya,muzik;

      Scanner input = new Scanner(System.in);

      System.out.print("Matematik notunuzu giriniz : ");
      mat = input.nextInt();

      System.out.print("Fizik notunuzu giriniz : ");
      fizik = input.nextInt();

      System.out.print("Türkçe notunuzu giriniz : ");
      turkce = input.nextInt();

      System.out.print("Kimya notunuzu giriniz : ");
      kimya = input.nextInt();

      System.out.print("Müzik notunuzu giriniz : ");
      muzik = input.nextInt();

      double average = (mat + fizik + turkce + kimya + muzik) / 5.0 ;
      if(average <= 55){
          System.out.println("Sınıfta kaldınız ! Seneye tekrar görüşmek üzere :)");
      } else {
          System.out.println("Tebrikler sınıfı geçtiniz !");
      }
      System.out.println("Ortalamanız :"+average);

    }

}

