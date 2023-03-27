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
        if (block_num == 0) {
            rewriter.insertAfter(ctx.getStart(), "//block number" + block_num + "\n" + "Vector<String> hash_Set = new Vector<String>();\n" + "hash_Set.add(\"block number\"" + "+\" " + block_num + " \"+" + "\"is visited\");\n");
            rewriter.insertBefore(ctx.getStop(), "FileWriter myWriter = new FileWriter(\"visited.txt\");\n" +
                    "Iterator<String> itr = hash_Set.iterator();\n" +
                    "while(itr.hasNext()){\n" +
                    "myWriter.write(itr.next());\n" +
                    "myWriter.write(\'\\n\');\n" +
                    "}\n" +
                    "myWriter.close();\n");
        } else {
            rewriter.insertAfter(ctx.getStart(), "//block number" + block_num + "\n" + "hash_Set.add(\"block number\"" + "+\" " + block_num + " \"+" + "\"is visited\");\n");
        }

        block_num++; //block number to indicate numbe of blocks passed
    }
}
