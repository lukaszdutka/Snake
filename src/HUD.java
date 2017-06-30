/**
 * Creator: Dasi
 * Date: 2017-06-29
 * Description:
 */
import java.awt.Graphics;
import java.awt.Color;

public class HUD {

    public static int POINTS = 0;
    public static int FINAL_POINTS = 0;

    public void tick(){

    }

    public void render(Graphics g){
        g.setColor(Color.WHITE);
        if(!Game.gameover) {
            g.drawString("Points: " + POINTS, 15, 15);
        }
        else {
            g.drawString("Game Over! Final points: " + HUD.FINAL_POINTS, 15, 15);
        }
    }
}
