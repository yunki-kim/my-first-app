import javax.swing.*;

class Accounting {
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    public void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVAT());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getExpense());
        System.out.println("Income : "+ getIncome());
        System.out.println("Dividend 1 : "+ getDividend1());
        System.out.println("Dividend 2 : "+ getDividend2());
        System.out.println("Dividend 3 : "+ getDividend3());
    }

    public double getIncome() {
        return valueOfSupply - getExpense();
    }

    public double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public double getTotal() {
        return valueOfSupply + getVAT();
    }

    public double getVAT() {
        return valueOfSupply * vatRate;
    }

    public double getDividend1() {
        return getIncome() * 0.5;
    }

    public double getDividend2() {
        return getIncome() * 0.3;
    }

    public double getDividend3() {
        return getIncome() * 0.2;
    }
}

public class AccountingClassApp {
    public static void main(String[] args) {

        String value1 = JOptionPane.showInputDialog("Enter a 1st value");
        String value2 = JOptionPane.showInputDialog("Enter a 2nd value");

        // instance
        Accounting a1 = new Accounting();
        a1.valueOfSupply = Double.parseDouble(value1);
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = Double.parseDouble(value2);
        a2.vatRate = 0.1;
        a2.expenseRate = 0.3;
        a2.print();

    }
}
