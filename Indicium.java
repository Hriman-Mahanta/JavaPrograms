// Google Code Jam 4
import java.util.Scanner;
class Indicium{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for(int i=0;i<T;i++){
            int N=input.nextInt();
            int K=input.nextInt();
            System.out.print("Case #"+(i+1)+": ");
            /*if(N*(N+1)/2==K){
                System.out.println("POSSIBLE");
                break;
            }*/
            for(int j=1;j<=N;j++){
                if(j*N==K){
                    System.out.println("POSSIBLE");
                    break;
                }
                System.out.println("IMPOSSIBLE");
            }

        }
    }
}