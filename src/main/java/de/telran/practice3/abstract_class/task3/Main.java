package de.telran.practice3.abstract_class.task3;

public class Main {
    public static void main(String[] args) {
        Printer printer = new ColorPrinter();
        printer.printMe();
        System.out.println(printer.getClass());
    }
}
