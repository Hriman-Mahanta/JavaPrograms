//14. Program to check an identity matrix.
public class IdentityMatrix {
    public static void main(String[] args) {
        int flag=0;
        int[][] A={{1,0,0},{0,1,0},{0,0,1}};
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(i!=j&&A[i][j]!=0)
                    flag=1;
                if(i==j&&A[i][j]!=1)
                    flag=1;
            }
        }
        if (flag==0)
            System.out.println("The matrix is an identity matrix");
        else
            System.out.println("The matrix is not an identity mattrix");
    }
}
