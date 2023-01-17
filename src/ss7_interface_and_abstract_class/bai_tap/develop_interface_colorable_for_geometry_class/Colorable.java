package ss7_interface_and_abstract_class.bai_tap.develop_interface_colorable_for_geometry_class;

public interface Colorable {
     void howToColor();

     default void log(String string){
        System.out.println("This method is default implementation" + string);
    }
}
