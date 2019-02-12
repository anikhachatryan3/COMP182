//Name: Ani Khachatryan
//Date: 02/02/2019
//App: Sudoku Solver
//Purpose:

import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;
import java.io.IOException;

class Sudoku {

    private int[][] sudoku;
    private static final int DEFAULT = 0;
    
    public Sudoku (int[][] sudoku) {
        
        this.sudoku = sudoku;
        sudoku = new int[9][9];
       
    }
    
    
    
    /*public void read() {
        try {
            Scanner sc = new Scanner(new File("SudokuPuzzle.txt"));
            
            while(sc.hasNextLine()) {
                String word = sc.nextLine();
                // store word in my array and increment idx
                myArray[idx] = word;
                idx++;
                //System.out.println();
                
            }
            
        }
    }
        
    private void swap(int j, String[] myArray) {
            
        String str = myArray[j - 1];
        myArray[j - 1] = myArray[j];
        myArray[j] = str;
            
    }
        
    public void write() {
            
        try {
                
            PrintStream writer = new PrintStream(new File("output.txt"));
            for(int i = 0; i < 30000; i++) {
                    
                writer.println(myArray[i]);
                    
            }
                
            writer.close();
                
        }
            
        catch(IOException e) {
                
            System.out.println(e);
                
        }
        
    }*/
    
}


