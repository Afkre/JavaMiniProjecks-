
import java.io.File;

public class DosyaIsimleriniDegistir {
    public static void main(String[] args) {
        String klasorYolu = "F:/Users/Student/Desktop/ITIL/Kitap cift dilli/Tr";  // İlgili klasörün yolunu buraya girin

        File klasor = new File(klasorYolu);
        File[] dosyalar = klasor.listFiles();

        if (dosyalar != null) {
            for (File dosya : dosyalar) {
                if (dosya.isFile()) {
                    String dosyaAdi = dosya.getName();
                    String yeniDosyaAdi = dosyaAdi.substring(0, dosyaAdi.length() - 4) + "a" + dosyaAdi.substring(dosyaAdi.length() - 4);
                    File yeniDosya = new File(klasorYolu + File.separator + yeniDosyaAdi);
                    dosya.renameTo(yeniDosya);
                }
            }
            System.out.println("Dosya isimleri değiştirildi.");
        } else {
            System.out.println("Klasör boş veya hatalı.");
        }
    }
}