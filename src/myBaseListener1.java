import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Vector;

public class myBaseListener1 extends JavaParserBaseListener{
    int block_num;
    TokenStreamRewriter rewriter;
    public myBaseListener1(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
        this.block_num = 0;
    }
    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        //System.out.println(ctx.getText());

        //System.out.println("{//block number "+block_num+ctx.getText().substring(1));
        rewriter.insertAfter(ctx.getStart(),"//block number"+block_num);
        block_num++;
    }

}