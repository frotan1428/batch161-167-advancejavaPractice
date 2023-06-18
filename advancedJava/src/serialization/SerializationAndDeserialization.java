package serialization;

import java.io.*;

public class SerializationAndDeserialization {
    public static void main(String[] args) {

       // writeObject();
        readObject();

    }

    //method to serialize user class
    private static void writeObject(){
        System.out.println("***** Creating User Object *****");
        User user1 = new User(1L, "AAA", "9798908080");
        User user2 = new User(2L, "BBB", "8799088080");
        User user3 = new User(3L, "CCC", "253254252");
        User user4 = new User(4L, "DDD", "254252542");

        try {
            //used to create a stream that allows us to write data to file
            FileOutputStream fos = new FileOutputStream("user.txt"); //file to write objs

            try {
                //converting objects into a stream of bytes for storage or transmiision purpose
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(user1);
                oos.writeObject(user2);
                oos.writeObject(user3);
                oos.writeObject(user4);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    //method to read object from file (deserialize)
    private static void readObject(){
        try {
            //used to create a stream that allows us to read data from a file
            FileInputStream fis = new FileInputStream("user.txt");
            //used to create a stream that allows us to read serialized objects from input source
            ObjectInputStream ois = new ObjectInputStream(fis);

            User user1 = (User) ois.readObject(); //read an object
            User user2 = (User) ois.readObject(); //read an object
            User user3 = (User) ois.readObject(); //read an object
            User user4 = (User) ois.readObject(); //read an object

            System.out.println(user1);
            System.out.println(user2);
            System.out.println(user3);
            System.out.println(user4);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

//POJO Class
//User class can be serialized

class User implements Serializable {

    //private fields
    private Long id;
    private String name;
    private String ssn;

    //constructor


    public User(Long id, String name, String ssn) {
        this.id = id;
        this.name = name;
        this.ssn = ssn;
    }
    //getter -setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //toString

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
