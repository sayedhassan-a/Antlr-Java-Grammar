# Antlr-Java-Grammar
Antlr-Java-Grammar
Build a dynamic code analyzer for Java Language to generate statement and branchescode coverage reports. Kindly refer to this stackoverflow link to know the differencebetween statement and branch coverage.To warm you up, check the expected output of the project that you are expected todeliver at the end of the project.

## Task 2 : <br>
    <p>
      Task require to list the blocks that's entered during runing the code <br>
      This Done by :
        - we record the cur block and the total block numvers
        - first we start at main so we write a java code at that block that insert in a set the block number and that block is visited
        - increas the block num and cur num
        - when entring a new block the we write sniipet of java code that do push the block num and that's visted in the set
        - when exiting the block the cur_block is decreases by one 
        - when the cur block reaches 0 so i am leaving the main so i write a snippet of code that write the set to an outer file
       
    </p>
