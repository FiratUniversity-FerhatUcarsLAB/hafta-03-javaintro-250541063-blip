public class DonusumTablosu {

    public static void main(String[] args) {
        
        final double MIL_KM_ORANI = 1.609;
        
       
        int[] milDegerleri = {1, 5, 10, 20, 50};
    
        System.out.println("Mil → Kilometre Dönüşüm Tablosu");
        System.out.println("=================================");
        System.out.printf("%-10s | %s%n", "Mil", "Kilometre");
        System.out.println("---------------------------------");
        
       
        for (int mil : milDegerleri) {
            
            
            double kilometre = mil * MIL_KM_ORANI;
            
           
            System.out.printf("%-10d | %.3f%n", mil, kilometre);
        }
        
        System.out.println("=================================");
        System.out.printf("(1 Mil = %.3f Km)%n", MIL_KM_ORANI);
    }
}
