import java.util.Arrays;
import java.util.Scanner;

public class CoreLogic {


    private String[][] field  = {{"_","_","_"}, {"_","_","_"}, {"_","_","_"}}; //3х3 поле

    public String[][] GetFiled()//мб если буду делать больше поле
    {
        return field;
    }

    public void SetMove(int x, int y, String letter)//Выполнить ход
    {
        field[x][y] = letter;
    }

    public void ShowPlayground (String[][] arr){

        for (int i =0; i< arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){

            }
        }
        System.out.println("  | X \n"+
                           "――――――――――――┤\n"+
                           "Y |  " + arr[0][0] + "  |  "+ arr[0][1]+ "  |  " + arr[0][2]+"  |\n" +
                           "  |  " + arr[1][0] + "  |  "+ arr[1][1]+ "  |  " + arr[1][2]+"  |\n" +
                           "  |  " + arr[2][0] + "  |  "+ arr[2][1]+ "  |  " + arr[2][2]+"  |\n" );

    }

    public void FinishSecurity(String[][] arr, boolean flag){
        Main main1 = new Main();
        if(arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] && arr[0][0] == arr[0][2] && arr[0][0] !="_") //up3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]); main1.flag = true;}
        if(arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] && arr[1][0] == arr[1][2] && arr[1][0] !="_") //middle3
            {System.out.println("Игра завершена, победил игрок: "+arr[1][0]); main1.flag = true;}
        if(arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] && arr[2][0] == arr[2][2] && arr[2][0] !="_") //down3
            {System.out.println("Игра завершена, победил игрок: "+arr[2][0]); main1.flag = true;}

        if(arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && arr[2][0] == arr[0][0] && arr[0][0] !="_") //left3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]); main1.flag = true;}
        if(arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && arr[2][1] == arr[0][1] && arr[0][1] !="_") //cencer3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][1]); main1.flag = true;}
        if(arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2] && arr[2][2] == arr[0][2] && arr[0][2] !="_") //right3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][2]); main1.flag = true;}

        if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] == arr[2][2] && arr[0][0] !="_") //diag1
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]); main1.flag = true;}
        if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[2][0] == arr[0][2] && arr[0][2] !="_") //diag2
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]); main1.flag = true;}
    }

    int tmp = 0;
    public void UniversalMethodPlayer(boolean flag){
        ShowPlayground(field);
        Scanner scanner = new Scanner(System.in);
        tmp++;
        if (tmp%2==0){
            System.out.printf("Ход №%d. ",tmp); System.out.println("Игрок [O]:");
            System.out.print("\nВведите 'y': ");
            int x = scanner.nextInt();
            System.out.print("Введите 'x': ");
            int y = scanner.nextInt();
            String letter = "O";
            y -=1;
            x -=1;
            SetMove(x,y,letter);
        }else{
            System.out.printf("Ход №%d. ",tmp); System.out.println("Игрок [X]:");
            System.out.print("\nВведите 'y': ");
            int x = scanner.nextInt();
            System.out.print("Введите 'x': ");
            int y = scanner.nextInt();
            String letter = "X";
            y -=1;
            x -=1;
            SetMove(x,y,letter);
        }


    }
}
