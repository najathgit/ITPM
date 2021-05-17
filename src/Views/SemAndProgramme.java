/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Programme.ProgrammeController;
import Controllers.Semester.SemesterController;
import Models.Programme;
import Models.Semester;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.ir.BreakNode;


public class SemAndProgramme extends javax.swing.JFrame {

    int resultOutput;

    int selectedSemAndYear;
    int selectedProgramme;

    ArrayList<Semester> semesterModelList;
    ArrayList<Programme> programmeModelList;

    SemesterController semesterController;
    ProgrammeController programmeController;

    public SemAndProgramme() {
        initComponents();

        semesterModelList = new ArrayList<>();
        programmeModelList = new ArrayList<>();

        semesterController = new SemesterController();
        programmeController = new ProgrammeController();

        loadAllSemester();
        loadAllProgrammes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        semAndYear = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        semAndYearList = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        programmeName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        programmeList = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ABC INSTITUE TIME TABLE MANAGEMENT SYSTEM");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ABC Institute, New Kandy Rd, Malabe 10115");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abc.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Register a New Lecturer");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 535));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Year and Semester Registration");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel5.setText(" Semester and Year Registration");

        semAndYear.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        semAndYear.setForeground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(118, 255, 3));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Success.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/hover_btn.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/reset_btn.png"))); // NOI18N
        jButton3.setText("DELETE");
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/hover_btn.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel6.setText(" Registered Semester and Year");

        semAndYearList.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        semAndYearList.setForeground(new java.awt.Color(51, 51, 51));
        semAndYearList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture", "Tutorial", "Practical" }));
        semAndYearList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semAndYearListItemStateChanged(evt);
            }
        });
        semAndYearList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semAndYearListActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(118, 255, 3));
        jButton5.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Success.png"))); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/hover_btn.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semAndYearList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semAndYear)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semAndYear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semAndYearList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 250, 250));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Tips");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 30, -1));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Click on the 'Calander' to Set Working Days,");

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Working Time and to Set Time Slot");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar (2).png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel16)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/all.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Click on the 'Select All' to view Dashbaord");

        jLabel23.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("reports from Begining of the time");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel23)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Click on the 'Refresh' your Dashbaord");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 800, 220));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 535));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText(" Programme Registration");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel8.setText(" Programme Name");

        programmeName.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        programmeName.setForeground(new java.awt.Color(51, 51, 51));

        jButton2.setBackground(new java.awt.Color(118, 255, 3));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Success.png"))); // NOI18N
        jButton2.setText("SAVE");
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/hover_btn.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/reset_btn.png"))); // NOI18N
        jButton4.setText("DELETE");
        jButton4.setToolTipText("");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/hover_btn.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel9.setText(" Registered Programmes");

        programmeList.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        programmeList.setForeground(new java.awt.Color(51, 51, 51));
        programmeList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture", "Tutorial", "Practical" }));
        programmeList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmeListActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(118, 255, 3));
        jButton6.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/Success.png"))); // NOI18N
        jButton6.setText("UPDATE");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Buttons/hover_btn.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(programmeList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(programmeName)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programmeName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programmeList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setVisible(false);
        StudentRegistration d = new StudentRegistration();
        d.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        resultOutput = semesterController.insertSemester(new Semester(semAndYear.getText(), 1));
        if (resultOutput == 1) {
            JOptionPane.showMessageDialog(null, "Successfully Saved", "Semester And Year Saved", JOptionPane.WARNING_MESSAGE);
            loadAllSemester();
            semAndYear.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Oops !", "Something Wrong. Please Contact Administrator.", JOptionPane.ERROR_MESSAGE);
            loadAllSemester();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

//        semesterModelList.forEach((data)->{
//            System.out.println(data.getSemester_id());
//        });
        int semester_id = semesterModelList.get(semAndYearList.getSelectedIndex()).getSemester_id();

        resultOutput = semesterController.deleteSemesterAndYear(new Semester(semester_id, 0));
        loadAllSemester();
        JOptionPane.showMessageDialog(null, "Delete Semester And Year Successfully.");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        resultOutput = programmeController.insertProgramme(new Programme(1, programmeName.getText(), 1));
        if (resultOutput == 1) {
            JOptionPane.showMessageDialog(null, "Successfully Saved", "Programme Saved", JOptionPane.WARNING_MESSAGE);
            loadAllProgrammes();
            programmeName.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Oops !", "Something Wrong. Please Contact Administrator.", JOptionPane.ERROR_MESSAGE);
            loadAllSemester();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int programme_id = programmeModelList.get(programmeList.getSelectedIndex()).getProgramme_id();

        resultOutput = programmeController.deleteProgramme(new Programme(programme_id, "ABC", 0));
        loadAllProgrammes();
        JOptionPane.showMessageDialog(null, "Delete Programme Successfully.");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void semAndYearListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semAndYearListItemStateChanged


    }//GEN-LAST:event_semAndYearListItemStateChanged

    private void semAndYearListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semAndYearListActionPerformed

        if (semAndYearList.getSelectedIndex() > -1) {
            semAndYear.setText(semesterModelList.get(semAndYearList.getSelectedIndex()).getSemester());
        }

    }//GEN-LAST:event_semAndYearListActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (semAndYearList.getSelectedIndex() > -1) {
            resultOutput = semesterController.updateSemester(new Semester(semesterModelList.get(semAndYearList.getSelectedIndex()).getSemester_id(), semAndYear.getText(), 1));
            loadAllSemester();
            JOptionPane.showMessageDialog(null, "Update Semester And Year Successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Oops !", "Something Wrong. Unable Process Update, Please process as Save Function.", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if (programmeList.getSelectedIndex() > -1) {

            resultOutput = programmeController.updateProgramme(new Programme(programmeModelList.get(programmeList.getSelectedIndex()).getProgramme_id(), programmeName.getText(), 1));
            loadAllProgrammes();
            JOptionPane.showMessageDialog(null, "Update Programme Successfully.");

        } else {
            JOptionPane.showMessageDialog(null, "Oops !", "Something Wrong. Unable Process Update, Please process as Save Function.", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void programmeListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmeListActionPerformed

        if (programmeList.getSelectedIndex() > -1) {
            programmeName.setText(programmeModelList.get(programmeList.getSelectedIndex()).getProgramme_name());
        }


    }//GEN-LAST:event_programmeListActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SemAndProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SemAndProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SemAndProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SemAndProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemAndProgramme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> programmeList;
    private javax.swing.JTextField programmeName;
    private javax.swing.JTextField semAndYear;
    private javax.swing.JComboBox<String> semAndYearList;
    // End of variables declaration//GEN-END:variables

    private void loadAllSemester() {
        semesterModelList.clear();
        semAndYearList.removeAllItems();
        semesterModelList = semesterController.getSemesters();
        semesterModelList.forEach((data) -> semAndYearList.addItem(data.getSemester()));

    }

    private void loadAllProgrammes() {
        programmeModelList.clear();
        programmeList.removeAllItems();
        programmeModelList = programmeController.getProgramme();
        programmeModelList.forEach((data) -> programmeList.addItem(data.getProgramme_name()));
    }

}
