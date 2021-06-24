public class BubbleSort {
    public static void main(String[] args) {
        int[] A={99,3,123,75,33,445};
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length-i-1;j++){
                if(A[j+1]<A[j]){
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<A.length;i++)
            System.out.print(A[i]+"   ");

    }
}
