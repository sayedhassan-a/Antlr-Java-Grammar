public class test2 {
    public static void say_hi() {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        int x=1;
        if(x==1)
            x=2;
        int i=0;
        while(i<5)i+=1;
        if(x==2||x==3||x==5||x!=6){}
        else if(x==5||x==1)
        if(x==2){
            if(x==11||x==2&&x!=5){
                    for(i=0;i<5;i++);
            }
            if(x==1){
                
            }
            if(x==15){

            }
            if(x==5){

            }

        }
        if(!(x==6)){
            if(x==11){

            }
            if(x==1){

            }
            if(x==15){
                
            }
            if(x==12){

            }

        }
        trial_rec(5);
    }
    public static int trial_rec(int x) {
        if(x==0) return 0;
        System.out.println(x);
        x-=1;
        return trial_rec(x);
    }
}