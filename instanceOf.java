class Main {
    public static void main(String[] args) {
        String str = "helloWorld";
        boolean resultstr;
        Integer a = 10;
        boolean resultint;

        resultstr = str instanceof String;
        resultint = a instanceof Integer;

        System.out.println("Is str an instance of String? " + resultstr);
        System.out.println("Is a an instance of Intefer? " + resultint);
    }
}