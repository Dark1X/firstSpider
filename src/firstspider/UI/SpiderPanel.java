package firstspider.UI;

import firstspider.network.AddressCatcher;
import java.io.File;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;

public class SpiderPanel extends javax.swing.JPanel implements Observer {

    private AddressCatcher ac = new AddressCatcher();
   private Map<String, String> courseMap = null;
    public AddressCatcher getAc() {
        return ac;
    }

    public SpiderPanel() {
        initComponents();
        ac.addObserver(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectDialog = new javax.swing.JDialog();
        ensureSelect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        fileChoosingBtu = new javax.swing.JButton();
        pathTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        commandShow = commandShow =null;
        try{
            commandShow = new ConsoleTextArea();}
        catch(Exception e1){};
        userNameTxt = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();

        ensureSelect.setFont(new java.awt.Font("微软雅黑 Light", 0, 14)); // NOI18N
        ensureSelect.setText("确定 Okay");
        ensureSelect.setToolTipText("");
        ensureSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ensureSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectDialogLayout = new javax.swing.GroupLayout(selectDialog.getContentPane());
        selectDialog.getContentPane().setLayout(selectDialogLayout);
        selectDialogLayout.setHorizontalGroup(
            selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectDialogLayout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addComponent(ensureSelect)
                .addGap(30, 30, 30))
        );
        selectDialogLayout.setVerticalGroup(
            selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectDialogLayout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(ensureSelect)
                .addContainerGap())
        );

        setFont(new java.awt.Font("微软雅黑 Light", 0, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("微软雅黑 Light", 1, 18)); // NOI18N
        jLabel1.setText("Password 密码 :");

        jLabel2.setFont(new java.awt.Font("微软雅黑 Light", 1, 18)); // NOI18N
        jLabel2.setText("Username 用户名 :");

        start.setFont(new java.awt.Font("微软雅黑 Light", 0, 24)); // NOI18N
        start.setText("Start Backup 开始备份！");
        start.setActionCommand("Start Backiup 开始备份！");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        fileChoosingBtu.setFont(new java.awt.Font("微软雅黑 Light", 0, 18)); // NOI18N
        fileChoosingBtu.setText("Choose path 选择目录. . .");
        fileChoosingBtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChoosingBtuActionPerformed(evt);
            }
        });

        pathTextField.setFont(new java.awt.Font("微软雅黑 Light", 0, 18)); // NOI18N
        pathTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pathTextField.setText(new File(ac.getRootPath()).getAbsolutePath().replace("\\\\", "\\")
        );
        pathTextField.setToolTipText("");
        pathTextField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        pathTextField.setEnabled(false);
        pathTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("微软雅黑 Light", 1, 18)); // NOI18N
        jLabel3.setText("Save ALL files to 所有文件存储到 : ");

        commandShow.setEditable(false);
        commandShow.setColumns(20);
        commandShow.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        commandShow.setRows(5);
        jScrollPane3.setViewportView(commandShow);

        userNameTxt.setFont(new java.awt.Font("微软雅黑 Light", 0, 15)); // NOI18N

        passwordText.setFont(new java.awt.Font("微软雅黑 Light", 0, 14)); // NOI18N
        passwordText.setToolTipText("");
        passwordText.setPreferredSize(new java.awt.Dimension(94, 24));
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 391, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(144, 144, 144))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(fileChoosingBtu))
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileChoosingBtu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleParent(commandShow);
    }// </editor-fold>//GEN-END:initComponents

    public JTextArea getCommandShow() {
        return commandShow;
    }


    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        if (userNameTxt.getText().equals("") || passwordText.getText().equals("")) {
            System.out.println("Error: No password or username. 无用户名或密码。");
            start.setEnabled(true);
            return;
        }

        ac.setUserName(userNameTxt.getText());
        ac.setPassword(passwordText.getText());
        Map session = ac.beforeCatch();
        courseMap = ac.getCourse();
        if (session == null) {
            return;
        }
        
      //  JCheckBox jcb = null;
    //    for (String es:courseMap.keySet()){
    //        jcb = new JCheckBox();
    //        jcb.setText(es);
    //        selectDialog.add(jcb);
     //   }
      //  selectDialog.setVisible(true);
      //  ac.setCourseMap(selectedCourseMap);
        Thread act = new Thread(ac);
        act.start();

    }//GEN-LAST:event_startActionPerformed


    private void fileChoosingBtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChoosingBtuActionPerformed
        JFileChooser jc = new JFileChooser();
        jc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jc.setApproveButtonText("Choose this folder | 选择此文件夹");
        jc.setCurrentDirectory(new File(ac.getRootPath()));
        jc.showDialog(this, null);

        String localAddr = "";
        try {
            localAddr = jc.getSelectedFile().getAbsolutePath();
        } catch (NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Please choose a folder.请选择一个文件夹。");
            localAddr = new File(ac.getRootPath()).getAbsolutePath().replace("\\\\", "\\");
            System.out.println("Error: Must choose a folder to store your files on ICE. 必须选择一个文件夹来保存你ICE上的文件。");
        }
        pathTextField.setText(localAddr);
        String temp = localAddr.replace("\\", "\\\\") + "\\\\";
        ac.setRootPath(temp);

    }//GEN-LAST:event_fileChoosingBtuActionPerformed

    private void pathTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathTextFieldActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void ensureSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ensureSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ensureSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea commandShow;
    private javax.swing.JButton ensureSelect;
    private javax.swing.JButton fileChoosingBtu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField pathTextField;
    private javax.swing.JDialog selectDialog;
    private javax.swing.JButton start;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof AddressCatcher) {
            AddressCatcher ac = (AddressCatcher) o;
            start.setEnabled(ac.flag);
        }
    }

}
