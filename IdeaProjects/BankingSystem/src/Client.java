public class Client {

    private String name;
    private String ID;
    private double totalBalance;
    private double interestRate;
    private final double[] withdrawHistory = new double[30];

    private final double[] depositHistory = new double[30];
    public Client(String name, String ID, double totalBalance, double interestRate){
        this.name = name;
        this.ID = ID;
        this.totalBalance = totalBalance;
        this.interestRate = interestRate;
    }

    public void addDeposit(double deposited){
        totalBalance += deposited;
        int i = 0;
        //Find the first available spot in the array to save the deposited amount
        while ((i < depositHistory.length)&&(depositHistory[i] != 0)){
            i++;
        }
        //Check if the found spot is in between array bounds
        if(i < depositHistory.length){
            depositHistory[i] = deposited;
        //If it's not we delete the firs value in the array to make space for the new one
        }else {
            for (int j = 0; j < depositHistory.length - 1; j++){
                depositHistory[j] = depositHistory[j+1];
            }
            depositHistory[depositHistory.length - 1] = deposited;
        }
    }

    public void withdraw(double withdrawn){
        totalBalance -= withdrawn;
        int i = 0;
        //Find the first available spot in the array to save the withdrawn amount
        while ((i < withdrawHistory.length)&&(withdrawHistory[i] != 0)){
            i++;
        }
        //Check if the found spot is in between array bounds
        if(i < withdrawHistory.length){
            withdrawHistory[i] = withdrawn;
            //If it's not we delete the firs value in the array to make space for the new one
        }else {
            for (int j = 0; j < withdrawHistory.length - 1; j++){
                withdrawHistory[j] = withdrawHistory[j+1];
            }
            withdrawHistory[withdrawHistory.length - 1] = withdrawn;
        }
    }

    public void printDepositHistory(){
        System.out.println("\n\nPrinting deposits history");
        for (double deposit : depositHistory) {
            if (deposit != 0){
                System.out.println("Deposited: " + deposit);
            }
        }
    }

    public void printWithdrawHistory(){
        System.out.println("\n\nPrinting withdraws history");
        for(double withdrawn : withdrawHistory){
            if(withdrawn != 0){
                System.out.println("Withdrew: " + withdrawn);
            }
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    @Override
    public String toString(){
        return "\nName: "+name+"\nID: "+ID+"\nTotal balance: "+totalBalance+"\nInterest rate: "+interestRate;
    }
}
