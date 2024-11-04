import java.util.Scanner;

class Tic_Tac_Toe{
    
    public static void main(String[] args){
        System.out.println("Welcome to tic tac toe game");
        char[][] board =new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                board[row][col]=' ';
            }
        }
    

         Scanner sc=new Scanner(System.in);
         boolean gameOver=false;
         char player='X';

        while(!gameOver){
            printBoard(board);
            System.out.println();
            System.out.println("Player " +player+ " Enter: ");
            System.out.print("Enter row:");
            int row=sc.nextInt();
            System.out.print("Enter col:");
            int col=sc.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                gameOver=hasWon(board,player);
            
                if(gameOver){
                   System.out.println("Player "+player+" has won!!");
                }

                else{
                    player=player=='X'?'O':'X';
                }
            }
            else{
                System.out.println("Invalid Move");
            }
        

       }
       printBoard(board);

    }

    public static boolean hasWon(char[][] board,char player){
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
                return true;
            }
        }

        for(int col=0;col<board[0].length;col++){
            if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
                return true;
            }
        }

        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }

        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return false;
    }
    
    public static void printBoard(char[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
        }
    }

}
