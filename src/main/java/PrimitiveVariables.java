public class PrimitiveVariables {
    public static void main(String[] args) {
        String s = "Anush";
        String ss = "Anush";
        if (s==ss){
            System.out.println("true");
        }
        System.out.println(s);
        System.out.println(ss);
        String [] sss = s.split("u");
        for (int i = 0; i <sss.length ; i++) {
            System.out.println(sss[i]);

        }
        int a=1;
        a++;
        System.out.println(a);

    }

}
