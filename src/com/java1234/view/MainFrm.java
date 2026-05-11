package com.java1234.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrm extends JFrame {

    private JPanel contentPane;
    private JDesktopPane table;

    /**
     * Create the frame.
     */
    public MainFrm() {
        setTitle("Library Management Main Interface");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setLocationRelativeTo(null); // center
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnBasicDataMaintenance = new JMenu("Basic data maintenance");
        menuBar.add(mnBasicDataMaintenance);
        
        JMenu mnBookCategoryManagement = new JMenu("Book category management");
        mnBasicDataMaintenance.add(mnBookCategoryManagement);
        
        JMenuItem mntmAddCategory = new JMenuItem("Add category");
        mntmAddCategory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BookTypeAddInterFrm bookTypeAddInterFrm = new BookTypeAddInterFrm();
                bookTypeAddInterFrm.setVisible(true);
                table.add(bookTypeAddInterFrm);
            }
        });
        mnBookCategoryManagement.add(mntmAddCategory);
        
        JMenuItem mntmCategoryMaintenance = new JMenuItem("Category Maintenance");
        mntmCategoryMaintenance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BookTypeManageInterFrm bookTypeManageInterFrm = new BookTypeManageInterFrm();
                bookTypeManageInterFrm.setVisible(true);
                table.add(bookTypeManageInterFrm);
            }
        });
        mnBookCategoryManagement.add(mntmCategoryMaintenance);
        
        JMenu mnBookManagement = new JMenu("Book management");
        mnBasicDataMaintenance.add(mnBookManagement);
        
        JMenuItem mntmAddBook = new JMenuItem("Add book");
        mntmAddBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BookAddInterFrm bookAddInterFrm = new BookAddInterFrm();
                bookAddInterFrm.setVisible(true);
                table.add(bookAddInterFrm);
            }
        });
        mnBookManagement.add(mntmAddBook);
        
        JMenuItem mntmBookMaintenance = new JMenuItem("Book maintenance");
        mntmBookMaintenance.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BookManageInterFrm bookManageInterFrm = new BookManageInterFrm();
                bookManageInterFrm.setVisible(true);
                table.add(bookManageInterFrm);
            }
        });
        mnBookManagement.add(mntmBookMaintenance);
        
        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the system?");
                if (result == 0) {
                    dispose();
                }
            }
        });
        mnBasicDataMaintenance.add(mntmExit);
        
        JMenu mnAboutUs = new JMenu("About us");
        menuBar.add(mnAboutUs);
        
        JMenuItem mntmAbout = new JMenuItem("About");
        mntmAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Book Management System V1.0");
            }
        });
        mnAboutUs.add(mntmAbout);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        table = new JDesktopPane();
        contentPane.add(table, BorderLayout.CENTER);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
}
