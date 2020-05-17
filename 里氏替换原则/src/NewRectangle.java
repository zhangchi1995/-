/**
 * 新长方形类 继承于抽象四边形类
 */
public class NewRectangle extends AbstractQuadrangle{
    private int wide;

    @Override
    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;
}
