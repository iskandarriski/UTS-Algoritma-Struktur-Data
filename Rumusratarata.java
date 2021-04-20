package utsalgo;

import javax.swing.JOptionPane;

public class Rumusratarata {
    
    public static void main(String[] args) {

        int[] nilai = new int[10];
        double nilairata = 0;
        int i;
        
        //membuat perulangan dari inputan user, dimana perulangan 
        //akan menampilkan output untuk menginputkan angka sebanyak 10 kali
        for (i = 0; i<10; i++)
        {
            String bilangan = JOptionPane.showInputDialog(" 12 : ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println(" 18 : "+bilangan);
        }
        
        //menghitung rata-rata
        for (i=0; i<10; i++)
            nilairata += nilai[i];
            nilairata = nilairata/i;
            System.out.println("---------------------------------");
            System.out.println("Nilai Rata-Rata = "+" "+nilairata);
            System.exit(0);
    }
    
}
    

