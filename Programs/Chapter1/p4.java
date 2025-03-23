/*Find the balance*/

public class p4
{
    public static void main(String[] args)
    {
        int bank_Account=1000;
        double interest_per=0.05;
        double balance= bank_Account + (bank_Account*interest_per);

        System.out.println("balance in first year " + balance);
        balance= balance + (balance*interest_per);
        System.out.println("balance in second year " + balance);
        balance= balance + (balance*interest_per);
        System.out.println("balance in third year " + balance);
        

    }
}