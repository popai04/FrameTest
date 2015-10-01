import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import processing.core.PApplet;

public class MoniterPanel extends JPanel {
	ProcWin a;
	String str;
	MainFrame mf;

	public MoniterPanel(MainFrame m, String s){
		mf = m;
		str = s;

		this.setName("mp");
        setSize(MainFrame.w, MainFrame.h);

        setBackground(Color.WHITE);
		PApplet processing = new ProcWin();
		// PAppletを埋め込む
		this.add(processing);
		processing.init();
	}

	public void pc(String str){
		this.setVisible(false);
        mf.PanelChange((JPanel)this, str);
    }
}

