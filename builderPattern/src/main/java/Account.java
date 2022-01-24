import java.util.Objects;

public class Account {
    private String accountName;
    private String accountType;
    private String description;
    private double accountPrice;

    public Account() {
    }

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public Account(String accountType, double accountPrice) {
        this.accountType = accountType;
        this.accountPrice = accountPrice;
    }

    public Account(String accountName, String accountType, String description, double accountPrice) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.description = description;
        this.accountPrice = accountPrice;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAccountPrice() {
        return accountPrice;
    }

    public void setAccountPrice(double accountPrice) {
        this.accountPrice = accountPrice;
    }

    @Override
    public String toString() {
        return "Account{" +
                (Objects.nonNull(accountName) ? "accountName='" + accountName + '\'' : "") +
                (Objects.nonNull(accountType) ? ", accountType='" + accountType + '\'' : "") +
                (Objects.nonNull(accountPrice) ? ", accountPrice=" + accountPrice : "") +
                (Objects.nonNull(description) ? ", description='" + description + '\'' : "") +
                '}';
    }
}
