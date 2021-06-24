//36. Program to catch exception using finally.
class ExceptionFinally{
    public static void main(String[] args) {
        new ExceptionFinally().doTheWork();
    }
    public void doTheWork(){
        Object o=null;
        for(int i=0;i<5;i++){
            try{
                o=makeObj(i);
            } catch(IllegalArgumentException e){
                System.err.println("All Done");
                if(o==null)
                    System.exit(0);
            }
            System.out.println(o);
        }
    }
    public Object makeObj(int type) throws IllegalArgumentException{
        if(type==1)throw new IllegalArgumentException("Don't like type "+type);
        return new Object();
    }
}