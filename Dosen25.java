public class Dosen25 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen25() {

    }

    public Dosen25(String idDosen, String nama, boolean statusAktif, 
                   int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("-----------------------------------");
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif) {
            System.out.println("Status dosen diubah menjadi Aktif");
        } else {
            System.out.println("Status dosen diubah menjadi Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSekarang) {
        return thnSekarang - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah menjadi " + bidangKeahlian);
    }
}