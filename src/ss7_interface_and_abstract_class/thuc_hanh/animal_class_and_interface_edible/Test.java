package ss7_interface_and_abstract_class.thuc_hanh.animal_class_and_interface_edible;
class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
            
        }
        Orange orange1 = new Orange();
        System.out.println("how to eat orange: "+ orange1.howToEat());
    }
}
