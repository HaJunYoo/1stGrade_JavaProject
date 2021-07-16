package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;

public class Playlist extends JFrame {

	protected static final boolean True = false;
	private JPanel contentPane;
	private JTable table;
	private Playlist list;
	//private static Playlist frame2;
	private JTable newTable;
	private JScrollPane scrollPane;
	
	public GUI_choice_second pt2;
	//private GUI_choice_second playlist;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Playlist frame = new Playlist();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Playlist() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPlaylist = new JLabel("Playlist");
		lblPlaylist.setBounds(199, 6, 61, 16);
		contentPane.add(lblPlaylist);
		
		
		String header[] = {"Song","Singer"}; // 열 이름
		
		String contents[][] = { // 사용 안함 
			{"1","2"},
			{"3","4"},
			{"5","6"}
		};
		
		String[][] play = new String[10][10];
		play[0][0] = "SS"; 
		play[0][1] = "SS2";
		
		
		JTable table = new JTable(GUI_choice_second.playlist, header); // JTable(row data, column name)
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(66, 34, 330, 180);
		contentPane.add(scrollPane);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.setVisible(false);
				
				//pt2 = new GUI_choice_second();
				pt2.setVisible(True);
				
				
			}
		});
		btnReturn.setBounds(173, 228, 117, 29);
		contentPane.add(btnReturn);
		
		System.out.println(GUI_choice_second.playlist[0][0]);
		
		
		
		
		
		
		
	}
	
	public String getPlaylist() {
		
		return null;
	}
	
	
}

