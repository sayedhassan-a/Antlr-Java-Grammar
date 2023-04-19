public class Example {
    public static void main(String[] args) {
        int x = 5;
        if (x == 5 || x == 7) {
            System.out.println("x is 5 or 7");
        }
        else if (x == 3 && x != 6) {
            System.out.println("x is 3 but not 6");
        }
        else {
            System.out.println("x is neither 5 nor 7 nor 3");
        }
        int y = 10;
        while (y < 20) {
            System.out.println(y);
            y++;
        }
        if (x > y || y < 15) {
            System.out.println("either x is greater than y or y is less than 15");
        }
    }
}
