import java.util.Scanner;

public class Main {
    static boolean flag = false;
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            CoreLogic cl = new CoreLogic();


            System.out.println("\nДобро пожаловать, данная игра является первой, которую я написал на Java!\n" +
                    "Надеюсь вам она понравится. Для навигации вводите цифры в консоль.\n\nМеню:\n" +
                    "1. Начать играть\n" +
                    "3. Как играть\n" +
                    "4. Об авторе\n" +
                    "5. Выход\n");
            System.out.print("Player> ");
            int menuChoise = scanner.nextInt();
            switch (menuChoise){
                case 1:
                    System.out.println("\n\n\nИгра началась!\n");
                    String[][] playground = cl.GetFiled();

                    while(!flag){
                        cl.UniversalMethodPlayer(flag);
                        cl.FinishSecurity(cl.GetFiled(), flag);
                    }

                    cl.ShowPlayground(playground);
                    System.out.println("Данная партия закончилась ничьей");

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный пункт");
                    break;
            }

        }













        }
    }
