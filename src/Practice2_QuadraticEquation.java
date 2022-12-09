public class Practice2_QuadraticEquation {
    private double a, b, c;
    private double delta;
    private double root1;
    private double root2;
    public Practice2_QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = ( b * b)-(4 * a * c);;
        this.root1 = ( -b - Math.sqrt(delta)) / 2 * a;
        this.root2 = ( -b + Math.sqrt(delta)) / 2 * a;

    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDelta(){
        return this.delta;
    }
    public  void getRoot1(){
        if(this.delta < 0 ){
            System.out.println("There is no root");;
        } else if ( ( this.delta == 0)){
            System.out.println("There is one solution = " + this.root2);
        } else {
            System.out.println("There are two solutions for the equation x1 = " + this.root1 + " and x2 = " + this.root2);
        }
    }
}
