package stockClass;

public class Stock {

    private String symbol;
    private String name;
    private double previousClosingCost;
    private double currentCost;
    private double currentCostChangePercentage;

    public Stock() {
        //constructor
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;

    }

    public void setPreviousClosingCost(double previousClosingCost)
    {
        this.previousClosingCost = previousClosingCost;
    }

    public void printSymbol() {
        System.out.println("Our Symbol: " + this.symbol);

    }

    public void printName() {
        System.out.println("Our Name: " + this.name);

    }

    public void printPreviousClosingCost() {
        System.out.println("Previous closing cost: " + this.previousClosingCost);

    }

    public void setCurrentCost(double newCurrentCost) {
        this.currentCost = newCurrentCost;

    }

    public void printCurrentCost() {
        System.out.println("Current Cost: " + this.currentCost);

    }

    public void displayCostChangePercentage() {
        this.updateCostChangePercentage();
        System.out.printf("Current cost change percentage: %2.2f%%\n",
                (100 * this.currentCostChangePercentage));

    }

    private void updateCostChangePercentage() {
        this.currentCostChangePercentage =
                (this.currentCost - this.previousClosingCost) /
                        this.previousClosingCost;
    }
}
