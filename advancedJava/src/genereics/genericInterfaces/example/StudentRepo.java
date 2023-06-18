package genereics.genericInterfaces.example;

public class StudentRepo implements Repository <Student> {
    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Student findAll() {
        return null;
    }

    @Override
    public void update() {

    }
    //for crud operations we need to have save(), findAll(), delete(), update()
}
