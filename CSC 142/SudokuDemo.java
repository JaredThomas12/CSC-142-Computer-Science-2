/* A demo file to test Sudoku class */

public class SudokuDemo
{
   public static void main(String[] args)
   {
      int[][] SudokuSolution={

              {5,3,4,6,7,8,9,1,2},
              {6,7,2,1,9,5,3,4,8},
              {1,9,8,3,4,2,5,6,7},
              {8,5,9,7,6,1,4,2,3},
              {4,2,6,8,5,3,7,9,1},
              {7,1,3,9,2,4,8,5,6},
              {9,6,1,5,3,7,2,8,4},
              {2,8,7,4,1,9,6,3,5},
              {3,4,5,2,8,6,1,7,9}
          };
      int[][] SudokuSolutionFalse={

              {5,3,4,6,7,8,9,1,9},
              {6,7,2,1,9,5,3,4,8},
              {1,9,8,3,4,2,5,6,7},
              {8,5,9,7,6,1,4,2,3},
              {4,2,6,8,5,3,7,9,1},
              {7,1,3,9,2,4,8,5,6},
              {9,6,1,5,3,7,2,8,4},
              {2,8,7,4,1,9,6,3,5},
              {3,4,5,2,8,6,1,7,9}
          };      
      int[][] SudokuSolutionFalse2={

              {5,3,4,6,7,8,9,1,999},
              {6,7,2,1,9,5,3,4,8},
              {1,9,8,3,4,2,5,6,7},
              {8,5,9,7,6,1,4,2,3},
              {4,2,6,8,5,3,7,9,1},
              {7,1,3,9,2,4,8,5,6},
              {9,6,1,5,3,7,2,8,4},
              {2,8,7,4,1,9,6,3,5},
              {3,4,5,2,8,6,1,7,9}
          };
      
      // Test Constructor 
      Sudoku testSudoku = new Sudoku(SudokuSolution);
      Sudoku testSudokuFalse = new Sudoku(SudokuSolutionFalse);
      Sudoku testSudokuFalse2 = new Sudoku(SudokuSolutionFalse2);
      
      // Test isValidSolution()
      System.out.println(testSudoku.isValidSolution()); // output true 
      System.out.println(testSudokuFalse.isValidSolution()); // output false 
      System.out.println(testSudokuFalse2.isValidSolution()); // output false 
      
      // Test showSudoku()
      // Expected output:
      /*
                    5,3,4,6,7,8,9,1,2,
                 6,7,2,1,9,5,3,4,8,
                 1,9,8,3,4,2,5,6,7,
                 8,5,9,7,6,1,4,2,3,
                 4,2,6,8,5,3,7,9,1,
                 7,1,3,9,2,4,8,5,6,
                 9,6,1,5,3,7,2,8,4,
                 2,8,7,4,1,9,6,3,5,
                 3,4,5,2,8,6,1,7,9,
      */
      testSudoku.showSudoku();
      
      // Test getSudokuSize()
      System.out.println(testSudoku.getSudokuSize()); // output 9
      
   }
}