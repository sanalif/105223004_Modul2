import java.util.Scanner;
public class User {
    public static void main(String[] args) throws Exception {
        //1
        System.out.println ("Masukan nama anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Masukan usia Anda: ");
        int age = input.nextInt();

        System.out.println("jumlah uang yang dimiliki: ");
        int jumlahUang = input.nextInt();

        System.out.println("rata-rata pengeluaran harian: ");
        double rate = input.nextDouble();

        System.out.println("Masukan jumlah Hutang: ");
        int jumlahHutang = input.nextInt();

        input.close();

        System.out.println();

        int bonus = (int) (Math.random() * 899999);
    
        //2
        double usia = age;
        int totalUang = (int) jumlahUang;

        //3
        double sisaUang = totalUang - (30 * rate);
        double bulan = totalUang / (30 * rate);
        boolean status1 = bulan < 1;
        boolean status2 = bulan > 1 || bulan > 6;

        //4
        boolean Up130 = age > 30;
        boolean Up230 = age > 30 && totalUang > 10000000;
        boolean Up330 = age < 30 || totalUang > 5000000;

        System.out.println("Apakah age lebih dari 30?: " + Up130);
        System.out.println("Apakah age > 30 dan uang > 10 juta?: " + Up230);
        System.out.println("Apakah age < 30 atau uang > 5 juta?: " + Up330);
        System.out.println();

        //6
        System.out.println("===LAPORAN KEUANGAN PRIBADI===");
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age + " tahun");
        System.out.println("uang yang dimiliki: Rp" + totalUang);
        System.out.println("Pengeluaran harian rata-rata: Rp" + rate);
        System.out.println("Sisa uang dalam 30 hari: Rp" + sisaUang);
        System.out.println("Estimasi bulan bertahan: " + bulan + " bulan");
        if(status1){
            System.out.println("Status Keuangan: PERINGATAN: Keuangan Anda kurang stabil!");
        }
        if(status2){
            System.out.println("Status Keuangan: Keuangan Anda dalam kondisi aman.");
        }

        //5
        System.out.println("Nilai absolut dari hutang: Rp" + Math.abs(jumlahHutang));
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + Math.ceil(rate));
        System.out.println("Bonus tak terduga: Rp" + bonus);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: " + (sisaUang + bonus) );
    }
}
