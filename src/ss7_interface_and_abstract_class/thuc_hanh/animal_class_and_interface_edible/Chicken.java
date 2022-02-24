package ss7_interface_and_abstract_class.thuc_hanh.animal_class_and_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "fry it";
    }
}