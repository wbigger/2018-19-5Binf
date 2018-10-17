/*
 * untitled.java
 * 
 * Copyright 2018  <pi@raspberrypi>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

package it.marconicivitavecchia.as2018_19.c5Binf;
import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Project X");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Item list</h1>");
		sb.append("</html>");
		String htmlText = sb.toString();
		
		super.add(new JLabel(htmlText));
		super.pack();
		super.setVisible(true);
		 
		System.out.println("I am a monolithics application written in Java Swing.");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

