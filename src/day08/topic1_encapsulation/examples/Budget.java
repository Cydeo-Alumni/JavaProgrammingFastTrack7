package day08.topic1_encapsulation.examples;

public class Budget {  // only setter makes it Write-only
    private double annualBudget;

    public void setAnnualBudget(double annualBudget) {
        this.annualBudget = annualBudget;
    }

    // some methods that use the variable for calculations. In this idea we wouldn't need to see the value of the budget only the result of some functions that use the budget
}
