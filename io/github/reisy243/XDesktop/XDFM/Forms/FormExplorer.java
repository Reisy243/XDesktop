package io.github.reisy243.XDesktop.XDFM.Forms;

import javax.swing.*;
<<<<<<< HEAD
import javax.swing.tree.DefaultMutableTreeNode;
=======
>>>>>>> fb73bd4d0d1fabdb9b1654f82ac996d8f89f1868

public class FormExplorer extends JFrame {
	public FormExplorer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("XDFile-Manager");

<<<<<<< HEAD
		JSplitPane MainPanel = new JSplitPane();
		JTable Files = new JTable();

		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root: /");
		DefaultMutableTreeNode FolderBin = new DefaultMutableTreeNode("bin");
		DefaultMutableTreeNode FolderSBin = new DefaultMutableTreeNode("sbin");
		DefaultMutableTreeNode FolderLib = new DefaultMutableTreeNode("lib");
		DefaultMutableTreeNode FolderLib64 = new DefaultMutableTreeNode("lib64");
		DefaultMutableTreeNode FolderUsr = new DefaultMutableTreeNode("usr");

		root.add(FolderBin);
		root.add(FolderSBin);
		root.add(FolderLib);
		root.add(FolderLib64);
		root.add(FolderUsr);
		JTree FileTree = new JTree(root);

		JMenuBar MenuBar = new JMenuBar();
		JMenu MenuFile = new JMenu("File");
		JMenu MenuEdit = new JMenu("Edit");
		JMenu MenuView = new JMenu("View");

		JMenuItem MINewDir = new JMenuItem("New directory");
		JMenuItem MINewFile = new JMenuItem("New file");
		JMenuItem MIExit = new JMenuItem("Exit");

		JMenuItem MICopy = new JMenuItem("Copy");
		JMenuItem MICut = new JMenuItem("Cut");
		JMenuItem MIPaste = new JMenuItem("Paste");
		JMenuItem MIDelete = new JMenuItem("Delete");

		JMenuItem MIShowHid = new JMenu("Show hiden files");

		MenuFile.add(MINewDir);
		MenuFile.add(MINewFile);
		MenuFile.add(MIExit);

		MenuEdit.add(MICopy);
		MenuEdit.add(MICut);
		MenuEdit.add(MIPaste);
		MenuEdit.add(MIDelete);

		MenuView.add(MIShowHid);

		MenuBar.add(MenuFile);
		MenuBar.add(MenuEdit);
		MenuBar.add(MenuView);

		MainPanel.setLeftComponent(new JScrollPane(FileTree));
		MainPanel.setRightComponent(new JScrollPane(Files));

		setJMenuBar(MenuBar);
=======
		JPanel MainPanel = new JPanel();

>>>>>>> fb73bd4d0d1fabdb9b1654f82ac996d8f89f1868
		setContentPane(MainPanel);
		setSize(800,600);
	}
}
