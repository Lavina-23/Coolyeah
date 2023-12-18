import java.util.Scanner;

public class atmArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] accountBalances = {1000, 2000, 3000, 4000}; // Contoh saldo awal untuk 4 akun.

        while (true) {
            System.out.println("Pilih nomor akun (0-3) atau ketik -1 untuk keluar:");
            int accountNumber = input.nextInt();
            if (accountNumber == -1) {
                System.out.println("Terima kasih, selamat tinggal!");
                break;
            }

            if (accountNumber < 0 || accountNumber >= accountBalances.length) {
                System.out.println("Nomor akun tidak valid.");
                continue;
            }

            System.out.println("Selamat datang, Akun #" + accountNumber);
            while (true) {
                System.out.println("Pilihan: ");
                System.out.println("1. Lihat Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Setoran Tunai");
                System.out.println("4. Keluar");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Saldo Anda saat ini: " + accountBalances[accountNumber]);
                        break;
                    case 2:
                        System.out.println("Masukkan jumlah yang ingin ditarik: ");
                        int withdrawalAmount = input.nextInt();
                        if (withdrawalAmount > 0 && withdrawalAmount <= accountBalances[accountNumber]) {
                            accountBalances[accountNumber] -= withdrawalAmount;
                            System.out.println("Anda telah menarik " + withdrawalAmount + ". Saldo Anda saat ini: "
                                    + accountBalances[accountNumber]);
                        } else {
                            System.out.println("Saldo tidak mencukupi.");
                        }
                        break;
                    case 3:
                        System.out.println("Masukkan jumlah yang ingin disetor: ");
                        int depositAmount = input.nextInt();
                        if (depositAmount > 0) {
                            accountBalances[accountNumber] += depositAmount;
                            System.out.println("Anda telah melakukan setoran " + depositAmount
                                    + ". Saldo Anda saat ini: " + accountBalances[accountNumber]);
                        } else {
                            System.out.println("Jumlah setoran tidak valid.");
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih, selamat tinggal!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }

                if (choice == 4) {
                    break;
                }
            }

        }
        input.close();
    }
}


/**
 * array
 */
// public class array {

//     public static void main(String[] args) {
//         int[] a = {1,2,3,4,5};
//         int j = a.length - 1;

//         for (int i = 0; i < 5; i++) {
//             System.out.println(a[j]);
//             j = j - 1;
//         }

//     }
// }
