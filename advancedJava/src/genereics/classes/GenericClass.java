package genereics.classes;

/*
Letters generally used by devs

        E --> Element(used for collections)
        K --> Key
        V --> Value
        T -->Type
        N --> Numbers
        S, U, V

 */

public class GenericClass <T>{

    public T type;
    //getter-setter


    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
