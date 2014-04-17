import javax.swing.*;

class Frame{
	Frame(){
		JFrame mWindow = new JFrame ("Hello World!");
		mWindow.setSize(200,200);
		mWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mWindow.setVisible(true);
	}
}

public class MainWindow {
	
	public static void main(String[] argc){
		Frame mFrame = new Frame();
		
	}
	
}
