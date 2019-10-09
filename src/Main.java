package com.example.myapplication;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Registry registry = new Registry();

        Customer c1 = new Customer("Kostas", "3217",
                new BankAccount("GR321",Currency.EURO, 100));

        Customer c2 = new Customer("Maria", "8854",
                new BankAccount("GR8889999",Currency.EURO, 100));

        Customer c3 = new Customer("Giannis", "123",
                new BankAccount("GR99215874",Currency.EURO, 100));

        Customer c4 = new Customer("Giannis", "666",
                new BankAccount("GR8841252",Currency.DOLLAR, 100));

        registry.addCustomer(c1).addCustomer(c2).addCustomer(c3).addCustomer(c4);

        c1.getAccount().setFinancialProduct(new ShortTermProduct());
        c2.getAccount().setFinancialProduct(new ShortTermProduct());
        c3.getAccount().setFinancialProduct(new LongTermProduct());
        c4.getAccount().setFinancialProduct(new LongTermProduct());

        registry.calculateProfit();

        Customer cc =  Customer.create().setAfm("321321231").setName("teo").build();

        List<BankAccount> a = new ArrayList();
        a.add(new BankAccount("GR8841252",Currency.DOLLAR, 100));
        a.add(new BankAccount("GR234234",Currency.EURO, 100));

        List<BankAccount> b = new ArrayList<>();
        for(BankAccount t : a){
            System.out.println(t.hashCode());
            b.add(new BankAccount(t.getIban(), t.getCurrency(), t.getBalance()));
        }


        for(BankAccount bb : b){
            System.out.println(bb.hashCode());
        }
    }
}
