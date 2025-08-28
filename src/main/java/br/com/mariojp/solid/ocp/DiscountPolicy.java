package br.com.mariojp.solid.ocp;

public interface DiscountPolicy {
    abstract double apply(double amount);
}
