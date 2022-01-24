import java.util.Objects;

public class AccountBuilder {
    private String accountName;
    private String accountType;
    private String description;
    private double accountPrice;

    public AccountBuilder(Builder builder) {
        this.accountName = builder.accountName;
        this.accountType = builder.accountType;
        this.accountPrice = builder.accountPrice;
        this.description = builder.description;
    }

    public AccountBuilder(String accountName, String accountType, String description, double accountPrice) {
        this.accountName = accountName;
        this.accountType = accountType;
        this.description = description;
        this.accountPrice = accountPrice;
    }

    public AccountBuilder(String accountType, double accountPrice) {
        this.accountType = accountType;
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

    public static class Builder{

        private String accountName;
        private String accountType;
        private String description;
        private double accountPrice;

        public Builder() {
        }

        public Builder withAccountName(String accountNameWithBuilder){
        accountName = accountNameWithBuilder;
        return this;
        }

        public Builder withAccountType(String accountTypeWithBuilder){
            accountType = accountTypeWithBuilder;
            return this;
        }

        public Builder withAccountDescription(String accountDescriptionWithBuilder){
            description = accountDescriptionWithBuilder;
            return this;
        }

        public Builder withAccountPrice(double accountPriceWithBuilder){
        accountPrice = accountPriceWithBuilder;
        return this;
        }

        public AccountBuilder build(){
            return new AccountBuilder(this);
        }

    }

}
