/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.homepagegui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class HomepageGui extends JFrame implements ActionListener {

    private JFrame mainFrame, mainFrame1, mainFrame2, mainFrame3;
    private JPanel panelCenter, panelNorth, panelNew1, panelNew2, panelNew3;
    private JButton btnShuttleSchedules, btnBulletinBoard, btnShuttleDrivers;
    private JLabel labelHomePage;
    private Font font, font1;

    public HomepageGui() {
        mainFrame = new JFrame("Homepage");

        panelCenter = new JPanel();
        panelNorth = new JPanel();

        labelHomePage = new JLabel("HOMEPAGE");
        labelHomePage.setForeground(Color.black);

        btnShuttleSchedules = new JButton("Shuttle Schedules");
        btnBulletinBoard = new JButton("Bulletin Board");
        btnShuttleDrivers = new JButton("Shuttle Drivers");

        font = new Font("Ariel", Font.BOLD, 15);
        font1 = new Font("Ariel", Font.BOLD, 27);

    }

    public void setGUI() {

        panelCenter.setLayout(new FlowLayout());
        labelHomePage.setFont(font1);

        panelNorth.setLayout(new FlowLayout());

        panelCenter.add(btnShuttleSchedules);
        panelCenter.add(btnBulletinBoard);
        panelCenter.add(btnShuttleDrivers);

        panelNorth.add(labelHomePage);

        btnShuttleSchedules.setForeground(Color.white);
        btnShuttleSchedules.setBackground(Color.blue);
        btnShuttleSchedules.setFont(font);

        btnBulletinBoard.setForeground(Color.white);
        btnBulletinBoard.setBackground(Color.blue);
        btnBulletinBoard.setFont(font);

        btnShuttleDrivers.setForeground(Color.white);
        btnShuttleDrivers.setBackground(Color.blue);
        btnShuttleDrivers.setFont(font);

        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelCenter, BorderLayout.CENTER);

        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(550, 250);
        mainFrame.setVisible(true);

        btnShuttleSchedules.addActionListener(this);
        btnBulletinBoard.addActionListener(this);
        btnShuttleDrivers.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Shuttle Schedules")) {
            mainFrame1 = new JFrame("Shuttle Schedules");
            panelNew1 = new JPanel();
            mainFrame1.pack();
            mainFrame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mainFrame1.setSize(550, 250);
            mainFrame1.setVisible(true);

        } else if (e.getActionCommand().equals("Bulletin Board")) {
            mainFrame2 = new JFrame("Bulletin Board");
            panelNew2 = new JPanel();
            mainFrame2.pack();
            mainFrame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mainFrame2.setSize(550, 250);
            mainFrame2.setVisible(true);

        } else if (e.getActionCommand().equals("Shuttle Drivers")) {
            mainFrame3 = new JFrame("Shuttle Drivers");
            panelNew3 = new JPanel();
            mainFrame3.pack();
            mainFrame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mainFrame3.setSize(550, 250);
            mainFrame3.setVisible(true);

        }

    }

    public static void main(String[] args) {

        HomepageGui myHomepageGui = new HomepageGui();
        myHomepageGui.setGUI();

    }
}
