package math;

/**
 * Created by lancer on 2017/1/23.
 */
public class Util {
    public static void main(String[] args) {
        System.out.println(abs(-5.5));
        System.out.println(isPrime(113));
        System.out.println(sqrt(2));
        System.out.println(Math.sqrt(2));
    }

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static double abs(double x) {
        if (x < 0.0) {
            return -x;
        } else {
            return x;
        }
    }

    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= N; i++) {
                if (N % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 计算平方根（牛顿迭代法）
     *
     * @param c
     * @return
     */
    public static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }

}

