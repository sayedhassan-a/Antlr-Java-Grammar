public class Main {
    public static void main(String[] args) throws Exception{
        int a = 10, b = 20, c = 20, d = 0;
        if ((a < b) || (b == c))
        {
            if ((a < b) && (b == c))
            {
                if ((a < b) || (b == d))
                {
                    if ((a < b) && (b == d))
                    {
                        d = a + b + c;
                    }

                }

            }

            System.out.println("The sum is: " + d);
        }

        else if ((a > b) && (b == c)){
            System.out.println("The sum is: " + d);

        }
        else
            System.out.println("The sum is: " + d);
    }
}
