public class Yeet
{

   private int[][] sudokuArray;
   private int sudokuSize;
   /*
   public Sudoku(int[][] sudokuSolution)
   {
         sudokuArray = sudokuSolution;
         sudokuSize = 9;
   }
   */
   public boolean isValidSolution()
   {
      boolean[] testRow = new boolean[9];

      int currentVal = 0;
      for(int row = 0; row < sudokuArray.length; row ++)
      {
         testRow = new boolean[9];

         for(int col = 0; col < sudokuArray[0].length; col++)
         {
         
            currentVal = sudokuArray[row][col];
            if(currentVal < 1 || currentVal >9)
            {
               return false;
            }
            else
            {
               if(testRow[currentVal - 1] == false)
               {
                  testRow[currentVal-1] = true;
               }
               else
               { 
                  return false;
               }
            }
            
         }
       }
}