FasdUAS 1.101.10   ��   ��    k             l      �� ��   �� 	This is the example error handler script for DreamCatcher and BBEdit
	It currently is configured to look for files in the /Library/WebServer/Documents folder and then
	to open the files with BBEdit, offer the list of suggestions, and then replace
	the offending word with the selected item.
	
	Feel free to use this as a starting point for building an error handler customized
	to your environment.
       	  l     ������  ��   	  
  
 j     �� �� 0 doc_root    m        # /Library/WebServer/Documents/         j    �� �� 0 welcome_file    m        
index.html         l     ������  ��        l      �� ��    � � 	you can use the call below to run this script standalone for testing purposes 
	When the script is called from DreamCatcher, execution will jump straight to 
	the handler, ignoring this call 
         l     ��  I     �� ���� 0 error_found        m        /         m          	localhost      ! " ! m     # #  docment    "  $ % $ J     & &  ' ( ' m     ) )  document    (  *�� * m     + +  docent   ��   %  ,�� , m    	���� ��  ��  ��     - . - l     ������  ��   .  /�� / i    	 0 1 0 I      �� 2���� 0 error_found   2  3 4 3 o      ���� 0 infile inFile 4  5 6 5 o      ���� 0 onhost onHost 6  7 8 7 o      ���� 0 misspelling   8  9 : 9 o      ���� 0 suggestions   :  ;�� ; o      ���� 0 
occurrence  ��  ��   1 k     < <  = > = r     	 ? @ ? b      A B A o     ���� 0 doc_root   B o    ���� 0 infile inFile @ o      ���� 0 thepath thePath >  C D C Z   
   E F���� E =  
  G H G l  
  I�� I n   
  J K J 4   �� L
�� 
cha  L m    ������ K o   
 ���� 0 infile inFile��   H m     M M  /    F r     N O N b     P Q P o    ���� 0 thepath thePath Q o    ���� 0 welcome_file   O o      ���� 0 thepath thePath��  ��   D  R S R r   ! $ T U T m   ! "��
�� boovfals U o      ���� 0 returnvalue returnValue S  V W V O   % � X Y X k   ) � Z Z  [ \ [ r   ) 3 ] ^ ] I  ) 1�� _��
�� .aevtodocnull  �    alis _ l  ) - `�� ` 4   ) -�� a
�� 
psxf a o   + ,���� 0 thepath thePath��  ��   ^ o      ���� 0 thedocument theDocument \  b c b r   4 7 d e d m   4 5��
�� boovfals e o      ���� 0 thematch theMatch c  f g f U   8 V h i h r   ? Q j k j n   ? O l m l 1   M O��
�� 
Fnd? m l  ? M n�� n I  ? M�� o p
�� .R*chFindMtch��� ��� TEXT o o   ? @���� 0 misspelling   p �� q r
�� 
FnIn q n   A G s t s 4   D G�� u
�� 
ctxt u m   E F����  t l  A D v�� v n   A D w x w m   B D��
�� 
cwin x o   A B���� 0 thedocument theDocument��   r �� y��
�� 
SelM y m   H I��
�� boovtrue��  ��   k o      ���� 0 thematch theMatch i o   ; <���� 0 
occurrence   g  z { z Z   W � | }�� ~ | o   W X���� 0 thematch theMatch } k   [ �    � � � r   [ d � � � I  [ b�� � �
�� .gtqpchltns    @   @ ns   � o   [ \���� 0 suggestions   � �� ���
�� 
appr � m   ] ^ � �  Choose word   ��   � o      ���� 0 response   �  � � � r   e � � � � I  e ~�� � �
�� .sysodlogaskr        TEXT � b   e l � � � b   e h � � � m   e f � � 5 /Replace all instances of this misspelling with     � o   f g���� 0 response   � m   h k � �   or just this one?    � �� ���
�� 
btns � l  o z ��� � J   o z � �  � � � m   o r � �  Replace all    �  � � � m   r u � �  Replace one    �  ��� � m   u x � �  Replace none   ��  ��  ��   � o      ���� 0 replaceresult replaceResult �  ��� � Z   � � � � ��� � =  � � � � � n   � � � � � 1   � ���
�� 
bhit � o   � ����� 0 replaceresult replaceResult � m   � � � �  Replace All    � k   � � � �  � � � I  � ��� � �
�� .R*chReplmagn��� ��� TEXT � o   � ����� 0 misspelling   � �� � �
�� 
Repl � o   � ����� 0 response   � �� � �
�� 
FnIn � n   � � � � � 4   � ��� �
�� 
ctxt � m   � �����  � l  � � ��� � n   � � � � � m   � ���
�� 
cwin � o   � ����� 0 thedocument theDocument��   � �� ���
�� 
Opts � K   � � � � �� ���
�� 
STop � m   � ���
�� boovtrue��  ��   �  � � � r   � � � � � m   � ���
�� boovtrue � o      ���� 0 returnvalue returnValue �  ��� � I  � ��� ���
�� .coresavenull        obj  � o   � ����� 0 thedocument theDocument��  ��   �  � � � =  � � � � � n   � � � � � 1   � ���
�� 
bhit � o   � ����� 0 replaceresult replaceResult � m   � � � �  Replace one    �  ��� � k   � � � �  � � � I  � ��� � �
�� .R*chReplmagn��� ��� TEXT � o   � ����� 0 misspelling   � �� � �
�� 
Repl � o   � ����� 0 response   � �� ���
�� 
FnIn � 1   � ���
�� 
pusl��   �  � � � r   � � � � � m   � ���
�� boovtrue � o      ���� 0 returnvalue returnValue �  ��� � I  � ��� ���
�� .coresavenull        obj  � o   � ����� 0 thedocument theDocument��  ��  ��  ��  ��  ��   ~ I  � ��� ���
�� .sysodlogaskr        TEXT � b   � � � � � b   � � � � � b   � � � � � m   � � � �  Couldn't find the     � o   � ����� 0 
occurrence   � m   � � � �   occurrence of     � o   � ����� 0 misspelling  ��   {  ��� � I  � ��� ���
�� .coreclosnull���     obj  � o   � ����� 0 thedocument theDocument��  ��   Y m   % & � ��null     �����  d
BBEdit.app��p( BD�s�D� ���p�������E�4����   f�E�L   u    �R*ch   alis    >  FatMac2                    ��o�H+    d
BBEdit.app                                                      0�����        ����  	                Applications    ���4      ����      d  FatMac2:Applications:BBEdit.app    
 B B E d i t . a p p    F a t M a c 2  Applications/BBEdit.app   / ��   W  � � � I  � ��� ���
�� .miscactvnull��� ��� null � m   � � � �"null     ߥ�� A��DreamCatcher.appD�s�D    �����Ґ��Ӑ�E�4���P    �E�L          ????@  alis    �  FatMac2                    ��o�H+   A��DreamCatcher.app                                                B� �/Ts        ����  	                Release     ���4      �/��     A�� A�� A�� 5 )< Y�  `�  PFatMac2:Users:fats:Programming:Cocoa:DreamCatcher:build:Release:DreamCatcher.app  "  D r e a m C a t c h e r . a p p    F a t M a c 2  HUsers/fats/Programming/Cocoa/DreamCatcher/build/Release/DreamCatcher.app  /    ��  ��   �  �� � L    � � o   �~�~ 0 returnvalue returnValue�  ��       �} �   � ��}   � �|�{�z�y�| 0 doc_root  �{ 0 welcome_file  �z 0 error_found  
�y .aevtoappnull  �   � **** � �x 1�w�v � ��u�x 0 error_found  �w �t ��t  �  �s�r�q�p�o�s 0 infile inFile�r 0 onhost onHost�q 0 misspelling  �p 0 suggestions  �o 0 
occurrence  �v   � �n�m�l�k�j�i�h�g�f�e�d�n 0 infile inFile�m 0 onhost onHost�l 0 misspelling  �k 0 suggestions  �j 0 
occurrence  �i 0 thepath thePath�h 0 returnvalue returnValue�g 0 thedocument theDocument�f 0 thematch theMatch�e 0 response  �d 0 replaceresult replaceResult � %�c M ��b�a�`�_�^�]�\�[�Z�Y ��X � ��W � � ��V�U ��T�S�R�Q�P�O ��N � ��M ��L
�c 
cha 
�b 
psxf
�a .aevtodocnull  �    alis
�` 
FnIn
�_ 
cwin
�^ 
ctxt
�] 
SelM�\ 
�[ .R*chFindMtch��� ��� TEXT
�Z 
Fnd?
�Y 
appr
�X .gtqpchltns    @   @ ns  
�W 
btns
�V .sysodlogaskr        TEXT
�U 
bhit
�T 
Repl
�S 
Opts
�R 
STop�Q 
�P .R*chReplmagn��� ��� TEXT
�O .coresavenull        obj 
�N 
pusl
�M .coreclosnull���     obj 
�L .miscactvnull��� ��� null�ub   �%E�O��i/�  �b  %E�Y hOfE�O� �*�/j E�OfE�O �kh���,�k/�e� 
�,E�[OY��O� ����l E�O�%a %a a a a mvl E�O�a ,a   *�a ���,�k/a a ela  OeE�O�j Y +�a ,a   �a ��*a ,� OeE�O�j Y hY a  �%a !%�%j O�j "UOa #j $O� � �K ��J�I � ��H
�K .aevtoappnull  �   � **** � k      � �  �G�G  �J  �I   �   �     # ) +�F�E�F �E 0 error_found  �H *�����lvk�+  ascr  ��ޭ