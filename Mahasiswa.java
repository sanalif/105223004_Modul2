import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        System.out.println ("Masukan nama anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Masukan NIM Anda: ");
        String nim = input.nextLine();

        System.out.println("Masukan usia Anda: ");
        int age = input.nextInt();

        System.out.println("Masukan tinggi badan Anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukan: ");
        System.out.println("Nama Anda: " + name);
        System.out.println("Usia Anda: " + age);
        System.out.println("NIM: " + nim);
        System.out.println("Tinggi badan Anda: " + height);

        input.close();

        int hasil = (age*2) + 10 / 5 - 3;
        System.out.println("Hasil Aritmatika: " + hasil);
        System.out.println(age > 18);
        System.out.println(age > 18 && height > 160);

        double umur = age; //karena urutannya int baru double
        System.out.println(" umur dalam double: " + umur);

        int tinggiBadan = (int) height; //karena double lebih tinggi dari int
        System.out.println("tinggi dalam int: " + tinggiBadan);



    }
}
