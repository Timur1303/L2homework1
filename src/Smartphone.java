public final class Smartphone extends Laptop {
    private Brands brand;
    private int cameraPixel;



    public Smartphone(int cameraPixel, Brands brand){
        this.cameraPixel = cameraPixel;
    }

    public int getCameraPixel() {
        return cameraPixel;
    }

    @Override
    public void choiceLaptop(int memory, String name){
        for (int i = 0; i < memory ; i++) {
            System.out.println(name);

        }
    }

}
