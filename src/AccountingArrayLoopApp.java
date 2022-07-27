import javax.swing.*;

public class AccountingArrayLoopApp {
    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Enter a value");

        double valueOfSupply = Double.parseDouble(value);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        int cnt = 0;
        while (cnt < dividendRates.length) {
            System.out.println("Dividend "+ (cnt+1) +" : "+ (income * dividendRates[cnt]));
            cnt = cnt + 1;
        }


    }
}
