import java.util.stream.IntStream;

class test3 {

    public static void main(String args[]) {
//        fizzBuzz(15);
        fizzBuzz1(15);
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public static void fizzBuzz1(int n) {
        IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : Integer.toString(i))
                .forEach(System.out::println);
    }
}




