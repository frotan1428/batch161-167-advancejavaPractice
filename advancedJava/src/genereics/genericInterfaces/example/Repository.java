package genereics.genericInterfaces.example;

public interface Repository <T>{

    //common methods for CRUD OPERATION
    void save();
    void delete();

    T findAll();

    void update();
}
