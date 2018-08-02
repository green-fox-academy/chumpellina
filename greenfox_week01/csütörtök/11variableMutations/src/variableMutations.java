public class variableMutations {
    public static void main(String[] args) {
        int a = 3;
        a+=10;
        System.out.println(a);


        int b = 100;
        b-=7;
        System.out.println(b);




        int c = 44;
        c*=2;
        System.out.println(c);



        int d = 125;
        d/=5;
        System.out.println(d);




        int e = 8;
        e*=e;
        System.out.println(e);



        int f1 = 123;
        int f2 = 345;
        boolean equality = f1>f2;
        System.out.println(equality);


        int g1 = 350;
        int g2 = 200;
        int g2double = g2*=2;
        boolean equalityTwo =  g1 < g2double;
        System.out.println(equalityTwo);




        int h = 135798745;
        int x = 11;
        double result = h%x;
        boolean wtf = result == 0;
        System.out.println(wtf);




        int i1 = 10;
        int i2 = 3;
        int i2squared = i2*=i2;
        int i2cubed = i2*=i2*=i2;
        boolean wtf2 = i1 > i2squared & i1 < i2cubed;
        System.out.println(wtf2);



        double j = 1521.00;
        double z = 3.00;
        double zs = 5.00;
        boolean bool1 = j % z == 0;
        boolean bool2 = j % zs == 0;
        boolean végső = bool1 || bool2;
        System.out.println(végső);


        String k = "Apple";
        String wtf3 = k + k + k + k;
        System.out.println(wtf3);
    }
}
