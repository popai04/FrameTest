import processing.core.PApplet;

public class ProcWin extends PApplet{

	public void setup(){
		// MainFrameからパネルサイズをもらってきます．
		int wid = MainFrame.w;
		int hei = MainFrame.h;
		size(wid, hei);
		frameRate(20);
	}

	public void  draw(){
		background(0);
		  //ellipse(width/2, height/2, mouseX, mouseY);
		  textSize(24);
		  text("this panel is Procecssing", 800, 500);
		  
	}

}
