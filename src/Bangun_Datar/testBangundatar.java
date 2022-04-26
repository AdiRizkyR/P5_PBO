package Bangun_Datar;

public class testBangundatar {
    public static void main(String[] args) {
        //Membuat Objek Bangun Datar
        Bangun_Datar bangunDatar = new Bangun_Datar();

        //Membuat Obejk Persegi dan Mengisi Nilai Properti
        Persegi persegi = new Persegi();
        persegi.setSisi(2);

        //Membuat Objek Lingkaran dan Mengisi Nilai Properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(22);

        //Membuat Objek Persegi Panjang dan Mengisi Nilai Properti
        Persegi_Panjang persegiPanjang = new Persegi_Panjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(4);

        //Membuat Objek Segitiga dan Mengisi Nilai Properti
        Segitiga msegitiga = new Segitiga();
        msegitiga.setAlas(6);
        msegitiga.setTinggi(4);

        //Memanggil Method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        System.out.println();

        persegi.luas();
        persegi.keliling();
        System.out.println();

        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        msegitiga.luas();
        msegitiga.keliling();
        System.out.println();
    }
}
