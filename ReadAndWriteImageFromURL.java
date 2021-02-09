package GeneralProgramming;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ReadAndWriteImageFromURL {

	public static void main(String[] args) {
		URL url = null;
		BufferedImage image = null;
		try {
			url = new URL("http://javaconceptoftheday.com/wp-content/NumberPatternPrograms.png");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		try {
			image = ImageIO.read(url);
			ImageIO.write(image, "jpg", new File("I:/output.jpg"));
			ImageIO.write(image, "png", new File("I:/output.png"));
			ImageIO.write(image, "gif", new File("I:/output.gif"));
			ImageIO.write(image, "bmp", new File("I:/output.bmp"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
