import java.util.Arrays;

public class CoreLogic {
    String a = "a";
    String b = "b";
    String c = "c";
    String d = "d";
    String e = "e";

    String f = "f";
    String j = "j";
    String k = "k";
    String l = "l";




    private String[][] field  = {{a,b,c}, {d,e,f}, {j,k,l}}; //3х3 поле
    private String player = "X";



    public String[][] GetFiled()//мб если буду делать больше поле
    {
        return field;
    }

    public String SetPlayer(){
        if(player == "X"){
            player = "O";
        }else player = "X";
        return player;
    }

    public void SetMove(int x, int y, String letter)//Выполнить ход
    {
        for(int i = 0; i<field.length; i++){
            for(int j = 0; i< field[i].length; i++){
                if (x==i && y==j){
                    field[x][y] = letter;
                }
            }
        }
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
        System.out.println("  " + arr[0][0] + "  |  "+ arr[0][1]+ "  |  " + arr[0][2]+"\n" +
                           "  " + arr[1][0] + "  |  "+ arr[1][1]+ "  |  " + arr[1][2]+"\n" +
                           "  " + arr[2][0] + "  |  "+ arr[2][1]+ "  |  " + arr[2][2]+"\n" );

    }

    public void FinishSecurity(String[][] arr){
        Arrays.equals(arr[0][0], arr[0][1], arr[0][2])
    }

}
