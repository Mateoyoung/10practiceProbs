public class Runner {
    //your main containing tests and output
    public static void main(String[] args) {
        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));
        System.out.println(doubleX("xxmmxxxm"));
        System.out.println(doubleX("xxxxx"));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(atFirst("Hello"));
        System.out.println(atFirst("Hi"));
        System.out.println(atFirst("H"));
        int[] sum3 = {1,2,3};

        System.out.println(less20(2202));
        System.out.println(luckySum(2,3,6));
        System.out.println(repeatFront("oogabooga",2));

    }
    //your codingbat method here - must match
    // the method name from codingbat
    public static String helloName(String name) {
        return "hi " + name;
    }   // next codingbat method here



    //Warmup-1 > nearHundred
        public static boolean nearHundred(int n){
            for(int i = 190; i<211;i++){
                if(i == n){
                    return true;
                }

                for(int z = 90;z<111;z++){
                    if(z == n){
                        return true;
                    }
                }
            }
            return false;

        }

    //Warmup-2 > doubleX
    public static boolean doubleX(String str) {
        int n = str.indexOf("xx");
        if(n == -1){
            return false;
        }

        int m = str.indexOf("x");
        if(m < n){
            return false;
        }

        return true;
    }


    //String-1 > atFirst
    public static String atFirst(String str) {
        if(str.length() == 1){
            return str.substring(0,1) + "@";
        }

        if(str.length() >= 2){
            String n = str.substring(0,1);
            String m = str.substring(1,2);

            return n + m;
        }

        if(str.length() == 0){
            return "@@";
        }

        return "";

    }

    //Array-1 > sum3
    public static int sum3(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        return a+b+c;
    }

    //Logic-1 > less20
    public static boolean less20(int n) {
        if(n % 20 == 0){
            return false;
        }

        if(n % 20 > 0 && n % 20 < 17){
            return false;
        }

        if(n % 20 == 17){
            return false;
        }
        return true;
    }

    //Logic-2 > luckySum
    public static int luckySum(int a, int b, int c) {
        if(a != 13 && b != 13 && c != 13){
            return a+b+c;
        }

        if(a == 13){
            return 0;
        }

        if(b == 13){
            return a;
        }

        if(c == 13){
            return a+b;
        }

        return 0;

    }

    //String-2 > repeatFront

    public static String repeatFront(String str, int n) {
        String finalWord = "";
        for(int i = 0; i<n; i++){
            String nMinusOne = str.substring(0,n-i);
            finalWord = finalWord + nMinusOne;
        }

        return finalWord;
    }

}
