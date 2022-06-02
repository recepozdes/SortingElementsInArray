import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int numOfElements;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz : ");
        numOfElements = sc.nextInt();

        if(numOfElements>0){
            int[] dizi = new int[numOfElements];
            for(int i=0;i<numOfElements;i++){
                System.out.print("Dizinin "+(i+1)+". elemanini giriniz : ");
                dizi[i] = sc.nextInt();
            }

            for(int i=0;i<numOfElements-1;i++){
                for (int j=i+1;j<numOfElements;j++){
                    if(dizi[i]>=dizi[j]){
                        int temp = dizi[i];
                        dizi[i] = dizi[j];
                        dizi[j] = temp;
                    }
                }
            }
            for (int i=0;i<numOfElements;i++){
                System.out.print(dizi[i]+" ");
            }

        }else {
            System.out.println("Dizi boyutu 0'dan küçük olamaz.");
        }

    }
}
