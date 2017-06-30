/**
 * Creator: Dasi
 * Date: 2017-06-29
 * Description:
 */

import java.awt.*;

public class Player extends GameObject {

    Handler handler;
    int widthOfPlayer = 16;
    int heightOfPlayer = 16;
    GameObject last;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;

        last = this;
    }

    public void tick() {
        previousX = x;
        previousY = y;

        x += velX;
        y += velY;

        x = Game.clamp(x, 0, Game.WIDTH/16 * 16 - 32);
        y = Game.clamp(y, 0, Game.HEIGHT/16 * 16 - 32);

        collision();
    }

    public void collision(){
        for(int i = 0; i < handler.object.size(); i++){

            GameObject tempObject = handler.object.get(i);

            if(tempObject.getId() == ID.Point){
                if(getBounds().intersects(tempObject.getBounds())){
                    HUD.POINTS += 100;
                    Point tempPoint = (Point) tempObject;
                    tempPoint.relocate();

                    increaseSize();
                }
            }

            if(tempObject.getId() == ID.Tail){
                if(getBounds().intersects(tempObject.getBounds())){
                    if(!Game.gameover) {
                        HUD.FINAL_POINTS = HUD.POINTS;
                        Game.gameover = true;
                    }
                }
            }
        }
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, widthOfPlayer, heightOfPlayer);
    }

    public void increaseSize(){
        int tempPrevX = last.getPreviousX();
        int tempPrevY = last.getPreviousY();
        TailSegment newLast = new TailSegment(tempPrevX, tempPrevY, ID.Tail, handler, last);

        last = newLast;
        handler.addObject(newLast);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, widthOfPlayer, heightOfPlayer);
    }

}
