package Question7_FinalKeyword;

class BasicCalculator {
    public final int add(int a , int b){
        return a + b;
    }
}

class SmartCalculator extends BasicCalculator{
    public int subtract(int a , int b){
        return a - b;
    }
//    public int add(int a, int b){
//        return 0;         //Error will be given
//    }
}
