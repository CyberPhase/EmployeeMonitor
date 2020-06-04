import java.awt.geom.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.util.*;

public class ScreenCapturer extends TimerTask
{
       
        File out = new File("D:/XAMPP/htdocs/deskmonitor/DeskMonitor.jpg");
        Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(resolution);
        
    public void run()
    {
   
        try{
        
        Robot robot = new Robot();
        BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
        //Graphics g = bufferedImage.getGraphics();
        //g.drawImage(bufferedImage.getScaledInstance(bufferedImage.getWidth(), bufferedImage.getHeight(), Image.SCALE_DEFAULT), 0, 0, null);

        ImageIO.write(bufferedImage,"jpg",out);
        bufferedImage=null;
        
    }
    catch(Exception ex){}
    }
    
    public static void main(String [] args){
        
        Timer timer = new Timer();
        timer.schedule(new ScreenCapturer(), 0, 500);
    }
}