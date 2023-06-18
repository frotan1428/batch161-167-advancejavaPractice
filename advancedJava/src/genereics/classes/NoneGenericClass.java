package genereics.classes;

public class NoneGenericClass {
    private Object obj;
    //getter-setter

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    //main method
    public static void main(String[] args) {
        NoneGenericClass obj1= new NoneGenericClass();
        NoneGenericClass obj2= new NoneGenericClass();
        //set values for the obj
        obj1.setObj("Hello");//set String value
        obj2.setObj(1234); //set Integer value
        //---after some codes
        String str = (String) obj1.getObj(); //we have to type cast because we are narrowing from obj to String
        //String str1 = (String) obj2.getObj(); //no compile time error(CTE)
        int num = (int) obj2.getObj();
    }
}
