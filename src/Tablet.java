public class Tablet extends Laptop {
    private int[] tabletSize;


    public Tablet(int[] tabletSize){
        this.tabletSize = tabletSize;
    }

    public int[] getTabletSize() {
        return tabletSize;
    }
}
