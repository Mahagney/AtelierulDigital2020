package lab1;

public class Main {
    private static int semester=2;
    private int instanceVar=3;

    public static void main(String[] args) {
        ControlFlow cf=null;
        System.out.println("cf="+cf);
        cf = new ControlFlow();
        System.out.println("cf="+cf);

        System.out.println("result= "+cf.addManyTimes());

        int nr=6;
        Integer j=new Integer(4);
        cf.AutoBox(nr,j);

        stringExample();
    }

    public static void stringExample(){
        String s="Java";
        String b="Java";
        s = s.concat("code");
        System.out.println(s);
    }
}
