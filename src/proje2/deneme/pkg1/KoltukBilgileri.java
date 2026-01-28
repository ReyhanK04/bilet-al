
package proje2.deneme.pkg1;

import java.util.ArrayList;
import java.util.List;

public class KoltukBilgileri {
    
    private static List<String> seciliKoltuklar = new ArrayList<>();

    public static List<String> getSeciliKoltuklar() {
        return seciliKoltuklar;
    }

    public static void setSeciliKoltuklar(List<String> seciliKoltuklar) {
        KoltukBilgileri.seciliKoltuklar = seciliKoltuklar;
    }
    
    public static void addSeciliKoltuk(String koltuk) {
        seciliKoltuklar.add(koltuk);
    }
    
}
