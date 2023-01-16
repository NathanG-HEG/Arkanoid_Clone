public abstract class Utilities {

    public static int clampAdd(int a, int b, int min, int max){
        int res = a+b;
        if(res > max) return max;
        return Math.max(res, min);
    }
}
