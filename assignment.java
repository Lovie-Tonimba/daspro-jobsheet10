import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int survey [][] = new int[10][6];
        int i, j;
        double totalValue, totalAnswer, averageAnswer, totalQuestion, averageQuestion; 
        double totalOverall = 0, totalRespond = 0, overallAverage;
    
        //User input
        for (i = 0; i < survey.length; i++) {
            System.out.println("Respondent " + (i+1));
            for (j = 0; j < survey[i].length; j++) {
                System.out.print("Enter answer (1-5) for question " + (j+1) + ": ");
                survey[i][j] = sc.nextInt();
                totalOverall += survey[i][j];
                totalRespond++;
            }
        }

        //Display the survey results
        System.out.println("--------------------------------------------------");
        for (i = 0; i < survey.length; i++) {
            totalValue = 0;
            System.out.println("Respondent " + (i+1) + ": ");
            for (j = 0; j < survey[i].length; j++) {
                System.out.println("Question " + (j+1) + " = " + survey[i][j]);
                totalValue += survey[i][j];
            }
            System.out.println("Total survey value respondent " + (i+1) + ": " + totalValue);
        }
        System.out.println("Total survey value from all respondents: " + totalOverall);

        //Display the average value for each respondent
        System.out.println("--------------------------------------------------");
        for (i = 0; i < survey.length; i++) {
            totalAnswer = 0;
            for (j = 0; j < survey[i].length; j++) {
                totalAnswer += survey[i][j];
            }
            averageAnswer = totalAnswer / survey[i].length;
            System.out.println("The average value for respondent " + (i+1) + " is " + averageAnswer);
        }

        //Display the average value for each question
        System.out.println("--------------------------------------------------");
        for (j = 0; j < survey[0].length; j++) {
            totalQuestion = 0;
            for (i = 0; i < survey.length; i++) {
                totalQuestion += survey[i][j];
            }
            averageQuestion = totalQuestion / survey.length;
            System.out.println("The average value for question " + (j+1) + " is " + averageQuestion);
        }

        //Display the overall average value
        System.out.println("--------------------------------------------------");
        overallAverage = totalOverall / totalRespond;
        System.out.println("THE OVERALL AVERAGE VALUE IS " + overallAverage);
    }
}