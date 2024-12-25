package zad5;

public class PotatoSoup extends Bouillon {
    double potato;
    double carrot;

    public PotatoSoup(Bouillon bouillon, double potato, double carrot) {
        super(bouillon.water, bouillon.salt, bouillon.meat);
        this.potato = potato;
        this.carrot = carrot;
    }

    public PotatoSoup(SoupBase base, double potato, double carrot) {
        super(base.water, base.salt, 0); // Мясо по умолчанию 0
        this.potato = potato;
        this.carrot = carrot;
    }

    public PotatoSoup(double water, double salt, double meat, double potato, double carrot) {
        super(water, salt, meat);
        this.potato = potato;
        this.carrot = carrot;
    }

    @Override
    public void printIngredients() {
        System.out.println("Ингредиенты картофельного супа:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
        System.out.println("Мясо: " + meat + " г.");
        System.out.println("Картошка: " + potato + " шт.");
        System.out.println("Морковка: " + carrot + " шт.");
    }
}

