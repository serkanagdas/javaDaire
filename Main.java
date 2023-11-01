import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        int r, aci;
        double pi=3.14, alan, cevre;

        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        System.out.print("Lütfenin Dairenin Merkez Açısını Giriniz: ");
        aci= input.nextInt();

        alan= (pi*r*r*aci)/360;
        cevre=2*pi*r;

        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);


    }

}
