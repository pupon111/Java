package org.example.chapter01.task17;
/*
Java Development Kit включает файл src.zip с исходным кодом библиотеки Java. Распакуйте его и
с помощью любимого инструмента текстового поиска найдите случаи использования помеченных (labeled)
операторов break и continue.
Возьмите один из них и перепишите его без использования меток.
 */
public class Main {
    public static void main(String[] args) {
        byte[] seed = {1, 2, 3, 4, 5};
        int n = 3;
        int z = 1;
        long[] result = convertSeedBytesToLongs(seed, n, z);
        System.out.println("Результат:");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("result[%d] = %d%n", i, result[i]);
        }
    }
    public static final long SILVER_RATIO_64 = 0x6A09E667F3BCC909L;
    public static long mixMurmur64(long z) {
        z = (z ^ (z >>> 33)) * 0xff51afd7ed558ccdL;
        z = (z ^ (z >>> 33)) * 0xc4ceb9fe1a85ec53L;
        return z ^ (z >>> 33);
    }
    public static long[] convertSeedBytesToLongs(byte[] seed, int n, int z) {
        final long[] result = new long[n];
        final int m = Math.min(seed.length, n << 3);
        // Distribute seed bytes into the words to be formed.
        for (int j = 0; j < m; j++) {
            result[j>>3] = (result[j>>3] << 8) | (seed[j] & 0xFF);
        }
        // If there aren't enough seed bytes for all the words we need,
        // use a SplitMix-style PRNG to fill in the rest.
        long v = result[0];
        for (int j = (m + 7) >> 3; j < n; j++) {
            result[j] = mixMurmur64(v += SILVER_RATIO_64);
        }
        // Finally, we need to make sure the last z words are not all zero.
        boolean flag = true;
        for (int j = n - z; j < n; j++) {
            if (result[j] != 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            long w = result[0] & ~1L;
            for (int j = n - z; j < n; j++) {
                result[j] = mixMurmur64(w += SILVER_RATIO_64);
            }
        }

        return result;
        /*search: {
            for (int j = n - z; j < n; j++) {
                if (result[j] != 0) break search;
            }
            // If they are, fill in using a SplitMix-style PRNG.
            // Using "& ~1L" in the next line defends against the case z==1
            // by guaranteeing that the first generated value will be nonzero.
            long w = result[0] & ~1L;
            for (int j = n - z; j < n; j++) {
                result[j] = mixMurmur64(w += SILVER_RATIO_64);
            }
        }*/
    }
}
