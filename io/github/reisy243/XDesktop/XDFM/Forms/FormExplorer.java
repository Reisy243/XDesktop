package io.github.reisy243.XDesktop.XDFM.Forms;

import javax.swing.*;

public class FormExplorer extends JFrame {
	public FormExplorer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("XDFile-Manager");

		JPanel MainPanel = new JPanel();

		setContentPane(MainPanel);
		setSize(800,600);
	}
}
