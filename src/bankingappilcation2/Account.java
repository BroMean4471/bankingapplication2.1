/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingappilcation2;

/**
 *
 * @author Bromean
 */
public interface Account {
    public void deposit(double amount);
    public void withdraw(double amount);
    public double getBalance();
    public String getAccountType();
    public int getAccountNumber();
    public String getAccountName();
}
