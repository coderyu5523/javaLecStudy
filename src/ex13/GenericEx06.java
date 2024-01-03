package ex13;


public class GenericEx06 {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static void main(String[] args) {

        GenericEx06 g1 = new GenericEx06();
        g1.setData("hi");
        String s = (String) g1.getData();

    }
}
