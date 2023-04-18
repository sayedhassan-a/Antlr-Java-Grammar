public class Main {
    public static void say_hi() {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        int x=1;
        if(x){
            if(x==11){

            }
            if(x==1){

            }
            if(x==15){

            }
            if(x){

            }

        }
        if(!x){
            if(x==11){

            }
            if(x==1){

            }
            if(x==15){

            }
            if(x){

            }

        }
    }
    public static int trial_rec(int x) {
        if(x==0) return 0;
        System.out.println(x);
        x-=1;
        return trial_rec(x);
    }
}