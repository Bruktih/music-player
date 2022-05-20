import jaco.mp3.player.MP3Player;

import java.io.File;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.swing.JFileChooser;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import pirates.music.PiratesMusic;

class AudioListener implements LineListener{
    @Override
    public void update(LineEvent event ){
        LineEvent.Type eventType=event.getType();
        if(eventType==LineEvent.Type.STOP||eventType==LineEvent.Type.CLOSE){
            synchronized(this){
                notify();
            }
        }
    }
    public synchronized void waitUntilDone()throws InterruptedException{
        wait();
    }
    }

public class Music_interface extends javax.swing.JFrame {
    PiratesMusic PM=new PiratesMusic();
    public static int count;
    private Object Display;
    public static class FilePath {
    String pirate;
        private String piratespath;

    public FilePath() {
    }

    public FilePath(String pirate) {
        this.pirate = pirate;
    }

}

public static class Node{
    FilePath MP;
    Node next;

        public Node(FilePath MP, Node next) {
            this.MP = MP;
            this.next = next;
        }

        public Node(FilePath MP) {
            this.MP = MP;
        }

}
public static class PiratesList{
    Node head,tail;
    public PiratesList(){
        this.head=this.tail=null;
    }
    public boolean isEmpty(){
        return this.head==null;
    }
    public void addToTail(FilePath piratespath){
        Node node=new Node(piratespath);
        if(!this.isEmpty()){
              this.tail.next=this.tail;
            this.tail=node;
        }
        else{
            this.head=this.tail=node;
        }}
    public void piratesMusicPlayer(){
            Node temp=this.head;
            int p=1;
            while(temp!=null){
                try {
                    MP3Player piratesplayer=new MP3Player(new File(temp.MP.piratespath));
                    piratesplayer.play();

                    while(!piratesplayer.isStopped()){
                        Thread.sleep(1);
                    }
                }
                catch(Exception e){
                    System.err.println(e.getMessage());
                }
                temp=temp.next;
                p++;
            }
        }}


public static class piratesEndless{
    Node head;
    public piratesEndless(){
        this.head=null;
    }
    public boolean isEmpty(){
        return this.head==null;
    }
    public void addToTailEndless(FilePath piratespath){
        Node temp=new Node(piratespath);
        temp.next=temp;
        if(!this.isEmpty()){
            Node pir=this.head;
            while(pir.next!=this.head){
                pir=pir.next;
            }
            temp.next=this.head;
            pir.next=temp;
        }
        else
            this.head=temp;
    }
    public void EndlessPlayer(){
        Node temp=this.head;
        while(temp!=null){
            try{
                MP3Player piratesplayer=new MP3Player(new File(temp.MP.piratespath));
                    piratesplayer.play();

                    while(!piratesplayer.isStopped()){
                        Thread.sleep(1);
            }
}
        catch(Exception e){
                    System.err.println(e.getMessage());
                }
//            System.out.println(e.getMessage());
        }
    }}


    public Music_interface() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {jFileChooser1 = new javax.swing.JFileChooser();
        checkbox1 = new java.awt.Checkbox();
        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        PiratesLogo = new javax.swing.JLabel();
        setting = new javax.swing.JPanel();
        songspanel = new javax.swing.JPanel();
        Songs = new javax.swing.JButton();
        songs1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        playlistpanel = new javax.swing.JPanel();
        artists1 = new javax.swing.JButton();
        artist1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        play1 = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        loopOnce = new javax.swing.JButton();
        LoopCounter = new javax.swing.JLabel();
        shuffle = new javax.swing.JButton();
        shufflecounter = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EndlessLoop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        Loopcounter = new javax.swing.JLabel();
        Loopcounter1 = new javax.swing.JLabel();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(46, 46, 46));

        PiratesLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PiratesLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plogo.png"))); // NOI18N

        setting.setBackground(new java.awt.Color(46, 46, 46));

        javax.swing.GroupLayout settingLayout = new javax.swing.GroupLayout(setting);
        setting.setLayout(settingLayout);
        settingLayout.setHorizontalGroup(
            settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        settingLayout.setVerticalGroup(
            settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );

        songspanel.setBackground(new java.awt.Color(24, 24, 24));
        songspanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        songspanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                songspanelMouseReleased(evt);
            }
        });

        Songs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/songs.png"))); // NOI18N
        Songs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SongsMouseReleased(evt);
            }
        });
        Songs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SongsActionPerformed(evt);
            }
        });

        songs1.setBackground(new java.awt.Color(45, 45, 45));
        songs1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        songs1.setForeground(new java.awt.Color(255, 51, 51));
        songs1.setText("Songs");javax.swing.GroupLayout songspanelLayout = new javax.swing.GroupLayout(songspanel);
        songspanel.setLayout(songspanelLayout);
        songspanelLayout.setHorizontalGroup(
            songspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songspanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Songs, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(songs1)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        songspanelLayout.setVerticalGroup(
            songspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Songs, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songspanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(songs1)
                .addGap(26, 26, 26))
        );

        jPanel5.setBackground(new java.awt.Color(24, 24, 24));

        jLabel3.setBackground(new java.awt.Color(24, 24, 24));
        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pirates Music");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(46, 46, 46));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        playlistpanel.setBackground(new java.awt.Color(24, 24, 24));
        playlistpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        playlistpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                playlistpanelMouseReleased(evt);
            }
        });artists1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/playlist.png"))); // NOI18N
        artists1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                artists1MouseReleased(evt);
            }
        });
        artists1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artists1ActionPerformed(evt);
            }
        });

        artist1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        artist1.setForeground(new java.awt.Color(255, 0, 51));
        artist1.setText("New Playlists");

        javax.swing.GroupLayout playlistpanelLayout = new javax.swing.GroupLayout(playlistpanel);
        playlistpanel.setLayout(playlistpanelLayout);
        playlistpanelLayout.setHorizontalGroup(
            playlistpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(artists1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(artist1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playlistpanelLayout.setVerticalGroup(
            playlistpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlistpanelLayout.createSequentialGroup()
                .addGroup(playlistpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playlistpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(artists1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playlistpanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(artist1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(27, 27, 27));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });

        play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        play1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                play1MouseReleased(evt);
            }
        });
        play1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play1ActionPerformed(evt);
            }
        });

        pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pause.png"))); // NOI18N
        pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pauseMouseReleased(evt);
            }
        });
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                stopMouseReleased(evt);
            }
        });
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });loopOnce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loop.png"))); // NOI18N
        loopOnce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loopOnceMouseReleased(evt);
            }
        });
        loopOnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loopOnceActionPerformed(evt);
            }
        });

        LoopCounter.setForeground(new java.awt.Color(240, 240, 240));

        shuffle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shu.png"))); // NOI18N
        shuffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                shuffleMouseReleased(evt);
            }
        });

        shufflecounter.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(24, 24, 24));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Loop Once");

        EndlessLoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loop.png"))); // NOI18N
        EndlessLoop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EndlessLoopMouseReleased(evt);
            }
        });
        EndlessLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndlessLoopActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(24, 24, 24));
        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Endless Loop");

        display.setFont(new java.awt.Font("Lucida Sans", 3, 18)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Loopcounter.setForeground(new java.awt.Color(240, 240, 240));

        Loopcounter1.setForeground(new java.awt.Color(240, 240, 240));javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoopCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loopOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(play1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(shuffle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(EndlessLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(231, 231, 231))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Loopcounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Loopcounter1)
                .addGap(314, 314, 314))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(997, 997, 997)
                        .addComponent(shufflecounter))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(LoopCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(shuffle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EndlessLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(play1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loopOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Loopcounter, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Loopcounter1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(shufflecounter)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PiratesLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playlistpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(setting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap().addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PiratesLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(songspanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(playlistpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void SongsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void SongsMouseReleased(java.awt.event.MouseEvent evt) {
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
    }

    private void loopOnceActionPerformed(java.awt.event.ActionEvent evt) {
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
    }

    private void loopOnceMouseReleased(java.awt.event.MouseEvent evt) {

    }

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void stopMouseReleased(java.awt.event.MouseEvent evt) {
        PM.Stop();}

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void pauseMouseReleased(java.awt.event.MouseEvent evt) {
    PM.Pause();
    }

    private void play1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void play1MouseReleased(java.awt.event.MouseEvent evt) {
        PM.Resume();

    }

    private void songspanelMouseReleased(java.awt.event.MouseEvent evt) {
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
    }

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {

    }

    private void shuffleMouseReleased(java.awt.event.MouseEvent evt) {
        switch (count){
            case 0:
            count=1;
            shufflecounter.setText("Shuffle on");
            break;
            case 1:
            count=0;
            shufflecounter.setText("Shuffle Off");
            break;}
    }

    private void artists1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void artists1MouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void playlistpanelMouseReleased(java.awt.event.MouseEvent evt) {

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
    }

    private void EndlessLoopMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }private void EndlessLoopActionPerformed(java.awt.event.ActionEvent evt) {
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
    }

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

    // Variables declaration - do not modify
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
    // End of variables declaration
}
