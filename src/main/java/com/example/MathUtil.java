package com.example;

public class MathUtil {
    static int mdc(int a, int b) {
        // P7
        a = Math.abs(a);
        b = Math.abs(b);

        int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        // P1
        if (b > 0 && a % b == 0) {
            return b;
        }
        if (b == 0)
            return Math.abs(a);

        throw new UnsupportedOperationException("Não foi possível calcular o MDC com os valores informados");
    }
}

