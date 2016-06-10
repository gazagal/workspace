/**
 * 
 */
package cl.curso.java.login_app;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

/**
 * @author Gabriel Zagal
 *
 */
public class WebcamService {
	
	public static void TomarFoto() throws IOException{
	       Webcam webcam = Webcam.getDefault();
	       webcam.setViewSize(WebcamResolution.VGA.getSize());
//	       webcam.setViewSize(new Dimension(1024, 768));
	       webcam.open();
	       ImageIO.write(webcam.getImage(), "PNG", new File("/Users/Public/Pictures/Sample Pictures/"+new Date().getTime()+".png"));
	}
	
	
	
}
