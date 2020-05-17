/**
 * 新正方形类，继承于四边形类
 */
public class NewSquare extends AbstractQuadrangle{
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

    private int wide;
    private int height;
}
