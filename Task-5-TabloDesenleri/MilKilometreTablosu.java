public class MilToKilometre {
    public static void main(String[] args) {
        // Dönüşüm katsayısı
        double katsayi = 1.609;

        // Mil değerleri
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("Mil -> Kilometre Dönüşüm Tablosu");
        System.out.println("-------------------------------");

        for (int mil : milDegerleri) {
            double kilometre = mil * katsayi;
            System.out.println(mil + " mil = " + kilometre + " kilometre");
        }
    }
}

