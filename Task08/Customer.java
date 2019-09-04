package by.htp.SimpleClass.Task08;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String adress;
    private long creditCard;
    private long bankAccount;

    public Customer(int id, String lastName, String firstName, String adress, long creditCard, long bankAccount) {
	this.id = id;
	this.lastName = lastName;
	this.firstName = firstName;
	this.adress = adress;
	this.creditCard = creditCard;
	this.bankAccount = bankAccount;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getAdress() {
	return adress;
    }

    public void setAdress(String adress) {
	this.adress = adress;
    }

    public long getCreditCard() {
	return creditCard;
    }

    public void setCreditCard(long creditCard) {
	this.creditCard = creditCard;
    }

    public long getBankAccount() {
	return bankAccount;
    }

    public void setBankAccount(long bankAccount) {
	this.bankAccount = bankAccount;
    }

    public String getShortInfo() {
	return "ID: " + getId() + " | ФИО: " + getLastName() + " " + getFirstName() + " | Карта: " + getCreditCard();
    }

    @Override
    public String toString() {
	return id + " " + lastName + " " + firstName + " " + adress + " " + creditCard + " " + bankAccount;
    }
}
