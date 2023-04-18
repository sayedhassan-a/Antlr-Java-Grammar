import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HTMLBranchCoverage extends JavaParserBaseListener{
    TokenStreamRewriter rewriter;
    int cnt=0,block_num=0,last=0;
    boolean flag=false;
    boolean add_imports=false;

    public HTMLBranchCoverage(TokenStreamRewriter rewriter){
        this.rewriter = rewriter;

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
    public void visitTerminal(TerminalNode node) {
        if(node.getText().equals("||")||node.getText().equals("&&")){
            flag=true;
        }

    }

    @Override
    public void enterParExpression(JavaParser.ParExpressionContext ctx) {
        flag=true;
        last=cnt+1;

    }

    @Override
    public void exitParExpression(JavaParser.ParExpressionContext ctx) {
        boolean ch=true;
        boolean once=false;
        for(int i=last;i<=cnt;i++)
        {
            System.out.println(i);
            String s=Integer.toString(i);

            try {
                File myObj = new File(".\\branch.txt");
                Scanner myReader = new Scanner(myObj);
                boolean cur=false;
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    if(data.equals(s))
                    {
                        cur=true;
                    }
                }
                if(!cur)ch=false;
                else once=true;
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        if(!ch&&once)
        {
            rewriter.insertAfter(ctx.getStart(),"<pre style=\"background-color:orange;display:inline;\">");
            rewriter.insertBefore(ctx.getStop(),"</pre>");
        }
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        if(flag&&ctx.AND()==null&&ctx.OR()==null)
        {
            cnt++;
            flag=false;
            if(ctx.getText().charAt(0)=='(')flag=true;
        }
    }



}
