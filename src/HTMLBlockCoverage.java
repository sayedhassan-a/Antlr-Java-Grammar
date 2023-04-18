import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Vector;
import java.util.*;


public class HTMLBlockCoverage extends JavaParserBaseListener{
    int block_num;
    boolean add_imports;
    TokenStreamRewriter rewriter;
    public HTMLBlockCoverage(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;
        this.block_num = 0;
        this.add_imports = false;
    }

    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        rewriter.insertBefore(ctx.getStart(),"<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>Green Background Paragraph</title>\n" +
                "  </head>\n" +
                "  <body>\n"+"<pre style=\"background-color:green\">\n");
        rewriter.insertAfter(ctx.getStop()," </pre>\n</body>\n" +
                "</html>");
    }

    @Override
    public void enterBlock(JavaParser.BlockContext ctx) {
        String s="Block number "+Integer.toString(block_num)+" is visited";
        int ok=0;
        try {
            File myObj = new File(".\\visited.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.equals(s))
                {
                    ok=1;

                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if(ok==0)
        {
            rewriter.insertBefore(ctx.getStart(),"<pre style=\"background-color:red;\">");
            rewriter.insertAfter(ctx.getStop(),"</pre>");
        }

            block_num++; //block number to indicate numbe of blocks passed
    }

}
