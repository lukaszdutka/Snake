import java.awt.*;
import java.util.Random;

/**
 * Creator: Dasi
 * Date: 2017-06-29
 * Description:
 */
public class Point extends GameObject {

    Handler handler;
    boolean eaten = false;
    int widthOfPoint = 16;
    int heightOfPoint = 16;
    Color pointColor;

    public Point(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
        pointColor = Color.GREEN;
    }

    @Override
    public void tick() {
        if(pointColor == Color.GREEN) pointColor = Color.ORANGE;
        else pointColor = Color.GREEN;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(pointColor);
        g.fillRect(x, y, widthOfPoint, heightOfPoint);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, widthOfPoint, heightOfPoint);
    }

    public void relocate(){
        Random r = new Random();
        x = r.nextInt(Game.WIDTH-48)/16 * 16 ;
        y = r.nextInt(Game.HEIGHT-48)/16 * 16 ;
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setId(ID id) {
        super.setId(id);
    }

    @Override
    public ID getId() {
        return super.getId();
    }

    @Override
    public void setVelX(int velX) {
        super.setVelX(velX);
    }

    @Override
    public void setVelY(int velY) {
        super.setVelY(velY);
    }

    @Override
    public int getVelX() {
        return super.getVelX();
    }

    @Override
    public int getVelY() {
        return super.getVelY();
    }


}
