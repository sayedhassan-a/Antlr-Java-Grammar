import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class Main {
    public static void say_hi() throws Exception {
//block number 0
        try {FileWriter fileWriter0 = new FileWriter("visited.txt", true);
        fileWriter0.write("Block number " +0+ " is visited\n");
        fileWriter0.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

        System.out.println("Hi");
    }
    public static void main(String[] args) throws Exception{
//block number 1
        try {FileWriter fileWriter1 = new FileWriter("visited.txt", true);
        fileWriter1.write("Block number " +1+ " is visited\n");
        fileWriter1.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

        trial_rec(5);
        int x=5;
        //ANTLRFileStream input=new ANTLRFileStream("C:\\Users\\Sayed\\IdeaProjects\\trial\\src\\trial.java");
        say_hi();
        if(5>=4){
//block number 2
        try {FileWriter fileWriter2 = new FileWriter("visited.txt", true);
        fileWriter2.write("Block number " +2+ " is visited\n");
        fileWriter2.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            if(1==0){
//block number 3
        try {FileWriter fileWriter3 = new FileWriter("visited.txt", true);
        fileWriter3.write("Block number " +3+ " is visited\n");
        fileWriter3.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

                say_hi();
            }
        }
        for(int i=0;i<5;i++){
//block number 4
        try {FileWriter fileWriter4 = new FileWriter("visited.txt", true);
        fileWriter4.write("Block number " +4+ " is visited\n");
        fileWriter4.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            System.out.println("Hello");
            say_hi();
        }
    }
    public static int trial_rec(int x) throws Exception{
//block number 5
        try {FileWriter fileWriter5 = new FileWriter("visited.txt", true);
        fileWriter5.write("Block number " +5+ " is visited\n");
        fileWriter5.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

        if(x==0) return 0;
        System.out.println(x);
        x-=1;
        return trial_rec(x);
    }
}
