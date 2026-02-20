public class DosenMain25 {
    public static void main(String[] args) {

        Dosen25 dsn1 = new Dosen25();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Basis Data";

        Dosen25 dsn2 = new Dosen25("DSN002", "Siti Rahma", false, 2018, "Algoritma");

        dsn1.tampilInformasi();
        dsn2.tampilInformasi();

        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.ubahKeahlian("Kecerdasan Buatan");

        dsn1.tampilInformasi();
    }
}