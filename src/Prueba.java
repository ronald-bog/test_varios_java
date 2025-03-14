import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {
        int[] array = {-4, 2, 1, 4, -3, 6,-7,8};
//        Integer k = 100;
//        System.out.println(exists(array,k));
        temp(array);
        int[] numeros = {5, 3, 8, 2, 9, 1};

    }

    public static void fibo(int n) {
        int a = 0, b = 1;
        for (int i = 0; a < n; i++, a = b - a) {
            System.out.print(a + (i == n - 1 ? "" : ","));
            b += a;
        }
    }

    public static void temp(int[] ts) {

    }
}

//    public static int temperaturaMasCercanaA0(int[] ts) {
//        if (ts.length == 0) {
//            return 0;
//        }
//
//        int positiva = Integer.MAX_VALUE;
//        int negativa = Integer.MIN_VALUE;
//
//        for (int i = 0; i < ts.length; i++) {
//            if (ts[i] >= 0 && ts[i] <= 10000) {
//                if (ts[i] < positiva) {
//                    positiva = ts[i];
//                }
//            } else if (ts[i] < 0 && ts[i] >= -10000) {
//                if (ts[i] > negativa) {
//                    negativa = ts[i];
//                }
//            }
//        }
//
//        if (negativa == Integer.MIN_VALUE) {
//            return positiva;
//        } else if (Math.abs(negativa) <= positiva) {
//            return negativa;
//        } else {
//            return positiva;
//        }
//    }

//    public static int temperaturaMasCercanaA0(int[] ts) {
//        if (ts.length == 0) {
//            return 0;
//        }
//        int positiva = Integer.MAX_VALUE;
//        int negativa = Integer.MIN_VALUE;
//
//        for (int t : ts) {
//            if (t >= 0 && t <= 10000) {
//                positiva = Math.min(positiva, t);
//            } else if (t < 0 && t >= -10000) {
//                negativa = Math.max(negativa, t);
//            }
//        }
//        return negativa == Integer.MIN_VALUE ? positiva :
//                Math.abs(negativa) <= positiva ? negativa :
//                        positiva;
//    }

//    public static int computeClosestToZero(int[] ts) {
//        if (ts == null || ts.length == 0) {
//            return 0;
//        }
//        int closestTemp = ts[0];
//        for (int i = 1; i < ts.length; i++) {
//            if (Math.abs(ts[i]) < Math.abs(closestTemp) ||
//                    (Math.abs(ts[i]) == Math.abs(closestTemp) &&
//                            ts[i] > closestTemp)) {
//                closestTemp = ts[i];
//            }
//        }
//        return closestTemp;
//    }

//    public static boolean exists(int[] ints, int k) {
//        return Arrays.binarySearch(ints, k) >= 0;
//    }
//}

