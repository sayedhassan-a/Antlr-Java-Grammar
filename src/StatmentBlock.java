import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

public class StatmentBlock extends JavaParserBaseListener {
    boolean flag=false;
    TokenStreamRewriter rewriter;
    int block_num;
    int cur_block;
    String last="";
    public StatmentBlock(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
        this.block_num = 0;
    }

    @Override
    public void visitTerminal(TerminalNode node) {

        String s = node.getText();
        System.out.println(s);
        last=s;
        try {
            if (s.equals("else")) {
                flag = true;
            }
        } catch (Exception e) {
        }

        try {
            if (s.equals("if")) {
                flag = true;
            }
        } catch (Exception e) {
        }
        try {
            if (s.equals("for")) {
                flag = true;
            }
        } catch (Exception e) {
        }
        try {
            if (s.equals("while")) {
                flag = true;
            }
        } catch (Exception e) {
        }
        if(flag) System.out.println(node.getText());
    }

    @Override

    public void enterStatement(JavaParser.StatementContext ctx) {

        if (flag) {
            try {
                if(last.equals("else")&&ctx.getText().substring(0,3).equals("if "))return;
                if(last.equals("else")&&ctx.getText().substring(0,3).equals("if("))return;
            }
            catch(Exception e){

            }

            flag = false;
            if (ctx.getText().charAt(0) == '{') {

            } else {
                System.out.println(ctx.getText());
                rewriter.insertBefore(ctx.getStart(), "{");
                rewriter.insertAfter(ctx.getStop(), "}");


            }
        }

    }
}


