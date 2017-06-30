/**
 * Creator: Dasi
 * Date: 2017-06-29
 * Description:
 */
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        for(int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                /*
                if(key == KeyEvent.VK_W){tempObject.setVelY(-3);}
                if(key == KeyEvent.VK_S){tempObject.setVelY(3);}
                if(key == KeyEvent.VK_A){tempObject.setVelX(-3);}
                if(key == KeyEvent.VK_D){tempObject.setVelX(3);}
                */
                if(key == KeyEvent.VK_W){
                    tempObject.setVelY(-16);
                    tempObject.setVelX(0);
                }
                if(key == KeyEvent.VK_S){
                    tempObject.setVelY(16);
                    tempObject.setVelX(0);}
                if(key == KeyEvent.VK_A){
                    tempObject.setVelX(-16);
                    tempObject.setVelY(0);
                }
                if(key == KeyEvent.VK_D){
                    tempObject.setVelX(16);
                    tempObject.setVelY(0);
                }
                // Z - zatrzymaj sie
                if(key == KeyEvent.VK_Z){
                    tempObject.setVelX(0);
                    tempObject.setVelY(0);
                }
            }else if(tempObject.getId() == ID.Point){
                if(key == KeyEvent.VK_SPACE) {
                    Point tempPoint = (Point) tempObject;
                    tempPoint.relocate();
                }
            }
        }
    }
    public void keyReleased(KeyEvent e){
        /*
        int key = e.getKeyCode();

        for(int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {

                if(key == KeyEvent.VK_W){tempObject.setVelY(0);}
                if(key == KeyEvent.VK_S){tempObject.setVelY(0);}
                if(key == KeyEvent.VK_A){tempObject.setVelX(0);}
                if(key == KeyEvent.VK_D){tempObject.setVelX(0);}

            }
        }
        */
    }
}




