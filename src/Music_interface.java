
import jaco.mp3.player.MP3Player;

import java.io.File;
import javax.swing.JFileChooser;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import pirates.music.PiratesMusic;



   

public static class piratesEndless{
   

    private void SongsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SongsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SongsActionPerformed

    private void SongsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SongsMouseReleased
         FileFilter filter=new FileNameExtensionFilter("MP3 Files","mp3","mpeg3");
        JFileChooser chooser=new JFileChooser();
       chooser.setMultiSelectionEnabled(true);
        chooser.addChoosableFileFilter(filter);
      
        
        int returnVal=chooser.showOpenDialog(null);
        if(returnVal==JFileChooser.APPROVE_OPTION){

            File myFile=chooser.getSelectedFile();
            String song  =myFile+"";
            String name=chooser.getSelectedFile().getName();
            display.setText(name);

            PM.Play(song);
        }
    }//GEN-LAST:event_SongsMouseReleased

    private void loopOnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loopOnceActionPerformed
          switch (count){
            case 0:
            count=1;
            shufflecounter.setText("Loop on");
            break;
            case 1:
            count=0;
            shufflecounter.setText("Loop Off");
            break;}
        PiratesList pl=new PiratesList();
      pl.piratesMusicPlayer();
    }//GEN-LAST:event_loopOnceActionPerformed

    private void loopOnceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loopOnceMouseReleased

    }//GEN-LAST:event_loopOnceMouseReleased

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopActionPerformed

    private void stopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseReleased
        PM.Stop();

    }//GEN-LAST:event_stopMouseReleased

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pauseActionPerformed

    private void pauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pauseMouseReleased
    PM.Pause();
    }//GEN-LAST:event_pauseMouseReleased

    private void play1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_play1ActionPerformed

    private void play1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play1MouseReleased
        PM.Resume();

    }//GEN-LAST:event_play1MouseReleased

    private void songspanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_songspanelMouseReleased
        FileFilter filter=new FileNameExtensionFilter("MP3 Files","mp3","mpeg3");
        JFileChooser chooser=new JFileChooser();
       chooser.setMultiSelectionEnabled(true);
        chooser.addChoosableFileFilter(filter);
        int returnVal=chooser.showOpenDialog(null);
        if(returnVal==JFileChooser.APPROVE_OPTION){
 
            File myFile=chooser.getSelectedFile();
            String song  =myFile+"";
            String name=chooser.getSelectedFile().getName();
            display.setText(name);

            PM.Play(song);
        }
    }//GEN-LAST:event_songspanelMouseReleased

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
     
    }//GEN-LAST:event_jPanel3MouseReleased

    private void shuffleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shuffleMouseReleased
        switch (count){
            case 0:
            count=1;
            shufflecounter.setText("Shuffle on");
            break;
            case 1:
            count=0;
            shufflecounter.setText("Shuffle Off");
            break;}
    }//GEN-LAST:event_shuffleMouseReleased

    private void artists1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artists1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artists1ActionPerformed

    private void artists1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artists1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_artists1MouseReleased

    private void playlistpanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistpanelMouseReleased
          
        JFileChooser chooser=new JFileChooser();
       chooser.setMultiSelectionEnabled(true);
       
        int returnVal=chooser.showOpenDialog(null);
        if(returnVal==JFileChooser.APPROVE_OPTION){
            PM.Stop();
            File myFile=chooser.getSelectedFile();
            String song  =myFile+"";
            String name=chooser.getSelectedFile().getName();
            display.setText(name);

            PM.Play(song);
        }
    }//GEN-LAST:event_playlistpanelMouseReleased

    private void EndlessLoopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndlessLoopMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_EndlessLoopMouseReleased

    private void EndlessLoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndlessLoopActionPerformed
        switch (count){
            case 0:
            count=1;
            Loopcounter1.setText("Loop on");
            break;
            case 1:
            count=0;
            Loopcounter1.setText("Loop Off");
            break;}
        PiratesList pl=new PiratesList();
        pl.piratesMusicPlayer();
    }//GEN-LAST:event_EndlessLoopActionPerformed
    
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
            java.util.logging.Logger.getLogger(Music_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Music_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Music_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Music_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Music_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EndlessLoop;
    private javax.swing.JLabel LoopCounter;
    private javax.swing.JLabel Loopcounter;
    private javax.swing.JLabel Loopcounter1;
    private javax.swing.JLabel PiratesLogo;
    private javax.swing.JButton Songs;
    private javax.swing.JLabel artist1;
    private javax.swing.JButton artists1;
    private java.awt.Canvas canvas1;
    private java.awt.Checkbox checkbox1;
    public static javax.swing.JLabel display;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton loopOnce;
    private javax.swing.JButton pause;
    private javax.swing.JButton play1;
    private javax.swing.JPanel playlistpanel;
    private javax.swing.JPanel setting;
    private javax.swing.JButton shuffle;
    private javax.swing.JLabel shufflecounter;
    private javax.swing.JLabel songs1;
    private javax.swing.JPanel songspanel;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
