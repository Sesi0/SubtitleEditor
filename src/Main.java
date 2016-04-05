import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(
				"\u0420\u0435\u0434\u0430\u043A\u0442\u043E\u0440 \u043D\u0430 \u0441\u0443\u0431\u0442\u0438\u0442\u0440\u0438");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(frame, "Има \"Изход\" бутон бе!");
				;
			}
		});

		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(0, 0, 434, 23);
		toolBar.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(toolBar);

		JButton button = new JButton("\u0417\u0430\u0440\u0435\u0434\u0438 \u0424\u0430\u0439\u043B");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		toolBar.add(button);

		JButton button_1 = new JButton("\u041E\u0442\u0432\u043E\u0440\u0438 \u0424\u0430\u0439\u043B");
		toolBar.add(button_1);

		JButton button_2 = new JButton("\u0417\u0430\u043F\u0438\u0448\u0438");
		toolBar.add(button_2);

		JButton button_3 = new JButton("\u0418\u0437\u0445\u043E\u0434");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		toolBar.add(button_3);
	}
}
