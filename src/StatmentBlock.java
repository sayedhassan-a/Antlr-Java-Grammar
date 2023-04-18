import org.antlr.v4.runtime.TokenStreamRewriter;

public class StatmentBlock extends JavaParserBaseListener {
    boolean flag=false;
    TokenStreamRewriter rewriter;
    int block_num;
    int cur_block;
    boolean add_imports;
    public StatmentBlock(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
        this.block_num = 0;
        this.add_imports = false;
    }
    @Override

    public void enterStatement(JavaParser.StatementContext ctx) {

        if (flag) {
            flag = false;
            if (ctx.getText().charAt(0) == '{') {

            } else {
                rewriter.insertBefore(ctx.getStart(), "{");
                rewriter.insertAfter(ctx.getStop(), "}");

            }
        }
        //super.enterStatement(ctx);
        String s = ctx.getText();

        try {
            String x = s.substring(0, 2);
            if (x.equals("if")) {
                flag = true;
            }
        } catch (Exception e) {
        }
        try {
            String x = s.substring(0, 3);
            if (x.equals("for")) {
                flag = true;
            }
        } catch (Exception e) {
        }
        try {
            String x = s.substring(0, 5);
            if (x.equals("while")) {
                flag = true;
            }
        } catch (Exception e) {
        }
    }
}
