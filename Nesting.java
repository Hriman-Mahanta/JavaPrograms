// Google Code Jam 2
import java.util.Scanner;
class Nesting{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for(int i=0;i<T;i++){
            int S=input.nextInt();
            StringBuilder builder=new StringBuilder(S);
            int num=S;
            int temp;
            while(num!=0){
                temp=num%10;
                num/=10;
                if(temp==1){
                    builder.insert(builder.length()-1,"(");
                    builder.insert(builder.length(),")");
                }
            }
            String S1=builder.toString();
            S1.replace(")(","");
            System.out.println("Case #"+(T+1)+" "+S1);
        }
    }
}