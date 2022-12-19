package by.tms.services;

public class MainHw {
    public static void main(String[] args) {
        Regex regex = new Regex();
        String str = "asdf1";
        regex.printStringTask2();
        regex.printStringTask3();
        System.out.println(regex.validate(str));
        regex.getCountLatinSymbol();
    }
}
