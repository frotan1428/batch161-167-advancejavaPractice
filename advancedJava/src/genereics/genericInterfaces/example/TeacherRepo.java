package genereics.genericInterfaces.example;

public class TeacherRepo implements Repository<Teacher>{
    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Teacher findAll() {
        return null;
    }

    @Override
    public void update() {

    }
    //for crud operations we need to have save(), findAll(), delete(), update()
}
