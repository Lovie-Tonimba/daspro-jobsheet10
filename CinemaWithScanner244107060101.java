import java.util.Scanner;
public class CinemaWithScanner244107060101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column;
        String name, next;
        String [][] audience = new String[4][2];

        while (true) { 
            System.out.println("==========MENU OPTIONS===========");
            System.out.println("1 = Input audience data");
            System.out.println("2 = Show audience list");
            System.out.println("3 = Exit");
            System.out.print("Select one of the following menus (1-3): ");
            int select = sc.nextInt();

            if(select == 1) {
                while (true) { 
                    System.out.println("~~~~~~~~~~INPUT AUDIENCE DATA~~~~~~~~~~");
                    System.out.print("Enter a name: ");
                    name = sc.next();
                    System.out.print("Enter row number (1-4): ");
                    row = sc.nextInt();
                    System.out.print("Enter column number (1-2): ");
                    column = sc.nextInt();
                    sc.nextLine();
        
                    if(row < 1 || row > audience.length || column < 1 || column > audience[row].length){
                        System.out.println("This seat is not available");
                        continue;
                    }

                    if(audience[row - 1][column - 1] != null){
                        System.out.println("WARNING!\nThis seat is already occupied by other audiences\nPlease enter another row and column number");
                        continue;
                    }

                    audience[row - 1][column - 1] = name;
        
                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = sc.nextLine();
                    if(next.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }else if(select == 2){
                System.out.println("~~~~~~~~~~AUDIENCE LIST~~~~~~~~~~");
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        if(audience[i][j] == null){
                            System.out.println("Row " + (i+1) +"-Column " + (j+1) + " : ***");
                        }else{
                            System.out.println("Row " + (i+1) +"-Column " + (j+1) + " : " + audience[i][j]);
                        }
                    }
                }
            }else if(select == 3){
                System.out.println("~~~~~~~~~~EXITING PROGRAM~~~~~~~~~~");
                break;
            }else{
                System.out.println("Please select a valid number of the following menus!");
            }      
        }
    }
}