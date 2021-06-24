//30. Program to add two complex numbers using class.
public class AddComplex {
    static class Complex{
        double real;
        double imag;
        public Complex(){
            this.real=0;
            this.imag=0;
        }
        public Complex(double a,double b){
            this.real=a;
            this.imag=b;
        }
        public Complex(Complex c){
            real=c.real;
            imag=c.imag;
        }
        public static Complex sum(Complex a,Complex b){
            Complex temp=new Complex();
            temp.real=a.real+b.real;
            temp.imag=a.imag+b.imag;
            return temp;
        }
        void display(){
            System.out.println(real+" +i"+imag);
        }
    }

    public static void main(String[] args) {
        Complex A=new Complex(3,4);
        A.display();
        Complex B=new Complex(4,7);
        B.display();;
        Complex C=new Complex(A);
        C.display();
        Complex D=new Complex();
        D= Complex.sum(A,B);
        D.display();
    }
}
