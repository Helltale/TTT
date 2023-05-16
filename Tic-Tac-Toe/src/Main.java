import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoreLogic cl = new CoreLogic();

        System.out.println("\nДобро пожаловать, данная игра является первой, которую я написал на Java!\n" +
                "Надеюсь вам она понравится. Для навигации вводите цифры в консоль.\n\nМеню:\n" +
                "1. Начать играть\n" +
                "2. Задать размеры поля [???]\n" +
                "3. Как играть\n" +
                "4. Об авторе\n" +
                "5. Выход\n");
        System.out.print("Player> ");
        int menuChoise = scanner.nextInt();
        switch (menuChoise){
            case 1:
                System.out.println("\n\n\nИгра началась!\n");
                String[][] playground = cl.GetFiled();








                cl.ShowPlayground(playground); //отображение поля
                System.out.println("Игрок 1:");
                System.out.print("Введите значение 'х':");
                int tmp1 = scanner.nextInt();
                System.out.print("Введите значение 'y':");
                int tmp2 = scanner.nextInt();

                System.out.println(""+tmp1+tmp2);

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
        }












        }
    }
