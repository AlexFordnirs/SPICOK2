import java.util.Scanner;

public class Main {
    public  static  void main (String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
         System.out.println("SDADAS");
         int vibor=1,operachionmenuy=0,tripp;
         do {
             System.out.println("\nдодавання елементу в початок ->1 \nвидалення елементу з початку->2 \nвиведення списку на екран->3");
             operachionmenuy=scanner.nextInt();
             switch (operachionmenuy)
             {
                 case 1:{
                     System.out.println("Введите:");
                     tripp = scanner.nextInt();
                     list.addFirst(tripp);break;}
                 case 2:{ System.out.println("Введите:");
                     tripp = scanner.nextInt();
                     list.delEl(tripp);break;}
                 case 3:{ System.out.println("Вывод:");
                     list.CollView();break;}
             }
             System.out.println("Продолжить операцию?(yes->1/no->0)");
             vibor=scanner.nextInt();
         } while (vibor==1);

    }
}
