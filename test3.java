public class test3 {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;
        int dum;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        int count = 0;
        while (count < num) {
            if (count % 2 == 0) dum=1;

            else{
                dum=2;
            }
                count++;
        }

        int x = 8;
        if (x > 5 && x < 15) {
            dum=3;
        } else if (x > 15 || x < 0)
            dum=4;
        else {
            dum=5;
        }

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i > 2) {
                dum=6;
            } else if (i % 2 == 1 || i == 1) {
                dum=7;
            }
        }

int t=1;

        if (t % 2 == 0 && t > 2) {
            dum=6;
        } else if (t % 2 == 1 || t == 2) {
            dum=7;
        }


        if (sum > 20 && sum % 2 == 0) dum=4;
        else if (sum > 20 && sum % 2 == 1) dum=2;

        else {
            dum = 1;
        }
    }
}
