/**
 * 正方形类，继承与长方形类
 */
public class Square extends Rectangle{

    public void setWide(int wide) {
        this.height = wide;
        this.wide = wide;
    }

    public int getWide() {
        return wide;
    }

    public void setHeight(int height) {
        this.height = height;
        this.wide = height;
    }

    public int getHeight() {
        return height;
    }
}
