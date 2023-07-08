import java.util.Scanner;

public class Main {
    static boolean flag = false;
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            CoreLogic cl = new CoreLogic();


            System.out.println("\nКрестики Нолики\n" +
                    "Для навигации введите цифру в консоль.\n\nМеню:\n" +
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
                    if(flag){
                        cl.ShowPlayground(playground);
                        System.out.println("Партия закончилась");
                    }else {
                        cl.ShowPlayground(playground);
                        System.out.println("Данная партия закончилась");
                    }
/*
                    System.out.println("Продолжим играть?\nЧтобы вернуться в главное меню введите Y\n" +
                            "Чтобы выйти введите N");
                    String contChoise = scanner.nextLine();
                    switch (contChoise){
                        case "Y":
                            System.out.print("\033[H\033[J");
                            break;
                        case "N":
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Некорректный ввод значения");
                            break;
                    }
*/
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Данное приложение было написано одним из первых на java,\n" +
                            "если вам интересно увидеть больше моих работ то можете ознакомиться с \n" +
                            "моим портфолио www.github.com/helltale");
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
