package client.View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

class TopPanel extends JPanel {
	private ImageIcon icon = new ImageIcon(this.getClass().getResource("images/logo.PNG"));
	private Image img = icon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Dimension d = getSize();
		g.drawImage(img, 0, 0, d.width, d.height, null);
	}
}