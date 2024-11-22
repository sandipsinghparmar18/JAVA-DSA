public class gennerik<T> {
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public static void main(String[] args) {
        gennerik<Integer>igennerik=new gennerik<Integer>();
        gennerik<String>sgenneric=new gennerik<String>();

        igennerik.add(5);
        sgenneric.add("five");
        

        System.out.println(igennerik.get());
        System.out.println(sgenneric.get());
    }
}
