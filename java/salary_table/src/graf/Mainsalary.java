package graf;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;

public class  Mainsalary extends JFrame {
    HashSet<Salarymodel> Salary = new HashSet<Salarymodel>();
    public Mainsalary() {
             super("Таблица");
             setDefaultCloseOperation( EXIT_ON_CLOSE );
             setSize(500, 450);
             // Панель содержимого
             Container container = getContentPane();
             container.setLayout (new FlowLayout(FlowLayout.CENTER));
             JPanel p = new JPanel();
             container.add(p);
             //
              String[][] data = {
                      {"1", "Сидоров Сидор Сидорович","1000"},

                 };
        //Как добавить в data и как обратно? но не все поля "Табельный","Работник","Сумма" я голову сломал уже
        //
         for(int i=0;i<10;i++) {
            this.Salary.add(new Salarymodel(String.valueOf(i), "Иванов", "Иван", "Иванович", "5000.6F", "20"));

         }
         int n=3;
         System.out.println(Salary.size());
        System.out.println("--------------");
         for(Salarymodel r:Salary){
             System.out.println(n);
             System.out.println(r.tabNomer.toString());
            // data[n][0]=r.tabNomer.toString();
             data[n][1]=r.firstName+" "+r.midleName+" "+r.secondName;
             data[n][2]=r.getSumma().toString();
             n++;
         }


        JTable t = new JTable(data,Salarymodel.Title());
         JScrollPane scrollPane = new JScrollPane(t);
             p.add(scrollPane);
             setVisible(true);
          }



   public static void main(String[] args)
    {
     //   Mainsalary w;
     //   w = new Mainsalary();
    }
}
