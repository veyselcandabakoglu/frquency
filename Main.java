public class Main {
    public static void main(String[] args) {
        // Örnek bir dizi
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Dizideki elemanların frekanslarını bulmak için iki döngü kullanıyoruz
        for (int i = 0; i < dizi.length; i++) {
            int frekans = 1; // Her elemanın frekansı varsayılan olarak 1'dir

            // Daha önce kontrol edilip edilmediğini kontrol etmek için bir iç döngü
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    frekans++; // Eğer aynı eleman bulunursa frekansı arttır
                    // Elemanın tekrar eden bir eleman olarak işaretlenmesi için 0 atanabilir
                    dizi[j] = 0;
                }
            }

            // Eğer eleman daha önce işlenmemişse
            if (dizi[i] != 0) {
                System.out.println(dizi[i] + ": " + frekans + " kez");
            }
        }
    }
}
