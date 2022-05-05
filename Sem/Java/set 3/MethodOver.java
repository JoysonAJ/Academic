class over{

    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(Double a,Double b){
        return a+b;
    }
}

public class MethodOver {
    public static void main(String[] args) {
        over o = new over();
        System.out.println("\n\naddition of 2 number "+o.add(2,2));
        System.out.println("addition of 3 number "+o.add(2,2,2));
        System.out.println("addition of 2 fraction number "+o.add(2.5,2.5));
    }
}
