import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.util.*;
import java.io.File;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws Exception{
        SortedSet<String> hash_Set = new TreeSet<String>();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter file path");


        File file = new File("visited.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
        File file2 = new File("branch.txt");
        if (file2.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
        // IF Test
        String file_name = myObj.nextLine();  // Read user input

        File new_file = new File(file_name);
        String new_file_name = new_file.getName();

        ANTLRInputStream input = new ANTLRFileStream(file_name);
        JavaLexer lexer=new JavaLexer(input);
        CommonTokenStream tokens= new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new StatmentBlock(rewriter), tree);
        FileWriter myWriter = new FileWriter("IF.java");
        file_name="IF.java";
        myWriter.write(rewriter.getText());
        myWriter.close();

        //Block Count
        String file_name1 = "IF.java";  // Read user input
         input = new ANTLRFileStream(file_name1);
         lexer=new JavaLexer(input);
         tokens= new CommonTokenStream(lexer);
         parser = new JavaParser(tokens);
         tree = parser.compilationUnit();
         rewriter = new TokenStreamRewriter(tokens);
         walker = new ParseTreeWalker();
         walker.walk(new BlockNumCount(rewriter), tree);
         myWriter = new FileWriter(new_file_name);
         myWriter.write(rewriter.getText());
         myWriter.close();
         // pipe line to run intermediat files



        // branc if
        input = new ANTLRFileStream(new_file_name);
        lexer=new JavaLexer(input);
        tokens= new CommonTokenStream(lexer);
        parser = new JavaParser(tokens);
        tree = parser.compilationUnit();
        rewriter = new TokenStreamRewriter(tokens);
        walker = new ParseTreeWalker();
        walker.walk(new BranchCoverage(rewriter), tree);
        myWriter = new FileWriter(new_file_name);
        myWriter.write(rewriter.getText());
        myWriter.close();

        ProcessBuilder pa = new ProcessBuilder("javac", new_file_name);
        ProcessBuilder pb = new ProcessBuilder("java", new_file_name.substring(0, new_file_name.lastIndexOf('.')));
        pa.directory(new File("./"));
        pb.directory(new File("./"));
        Process process = pa.start();
        int exitCode1 = process.waitFor();
        Process proc = pb.start();
        int exitCode2 = proc.waitFor();
        System.out.println("Process exited with code " + exitCode1+" "+exitCode2);
        try {
            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // HTML Bolck Coverage
        input = new ANTLRFileStream(file_name);
        lexer=new JavaLexer(input);
        tokens= new CommonTokenStream(lexer);
        parser = new JavaParser(tokens);
        tree = parser.compilationUnit();
        rewriter = new TokenStreamRewriter(tokens);
        walker = new ParseTreeWalker();
        walker.walk(new HTMLBlockCoverage(rewriter), tree);
        for (int i = 0; i < rewriter.getTokenStream().size(); i++) {
            Token token = rewriter.getTokenStream().get(i);
            if (token.getType() == JavaLexer.LT) {
                rewriter.replace(i, i, "&lt;");
            }
            if (token.getType() == JavaLexer.GT) {
                rewriter.replace(i, i, "&gt;");
            }
        }
        myWriter = new FileWriter("OutHTML.html");
        myWriter.write(rewriter.getText());
        myWriter.close();

        // HTML Branch Coverage
        input = new ANTLRFileStream(file_name);
        lexer=new JavaLexer(input);
        tokens= new CommonTokenStream(lexer);
        parser = new JavaParser(tokens);
        tree = parser.compilationUnit();
        rewriter = new TokenStreamRewriter(tokens);
        walker = new ParseTreeWalker();
        walker.walk(new HTMLBlockCoverage(rewriter),tree);
        walker.walk(new HTMLBranchCoverage(rewriter), tree);
        for (int i = 0; i < rewriter.getTokenStream().size(); i++) {
            Token token = rewriter.getTokenStream().get(i);
            if (token.getType() == JavaLexer.LT) {
                rewriter.replace(i, i, "&lt;");
            }
            if (token.getType() == JavaLexer.GT) {
                rewriter.replace(i, i, "&gt;");
            }
        }
        myWriter = new FileWriter("branch.html");
        myWriter.write(rewriter.getText());
        myWriter.close();

        String htmlFilePath = "branch.html";
        File htmlFile = new File(htmlFilePath);
        try {
            URI htmlUri = htmlFile.toURI();
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
