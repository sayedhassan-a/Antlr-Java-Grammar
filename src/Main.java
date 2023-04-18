import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{
        // IF Test
        String file_name = myObj.nextLine();  // Read user input
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


    }
}
