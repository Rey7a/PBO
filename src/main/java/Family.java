public class Family {
    public static void main(String[] args) {
        Parent bapak = new Parent("Maskur", "Kendal", "06 Juni 1972", "Petani", "Kendal");
        Parent ibu = new Parent("Istikoh", "Kendal", "08 juni 1980", "Ibu Rumah Tangga", "Kendal");

        Child anak1 = new Child("Reza Fatikhul Hidayat", "Kendal", "06 Agustus 2004", "Pelajar/Mahasiswa", "Kendal");
        Child anak2 = new Child("Mikaila Azna Qurrotunada", "Kendal", "16 Juni 2016", "Pelajar", "Kendal");

        System.out.println("------ Bapak ------");
        System.out.println(bapak.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibu.getDetails());

        System.out.println("------ Anak ------");
        System.out.println(anak1.getDetails());
        System.out.println(anak2.getDetails());
    }
}
