public class Sudoku
{

   private int[][] sudokuArray;
   private int sudokuSize;
  
   public Sudoku(int[][] sudokuSolution)
   {
     	sudokuArray = sudokuSolution;
     	sudokuSize = 9;
   }
  
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
      return true;
    }
      for(int k = 0; k < 3; k++)
      {
        for(int i = 0; i < 3; i++)
         {
            for(int j = 0; j < 3, j++)
            {
            }
         }
      
         
  	//Return true if no matches are found within same sub-grid, column, or row.
   
   public int getSudokuSize()
   {
  	   return sudokuSize;
   }
  
   public void showSudoku()
   {
  	for(int i = 0; i < sudokuArray.length; i++)
  	{
     	for(int j = 0; j < sudokuArray[i].length; j++)
     	{
        	System.out.print(sudokuArray[i][j] + " "); // Prints
     	}
  	System.out.println();
   }
 }
  
}


//bool[] testRow
//bool[] testColumn
//bool[] test3x3





