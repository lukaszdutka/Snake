import java.awt.*;

/**
 * Creator: Dasi
 * Date: 2017-06-29
 * Description:
 */
public class TailSegment extends GameObject{

    Handler handler;
    int widthOfTail = 16;
    int heightOfTail = 16;
    GameObject nextSegment;

    public TailSegment(int x, int y, ID id, Handler handler, GameObject nextSegment) {
        super(x, y, id);
        this.handler = handler;
        this.nextSegment = nextSegment;
    }

    @Override
    public void tick() {
        previousX = x;
        previousY = y;

        x = nextSegment.getPreviousX();
        y = nextSegment.getPreviousY();

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.drawRect(x, y, widthOfTail, heightOfTail);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, widthOfTail, heightOfTail);
    }

}
