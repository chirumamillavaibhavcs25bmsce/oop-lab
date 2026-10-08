//garbage collection
class Demo {
    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1 = null;
        d2 = null;

        System.gc();

        System.out.println("Garbage collection requested");
    }

    protected void finalize() {
        System.out.println("Object is garbage collected");
    }
}
