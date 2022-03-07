
public class Mframe extends javax.swing.JFrame {

    public Mframe() {
        initComponents();
    }
                       
    private void initComponents() {

        tO = new javax.swing.JTextField();
        tI = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bCopy = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bPM = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bCE = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bPt = new javax.swing.JButton();
        bC = new javax.swing.JButton();
        bP = new javax.swing.JButton();
        bPr = new javax.swing.JButton();
        bBS = new javax.swing.JButton();
        bM = new javax.swing.JButton();
        bEq = new javax.swing.JButton();
        bSq = new javax.swing.JButton();
        bSqrt = new javax.swing.JButton();
        bR = new javax.swing.JButton();
        bD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        tO.setEditable(false);
        tO.setBackground(new java.awt.Color(204, 204, 204));
        tO.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); 
        tO.setForeground(new java.awt.Color(51, 51, 51));
        tO.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tO.setToolTipText("Ouput Bar");

        tI.setEditable(false);
        tI.setBackground(new java.awt.Color(204, 204, 204));
        tI.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); 
        tI.setForeground(new java.awt.Color(51, 51, 51));
        tI.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tI.setText("0");
        tI.setToolTipText("Input Bar");

        bCopy.setBackground(new java.awt.Color(204, 204, 204));
        bCopy.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        bCopy.setText("↓");
        bCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCopyActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(204, 204, 204));
        b7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(204, 204, 204));
        b4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(204, 204, 204));
        b1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bPM.setBackground(new java.awt.Color(204, 204, 204));
        bPM.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        bPM.setText("±");
        bPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPMActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(204, 204, 204));
        b8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(204, 204, 204));
        b5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 204, 204));
        b2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(204, 204, 204));
        b0.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bCE.setBackground(new java.awt.Color(204, 204, 204));
        bCE.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        bCE.setText("CE");
        bCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCEActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(204, 204, 204));
        b9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(204, 204, 204));
        b3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(204, 204, 204));
        b6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bPt.setBackground(new java.awt.Color(204, 204, 204));
        bPt.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        bPt.setText(".");
        bPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPtActionPerformed(evt);
            }
        });

        bC.setBackground(new java.awt.Color(204, 204, 204));
        bC.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        bC.setText("C");
        bC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCActionPerformed(evt);
            }
        });

        bP.setBackground(new java.awt.Color(204, 204, 204));
        bP.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        bP.setText("+");
        bP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPActionPerformed(evt);
            }
        });

        bPr.setBackground(new java.awt.Color(204, 204, 204));
        bPr.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        bPr.setText("x");
        bPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrActionPerformed(evt);
            }
        });

        bBS.setBackground(new java.awt.Color(204, 204, 204));
        bBS.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        bBS.setText("←");
        bBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBSActionPerformed(evt);
            }
        });

        bM.setBackground(new java.awt.Color(204, 204, 204));
        bM.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); 
        bM.setText("-");
        bM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMActionPerformed(evt);
            }
        });

        bEq.setBackground(new java.awt.Color(204, 204, 204));
        bEq.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        bEq.setText("=");
        bEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqActionPerformed(evt);
            }
        });

        bSq.setBackground(new java.awt.Color(204, 204, 204));
        bSq.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        bSq.setText("x²");
        bSq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSqActionPerformed(evt);
            }
        });

        bSqrt.setBackground(new java.awt.Color(204, 204, 204));
        bSqrt.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        bSqrt.setText("²√x");
        bSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSqrtActionPerformed(evt);
            }
        });

        bR.setBackground(new java.awt.Color(204, 204, 204));
        bR.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        bR.setText("1/x");
        bR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRActionPerformed(evt);
            }
        });

        bD.setBackground(new java.awt.Color(204, 204, 204));
        bD.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        bD.setText("÷");
        bD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tI)
                    .addComponent(tO, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bCopy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bPM, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBS, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bPt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bEq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bPr, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tI, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPr, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                     

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //9 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+9);
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //7 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+7);
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //1 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+1);
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //2 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+2);
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //3 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+3);
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //4 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+4);
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //5 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+5);
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //6 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+6);
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //8 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+8);
    }                                  

    private void bPtActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //decimal button code
    String s=tI.getText(),s1="";
    int l=s.length();
    int as=0,ad=0,af=0;
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='*'||ch=='/'||ch=='+'||ch=='-')
     {
      as++;
      s1=s.substring(i+1,l);
     }
     if(ch=='.')
     ad++;
    }
    if(as==0&&ad==0)
    tI.setText(tI.getText()+'.');
    else
    {
      int l1=s1.length();
      for(int i=0;i<l1;i++)
      {
       char ch=s1.charAt(i);
       if(ch=='.')
       af++;    
      }
      if(af==0&&l1>0)
      tI.setText(tI.getText()+'.');
    }
    }                                   

    private void bRActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //Reciprocal button code
    String s=tI.getText(); 
    String st=s;
    int l=s.length(); 
    String s1="";
    String s2="";
    int as=0,ad=0,af=0; 
    char ch1=' ';
    double qq=0;
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     af++;
     tI.setText(s);
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
     {
      as++;
     }
    }
    char chp=s.charAt(l-1);
    if(chp=='.' || chp=='-' || chp=='+' || chp=='/' || chp=='*')
    {
     ad++;
    }
  
     if((as>0)&&(ad==0))
     {
      for(int i=0;i<l;i++)
      {
       char ch=s.charAt(i);
       if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
       {
        s1=s.substring(0,i);
        s2=s.substring(i+1);
        ch1=ch;
       }
      }
      if(ch1=='+')
      { 
       qq=Double.parseDouble(s1)+Double.parseDouble(s2);
       tI.setText(qq+""); 
      }
      if(ch1=='-')
      { 
       qq=Double.parseDouble(s1)-Double.parseDouble(s2);
       tI.setText(qq+""); 
      }
      if(ch1=='/')
      { 
       qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
       tI.setText(qq+""); 
      }
      if(ch1=='*')
      { 
       qq=Double.parseDouble(s1)*Double.parseDouble(s2);  
       tI.setText(qq+""); 
      }
     }
    if(ad==0)
    {
     double d=Double.parseDouble(tI.getText());
     if(af>0)
     {
      d=0-d;
     }
     d=1/d;
     tO.setText(d+"");
    }
    else
    {
     tO.setText("Error");
     tI.setText(st);
    }
    }                                  

    private void bCActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //clear input and output screen button code
    tI.setText("0");
    tO.setText("");
    }                                  

    private void bCEActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //Clear Input screen button code
    tI.setText("0");
    }                                   

    private void bSqrtActionPerformed(java.awt.event.ActionEvent evt) {                                      
    //Square root button code
    String s=tI.getText(); 
    String st=s;
    int l=s.length(); 
    String s1="";
    String s2="";
    int as=0,ad=0,af=0; 
    char ch1=' ';
    double qq=0;
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     af++;
     tI.setText(s);
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
     {
      as++;
     }
    }
    char chp=s.charAt(l-1);
    if(chp=='.' || chp=='-' || chp=='+' || chp=='/' || chp=='*')
    {
     ad++;
    }
  
     if((as>0)&&(ad==0))
     {
      for(int i=0;i<l;i++)
      {
       char ch=s.charAt(i);
       if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
       {
        s1=s.substring(0,i);
        s2=s.substring(i+1);
        ch1=ch;
       }
      }
      if(ch1=='+')
      { 
       qq=Double.parseDouble(s1)+Double.parseDouble(s2);
       tI.setText(qq+""); 
      }
      if(ch1=='-')
      { 
       qq=Double.parseDouble(s1)-Double.parseDouble(s2);
       tI.setText(qq+""); 
      }
      if(ch1=='/')
      { 
       qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
       tI.setText(qq+""); 
      }
      if(ch1=='*')
      { 
       qq=Double.parseDouble(s1)*Double.parseDouble(s2);  
       tI.setText(qq+""); 
      }
     }
    if(ad==0)
    {
     double d=Double.parseDouble(tI.getText());
     if(af>0)
     {
      d=0-d;
     }
     d=Math.sqrt(d);
     tO.setText(d+"");
    }
    else
    {
     tO.setText("Error");
     tI.setText(st);
    }
    }                                     

    private void bPMActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //Sign changing button coding
    String s=tI.getText(); 
    String st=s;
    int l=s.length(); 
    String s1="";
    String s2="";
    int as=0,ad=0,af=0; 
    char ch1=' ';
    double qq=0;
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     af++;
     tI.setText(s);
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
     {
      as++;
     }
    }
    char chp=s.charAt(l-1);
    if(chp=='.' || chp=='-' || chp=='+' || chp=='/' || chp=='*')
    {
     ad++;
    }
  
     if((as>0)&&(ad==0))
     {
      for(int i=0;i<l;i++)
      {
       char ch=s.charAt(i);
       if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
       {
        s1=s.substring(0,i);
        s2=s.substring(i+1);
        ch1=ch;
       }
      }
      if(ch1=='+')
      { 
       qq=Double.parseDouble(s1)+Double.parseDouble(s2);
       tI.setText(qq+"");
       tO.setText(qq+"");
      }
      if(ch1=='-')
      { 
       qq=Double.parseDouble(s1)-Double.parseDouble(s2);
       tI.setText(qq+"");
       tO.setText(qq+"");
      }
      if(ch1=='/')
      { 
       qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
       tI.setText(qq+"");
       tO.setText(qq+"");
      }
      if(ch1=='*')
      { 
       qq=Double.parseDouble(s1)*Double.parseDouble(s2);  
       tI.setText(qq+"");
       tO.setText(qq+"");
      }
     }
    if(ad==0)
    {
     double d=Double.parseDouble(tI.getText());
     if(af>0)
     {
      d=0-d;
     }
     if(d>0)
     {
      d=0-d;
     }
     else
     {
      d=Math.abs(d);
     }
     tI.setText(d+"");
    }
    else
    {
     tO.setText("Error");
     tI.setText(st);
    }
    }                                   

    private void bPrActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //Multiply button code
    String s=tI.getText();
    String s1="";
    String s2="";
    int as=0,ad=0; 
    char ch1=' ';
    double qq=0;
    int l=s.length();
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     ad++;
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0 && s.charAt(l-1)!='.')
    {
     tI.setText(tI.getText()+'*');
    }
    char chp=s.charAt(l-1);
    if(chp=='*' || chp=='/' || chp=='+' || chp=='-')
    {
     String sp="";
     for(int i=0;i<(l-1);i++)
     {
      char ch=s.charAt(i);
      sp=sp+ch;   
     }
     sp=sp+"*";
     tI.setText(sp);   
    }
    if(chp!='*' && chp!='/' && chp!='+' && chp!='-' && chp!='.')
    {
    if(as>0)    
    
    {
     for(int i=0;i<l;i++)
     {
      char ch=s.charAt(i);
      if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
      {
       s1=s.substring(0,i);
       s2=s.substring(i+1);
       ch1=ch;
      }
     } 
     if(ch1=='+')
     {
      qq=Double.parseDouble(s1)+Double.parseDouble(s2);
     }
     if(ch1=='-')
     {
      qq=Double.parseDouble(s1)-Double.parseDouble(s2);
     }
     if(ch1=='/')
     {
      qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
     }
     if(ch1=='*')
     {
      qq=Double.parseDouble(s1)*Double.parseDouble(s2); 
     }
     if(ad>0)
     {
      qq=0-qq;   
     }
     tI.setText(qq+"*"); 
     tO.setText(qq+"");
    }
    }
    }                                   

    private void bPActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //plus button code
    String s=tI.getText();
    String s1="";
    String s2="";
    int as=0,ad=0; 
    char ch1=' ';
    double qq=0;
    int l=s.length();
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     ad++;
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0 && s.charAt(l-1)!='.')
    {
     tI.setText(tI.getText()+'+');
    }
    char chp=s.charAt(l-1);
    if(chp=='*' || chp=='/' || chp=='+' || chp=='-')
    {
     String sp="";
     for(int i=0;i<(l-1);i++)
     {
      char ch=s.charAt(i);
      sp=sp+ch;   
     }
     sp=sp+"+";
     tI.setText(sp);   
    }
    if(chp!='*' && chp!='/' && chp!='+' && chp!='-' && chp!='.')
    {
    if(as>0)    
    
    {
     for(int i=0;i<l;i++)
     {
      char ch=s.charAt(i);
      if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
      {
       s1=s.substring(0,i);
       s2=s.substring(i+1);
       ch1=ch;
      }
     } 
     if(ch1=='+')
     {
      qq=Double.parseDouble(s1)+Double.parseDouble(s2);
     }
     if(ch1=='-')
     {
      qq=Double.parseDouble(s1)-Double.parseDouble(s2);
     }
     if(ch1=='/')
     {
      qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
     }
     if(ch1=='*')
     {
      qq=Double.parseDouble(s1)*Double.parseDouble(s2); 
     }
     if(ad>0)
     {
      qq=0-qq;   
     }
     tI.setText(qq+"+"); 
     tO.setText(qq+"");
    }
    }
    }                                  

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //0 button code
    String s=tI.getText();
    long l=s.length();
    int as=0;
    for(int i=0;i<l;i++)
    {char ch=s.charAt(i);
     if(ch=='.'||ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0)      
    {double sq=Double.parseDouble(tI.getText());
        if(sq==0)
        {tI.setText("");}}
    
    tI.setText(tI.getText()+0);
    }                                  

    private void bDActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //Divide button code
    String s=tI.getText();
    String s1="";
    String s2="";
    int as=0,ad=0; 
    char ch1=' ';
    double qq=0;
    int l=s.length();
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     ad++;
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0 && s.charAt(l-1)!='.')
    {
     tI.setText(tI.getText()+'/');
    }
    char chp=s.charAt(l-1);
    if(chp=='*' || chp=='/' || chp=='+' || chp=='-')
    {
     String sp="";
     for(int i=0;i<(l-1);i++)
     {
      char ch=s.charAt(i);
      sp=sp+ch;   
     }
     sp=sp+"/";
     tI.setText(sp);   
    }
    if(chp!='*' && chp!='/' && chp!='+' && chp!='-' && chp!='.')
    {
    if(as>0)    
    
    {
     for(int i=0;i<l;i++)
     {
      char ch=s.charAt(i);
      if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
      {
       s1=s.substring(0,i);
       s2=s.substring(i+1);
       ch1=ch;
      }
     } 
     if(ch1=='+')
     {
      qq=Double.parseDouble(s1)+Double.parseDouble(s2);
     }
     if(ch1=='-')
     {
      qq=Double.parseDouble(s1)-Double.parseDouble(s2);
     }
     if(ch1=='/')
     {
      qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
     }
     if(ch1=='*')
     {
      qq=Double.parseDouble(s1)*Double.parseDouble(s2); 
     }
     if(ad>0)
     {
      qq=0-qq;   
     }
     tI.setText(qq+"/"); 
     tO.setText(qq+"");
    }
    }
    
    }                                  

    private void bMActionPerformed(java.awt.event.ActionEvent evt) {                                   
    //minus button code
    String s=tI.getText();
    String s1="";
    String s2="";
    int as=0,ad=0; 
    char ch1=' ';
    double qq=0;
    int l=s.length();
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     ad++;
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    if(as==0 && s.charAt(l-1)!='.')
    {
     tI.setText(tI.getText()+'-');
    }
    char chp=s.charAt(l-1);
    if(chp=='*' || chp=='/' || chp=='+' || chp=='-')
    {
     String sp="";
     for(int i=0;i<(l-1);i++)
     {
      char ch=s.charAt(i);
      sp=sp+ch;   
     }
     sp=sp+"-";
     tI.setText(sp);   
    }
    if(chp!='*' && chp!='/' && chp!='+' && chp!='-' && chp!='.')
    {
    if(as>0)    
    
    {
     for(int i=0;i<l;i++)
     {
      char ch=s.charAt(i);
      if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
      {
       s1=s.substring(0,i);
       s2=s.substring(i+1);
       ch1=ch;
      }
     } 
     if(ch1=='+')
     {
      qq=Double.parseDouble(s1)+Double.parseDouble(s2);
     }
     if(ch1=='-')
     {
      qq=Double.parseDouble(s1)-Double.parseDouble(s2);
     }
     if(ch1=='/')
     {
      qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
     }
     if(ch1=='*')
     {
      qq=Double.parseDouble(s1)*Double.parseDouble(s2); 
     }
     if(ad>0)
     {
      qq=0-qq;   
     }
     tI.setText(qq+"-"); 
     tO.setText(qq+"");
    }
    }
    }                                  

    private void bSqActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //Square button code
    String s=tI.getText(); 
    String st=s;
    int l=s.length(); 
    String s1="";
    String s2="";
    int as=0,ad=0,af=0; 
    char ch1=' ';
    double qq=0;
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     af++;
     tI.setText(s);
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
     {
      as++;
     }
    }
    char chp=s.charAt(l-1);
    if(chp=='.' || chp=='-' || chp=='+' || chp=='/' || chp=='*')
    {
     ad++;
    }
  
     if((as>0)&&(ad==0))
     {
      for(int i=0;i<l;i++)
      {
       char ch=s.charAt(i);
       if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
       {
        s1=s.substring(0,i);
        s2=s.substring(i+1);
        ch1=ch;
       }
      }
      if(ch1=='+')
      { 
       qq=Double.parseDouble(s1)+Double.parseDouble(s2);
       tI.setText(qq+""); 
      }
      if(ch1=='-')
      { 
       qq=Double.parseDouble(s1)-Double.parseDouble(s2);
       tI.setText(qq+""); 
      }
      if(ch1=='/')
      { 
       qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
       tI.setText(qq+""); 
      }
      if(ch1=='*')
      { 
       qq=Double.parseDouble(s1)*Double.parseDouble(s2);  
       tI.setText(qq+""); 
      }
     }
    if(ad==0)
    {
     double d=Double.parseDouble(tI.getText());
     if(af>0)
     {
      d=0-d;
     }
     d=d*d;
     tO.setText(d+"");
    }
    else
    {
     tO.setText("Error");
     tI.setText(st);
    }
    }                                   

    private void bCopyActionPerformed(java.awt.event.ActionEvent evt) {                                      
    //Copy Result Button Code
    String sO=tO.getText();
    long l=sO.length();
    if(l>0)
    {
     tI.setText(sO);
     tO.setText("");
    }
    }                                     

    private void bBSActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //Backspace button code
    String s=tI.getText();
    long l=s.length();
     String s1="";
     for(int i=0;i<(l-1);i++)
     {
      char ch=s.charAt(i);
      s1=s1+ch;   
     }
     tI.setText(s1);
    if(l==1)
    tI.setText("0");   
   
    }                                   

    private void bEqActionPerformed(java.awt.event.ActionEvent evt) {                                    
    //equals to button code
    String s=tI.getText();
    String s1="";
    String s2="";
    int as=0,ad=0; 
    char ch1=' ';
    double qq=0,out=0;
    int l=s.length();
    char ch2=s.charAt(0);
    if(ch2=='-')
    {
     s=s.substring(1);
     l=s.length();
     ad++;
    }
    for(int i=0;i<l;i++)
    {
     char ch=s.charAt(i);
     if(ch=='*'||ch=='/'||ch=='+'||ch=='-')
     as++;    
    }
    char chp=s.charAt(l-1);
    if(chp=='*' || chp=='/' || chp=='+' || chp=='-')
    {
     tO.setText("Error");
    }
    if(chp!='*' && chp!='/' && chp!='+' && chp!='-' && chp!='.')
    {
    if(as==0)
    {
     out=Double.parseDouble(s);   
    }
    if(as>0)    
    
    {
     for(int i=0;i<l;i++)
     {
      char ch=s.charAt(i);
      if(ch=='+'||ch=='-'||ch=='/'||ch=='*')
      {
       s1=s.substring(0,i);
       s2=s.substring(i+1);
       ch1=ch;
      }
     } 
     if(ch1=='+')
     {
      qq=Double.parseDouble(s1)+Double.parseDouble(s2);
     }
     if(ch1=='-')
     {
      qq=Double.parseDouble(s1)-Double.parseDouble(s2);
     }
     if(ch1=='/')
     {
      qq=Double.parseDouble(s1)/Double.parseDouble(s2);  
     }
     if(ch1=='*')
     {
      qq=Double.parseDouble(s1)*Double.parseDouble(s2); 
     } 
     out=qq;
     if(ad>0)
    {
     out=0-out;   
    }
    tO.setText(out+"");
    }
    }
    
    }                                   

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mframe().setVisible(true);
            }
        });
    }
               
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bBS;
    private javax.swing.JButton bC;
    private javax.swing.JButton bCE;
    private javax.swing.JButton bCopy;
    private javax.swing.JButton bD;
    private javax.swing.JButton bEq;
    private javax.swing.JButton bM;
    private javax.swing.JButton bP;
    private javax.swing.JButton bPM;
    private javax.swing.JButton bPr;
    private javax.swing.JButton bPt;
    private javax.swing.JButton bR;
    private javax.swing.JButton bSq;
    private javax.swing.JButton bSqrt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tI;
    private javax.swing.JTextField tO;              
}
