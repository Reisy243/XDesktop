package io.github.reisy243.XDesktop.XDFM.Forms;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class FormExplorer extends JFrame {
	public FormExplorer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("XDFile-Manager");

		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root: /");

		JMenuBar MenuBar = new JMenuBar();
		JSplitPane MainPanel = new JSplitPane();
		JTree FileTree = new JTree(root);
		JTable Files = new JTable();

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

		DefaultMutableTreeNode FolderBin = new DefaultMutableTreeNode("bin");
		DefaultMutableTreeNode FolderSBin = new DefaultMutableTreeNode("sbin");
		DefaultMutableTreeNode FolderLib = new DefaultMutableTreeNode("lib");
		DefaultMutableTreeNode FolderLib64 = new DefaultMutableTreeNode("lib64");
		DefaultMutableTreeNode FolderUsr = new DefaultMutableTreeNode("usr");

		MenuBar.add(MenuFile);
		MenuBar.add(MenuEdit);
		MenuBar.add(MenuView);

		MenuFile.add(MINewDir);
		MenuFile.add(MINewFile);
		MenuFile.add(MIExit);

		MenuEdit.add(MICopy);
		MenuEdit.add(MICut);
		MenuEdit.add(MIPaste);
		MenuEdit.add(MIDelete);

		MenuView.add(MIShowHid);

		root.add(FolderBin);
		root.add(FolderSBin);
		root.add(FolderLib);
		root.add(FolderLib64);
		root.add(FolderUsr);

		MainPanel.setLeftComponent(new JScrollPane(FileTree));
		MainPanel.setRightComponent(new JScrollPane(Files));

		MIExit.addActionListener(e -> System.exit(0));

		setJMenuBar(MenuBar);
		setContentPane(MainPanel);
		setSize(800,600);
	}
}
