package com.whx.ui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginFrame extends Frame {
	
	private static final long serialVersionUID = 4871881271346989588L;
	private Dimension defaultSize = new Dimension();
	
	public LoginFrame(){
		this.setTitle("IMShare");
		defaultSize.setSize(400, 240);
		this.setSize(defaultSize);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
