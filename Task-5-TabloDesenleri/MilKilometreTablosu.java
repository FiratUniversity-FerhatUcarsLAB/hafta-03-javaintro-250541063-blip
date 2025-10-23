public class CarpimTablosuIki {

    public static void main(String[] args) {
        
        int carpan = 2; 
        int sinir = 10;
        System.out.println("--- " + carpan + "'nin Çarpım Tablosu (1'den " + sinir + "'a Kadar) ---");
        System.out.println("==========================================");
        
        for (int i = 1; i <= sinir; i++) {
            
            int sonuc = carpan * i; 
            System.out.printf("%d x %-2d = %d%n", carpan, i, sonuc);
        }
        System.out.println("==========================================");
    }
}

