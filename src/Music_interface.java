import jaco.mp3.player.MP3Player;

import java.io.File;
import javax.swing.JFileChooser;

import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import pirates.music.PiratesMusic;



   

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
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
            import jaco.mp3.player.MP3Player;

            import java.io.File;
            import javax.swing.JFileChooser;
            
            import javax.swing.filechooser.FileFilter;
            import javax.swing.filechooser.FileNameExtensionFilter;
            import pirates.music.PiratesMusic;
            
            
            
               
            
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
                // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
                private void initComponents() {
            
                    jFileChooser1 = new javax.swing.JFileChooser();
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