import java.nio.charset.StandardCharsets;

public class BuilderDesignPattern {
    public static void main(String[] args) {

        //Telescope Pattern
        Account account =new Account("Individual");
        System.out.println(account.getAccountName());
        Account accountWithFullInfoByConstructor = new Account("Individual", "Free Account",  "This account can only be used by one person.", 0);
        System.out.println("Full Info with Constructor: " + accountWithFullInfoByConstructor.toString());

        Account accountWithAccountTypeForIndividual = new Account("Free Account", 0);
        Account accountWithAccountTypeForTeam = new Account("Paid Account", 250.95);
        System.out.println("Account Type and Price For Individual with Constructor: " + accountWithAccountTypeForIndividual.toString());
        System.out.println("Account Type and Price For Organization with Constructor: " + accountWithAccountTypeForTeam.toString());


        //Java Beans Pattern
        Account account3 = new Account();
        account3.setAccountName("Team");
        account3.setAccountType("Paid account");
        account3.setAccountPrice(250.95);
        account3.setDescription("You can use this account with your friend.");


        //Builder Design Pattern
        AccountBuilder accountBuilderWithFullInfo = new AccountBuilder.Builder()
                .withAccountName("Individual")
                .withAccountType("Free Account")
                .withAccountDescription("This account can only be used by one person")
                .withAccountPrice(0)
                .build();
        System.out.println("Full Info with Builder " + accountBuilderWithFullInfo.toString());


        AccountBuilder accountBuilderWithAccountTypeForIndividual = new AccountBuilder.Builder()
                .withAccountName("Individual Account")
                .withAccountPrice(0)
                .build();
        System.out.println("Indıvidual Account Info with Builder " + accountBuilderWithAccountTypeForIndividual.toString());


        AccountBuilder accountBuilderWithAccountTypeForTeam = new AccountBuilder.Builder()
                .withAccountName("Team Account")
                .withAccountPrice(250.95)
                .build();
        System.out.println("Team Account Info with Builder " + accountBuilderWithAccountTypeForTeam.toString());

    }
}
