public class Dealer implements Seller {
    @Override
    public String sell(Goods goods) {
        String result = "";
        int money = 0;
        if (goods == Goods.POTION || money > 5) {
            result = "potion";
        }
        return result;
    }

    @Override
    public String buy(Goods goods) {
        String result = "";
        if (goods == Goods.POTION) {
            result += goods;
        }
        return result;
    }

    public enum Goods {
        POTION
    }
}
