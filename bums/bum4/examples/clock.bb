; ; workbench clock program ;  ��:� 0   ;open window on workbench  � 0,100,20,160,104,$100E,"BLITZ CLOCK",1,2  � 80,50,70,35,1   ;draw clock  � .xy:x.w:y.w:� � ;coordinates for hands � h.xy(59) � i=0 � 59   h(i)\x=68*�
(i*��/30),-32*�(i*��/30) �  ��   � 80,50,80+h(�)\x,50+h(�)\y,0   � 80,50,80+h(�
)\x,50+h(�
)\y,0   � 80,50,80+h(hr)\x/2,50+h(hr)\y/2,0   � 40,80:݂ �(�)   hr=5*(�	 �� 12)   � 80,50,80+h(hr)\x/2,50+h(hr)\y/2,1   � 80,50,80+h(�
)\x,50+h(�
)\y,1   � 80,50,80+h(�)\x,50+h(�)\y,2   � 50    ;goto sleep for 1 second �� �=$200  