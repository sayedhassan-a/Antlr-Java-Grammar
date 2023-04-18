import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

public class    BranchCoverage extends JavaParserBaseListener{
    TokenStreamRewriter rewriter;
    int cnt=0;
    boolean flag=false;
    boolean add_imports=false;

    public BranchCoverage(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;

    }

    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        if(!add_imports) {
            rewriter.insertBefore(ctx.getStart(), "import java.io.FileWriter;\n" +
                    "import java.util.*;\nimport java.io.*;\n");
            add_imports = true;
        }
    }

    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        rewriter.insertAfter(ctx.getStart(),"public static boolean ff(int x,boolean ret) {\n" +
                "        try{FileWriter myWriter = new FileWriter(\"branch.txt\",true);\n" +
                "        myWriter.write(x+\"\\n\");\n" +
                "        myWriter.close();\n}" +
                "        catch(Exception e){}\n"+
                "        return ret;\n" +
                "    }\n");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if(node.getText().equals("||")||node.getText().equals("&&")){
            flag=true;
        }

    }

    @Override
    public void enterParExpression(JavaParser.ParExpressionContext ctx) {
        flag=true;

    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        if(flag&&ctx.AND()==null&&ctx.OR()==null)
        {
            cnt++;
            rewriter.insertBefore(ctx.getStart(),"(ff("+cnt+",false)||");
            rewriter.insertAfter(ctx.getStop(),")");
            flag=false;
            if(ctx.getText().charAt(0)=='(')flag=true;
        }
    }
}
