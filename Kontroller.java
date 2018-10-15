package net.ferhatkurt;

import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Kontroller {
	
	
	@FXML
	private Button baslat;
	@FXML
	private Label kapatButonu;
	@FXML
	private Label yardim;
	@FXML
	private Button durdur;
	@FXML
	private Button temizle;
	@FXML
	private Button yenidenBaslat;
	@FXML
	private TextField macro_1;
	@FXML
	private TextField macro_2;
	@FXML
	private TextField macro_3;
	@FXML
	private TextField macro_4;
	@FXML
	private TextField macro_5;
	@FXML
	private TextField macro_6;
	@FXML
	private TextField macro_7;
	@FXML
	private TextField macro_8;
	@FXML
	private TextField macro_9;
	@FXML
	private TextField macro_10;
	@FXML
	private TextField macro_11;
	@FXML
	private TextField macro_12;
	@FXML
	private TextField macro_13;
	@FXML
	private TextField macro_14;
	@FXML
	private TextField sure_1;
	@FXML
	private TextField sure_2;
	@FXML
	private TextField sure_3;
	@FXML
	private TextField sure_4;
	@FXML
	private TextField sure_5;
	@FXML
	private TextField sure_6;
	@FXML
	private TextField sure_7;
	@FXML
	private TextField sure_8;
	@FXML
	private TextField sure_9;
	@FXML
	private TextField sure_10;
	@FXML
	private TextField sure_11;
	@FXML
	private TextField sure_12;
	@FXML
	private TextField sure_13;
	@FXML
	private TextField sure_14;
		
	
	
	Robot r,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14;
	Timer t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;

	TimerTask gorev1,gorev2,gorev3,gorev4,gorev5,gorev6,gorev7,gorev8,gorev9,gorev10,gorev11,gorev12,gorev13,gorev14;
	
	
	Boolean durum = false;
	
	public Kontroller() throws AWTException {
			
		/*
		//MET�N G�R��LER�
		macro_1 = new TextField();
		macro_2 = new TextField();
		macro_3 = new TextField();
		macro_4 = new TextField();
		macro_5 = new TextField();
		macro_6 = new TextField();
		macro_7 = new TextField();
		macro_8 = new TextField();
		macro_9 = new TextField();
		macro_10 = new TextField();
		macro_11 = new TextField();
		macro_12 = new TextField();
		macro_13 = new TextField();
		macro_14 = new TextField();
		
		//S�RE G�R��LER�
		sure_1 = new TextField();
		sure_1 = new TextField();
		sure_2 = new TextField();
		sure_3 = new TextField();
		sure_4 = new TextField();
		sure_5 = new TextField();
		sure_6 = new TextField();
		sure_7 = new TextField();
		sure_8 = new TextField();
		sure_9 = new TextField();
		sure_10 = new TextField();
		sure_11 = new TextField();
		sure_12 = new TextField();
		sure_13 = new TextField();
		sure_14 = new TextField();
		
		
		
		//BOTU BA�LAT
		baslat = new Button();
		durdur = new Button();
		yardim = new Label();
		temizle = new Button();
		yenidenBaslat = new Button();
		
		*/
		//TU�LAYICILAR
		r = new Robot();
		r2 = new Robot();
		r3 = new Robot();
		r4 = new Robot();
		r5 = new Robot();
		r6 = new Robot();
		r7 = new Robot();
		r8 = new Robot();
		r9 = new Robot();
		r10 = new Robot();
		r11 = new Robot();
		r12 = new Robot();
		r13 = new Robot();
		r14 = new Robot();
		
	}
	
	@FXML
	private void yenidenBaslat(ActionEvent e) {
		Platform.exit();
		Arayuz.launch();
	}
	
	@FXML
	private void yardimAc(MouseEvent e) {
		
		Alert a = new Alert(AlertType.INFORMATION);
		a.setTitle("Game Bot");
		a.setHeaderText("Tu� giri�leri hakk�nda");
		a.setContentText("(?) 1'den 10'a kadar olan kutulara tek karakterlik giri�ler yap�labilir."+
		"Aksi takdirde ilk girdi�iniz karakter ele al�narak i�lem yap�lacakt�r.\n\n"+"(?) Extra_1-4 aras� giri�lere F1-F2-F3-F4,F5 ve BO�LUK tu�lar� tan�mlanabilir."
		+ "Di�er durumlarda tek karakterlik giri�ler yap�labilmektedir.\n\n (?) S�re giri�lerini unutmay�n.S�reler MikroSaniye(MS) �zerinden de�elendirilmektedir.\n"
		+ "1000MS = 1sn\n\n\n"+"Keyifli oyunlar ge�irmeniz dile�iyle :)");
		a.showAndWait();
	}
	
	@FXML
	private void botuKapat(MouseEvent e){
		Alert a = new Alert(AlertType.CONFIRMATION);
		a.setContentText("��kmak istedi�inizden emin misiniz?");
		a.setTitle("Game Bot");
		a.setHeaderText("");
		a.showAndWait();
		
		if(a.getResult()==ButtonType.OK) {
			System.exit(0);
		}
	}
		

		
	@FXML
	public void macroBaslat(ActionEvent e) {
		durum = true;
	try {
		//TU� 1 ���N G�REVLER
		if(!macro_1.getText().equals("") && !sure_1.getText().equals("")) {
			
			t1= new Timer();
			int val = 0;
			gorev1 = new TimerTask() {

				@Override
				public void run() {
				
					r.keyPress((int)macro_1.getText().charAt(0));
					r.delay(200);
					r.keyRelease((int)macro_1.getText().charAt(0));
			}
					
			};
			try {
				val = Integer.parseInt(sure_1.getText());
				t1.schedule(gorev1,new Date(),val);
			
			}catch(NumberFormatException e1) {
				macro_1.setText("S�re girilmedi.");
			}
			
		}
		
		
		//TU� 2 ���N G�REVLER
		if(!macro_2.getText().equals("") && !sure_2.getText().equals("")) {
			
			t2 = new Timer();
			int val2 = 0;
			gorev2 = new TimerTask() {

				@Override
				public void run() {
				
					r2.keyPress((int)macro_2.getText().charAt(0));
					r2.delay(200);
					r2.keyRelease((int)macro_2.getText().charAt(0));
			}
					
			};
			try {
				val2 = Integer.parseInt(sure_2.getText());
				t2.schedule(gorev2,new Date(),val2);
			
			}catch(NumberFormatException e1) {
				
				macro_2.setText("S�re girilmedi.");
						
			}
		}
		
		//TU� 3 ���N G�REVLER
		if(!macro_3.getText().equals("") && !sure_3.getText().equals("")) {
			
			t3 = new Timer();
			int val3 = 0;
			gorev3 = new TimerTask() {

				@Override
				public void run() {
				
					r3.keyPress((int)macro_3.getText().charAt(0));
					r3.delay(200);
					r3.keyRelease((int)macro_3.getText().charAt(0));
			}
					
			};
			try {
				val3 = Integer.parseInt(sure_3.getText());
				t3.schedule(gorev3,new Date(),val3);
			
			}catch(NumberFormatException e1) {
				
				macro_3.setText("S�re girilmedi.");
						
			}
		}
		
		//TU� 4 ���N G�REVLER
		if(!macro_4.getText().equals("") && !sure_4.getText().equals("")) {
			
			t4 = new Timer();
			int val4 = 0;
			gorev4 = new TimerTask() {

				@Override
				public void run() {
				
					r4.keyPress((int)macro_4.getText().charAt(0));
					r4.delay(200);
					r4.keyRelease((int)macro_4.getText().charAt(0));
			}
					
			};
			try {
				val4 = Integer.parseInt(sure_4.getText());
				t4.schedule(gorev4,new Date(),val4);
			
			}catch(NumberFormatException e1) {
				
				macro_4.setText("S�re girilmedi.");
						
			}
		}
		//TU� 5 ���N G�REVLER
				if(!macro_5.getText().equals("") && !sure_5.getText().equals("")) {
					
					t5 = new Timer();
					int val5 = 0;
					gorev5 = new TimerTask() {

						@Override
						public void run() {
						
							r5.keyPress((int)macro_5.getText().charAt(0));
							r5.delay(200);
							r5.keyRelease((int)macro_5.getText().charAt(0));
					}
							
					};
					try {
						val5 = Integer.parseInt(sure_5.getText());
						t5.schedule(gorev5,new Date(),val5);
					
					}catch(NumberFormatException e1) {
						
						macro_5.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 6 ���N G�REVLER
				if(!macro_6.getText().equals("") && !sure_6.getText().equals("")) {
					
					t6 = new Timer();
					int val6 = 0;
					gorev6 = new TimerTask() {

						@Override
						public void run() {
						
							r6.keyPress((int)macro_6.getText().charAt(0));
							r6.delay(200);
							r6.keyRelease((int)macro_6.getText().charAt(0));
					}
							
					};
					try {
						val6 = Integer.parseInt(sure_6.getText());
						t6.schedule(gorev6,new Date(),val6);
					
					}catch(NumberFormatException e1) {
						
						macro_6.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 7 ���N G�REVLER
				if(!macro_7.getText().equals("") && !sure_7.getText().equals("")) {
					
					t7 = new Timer();
					int val7 = 0;
					gorev7 = new TimerTask() {

						@Override
						public void run() {
						
							r7.keyPress((int)macro_7.getText().charAt(0));
							r7.delay(200);
							r7.keyRelease((int)macro_7.getText().charAt(0));
					}
							
					};
					try {
						val7 = Integer.parseInt(sure_7.getText());
						t7.schedule(gorev7,new Date(),val7);
					
					}catch(NumberFormatException e1) {
						
						macro_7.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 8 ���N G�REVLER
				if(!macro_8.getText().equals("") && !sure_8.getText().equals("")) {
					
					t8 = new Timer();
					int val8 = 0;
					gorev8 = new TimerTask() {

						@Override
						public void run() {
						
							r8.keyPress((int)macro_8.getText().charAt(0));
							r8.delay(200);
							r8.keyRelease((int)macro_8.getText().charAt(0));
					}
							
					};
					try {
						val8 = Integer.parseInt(sure_8.getText());
						t8.schedule(gorev8,new Date(),val8);
					
					}catch(NumberFormatException e1) {
						
						macro_8.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 9 ���N G�REVLER
				if(!macro_9.getText().equals("") && !sure_9.getText().equals("")) {
					
					t9 = new Timer();
					int val9 = 0;
					gorev9 = new TimerTask() {

						@Override
						public void run() {
						
							r9.keyPress((int)macro_9.getText().charAt(0));
							r9.delay(200);
							r9.keyRelease((int)macro_9.getText().charAt(0));
					}
							
					};
					try {
						val9 = Integer.parseInt(sure_9.getText());
						t9.schedule(gorev9,new Date(),val9);
					
					}catch(NumberFormatException e1) {
						
						macro_9.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 10 ���N G�REVLER
				if(!macro_10.getText().equals("") && !sure_10.getText().equals("")) {
					
					t10 = new Timer();
					int val10 = 0;
					gorev10 = new TimerTask() {

						@Override
						public void run() {
						
							r10.keyPress((int)macro_10.getText().charAt(0));
							r10.delay(200);
							r10.keyRelease((int)macro_10.getText().charAt(0));
					}
							
					};
					try {
						val10 = Integer.parseInt(sure_10.getText());
						t10.schedule(gorev10,new Date(),val10);
					
					}catch(NumberFormatException e1) {
						
						macro_10.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 11 ���N G�REVLER
				if(!macro_11.getText().equals("") && !sure_11.getText().equals("")) {
					
					t11 = new Timer();
					int val11 = 0;
					gorev11 = new TimerTask() {

						@Override
						public void run() {
							if(macro_11.getText().toUpperCase().equals("F1")) {
								
								r11.keyPress(KeyEvent.VK_F1);
								r11.delay(200);
								r11.keyRelease(KeyEvent.VK_F1);
								
							}else if(macro_11.getText().toUpperCase().equals("F2")){
								
								r11.keyPress(KeyEvent.VK_F2);
								r11.delay(200);
								r11.keyRelease(KeyEvent.VK_F2);
								
							}else if(macro_11.getText().toUpperCase().equals("F3")) {
								
								r11.keyPress(KeyEvent.VK_F3);
								r11.delay(200);
								r11.keyRelease(KeyEvent.VK_F3);
								
							}else if(macro_11.getText().toUpperCase().equals("F4")) {
								
								r11.keyPress(KeyEvent.VK_F4);
								r11.delay(200);
								r11.keyRelease(KeyEvent.VK_F4);
								
							}else if(macro_11.getText().toUpperCase().equals("F5")) {
								
								r11.keyPress(KeyEvent.VK_F5);
								r11.delay(200);
								r11.keyRelease(KeyEvent.VK_F5);
								
							}else if(macro_11.getText().toUpperCase().equals("BO�LUK")){
								r11.keyPress(KeyEvent.VK_SPACE);
								r11.delay(200);
								r11.keyRelease(KeyEvent.VK_SPACE);
							}else {
								try {
								r11.keyPress((int)macro_11.getText().charAt(0));
								r11.delay(200);
								r11.keyRelease((int)macro_11.getText().charAt(0));
								}catch(StringIndexOutOfBoundsException e1) {
									
								}
							}


						}
						
					};
					try {
						val11 = Integer.parseInt(sure_11.getText());
						t11.schedule(gorev11,new Date(),val11);
					
					}catch(NumberFormatException e1) {
						
						macro_11.setText("S�re girilmedi.");
								
					}
				}
					
						
				//TU� 12 ���N G�REVLER
				if(!macro_12.getText().equals("") && !sure_12.getText().equals("")) {
					
					t12 = new Timer();
					int val12 = 0;
					gorev12 = new TimerTask() {

						@Override
						public void run() {
						
							if(macro_12.getText().toUpperCase().equals("F1")) {
								
								r12.keyPress(KeyEvent.VK_F1);
								r12.delay(200);
								r12.keyRelease(KeyEvent.VK_F1);
								
							}else if(macro_12.getText().toUpperCase().equals("F2")){
								
								r12.keyPress(KeyEvent.VK_F2);
								r12.delay(200);
								r12.keyRelease(KeyEvent.VK_F2);
								
							}else if(macro_12.getText().toUpperCase().equals("F3")) {
								
								r12.keyPress(KeyEvent.VK_F3);
								r12.delay(200);
								r12.keyRelease(KeyEvent.VK_F3);
								
							}else if(macro_12.getText().toUpperCase().equals("F4")) {
								
								r12.keyPress(KeyEvent.VK_F4);
								r12.delay(200);
								r12.keyRelease(KeyEvent.VK_F4);
								
							}else if(macro_12.getText().toUpperCase().equals("F5")) {
								
								r12.keyPress(KeyEvent.VK_F5);
								r12.delay(200);
								r12.keyRelease(KeyEvent.VK_F5);
								
							}else if(macro_12.getText().toUpperCase().equals("BO�LUK")){
								r12.keyPress(KeyEvent.VK_SPACE);
								r12.delay(200);
								r12.keyRelease(KeyEvent.VK_SPACE);
							}else {
								try {
								r12.keyPress((int)macro_12.getText().charAt(0));
								r12.delay(200);
								r12.keyRelease((int)macro_12.getText().charAt(0));
								}catch(StringIndexOutOfBoundsException e1) {
									
								}
							}

					}
							
					};
					try {
						val12 = Integer.parseInt(sure_12.getText());
						t12.schedule(gorev12,new Date(),val12);
					
					}catch(NumberFormatException e1) {
						
						macro_12.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 13 ���N G�REVLER
				if(!macro_13.getText().equals("") && !sure_13.getText().equals("")) {
					
					t13 = new Timer();
					int val13 = 0;
					gorev13 = new TimerTask() {

						@Override
						public void run() {
						
							if(macro_13.getText().toUpperCase().equals("F1")) {
								
								r13.keyPress(KeyEvent.VK_F1);
								r13.delay(200);
								r13.keyRelease(KeyEvent.VK_F1);
								
							}else if(macro_13.getText().toUpperCase().equals("F2")){
								
								r13.keyPress(KeyEvent.VK_F2);
								r13.delay(200);
								r13.keyRelease(KeyEvent.VK_F2);
								
							}else if(macro_13.getText().toUpperCase().equals("F3")) {
								
								r13.keyPress(KeyEvent.VK_F3);
								r13.delay(200);
								r13.keyRelease(KeyEvent.VK_F3);
								
							}else if(macro_13.getText().toUpperCase().equals("F4")) {
								
								r13.keyPress(KeyEvent.VK_F4);
								r13.delay(200);
								r13.keyRelease(KeyEvent.VK_F4);
								
							}else if(macro_13.getText().toUpperCase().equals("F5")) {
								
								r13.keyPress(KeyEvent.VK_F5);
								r13.delay(200);
								r13.keyRelease(KeyEvent.VK_F5);
								
							}else if(macro_13.getText().toUpperCase().equals("BO�LUK")){
								r13.keyPress(KeyEvent.VK_SPACE);
								r13.delay(200);
								r13.keyRelease(KeyEvent.VK_SPACE);
							}else {
								try {
								
									r13.keyPress((int)macro_13.getText().charAt(0));
									r13.delay(200);
									r13.keyRelease((int)macro_13.getText().charAt(0));
									
								}catch(StringIndexOutOfBoundsException e1) {
									
								}
								
							}

					}
							
					};
					try {
						val13 = Integer.parseInt(sure_13.getText());
						t13.schedule(gorev13,new Date(),val13);
					
					}catch(NumberFormatException e1) {
						
						macro_13.setText("S�re girilmedi.");
								
					}
				}
				
				//TU� 14 ���N G�REVLER
				if(!macro_14.getText().equals("") && !sure_14.getText().equals("")) {
					
					t14 = new Timer();
					int val14 = 0;
					gorev14 = new TimerTask() {

						@Override
						public void run() {
							
							if(macro_14.getText().toUpperCase().equals("F1")) {
								
								r14.keyPress(KeyEvent.VK_F1);
								r14.delay(200);
								r14.keyRelease(KeyEvent.VK_F1);
								
							}else if(macro_14.getText().toUpperCase().equals("F2")){
								
								r14.keyPress(KeyEvent.VK_F2);
								r14.delay(200);
								r14.keyRelease(KeyEvent.VK_F2);
								
							}else if(macro_14.getText().toUpperCase().equals("F3")) {
								
								r14.keyPress(KeyEvent.VK_F3);
								r14.delay(200);
								
								r14.keyRelease(KeyEvent.VK_F3);
								
							}else if(macro_14.getText().toUpperCase().equals("F4")) {
								
								r14.keyPress(KeyEvent.VK_F4);
								r14.delay(200);
								r14.keyRelease(KeyEvent.VK_F4);
								
							}else if(macro_14.getText().toUpperCase().equals("F5")) {
								
								r14.keyPress(KeyEvent.VK_F5);
								r14.delay(200);
								r14.keyRelease(KeyEvent.VK_F5);
								
							}else if(macro_14.getText().toUpperCase().equals("BO�LUK")){
								r14.keyPress(KeyEvent.VK_SPACE);
								r14.delay(200);
								r14.keyRelease(KeyEvent.VK_SPACE);
							}else {
								try {
									
								r14.keyPress((int)macro_14.getText().charAt(0));
								r14.delay(200);
								r14.keyRelease((int)macro_14.getText().charAt(0));
								
								}catch(StringIndexOutOfBoundsException e1) {
									
								}
							}

					}
							
					};
					try {
						val14 = Integer.parseInt(sure_14.getText());
						t14.schedule(gorev14,new Date(),val14);
					
					}catch(NumberFormatException e1) {
						
						macro_14.setText("S�re girilmedi.");
								
					}
					
				}
		}catch(StringIndexOutOfBoundsException e2) {
			e2.printStackTrace();
	} //TRY CATCH BLOK SONU
	
}//BUTON ��LEVLER� SONU
	

	@FXML
	public void temizle(ActionEvent e) {
		
			durum = false;
			macro_1.setText("");
			macro_2.setText("");
			macro_3.setText("");
			macro_4.setText("");
			macro_5.setText("");
			macro_6.setText("");
			macro_7.setText("");
			macro_8.setText("");
			macro_9.setText("");
			macro_10.setText("");
			macro_11.setText("");
			macro_12.setText("");
			macro_13.setText("");
			macro_14.setText("");
			sure_1.setText("");
			sure_2.setText("");
			sure_3.setText("");
			sure_4.setText("");
			sure_5.setText("");
			sure_6.setText("");
			sure_7.setText("");
			sure_8.setText("");
			sure_9.setText("");
			sure_10.setText("");
			sure_11.setText("");
			sure_12.setText("");
			sure_13.setText("");
			sure_14.setText("");
			
	}
	

}

