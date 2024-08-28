public class sec {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.area(2));
        System.out.println(c.area(2,4));
        System.out.println(c.area(4,6));
    }
}
class calculator{
    public double area(double r){
        return 3.14*r*r;
    }
    public double area(float l,float w){
        return l*w;
    }
    public double area(double b,double h){
        return 0.5*b*h;
    }
}
