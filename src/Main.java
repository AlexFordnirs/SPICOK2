import java.util.Scanner;

public class Main {
    public  static  void main (String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
         System.out.println("SDADAS");
         int vibor=1,operachionmenuy=0,tripp;
         do {
             System.out.println("\nдодавання елементу в початок ->1 \nдодавання елементу в середину списку->2 \nвидалення елементу з середини списку->3   \nвиведення списку на екран->4");
             operachionmenuy=scanner.nextInt();
             switch (operachionmenuy)
             {
                 case 1:{
                     System.out.println("Введите:");
                     tripp = scanner.nextInt();
                     list.addFirst(tripp);break;}
                 case 2:{ System.out.println("Введите:");
                     tripp = scanner.nextInt();
                     list.addInPlace(tripp);break;}
                 case 3:{ System.out.println("Введите:");
                     tripp = scanner.nextInt();
                     list.delEl(tripp);break;}
                 case 4:{ System.out.println("Вывод:");
                     list.CollView();break;}
             }
             System.out.println("Продолжить операцию?(yes->1/no->0)");
             vibor=scanner.nextInt();
         } while (vibor==1);

    }
}
