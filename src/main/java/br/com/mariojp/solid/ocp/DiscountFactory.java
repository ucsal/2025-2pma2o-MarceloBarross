package br.com.mariojp.solid.ocp;

public class DiscountFactory {
    public static DiscountPolicy create(double amount, CustomerType type){
        switch (type){
            case REGULAR: return new RegularPolicy();
            case PREMIUM: return new PremiumPolicy();
            case PARTNER: return new PartnerPolicy();
            default: return null;
        }
    }
}
