//package giftest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class giftest {

/*
 * Example:
 *    AnimatedGifEncoder e = new AnimatedGifEncoder();
 *    e.start(outputFileName);
 *    e.setDelay(1000);   // 1 frame per sec
 *    e.addFrame(image1);
 *    e.addFrame(image2);
 *    e.finish(); 
 */
	
    public static void main(String args[]) 
    { 
    	//C:\eclipse\work_spaces\giftest\src\giftest\01.png
    	//C:\eclipse\work_spaces\giftest\src\giftest\02.png
    	//C:\eclipse\work_spaces\giftest\src\giftest\03.png
    	
    	// images 경로는 알아서 다시 지정해서 사용하기 바랍니다.

    	String outputFileName = "C:\\eclipse\\work_spaces\\giftest\\src\\giftest\\images\\test.gif";
    	File inputFile1 = new File("C:\\eclipse\\work_spaces\\giftest\\src\\giftest\\images\\01.png");
    	File inputFile2 = new File("C:\\eclipse\\work_spaces\\giftest\\src\\giftest\\images\\02.png");
    	File inputFile3 = new File("C:\\eclipse\\work_spaces\\giftest\\src\\giftest\\images\\03.png");
    	
    	
    	BufferedImage image1,image2,image3;
		try {
			image1 = ImageIO.read(inputFile1);
			image2 = ImageIO.read(inputFile2);
			image3 = ImageIO.read(inputFile3);
			
	    	AnimatedGifEncoder e = new AnimatedGifEncoder();
	    	e.start(outputFileName);
	    	e.setDelay(1000);   // 1 frame per sec
	    	e.addFrame(image1);
	    	System.out.println("add image1"); 
	    	e.addFrame(image2);
	    	System.out.println("add image2"); 
	    	e.addFrame(image3);
	    	System.out.println("add image3"); 
	    	e.finish(); 
	    	
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

    	System.out.println("completed...."); 
    	
        //System.out.println("Hello, World"); 
    } 
}
