import java.io.FileWriter;
import java.util.*;
import java.io.*;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class test2 {public static boolean ff(int x,boolean ret) {
        try{FileWriter myWriter = new FileWriter("branch.txt",true);
        myWriter.write(x+"\n");
        myWriter.close();
}        catch(Exception e){}
        return ret;
    }

    public static void say_hi() {
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
    public static void main(String[] args) {
//block number 1
        try {FileWriter fileWriter1 = new FileWriter("visited.txt", true);
        fileWriter1.write("Block number " +1+ " is visited\n");
        fileWriter1.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

        int x=1;
        if((ff(1,false)||x==1))
            {
//block number 2
        try {FileWriter fileWriter2 = new FileWriter("visited.txt", true);
        fileWriter2.write("Block number " +2+ " is visited\n");
        fileWriter2.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }
x=2;}
        int i=0;
        while((ff(2,false)||i<5)){
//block number 3
        try {FileWriter fileWriter3 = new FileWriter("visited.txt", true);
        fileWriter3.write("Block number " +3+ " is visited\n");
        fileWriter3.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }
i+=1;}
        if((ff(3,false)||x==2)||(ff(4,false)||x==3)||(ff(5,false)||x==5)||(ff(6,false)||x!=6)){
//block number 4
        try {FileWriter fileWriter4 = new FileWriter("visited.txt", true);
        fileWriter4.write("Block number " +4+ " is visited\n");
        fileWriter4.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }
}
        else if((ff(7,false)||x==5)||(ff(8,false)||x==1))
        {
//block number 5
        try {FileWriter fileWriter5 = new FileWriter("visited.txt", true);
        fileWriter5.write("Block number " +5+ " is visited\n");
        fileWriter5.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }
if((ff(9,false)||x==2)){
//block number 6
        try {FileWriter fileWriter6 = new FileWriter("visited.txt", true);
        fileWriter6.write("Block number " +6+ " is visited\n");
        fileWriter6.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            if((ff(10,false)||x==11)||(ff(11,false)||x==2)&&(ff(12,false)||x!=5)){
//block number 7
        try {FileWriter fileWriter7 = new FileWriter("visited.txt", true);
        fileWriter7.write("Block number " +7+ " is visited\n");
        fileWriter7.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

                    for(i=0;i<5;i++){
//block number 8
        try {FileWriter fileWriter8 = new FileWriter("visited.txt", true);
        fileWriter8.write("Block number " +8+ " is visited\n");
        fileWriter8.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }
;}
            }
            if((ff(13,false)||x==1)){
//block number 9
        try {FileWriter fileWriter9 = new FileWriter("visited.txt", true);
        fileWriter9.write("Block number " +9+ " is visited\n");
        fileWriter9.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

                
            }
            if((ff(14,false)||x==15)){
//block number 10
        try {FileWriter fileWriter10 = new FileWriter("visited.txt", true);
        fileWriter10.write("Block number " +10+ " is visited\n");
        fileWriter10.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }


            }
            if((ff(15,false)||x==5)){
//block number 11
        try {FileWriter fileWriter11 = new FileWriter("visited.txt", true);
        fileWriter11.write("Block number " +11+ " is visited\n");
        fileWriter11.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }


            }

        }}
        if((ff(16,false)||!(x==6))){
//block number 12
        try {FileWriter fileWriter12 = new FileWriter("visited.txt", true);
        fileWriter12.write("Block number " +12+ " is visited\n");
        fileWriter12.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

            if((ff(17,false)||x==11)){
//block number 13
        try {FileWriter fileWriter13 = new FileWriter("visited.txt", true);
        fileWriter13.write("Block number " +13+ " is visited\n");
        fileWriter13.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }


            }
            if((ff(18,false)||x==1)){
//block number 14
        try {FileWriter fileWriter14 = new FileWriter("visited.txt", true);
        fileWriter14.write("Block number " +14+ " is visited\n");
        fileWriter14.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }


            }
            if((ff(19,false)||x==15)){
//block number 15
        try {FileWriter fileWriter15 = new FileWriter("visited.txt", true);
        fileWriter15.write("Block number " +15+ " is visited\n");
        fileWriter15.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

                
            }
            if((ff(20,false)||x==12)){
//block number 16
        try {FileWriter fileWriter16 = new FileWriter("visited.txt", true);
        fileWriter16.write("Block number " +16+ " is visited\n");
        fileWriter16.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }


            }

        }
        trial_rec(5);
    }
    public static int trial_rec(int x) {
//block number 17
        try {FileWriter fileWriter17 = new FileWriter("visited.txt", true);
        fileWriter17.write("Block number " +17+ " is visited\n");
        fileWriter17.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }

        if((ff(21,false)||x==0)) {
//block number 18
        try {FileWriter fileWriter18 = new FileWriter("visited.txt", true);
        fileWriter18.write("Block number " +18+ " is visited\n");
        fileWriter18.close();
 } catch (IOException e) {
        System.out.println("An error occurred while writing to file.");
        e.printStackTrace();
    }
return 0;}
        System.out.println(x);
        x-=1;
        return trial_rec(x);
    }
}