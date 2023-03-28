import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.Vector;

public class myBaseListener extends JavaParserBaseListener{
    int block_num;
    int cur_block;
    boolean add_imports;
    TokenStreamRewriter rewriter;
    public myBaseListener(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
        this.block_num = 0;
        this.add_imports = false;
    }

    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        if(!add_imports) {
            rewriter.insertBefore(ctx.getStart(), "import java.io.FileWriter;\n" +
                    "import java.util.*;\n");
            add_imports = true;
        }
    }


    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        //System.out.println(ctx.getText());
        //System.out.println("{//block number "+block_num+ctx.getText().substring(1));
        rewriter.insertAfter(ctx.getStart(), "\n//block number "+block_num+"\n"+"        FileWriter fileWriter"+block_num+" = new FileWriter(\"visited.txt\", true);\n" +
                "        fileWriter"+block_num+".write(\"Block number \" +"+block_num +"+ \" is visited\\n\");\n" +
                "        fileWriter"+block_num+".close();\n");


        block_num++; //block number to indicate numbe of blocks passed
    }

}
