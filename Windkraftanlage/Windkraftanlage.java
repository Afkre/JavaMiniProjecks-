package Windkraftanlage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Windkraftanlage {
    private static final String SETTINGS_FILE = "settings.txt";
    private static final int MIN_SPEED = 1;
    private static final int MAX_SPEED = 10;

    public static void main(String[] args) {
        final int[] speed = { readSpeedSettings() };

        Thread rotatingThread = new Thread(() -> {
            while (true) {
                rotate(speed[0]);
                try {
                    Thread.sleep(5000); // 5 saniye bekleyin
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        rotatingThread.start();

        // Hız ayarlarını güncellemek için kullanıcıdan giriş al
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Hızı (1-10 arasında) ayarlayın:");
                String input = reader.readLine();
                int newSpeed = Integer.parseInt(input);

                if (newSpeed >= MIN_SPEED && newSpeed <= MAX_SPEED) {
                    speed[0] = newSpeed;
                    writeSpeedSettings(speed[0]);
                } else {
                    System.out.println("Geçersiz hız değeri. Lütfen 1-10 arasında bir değer girin.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void rotate(int speed) {
        // Windkraftanlage'nin dönmesiyle ilgili gerekli işlemler burada gerçekleştirilir.
        // Hız, burada kullanılacak.
        System.out.println("Windkraftanlage " + speed + " hızında dönüyor.");
    }

    private static int readSpeedSettings() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SETTINGS_FILE))) {
            String speedString = reader.readLine();
            return Integer.parseInt(speedString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Varsayılan hızı döndür
        return MIN_SPEED;
    }

    private static void writeSpeedSettings(int speed) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(SETTINGS_FILE))) {
            writer.write(String.valueOf(speed));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
