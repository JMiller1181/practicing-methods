public class MethodReturnTypes {
    public static void main (String[] args){
        System.out.println(words());
        System.out.println(num());
        System.out.println(state());
    }
    public static String words(){
        return "This is a string";
    }
    public static int num(){
        return 1;
    }
    public static boolean state(){
        return true;
    }
}
