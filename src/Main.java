import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Main {

	private JFrame frame;
	private ButtonGroup bg = new ButtonGroup();
	private JTextField tfMlSeconds;
	private JLabel lblLoadedFile;
	private JTextField tfScreen;
	private File GlobalFile;

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources\\icon.png"));
		frame.setResizable(false);
		frame.setTitle(
				"\u0420\u0435\u0434\u0430\u043A\u0442\u043E\u0440 \u043D\u0430 \u0441\u0443\u0431\u0442\u0438\u0442\u0440\u0438");
		frame.setBounds(100, 100, 450, 203);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(frame, "Има \"Изход\" бутон бе!");
			}
		});

		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(0, 0, 434, 23);
		toolBar.setBackground(UIManager.getColor("Button.background"));
		frame.getContentPane().add(toolBar);

		JButton btnLoad = new JButton("\u0417\u0430\u0440\u0435\u0434\u0438 \u0424\u0430\u0439\u043B");
		btnLoad.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
<<<<<<< HEAD
				// making browse window
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				String name = f.getName();
				if (name.endsWith(".srt") == false && name.endsWith(".sub") == false) {
					JOptionPane.showMessageDialog(null, "Моля изберете \".srt\" файл");
				} else {
					lblLoadedFile.setText("Зареденият файл е : " + f.getName());
				}
=======
				// Making browse window
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
				File f = chooser.getSelectedFile();
				lblLoadedFile.setText("Зареденият файл е : " + f.getName());
				//
>>>>>>> 30678fb4e7284d382429f0eb3e16933a62de19ba

			}
		});
		toolBar.add(btnLoad);

		JButton btnOpen = new JButton("\u041E\u0442\u0432\u043E\u0440\u0438 \u0424\u0430\u0439\u043B");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		toolBar.add(btnOpen);

		JButton btnSave = new JButton("\u0417\u0430\u043F\u0438\u0448\u0438");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnSave);

		JButton btnExit = new JButton("\u0418\u0437\u0445\u043E\u0434");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		toolBar.add(btnExit);

		JRadioButton btnFaster = new JRadioButton("\u0417\u0430\u0431\u044A\u0440\u0437\u0430\u0439");
		btnFaster.setBounds(10, 25, 94, 23);
		frame.getContentPane().add(btnFaster);

		JRadioButton btnSlower = new JRadioButton("\u0417\u0430\u0431\u0430\u0432\u0438");
		btnSlower.setBounds(106, 25, 83, 23);
		frame.getContentPane().add(btnSlower);

		bg.add(btnFaster);
		bg.add(btnSlower);

		JCheckBox chckbxRemoveTags = new JCheckBox(
				"\u041F\u0440\u0435\u043C\u0430\u0445\u043D\u0438 \u0442\u0430\u0433\u043E\u0432\u0435\u0442\u0435");
		chckbxRemoveTags.setBounds(286, 25, 142, 23);
		frame.getContentPane().add(chckbxRemoveTags);

		tfMlSeconds = new JTextField();
		tfMlSeconds.setBounds(193, 26, 50, 20);
		frame.getContentPane().add(tfMlSeconds);
		tfMlSeconds.setColumns(10);

		JLabel label = new JLabel("\u043C\u043B/\u0441.");
		label.setBounds(245, 29, 46, 14);
		frame.getContentPane().add(label);

		lblLoadedFile = new JLabel(
				"\u0417\u0430\u0440\u0435\u0434\u0435\u043D\u0438\u044F\u0442 \u0444\u0430\u0439\u043B \u0435 ");
		lblLoadedFile.setBounds(10, 128, 434, 14);
		frame.getContentPane().add(lblLoadedFile);

		JLabel lbltime = new JLabel("00:01:09,028 \u0447. \u0434\u043E 00:01:10,321 \u0447.");
		lbltime.setOpaque(true);
		lbltime.setHorizontalAlignment(SwingConstants.CENTER);
		lbltime.setForeground(Color.WHITE);
		lbltime.setBackground(Color.GRAY);
		lbltime.setBounds(120, 83, 201, 35);
		frame.getContentPane().add(lbltime);

		tfScreen = new JTextField();
		tfScreen.setBounds(0, 55, 444, 29);
		frame.getContentPane().add(tfScreen);
		tfScreen.setColumns(10);

		JButton btnPrevious = new JButton("\u041F\u0440\u0435\u0434\u0438\u0448\u0435\u043D");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnPrevious.setBounds(10, 94, 100, 23);
		frame.getContentPane().add(btnPrevious);

		JButton btnNext = new JButton("\u0421\u043B\u0435\u0434\u0432\u0430\u0449");
		btnNext.setBounds(331, 94, 103, 23);
		frame.getContentPane().add(btnNext);
	}
}
