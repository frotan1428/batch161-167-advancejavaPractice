package genereics.classes;

public class GenericTypeTwoParams <S, U>{
    private S s;
    private U u;
    //constructor with parameters

    public GenericTypeTwoParams(S s, U u) {
        this.s = s;
        this.u = u;
    }

    //getter-setter

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
}
