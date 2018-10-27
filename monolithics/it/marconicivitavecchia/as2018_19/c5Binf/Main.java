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
		super.setSize(600, 600);
		
		// Use string builder for speed and memory
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		
		// Put the title
		sb.append("<h1>Command list</h1>");
		
		// Create a table
		sb.append("<div style=\"display:table;width:100%\">");
		
		// Header row
		sb.append("<div style=\"display:table-row\">");
		
		// Fill the cells
		sb.append("<div style=\"display:table-cell\">");
		sb.append("Name");
		sb.append("</div>");
		sb.append("<div style=\"display:table-cell\">");
		sb.append("Description");
		sb.append("</div>");
		
		// close header row div
		sb.append("</div>");
		
		// Row 1
		sb.append("<div style=\"display:table-row\">");
		sb.append("<div style=\"display:table-cell\">");
		sb.append("Bring me a coffee");
		sb.append("</div>");
		sb.append("<div style=\"display:table-cell\">");
		sb.append("Prepare a coffee and bring it to the user");
		sb.append("</div>");
		sb.append("</div>");
		
		// Row 2
		sb.append("<div style=\"display:table-row\">");
		sb.append("<div style=\"display:table-cell\">");
		sb.append("Turn on the lights");
		sb.append("</div>");
		sb.append("<div style=\"display:table-cell\">");
		sb.append("Turn on the lights of current location");
		sb.append("</div>");
		sb.append("</div>");
				
		// close table div
		sb.append("</div>");
		sb.append("</html>");
		
		// convert string builder to string when done with string manipulation
		String htmlText = sb.toString();
		
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println(htmlText);
		
		System.out.println("I am a monolithics application written in Java Swing.");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

