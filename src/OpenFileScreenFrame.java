import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class OpenFileScreenFrame extends JFrame {
	public OpenFileScreenFrame() {
	}

	private JPanel contentPane;

	public static void openFrame() {
		JPanel middlePanel = new JPanel();
		middlePanel.setBorder(new TitledBorder(new EtchedBorder(), Main.GlobalFile.getName()));

		// create the middle panel components

		JTextArea display = new JTextArea(16, 58);
		display.setEditable(false); // set textArea non-editable
		JScrollPane scroll = new JScrollPane(display);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		// Add Textarea in to middle panel
		middlePanel.add(scroll);

		JFrame frame1 = new JFrame();
		frame1.getContentPane().add(middlePanel, BorderLayout.NORTH);
		frame1.pack();
		frame1.setLocationRelativeTo(null);
		Scanner fileReader;
		try {
			fileReader = new Scanner(Main.GlobalFile);
			String temp = "";
			while (fileReader.hasNextLine()) {
				temp += fileReader.nextLine();
				temp += "\n";

			}
			display.setText(temp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		frame1.setVisible(true);
	}
}
