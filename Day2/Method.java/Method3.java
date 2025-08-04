public class Method3 {
    static int method(int x, int y){
        return x+y;
    }
    static float method(float x ,float y){
        return x+y;
    }
    public static void main(String[] args) {
        int a = method(4,5);
        float b = method(3.3f,4.4f);
        System.out.println(a);
        System.out.println(b);
    }
}
