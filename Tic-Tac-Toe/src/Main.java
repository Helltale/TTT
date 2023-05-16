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
                boolean flag  =true;
                System.out.println("\n\n\nИгра началась!\n");
                String[][] playground = cl.GetFiled();

                while(flag){
                    //1
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 1:");
                    System.out.print("Введите значение 'Y':");
                    int tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    int tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "X");


                    //2
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 2:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "O");

                    //3
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 1:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "X");


                    //4
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 2:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "O");

                    //5
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 1:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "X");
                    cl.FinishSecurity(playground);

                    //6
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 2:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "O");
                    cl.FinishSecurity(playground);

                    //7
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 1:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "X");
                    cl.FinishSecurity(playground);

                    //8
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 2:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "О");
                    cl.FinishSecurity(playground);

                    //9
                    cl.ShowPlayground(playground);
                    System.out.println("Игрок 1:");
                    System.out.print("Введите значение 'Y':");
                    tmp1 = scanner.nextInt();
                    System.out.print("Введите значение 'X':");
                    tmp2 = scanner.nextInt();
                    tmp1 -= 1;
                    tmp2 -= 1;
                    cl.SetMove(tmp1, tmp2, "X");
                    cl.FinishSecurity(playground);
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
        }












        }
    }
