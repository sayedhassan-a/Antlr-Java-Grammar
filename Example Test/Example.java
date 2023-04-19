import java.io.FileWriter;
import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class Example {public static boolean ff(int x,boolean ret) {
        try{FileWriter myWriter = new FileWriter("branch.txt",true);
        myWriter.write(x+"\n");
        myWriter.close();
}        catch(Exception e){}
        return ret;
    }

    public static void main(String[] args) {
//block number 0
        try {FileWriter fileWriter0 = new FileWriter("visited.txt", true);
        fileWriter0.write("Block number " +0+ " is visited\n");
        fileWriter0.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

        int x = 5;
        if ((ff(1,false)||x == 5) || (ff(2,false)||x == 7)) {
//block number 1
        try {FileWriter fileWriter1 = new FileWriter("visited.txt", true);
        fileWriter1.write("Block number " +1+ " is visited\n");
        fileWriter1.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            System.out.println("x is 5 or 7");
        }
        else if ((ff(3,false)||x == 3) && (ff(4,false)||x != 6)) {
//block number 2
        try {FileWriter fileWriter2 = new FileWriter("visited.txt", true);
        fileWriter2.write("Block number " +2+ " is visited\n");
        fileWriter2.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            System.out.println("x is 3 but not 6");
        }
        else {
//block number 3
        try {FileWriter fileWriter3 = new FileWriter("visited.txt", true);
        fileWriter3.write("Block number " +3+ " is visited\n");
        fileWriter3.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            System.out.println("x is neither 5 nor 7 nor 3");
        }
        int y = 10;
        while ((ff(5,false)||y < 20)) {
//block number 4
        try {FileWriter fileWriter4 = new FileWriter("visited.txt", true);
        fileWriter4.write("Block number " +4+ " is visited\n");
        fileWriter4.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            System.out.println(y);
            y++;
        }
        if ((ff(6,false)||x > y) || (ff(7,false)||y < 15)) {
//block number 5
        try {FileWriter fileWriter5 = new FileWriter("visited.txt", true);
        fileWriter5.write("Block number " +5+ " is visited\n");
        fileWriter5.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            System.out.println("either x is greater than y or y is less than 15");
        }
    }
}
