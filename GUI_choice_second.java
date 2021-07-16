package Group_Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Caret;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;

public class GUI_choice_second extends JFrame {

	private JPanel contentPane;
	private JTextField txtMusic;
	
	private static GUI_choice_second frame;
	private Music_database music_info;
	//private Playlist playlist;
	private Map<String,Object> result;
	private Map<String,String> singer_info;
	private String category;
	private JTextField txtSinger;
	
	private String best_music = "";
	
	private Double max_number = 0.0;
	private Double try_number = 0.0;
	
	public static String[][] playlist = new String[100][100];
	private int index = 0;
	
	public Playlist pt;
	 
	//private Set result;
	
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new GUI_choice_second();
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
	public GUI_choice_second() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"R&B", "ROCK", "BALLAD", "HIP-HOP", "CAFE", "CLUB", "SUNNY", "RAINY"}));
		comboBox.setBounds(210, 74, 155, 27);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Please , Recommand");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				max_number = 0.0;
				category = (String) comboBox.getSelectedItem();
				music_info = new Music_database();
				
				result = (Map<String, Object>) music_info.getmap();
				singer_info = (Map<String,String>) music_info.getSinger();
				
				System.out.println(result.keySet().toString());
				
				//Double max_number = 0.0;
				String max = "";
				
				for (String key : ((Map<String, Object>) result.get(category)).keySet()) {
					
					Double compar_number = (Double) ((Map<String, Object>) result.get(category)).get(key);
					
					if (compar_number > max_number) {
						max_number = compar_number;
						max = key;
					}
				}
				best_music = max;
				txtMusic.setText(best_music);
				txtSinger.setText(singer_info.get(best_music));
				try_number += 1;
				
			}
			
		});
		btnNewButton.setBounds(65, 113, 311, 37);
		contentPane.add(btnNewButton);
		
		JButton btnOut = new JButton("Exit");
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer =
					    JOptionPane.showConfirmDialog(null, 
					    "End program?",
					    "Click Yes or No:", JOptionPane.YES_NO_OPTION);

					    if (answer == JOptionPane.YES_OPTION)
					        System.exit(0);
			}
		});
		btnOut.setBounds(163, 243, 117, 29);
		contentPane.add(btnOut);
		
		txtMusic = new JTextField();
		txtMusic.setBounds(60, 173, 251, 26);
		contentPane.add(txtMusic);
		txtMusic.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String try_music="";
				for (String key : ((Map<String, Object>) result.get(category)).keySet()) {
					if (!key.equalsIgnoreCase(best_music)) {
						Double second = (Double) ((Map<String, Object>) result.get(category)).get(key);
						if (second < max_number) {
							if (second>try_number) {
								try_number = second;
								try_music = key;
							}
						}
					}
				}
				
				System.out.println(try_music);
				best_music = try_music;
				max_number = (Double) ((Map<String, Object>) result.get(category)).get(try_music);
				txtMusic.setText(best_music);
				txtSinger.setText(singer_info.get(best_music));
				System.out.println(max_number);
				try_number = 0.0;
				
			}
		});
		btnNewButton_1.setBounds(315, 173, 61, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playlist[index][0] = best_music; 		
				playlist[index][1] = singer_info.get(best_music);
				
				System.out.println(playlist[index][0]);
				System.out.println(playlist[index][1]);
				
				index+=1;
			}
		});
		btnOk.setBounds(377, 173, 67, 58);
		contentPane.add(btnOk);
		
		txtSinger = new JTextField();
		txtSinger.setColumns(10);
		txtSinger.setBounds(60, 202, 251, 26);
		contentPane.add(txtSinger);
	 	
		JLabel lblNewLabel = new JLabel("Choose the category of music you want");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel.setBounds(65, 24, 360, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("category");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(129, 72, 80, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSong = new JLabel("Song");
		lblSong.setBounds(6, 178, 61, 16);
		contentPane.add(lblSong);
		
		JLabel lblSinger = new JLabel("Singer");
		lblSinger.setBounds(6, 207, 61, 16);
		contentPane.add(lblSinger);
		
		JButton btnGoToPlaylist = new JButton("Go to Playlist");
		btnGoToPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				Playlist je = null;
				try {
					je = new Playlist();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
				je.setVisible(true);
				
				//frame.setVisible(false);
				//pt = new Playlist();
				//pt.setVisible(true);
			}
		});
		btnGoToPlaylist.setBounds(16, 243, 117, 29);
		contentPane.add(btnGoToPlaylist);
		
	}
	
}

