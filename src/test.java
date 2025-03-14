import java.util.Calendar;

public class test {

    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        scanner.close();
//        System.out.println(N % 2 != 0 || (6 <= N && N <= 20) ? "Weird" : "Not Weird");

//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//        Scanner sc = new Scanner(System.in);
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < 3; i++) {
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            result.append(String.format("\n%-15s%03d", s1, x));
//        }
//        sc.close();
//        System.out.print("================================");
//        System.out.println(result);
//        System.out.println("================================");

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(bufferedReader.readLine().trim());
//        bufferedReader.close();
//        for (int i = 1; i < 11; i++) {
//            System.out.println(N + " x " + i + " = " + N * i);
//        }

//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            int sum=a;
//            for(int j=0;j<n;j++){
//                sum+=Math.pow(2, j)*b;
//                System.out.print(sum+" ");
//            }
//            System.out.println();
//        }
//        in.close();

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        String result = "";
//        String itera = "";
//        for (int i = 0; i < t; i++) {
//            try {
//                long x = sc.nextLong();
//                result += x + " can be fitted in:\n";
//                if (x >= -128 && x <= 127) result += "* byte\n";
//                if (x >= -32768 && x <= 32767) result += "* short\n";
//                if (x >= -2147483648 && x <= 2147483647) result += "* int\n";
//                result += "* long\n";
//            } catch (Exception e) {
//                result += sc.next() + " can't be fitted anywhere.\n";
//            }
//            itera = result;
//        }
//        System.out.println(itera);

//        Scanner sc = new Scanner(System.in);
//        int i = 1;
//        while (sc.hasNext())
//            System.out.println(i++ + " " + sc.nextLine());

//                  bloque de inicializacion entre claas y main
//        static Scanner sc = new Scanner(System.in);
//        static int B = sc.nextInt();
//        static int H = sc.nextInt();
//        static boolean flag = false;
//
//        static {if(B >0 && H > 0){
//            flag  = true;
//        }else{
//            System.out.print("java.lang.Exception: Breadth and height must be positive");
//        }
//        }

//        String s = Integer.toString(n);
        String cadenaEspecial = "111222333444";
        String cadenaObjetivo = "121";
        int i = 0;
        for (char c : cadenaEspecial.toCharArray()) {
            if (i < cadenaObjetivo.length()) {
                System.out.println(i);

//                cadenaObjetivo.toCharArray()[i]
            }
            i++;
        }

//        System.out.println(cadenaEspecial.toCharArray()[3]);
    }


    public static String findDay(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return (daysOfWeek[dayOfWeek - 1]);
    }


}
