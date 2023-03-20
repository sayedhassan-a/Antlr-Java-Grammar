import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {
    public static void main(String[] args) throws Exception{

        ANTLRInputStream input = new ANTLRFileStream("C:\\Users\\Sayed\\IdeaProjects\\trial\\src\\trial.java");
        JavaLexer lexer=new JavaLexer(input);
        CommonTokenStream tokens= new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new myBaseListener(rewriter), tree);
        System.out.println(rewriter.getText());


    }
}