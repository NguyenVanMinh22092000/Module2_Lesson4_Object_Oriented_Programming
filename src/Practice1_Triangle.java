public class Practice1_Triangle {
    double width, height;
    public Practice1_Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return ( this.height + this.width) * 2;
    }

    public String display(){
        return "Rectangle { the width = "+ this.width + " and the height = " + this.height;
    }
}
