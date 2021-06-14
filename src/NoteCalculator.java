import java.util.Scanner;

public class NoteCalculator {
    public static void main(String[] args) {
        float mat, fizik, turkce, kimya, muzik;
        double average;

        Scanner s = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = s.nextFloat();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = s.nextFloat();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = s.nextFloat();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = s.nextFloat();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = s.nextFloat();

        average = (mat + fizik + turkce + kimya + muzik) / 5.0;
        if (average <=  55)
        {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere! ");
        }
        else
        {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        }

        System.out.print("Ortalamanız: " + average);
    }
}
