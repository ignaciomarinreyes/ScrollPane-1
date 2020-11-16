package view;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.ImageStats;
import org.opencv.core.Core;

public class MainFrame extends javax.swing.JFrame {

    private JFileChooser openJFileChooser;
    private FileNameExtensionFilter openFileNameExtensionFilter;
    private JScrollBar verticalBar;
    private JScrollBar horizontalBar;
    private ImageStats stats;

    public MainFrame() {
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        setLookAndFeel();
        openJFileChooser = new JFileChooser();
        openJFileChooser.setAcceptAllFileFilterUsed(false);
        openFileNameExtensionFilter = new FileNameExtensionFilter("Images [.jpg, .png, .jpeg]", new String[]{"jpg", "png", "jpeg"});
        openJFileChooser.addChoosableFileFilter(openFileNameExtensionFilter);
        initComponents();
        stats = canvas.getStats();
        verticalBar = jScrollPane1.getVerticalScrollBar();
        horizontalBar = jScrollPane1.getHorizontalScrollBar();
        verticalBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                canvas.setViewPoint(jScrollPane1.getViewport().getViewPosition(),
                        jScrollPane1.getViewport().getExtentSize());
                setChannelValues();
            }
        });
        horizontalBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                canvas.setViewPoint(jScrollPane1.getViewport().getViewPosition(),
                        jScrollPane1.getViewport().getExtentSize());
                setChannelValues();
            }
        });
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("ScrollPane - By Jesús Lárez & Ignacio Marín");
        this.setVisible(true);
        JOptionPane.showMessageDialog(rootPane, "Please load an image");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        canvas = new model.Canvas();
        redJPanel = new javax.swing.JPanel();
        minimunRedJTextField = new javax.swing.JTextField();
        averageRedJTextField = new javax.swing.JTextField();
        maximunRedJTextField = new javax.swing.JTextField();
        MinimunRedJLabel = new javax.swing.JLabel();
        averageRedJLabel = new javax.swing.JLabel();
        maximunRedJLabel = new javax.swing.JLabel();
        greenJPanel = new javax.swing.JPanel();
        minimunGreenJTextField = new javax.swing.JTextField();
        averageGreenJTextField = new javax.swing.JTextField();
        maximunGreenJTextField = new javax.swing.JTextField();
        minimunGreenJLabel = new javax.swing.JLabel();
        averageGreenJLabel = new javax.swing.JLabel();
        maximunGreenJLabel = new javax.swing.JLabel();
        blueJPanel = new javax.swing.JPanel();
        minimunBlueJTextField = new javax.swing.JTextField();
        averageBlueJTextField = new javax.swing.JTextField();
        maximunBlueJTextField = new javax.swing.JTextField();
        minimunBlueJLabel = new javax.swing.JLabel();
        averageBlueJLabel = new javax.swing.JLabel();
        maximunBlueJLabel = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        openImageJMenuItem = new javax.swing.JMenuItem();
        exitJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout canvasLayout = new javax.swing.GroupLayout(canvas);
        canvas.setLayout(canvasLayout);
        canvasLayout.setHorizontalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 846, Short.MAX_VALUE)
        );
        canvasLayout.setVerticalGroup(
            canvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(canvas);

        redJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Red Channel"));

        minimunRedJTextField.setEditable(false);

        averageRedJTextField.setEditable(false);

        maximunRedJTextField.setEditable(false);

        MinimunRedJLabel.setText("Minimun");

        averageRedJLabel.setText("Average");

        maximunRedJLabel.setText("Maximun");

        javax.swing.GroupLayout redJPanelLayout = new javax.swing.GroupLayout(redJPanel);
        redJPanel.setLayout(redJPanelLayout);
        redJPanelLayout.setHorizontalGroup(
            redJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MinimunRedJLabel)
                    .addComponent(averageRedJLabel)
                    .addComponent(maximunRedJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(redJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(averageRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimunRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximunRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        redJPanelLayout.setVerticalGroup(
            redJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, redJPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(redJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimunRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinimunRedJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(redJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(averageRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averageRedJLabel))
                .addGap(13, 13, 13)
                .addGroup(redJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maximunRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximunRedJLabel))
                .addContainerGap())
        );

        greenJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Green Channel"));

        minimunGreenJTextField.setEditable(false);

        averageGreenJTextField.setEditable(false);

        maximunGreenJTextField.setEditable(false);

        minimunGreenJLabel.setText("Minimun");

        averageGreenJLabel.setText("Average");

        maximunGreenJLabel.setText("Maximun");

        javax.swing.GroupLayout greenJPanelLayout = new javax.swing.GroupLayout(greenJPanel);
        greenJPanel.setLayout(greenJPanelLayout);
        greenJPanelLayout.setHorizontalGroup(
            greenJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greenJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(greenJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimunGreenJLabel)
                    .addComponent(averageGreenJLabel)
                    .addComponent(maximunGreenJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(greenJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimunGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averageGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximunGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        greenJPanelLayout.setVerticalGroup(
            greenJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greenJPanelLayout.createSequentialGroup()
                .addGroup(greenJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greenJPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(minimunGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, greenJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(minimunGreenJLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(greenJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(averageGreenJLabel)
                    .addComponent(averageGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(greenJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maximunGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximunGreenJLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        blueJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Blue Channel"));

        minimunBlueJTextField.setEditable(false);

        averageBlueJTextField.setEditable(false);

        maximunBlueJTextField.setEditable(false);

        minimunBlueJLabel.setText("Minimun");

        averageBlueJLabel.setText("Average");

        maximunBlueJLabel.setText("Maximun");

        javax.swing.GroupLayout blueJPanelLayout = new javax.swing.GroupLayout(blueJPanel);
        blueJPanel.setLayout(blueJPanelLayout);
        blueJPanelLayout.setHorizontalGroup(
            blueJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blueJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimunBlueJLabel)
                    .addComponent(averageBlueJLabel)
                    .addComponent(maximunBlueJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(blueJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimunBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averageBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximunBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        blueJPanelLayout.setVerticalGroup(
            blueJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(blueJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blueJPanelLayout.createSequentialGroup()
                        .addGroup(blueJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minimunBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minimunBlueJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(averageBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(averageBlueJLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blueJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maximunBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximunBlueJLabel))
                .addContainerGap())
        );

        fileJMenu.setMnemonic('f');
        fileJMenu.setText("File");

        openImageJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openImageJMenuItem.setText("Open Image");
        openImageJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openImageJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(openImageJMenuItem);

        exitJMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitJMenuItem.setText("Exit");
        exitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        jMenuBar.add(fileJMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(redJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(greenJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(blueJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(redJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blueJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(greenJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        int res = JOptionPane.showConfirmDialog(rootPane, "Are you sure you wanna exit?", 
                "Exit", JOptionPane.YES_OPTION);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    private void openImageJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openImageJMenuItemActionPerformed
        int res = openJFileChooser.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            canvas.setPath(openJFileChooser.getSelectedFile().getAbsolutePath());
            if (canvas.loadImage()) {
                repaint();
                canvas.setViewPoint(jScrollPane1.getViewport().getViewPosition(), 
                        jScrollPane1.getViewport().getExtentSize());
                setChannelValues();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Image could not be loaded");
            }
        }
    }//GEN-LAST:event_openImageJMenuItemActionPerformed

    private void setChannelValues() {
        minimunRedJTextField.setText(Integer.toString(stats.getMinimo()[2]));
        averageRedJTextField.setText(Integer.toString(stats.getPromedio()[2]));
        maximunRedJTextField.setText(Integer.toString(stats.getMaximo()[2]));
        minimunGreenJTextField.setText(Integer.toString(stats.getMinimo()[1]));
        averageGreenJTextField.setText(Integer.toString(stats.getPromedio()[1]));
        maximunGreenJTextField.setText(Integer.toString(stats.getMaximo()[1]));
        minimunBlueJTextField.setText(Integer.toString(stats.getMinimo()[0]));
        averageBlueJTextField.setText(Integer.toString(stats.getPromedio()[0]));
        maximunBlueJTextField.setText(Integer.toString(stats.getMaximo()[0]));

    }

    private void setLookAndFeel() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MinimunRedJLabel;
    private javax.swing.JLabel averageBlueJLabel;
    private javax.swing.JTextField averageBlueJTextField;
    private javax.swing.JLabel averageGreenJLabel;
    private javax.swing.JTextField averageGreenJTextField;
    private javax.swing.JLabel averageRedJLabel;
    private javax.swing.JTextField averageRedJTextField;
    private javax.swing.JPanel blueJPanel;
    private model.Canvas canvas;
    private javax.swing.JMenuItem exitJMenuItem;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JPanel greenJPanel;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maximunBlueJLabel;
    private javax.swing.JTextField maximunBlueJTextField;
    private javax.swing.JLabel maximunGreenJLabel;
    private javax.swing.JTextField maximunGreenJTextField;
    private javax.swing.JLabel maximunRedJLabel;
    private javax.swing.JTextField maximunRedJTextField;
    private javax.swing.JLabel minimunBlueJLabel;
    private javax.swing.JTextField minimunBlueJTextField;
    private javax.swing.JLabel minimunGreenJLabel;
    private javax.swing.JTextField minimunGreenJTextField;
    private javax.swing.JTextField minimunRedJTextField;
    private javax.swing.JMenuItem openImageJMenuItem;
    private javax.swing.JPanel redJPanel;
    // End of variables declaration//GEN-END:variables
}
