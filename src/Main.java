import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{
        SortedSet<String> hash_Set = new TreeSet<String>();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter file path");
        String file_name = myObj.nextLine();  // Read user input

        ANTLRInputStream input = new ANTLRFileStream(file_name);
        JavaLexer lexer=new JavaLexer(input);
        CommonTokenStream tokens= new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new myBaseListener(rewriter), tree);


        FileWriter myWriter = new FileWriter("Main.java");
        myWriter.write(rewriter.getText());
        myWriter.close();


    }
}
