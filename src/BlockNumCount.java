import org.antlr.v4.runtime.TokenStreamRewriter;

public class BlockNumCount extends JavaParserBaseListener{
    int block_num;
    int cur_block;
    boolean add_imports;
    TokenStreamRewriter rewriter;
    public BlockNumCount(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
        this.block_num = 0;
        this.add_imports = false;
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
    public void enterBlock(JavaParser.BlockContext ctx) {
        //System.out.println(ctx.getText());
        //System.out.println("{//block number "+block_num+ctx.getText().substring(1));
        rewriter.insertAfter(ctx.getStart(), "\n//block number "+block_num+"\n"+"        try {FileWriter fileWriter"+block_num+" = new FileWriter(\"visited.txt\", true);\n" +
                "        fileWriter"+block_num+".write(\"Block number \" +"+block_num +"+ \" is visited\\n\");\n" +
                "        fileWriter"+block_num+".close();\n } catch (IOException e) {\n" +
                "        System.out.println(\"An error occurred while writing to file.\");\n" +
                "        e.printStackTrace();\n" +
                "    }\n");


        block_num++; //block number to indicate numbe of blocks passed
    }

}