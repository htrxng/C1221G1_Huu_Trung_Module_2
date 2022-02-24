package ss7_interface_and_abstract_class.thuc_hanh.animal_class_and_interface_edible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "cant eat";
    }
}