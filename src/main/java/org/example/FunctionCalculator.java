package org.example;

public class FunctionCalculator {
    public double calculate(int a, int b, int n, int m) throws Exception {
        double res = 0;

        if(a > n || b > m){
            return res;
        }

        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                if (i == 0 || j == 0) {
                    throw new Exception("Error: Division by zero is impossible");
                }
                double value = (double) (i % j) / i;
                res += value;
            }
        }
        return res;
    }
}