public class Main {
    public static void say_hi() throws Exception {
        System.out.println("Hi");
    }
    public static void main(String[] args) throws Exception{
        trial_rec(5);
        int x=5;
        //ANTLRFileStream input=new ANTLRFileStream("C:\\Users\\Sayed\\IdeaProjects\\trial\\src\\trial.java");
        say_hi();
        if(5>=4){
            if(1==0){
                say_hi();
            }
        }
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            say_hi();
        }
    }
    public static int trial_rec(int x) throws Exception{
        if(x==0) return 0;
        System.out.println(x);
        x-=1;
        return trial_rec(x);
    }
}