import java.util.Scanner;

public class tht {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int stokVip = 5;
        int stokFestival = 25;
        int stokTribune = 35;

        boolean mesinAktif = true;

        do {
            // Deklarasi untuk simpan data transaksi
            int tiketDibeli = 0;
            int tiketBerhasil = 0;
            int totalHarga = 0;
            String kategori = "";

            // Menampilkan menu
            System.out.println("UNIVERSITAS PERTAMINA SOUNDFEST 2026");
            System.out.println("========================================");
            System.out.println("Sisa Stok Tiket:");
            System.out.println("VIP      : " + stokVip + " tiket (Min. 18 tahun) - Rp 1.500.000");
            System.out.println("Festival : " + stokFestival + " tiket (Min. 15 tahun) - Rp 800.000");
            System.out.println("Tribune  : " + stokTribune + " tiket (Bebas usia)    - Rp 500.000");
            System.out.println("----------------------------------------");
            System.out.println("Pilih tiket yang ingin dibeli:");
            System.out.println("1. VIP");
            System.out.println("2. Festival");
            System.out.println("3. Tribune");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: // Case VIP
                    kategori = "VIP";
                    System.out.print("Jumlah tiket VIP yang ingin dibeli: "); // input jumlah tiket VIP
                    int jumlahVip = sc.nextInt();
                    
                    // Simpan jumlah yang dicoba dibeli
                    tiketDibeli = jumlahVip;
                    
                    if (jumlahVip <= stokVip) { // Cek stok
                        for (int i = 1; i <= jumlahVip; i++) { // Loop jumlah tiket
                            System.out.print("Masukkan Usia Orang Ke-" + i + ": "); // Input usia
                            int usia = sc.nextInt();
                            
                            // Cek usia
                            if (usia == -1 || usia < 0 || usia > 100) {
                                if (usia == -1) {
                                    System.out.println("Pesanan dibatalkan.");
                                    i = jumlahVip + 1;
                                    // Reset counter karena batal
                                    tiketBerhasil = 0;
                                    totalHarga = 0;
                                } else {
                                    System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                                    i--;
                                }
                            } else if (usia < 18) {
                                System.out.println("Usia tidak memenuhi syarat (minimal 18 tahun). Tiket ke-" + i + " dibatalkan.");
                            } else {
                                System.out.println("Tiket VIP berhasil dibeli.");
                                stokVip -= 1;
                                tiketBerhasil++;
                                totalHarga += 1500000;
                            }
                        }
                    } else {
                        System.out.println("Stok tiket VIP tidak mencukupi.");
                        // Reset karena gagal dari awal
                        tiketDibeli = 0;
                    }
                    break;
                
                case 2: // Case Festival
                    kategori = "Festival";
                    System.out.print("Jumlah tiket Festival yang ingin dibeli: "); // input jumlah tiket Festival
                    int jumlahFestival = sc.nextInt();
                    
                    // Simpan jumlah yang dicoba dibeli
                    tiketDibeli = jumlahFestival;
                    
                    if (jumlahFestival <= stokFestival) { // Cek stok
                        for (int i = 1; i <= jumlahFestival; i++) { // Loop jumlah tiket
                            System.out.print("Masukkan Usia Orang Ke-" + i + ": "); // Input usia
                            int usia = sc.nextInt();
                            
                            // Cek usia
                            if (usia == -1 || usia < 0 || usia > 100) {
                                if (usia == -1) {
                                    System.out.println("Pesanan dibatalkan.");
                                    i = jumlahFestival + 1;
                                    // Reset counter karena batal
                                    tiketBerhasil = 0;
                                    totalHarga = 0;
                                } else {
                                    System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                                    i--;
                                }
                            } else if (usia < 15) {
                                System.out.println("Usia tidak memenuhi syarat (minimal 15 tahun). Tiket ke-" + i + " dibatalkan.");
                            } else {
                                System.out.println("Tiket Festival berhasil dibeli.");
                                stokFestival -= 1;
                                tiketBerhasil++;
                                totalHarga += 800000;
                            }
                        }
                    } else {
                        System.out.println("Stok tiket Festival tidak mencukupi.");
                        tiketDibeli = 0;
                    }
                    break;
                
                case 3: // Case Tribune
                    kategori = "Tribune";
                    System.out.print("Jumlah tiket Tribune yang ingin dibeli: "); // input jumlah tiket Tribune
                    int jumlahTribune = sc.nextInt();
                    
                    // Simpan jumlah yang dicoba dibeli
                    tiketDibeli = jumlahTribune;
                    
                    if (jumlahTribune <= stokTribune) { // Cek stok
                        for (int i = 1; i <= jumlahTribune; i++) { // Loop jumlah tiket
                            System.out.print("Masukkan Usia Orang Ke-" + i + ": "); // Input usia
                            int usia = sc.nextInt();
                            
                            // Cek usia
                            if (usia == -1 || usia < 0 || usia > 100) {
                                if (usia == -1) {
                                    System.out.println("Pesanan dibatalkan.");
                                    i = jumlahTribune + 1;
                                    // Reset counter karena batal
                                    tiketBerhasil = 0;
                                    totalHarga = 0;
                                } else {
                                    System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                                    i--;
                                }
                            } else {
                                System.out.println("Tiket Tribune berhasil dibeli.");
                                stokTribune -= 1;
                                tiketBerhasil++;
                                totalHarga += 500000;
                            }
                        }
                    } else {
                        System.out.println("Stok tiket Tribune tidak mencukupi.");
                        tiketDibeli = 0;
                    }
                    break;
                
                case 4: // Case Keluar
                    System.out.println("Terima kasih telah menggunakan layanan kami.");
                    mesinAktif = false;
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            
            // Cetak nota pembelian jika ada transaksi
            if (tiketDibeli > 0 && tiketBerhasil >= 0 && pilihan != 4) {
                System.out.println("\n========== NOTA PEMBELIAN ==========");
                System.out.println("Tiket Coba Dibeli : " + tiketDibeli + " tiket " + kategori);
                System.out.println("Tiket Berhasil Dibeli : " + tiketBerhasil + " tiket " + kategori + " yang berhasil diproses");
                System.out.println("total tagihan Rp " + totalHarga);
                System.out.println("================================\n");
            }
            
        } while (mesinAktif);
        
        sc.close();
    }
}