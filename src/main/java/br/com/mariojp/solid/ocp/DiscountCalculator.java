package br.com.mariojp.solid.ocp;

public class DiscountCalculator {
    public double apply(double amount, CustomerType type){

        DiscountPolicy discount = DiscountFactory.create(amount, type);
        if (type != null){
            return discount.apply(amount);
        }
        return amount;

    }
}
