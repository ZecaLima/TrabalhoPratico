/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BLL.dados;
import DAL.Carro;
import DAL.Cliente;
import DAL.Utilizador;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jcarl
 */
public class MenuCliente extends javax.swing.JFrame {
    dados d = new dados();
    /**
     * Creates new form MenuUser
     */
    public MenuCliente(Utilizador cliente) {  
        initComponents();
        TrocarMenu(1);
        this.perfil_nome.setText(cliente.getNome());
        this.perfil_email.setText(cliente.getEmail());
        this.perfil_password.setText(cliente.getPassword());
        this.perfil_telemovel.setText(String.valueOf(cliente.getnTelemovel()));
        this.perfil_id.setText(cliente.getId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideMenuOpen = new javax.swing.JLabel();
        sideMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PerfilPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        perfil_telemovel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        perfil_nome = new javax.swing.JLabel();
        perfil_email = new javax.swing.JLabel();
        perfil_password = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        perfil_id = new javax.swing.JLabel();
        carrosPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        carrosTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        reservasPanel = new javax.swing.JPanel();
        comprasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 745));
        setMinimumSize(new java.awt.Dimension(1366, 745));
        setPreferredSize(new java.awt.Dimension(1366, 745));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideMenuOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu-bar.png"))); // NOI18N
        sideMenuOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sideMenuOpenMousePressed(evt);
            }
        });
        getContentPane().add(sideMenuOpen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        sideMenu.setBackground(new java.awt.Color(127, 109, 82));
        sideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow.png"))); // NOI18N
        jLabel2.setText("Voltar");
        jLabel2.setToolTipText("Voltar");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        sideMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(127, 109, 82));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("Logout");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        sideMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 300, 70));

        jButton2.setBackground(new java.awt.Color(127, 109, 82));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ver Carros");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        sideMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 300, 70));

        jButton3.setBackground(new java.awt.Color(127, 109, 82));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Ver Reservas");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        sideMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 70));

        jButton4.setBackground(new java.awt.Color(127, 109, 82));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Ver Compras");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        sideMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 300, 70));

        jButton5.setBackground(new java.awt.Color(127, 109, 82));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Perfil");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        sideMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 70));

        getContentPane().add(sideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 720));

        jLayeredPane1.setBackground(new java.awt.Color(146, 129, 102));

        PerfilPanel.setBackground(new java.awt.Color(146, 129, 102));
        PerfilPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Meu Perfil");
        PerfilPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telemovel:");
        PerfilPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        perfil_telemovel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        perfil_telemovel.setForeground(new java.awt.Color(0, 0, 0));
        perfil_telemovel.setText("telemovel");
        PerfilPanel.add(perfil_telemovel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email:");
        PerfilPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Password:");
        PerfilPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nome:");
        PerfilPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        perfil_nome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        perfil_nome.setForeground(new java.awt.Color(0, 0, 0));
        perfil_nome.setText("nome");
        PerfilPanel.add(perfil_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        perfil_email.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        perfil_email.setForeground(new java.awt.Color(0, 0, 0));
        perfil_email.setText("email");
        PerfilPanel.add(perfil_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        perfil_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        perfil_password.setForeground(new java.awt.Color(0, 0, 0));
        perfil_password.setText("password");
        PerfilPanel.add(perfil_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID:");
        PerfilPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, -1, -1));

        perfil_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        perfil_id.setForeground(new java.awt.Color(0, 0, 0));
        perfil_id.setText("id");
        PerfilPanel.add(perfil_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jLayeredPane1.add(PerfilPanel);
        PerfilPanel.setBounds(0, 0, 1370, 720);

        carrosPanel.setBackground(new java.awt.Color(146, 129, 102));
        carrosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carrosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Estado", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(carrosTable);

        jScrollPane1.setViewportView(jScrollPane4);

        carrosPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 1130, 510));

        jButton6.setBackground(new java.awt.Color(0, 102, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Reservar Carro");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        carrosPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 620, 170, 60));

        jLayeredPane1.add(carrosPanel);
        carrosPanel.setBounds(0, 0, 1370, 720);

        reservasPanel.setBackground(new java.awt.Color(146, 129, 102));
        reservasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane1.add(reservasPanel);
        reservasPanel.setBounds(0, 0, 1370, 720);

        comprasPanel.setBackground(new java.awt.Color(146, 129, 102));
        comprasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLayeredPane1.add(comprasPanel);
        comprasPanel.setBounds(0, 0, 1370, 720);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TrocarMenu(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void sideMenuOpenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sideMenuOpenMousePressed
        sideMenu.setVisible(true);
        sideMenuOpen.setVisible(false);
    }//GEN-LAST:event_sideMenuOpenMousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        sideMenu.setVisible(false);
        sideMenuOpen.setVisible(true);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TrocarMenu(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TrocarMenu(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TrocarMenu(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String data = JOptionPane.showInputDialog("Escreva a data em que pretende realizar a reserva: (dd/mm/yyyy)");
        
        final Pattern DATA_REGEX = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$", Pattern.CASE_INSENSITIVE);
        if((DATA_REGEX.matcher(data).matches())){
            System.out.println("é data");
        }else{
            JOptionPane.showConfirmDialog(null, "Data Inválida!","Erro", JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cliente cliente = new Cliente("","","", 1);
                new MenuCliente(cliente).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PerfilPanel;
    private javax.swing.JPanel carrosPanel;
    private javax.swing.JTable carrosTable;
    private javax.swing.JPanel comprasPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel perfil_email;
    private javax.swing.JLabel perfil_id;
    private javax.swing.JLabel perfil_nome;
    private javax.swing.JLabel perfil_password;
    private javax.swing.JLabel perfil_telemovel;
    private javax.swing.JPanel reservasPanel;
    private javax.swing.JPanel sideMenu;
    private javax.swing.JLabel sideMenuOpen;
    // End of variables declaration//GEN-END:variables

    public void initCarrosTable(){
        ArrayList<Carro> carros = d.getAllCarros();       
        
        DefaultTableModel  carrosTablesModel = (DefaultTableModel) carrosTable.getModel();
        carrosTablesModel.setRowCount(0);
        for(int i = 0; i<carros.size(); i++){
            if(carros.get(i).getEstado()==2){
                carrosTablesModel.addRow(new Object[]{
                    carros.get(i).getId(),
                    carros.get(i).getMarca(),
                    carros.get(i).getModelo(),
                    "Disponivel",
                    carros.get(i).getPreco(),
                });           
            }
        }
    }
    
    
    
    private void TrocarMenu(int i){
        sideMenu.setVisible(false);
        sideMenuOpen.setVisible(true);
        
        this.carrosPanel.setVisible(false);
        this.reservasPanel.setVisible(false);
        this.comprasPanel.setVisible(false);
        this.PerfilPanel.setVisible(false);       
        
        switch (i) {
            case 1:carrosPanel.setVisible(true); initCarrosTable(); break;
            case 2:reservasPanel.setVisible(true); break;
            case 3:comprasPanel.setVisible(true);break;
            case 4: this.PerfilPanel.setVisible(true); break;
            default:throw new AssertionError();
        }
    }
}
