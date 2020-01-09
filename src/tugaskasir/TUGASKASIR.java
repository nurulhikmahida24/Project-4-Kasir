
import java.util.Scanner;


public class TUGASKASIR {

    
    public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU YANG TERSEDIA");
        System.out.println("1. Ayam Bakar       Rp.12.000,-");
        System.out.println("2. Ikan Bakar       Rp.13.000,-");
        System.out.println("3. Pecel Lele       Rp.15.000,-");
        System.out.println("4. Gurame Bakar     Rp.60.000,-");
        System.out.println("5. Sate Maranggi    Rp.25.000,-");
        System.out.println("6. Kambing Guling   Rp.200.000,-");
        System.out.println("7. Cah kangkung     Rp.5000,-");
        System.out.println("8. Karedok          Rp.5000,-");
        System.out.println("9. Es Jeruk         Rp.4.000,-");
        System.out.println("10. Es Teh          Rp.3.000,-");
        
        System.out.print("Masukan Jumlah Pesanan : ");
        a = sc.nextInt();
	
        int[]harga = new int [a];
        int z = 1;
        
        for (int x=0;x<a;x++)
        {
        
        System.out.print("Harga Item" + z + " : ");
        harga[x] = sc.nextInt();
        z++;
        }
        
        int c = 0;
        for(int num : harga)
        {
            c = c + num;
        }
        System.out.println("Total Harga :" + c);
     
	int n;
     	Scanner sce = new Scanner(System.in);
     	System.out.println("Uang Yang Dibayarkan :");
     	n = sce.nextInt();
    	
	int m;
	m = n-c;
     
     	if (n>c)
     	{
        System.out.println("Uang Kembalian :"+m);
	System.out.println("Terimakasih Atas Pesanannya Selamat Datang Kembali");
     	}
     
     	else 
     	{
         System.out.println("Uang yang dibayar kurang");
     	}
    }
    
}
