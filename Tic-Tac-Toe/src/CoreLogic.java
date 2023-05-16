import java.util.Arrays;

public class CoreLogic {
    String a = "_";
    String b = "_";
    String c = "_";
    String d = "_";
    String e = "_";
    String f = "_";
    String j = "_";
    String k = "_";
    String l = "_";




    private String[][] field  = {{a,b,c}, {d,e,f}, {j,k,l}}; //3х3 поле
    private String player = "X";
    private boolean flag = false;




    public String[][] GetFiled()//мб если буду делать больше поле
    {
        return field;
    }

    public void SetMove(int x, int y, String letter)//Выполнить ход
    {
        field[x][y] = letter;
    }

    public String GetMove(int x, int y) //получить информацию о по id клетки
    {
        return field[x][y];
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

    public void FinishSecurity(String[][] arr){
        if(arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] && arr[0][0] == arr[0][2]) //up3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]);}
        if(arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] && arr[1][0] == arr[1][2]) //middle3
            {System.out.println("Игра завершена, победил игрок: "+arr[1][0]);}
        if(arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] && arr[2][0] == arr[2][2]) //down3
            {System.out.println("Игра завершена, победил игрок: "+arr[2][0]);}

        if(arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && arr[2][0] == arr[0][0]) //left3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]);}
        if(arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && arr[2][1] == arr[0][1]) //cencer3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][1]);}
        if(arr[0][3] == arr[1][3] && arr[1][3] == arr[2][3] && arr[2][3] == arr[0][3]) //right3
            {System.out.println("Игра завершена, победил игрок: "+arr[0][3]);}

        if(arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[0][0] == arr[2][2]) //diag1
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]);}
        if(arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[2][0] == arr[0][2]) //diag2
            {System.out.println("Игра завершена, победил игрок: "+arr[0][0]);}
    }

}
