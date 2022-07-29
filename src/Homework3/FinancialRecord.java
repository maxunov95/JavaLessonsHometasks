package Homework3;

public class FinancialRecord {

    int incomes;
    int outcomes;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public double getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public double getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }
}
