package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import dataStructures.AcademicThemeEnum;
import dataStructures.Ambition;
import dataStructures.Data;
import dataStructures.Distance;
import dataStructures.Finances;
import dataStructures.Grade;
import dataStructures.University;
import dataStructures.WojewodztwoEnum;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("Systemy ekspertowe - Piotr Sotor, 200882");
		setSize(703, 486);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setLayout(null);

		JComboBox comboBox_wojewodztwo = new JComboBox();
		comboBox_wojewodztwo.setModel(new DefaultComboBoxModel(WojewodztwoEnum.values()));
		comboBox_wojewodztwo.setBounds(238, 8, 129, 20);
		getContentPane().add(comboBox_wojewodztwo);

		JLabel lblWybierzWasneWojewdzctwo = new JLabel("Wojew\u00F3dztwo pochodzenia");
		lblWybierzWasneWojewdzctwo.setBounds(10, 14, 213, 14);
		getContentPane().add(lblWybierzWasneWojewdzctwo);

		JLabel lblNewLabel = new JLabel("Interesuj\u0105ce tematyki");
		lblNewLabel.setBounds(382, 14, 147, 14);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Dopuszczalna odleg\u0142o\u015B\u0107 od uczelni");
		lblNewLabel_1.setBounds(10, 59, 213, 14);
		getContentPane().add(lblNewLabel_1);

		JComboBox comboBox_distance = new JComboBox();
		comboBox_distance.setModel(new DefaultComboBoxModel(Distance.values()));
		comboBox_distance.setBounds(238, 53, 129, 20);
		getContentPane().add(comboBox_distance);

		JLabel lblNewLabel_2 = new JLabel("Status materialny");
		lblNewLabel_2.setBounds(10, 103, 213, 14);
		getContentPane().add(lblNewLabel_2);

		JComboBox comboBox_finances = new JComboBox();
		comboBox_finances.setModel(new DefaultComboBoxModel(Finances.values()));
		comboBox_finances.setBounds(238, 97, 129, 20);
		getContentPane().add(comboBox_finances);

		JPanel panel_lastNotes = new JPanel();
		panel_lastNotes.setBounds(16, 214, 226, 245);
		getContentPane().add(panel_lastNotes);
		panel_lastNotes.setLayout(null);

		JLabel lblOcenyWOstatnim = new JLabel("Oceny w ostatnim semestrze");
		lblOcenyWOstatnim.setBounds(10, 11, 287, 14);
		panel_lastNotes.add(lblOcenyWOstatnim);

		JLabel lblNewLabel_3 = new JLabel("Matematyka");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 36, 136, 14);
		panel_lastNotes.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Fizyka");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(10, 60, 136, 14);
		panel_lastNotes.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("J\u0119zyk polski");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(10, 85, 136, 14);
		panel_lastNotes.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Najlepszy j\u0119zyk obcy");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setBounds(10, 110, 136, 14);
		panel_lastNotes.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Biologia");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7.setBounds(10, 135, 136, 14);
		panel_lastNotes.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("Chemia");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8.setBounds(10, 160, 136, 14);
		panel_lastNotes.add(lblNewLabel_8);

		JComboBox comboBox_math = new JComboBox();
		comboBox_math.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_math.setBounds(172, 33, 42, 20);
		panel_lastNotes.add(comboBox_math);

		JComboBox comboBox_physics = new JComboBox();
		comboBox_physics.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_physics.setBounds(172, 57, 42, 20);
		panel_lastNotes.add(comboBox_physics);

		JComboBox comboBox_polish = new JComboBox();
		comboBox_polish.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_polish.setBounds(172, 82, 42, 20);
		panel_lastNotes.add(comboBox_polish);

		JComboBox comboBox_foreign = new JComboBox();
		comboBox_foreign.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_foreign.setBounds(172, 107, 42, 20);
		panel_lastNotes.add(comboBox_foreign);

		JComboBox comboBox_biology = new JComboBox();
		comboBox_biology.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_biology.setBounds(172, 132, 42, 20);
		panel_lastNotes.add(comboBox_biology);

		JComboBox comboBox_chemistry = new JComboBox();
		comboBox_chemistry.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_chemistry.setBounds(172, 157, 42, 20);
		panel_lastNotes.add(comboBox_chemistry);

		JComboBox comboBox_music = new JComboBox();
		comboBox_music.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_music.setBounds(172, 206, 42, 20);
		panel_lastNotes.add(comboBox_music);

		JComboBox comboBox_draw = new JComboBox();
		comboBox_draw.setModel(new DefaultComboBoxModel(Grade.values()));
		comboBox_draw.setBounds(172, 181, 42, 20);
		panel_lastNotes.add(comboBox_draw);

		JLabel lblRysunekplastyka = new JLabel("Rysunek/plastyka");
		lblRysunekplastyka.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRysunekplastyka.setBounds(10, 184, 136, 14);
		panel_lastNotes.add(lblRysunekplastyka);

		JLabel lblMuzykasztuka = new JLabel("Muzyka/sztuka");
		lblMuzykasztuka.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMuzykasztuka.setBounds(10, 209, 136, 14);
		panel_lastNotes.add(lblMuzykasztuka);

		JComboBox comboBox_ambition = new JComboBox();
		comboBox_ambition.setModel(new DefaultComboBoxModel(Ambition.values()));
		comboBox_ambition.setBounds(238, 140, 129, 20);
		getContentPane().add(comboBox_ambition);

		JLabel lblWasnaAmbicja = new JLabel("W\u0142asna ambicja");
		lblWasnaAmbicja.setBounds(10, 146, 213, 14);
		getContentPane().add(lblWasnaAmbicja);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(544, 16, 138, 222);
		getContentPane().add(scrollPane);

		JList list_academicalThemes = new JList();
		scrollPane.setViewportView(list_academicalThemes);
		list_academicalThemes.setModel(new ModelList());

		JButton btn_run = new JButton("Uruchom");
		btn_run.setBounds(328, 209, 115, 29);
		btn_run.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				WojewodztwoEnum livingIn = (WojewodztwoEnum) comboBox_wojewodztwo.getSelectedItem();
				Distance dist = (Distance) comboBox_distance.getSelectedItem();
				Finances finance = (Finances) comboBox_finances.getSelectedItem();
				Ambition ambition = (Ambition) comboBox_ambition.getSelectedItem();
				List<AcademicThemeEnum> academicThemeEnums = list_academicalThemes.getSelectedValuesList();

				Grade math = (Grade) comboBox_math.getSelectedItem();
				Grade physics = (Grade) comboBox_physics.getSelectedItem();
				Grade polish = (Grade) comboBox_polish.getSelectedItem();
				Grade foreign = (Grade) comboBox_foreign.getSelectedItem();
				Grade biology = (Grade) comboBox_biology.getSelectedItem();
				Grade chemistry = (Grade) comboBox_chemistry.getSelectedItem();
				Grade draw = (Grade) comboBox_draw.getSelectedItem();
				Grade music = (Grade) comboBox_music.getSelectedItem();

				List<University> universities = Data.getInstance().getUniversities();
				Map<University, Float> result = new HashMap<>();
				for (University uni : universities) {
					float baseFactor = 1.0f;
					baseFactor *= getDistanceFactor(dist, livingIn, uni);
					baseFactor *= getFinanceFactor(finance, uni);
					baseFactor *= getAmbitionFactor(ambition, uni);
					baseFactor *= getAcademicThemeFactor(academicThemeEnums, uni);
					baseFactor *= getMathFactor(math, uni);
					baseFactor *= getPhysicsFactor(physics, uni);
					baseFactor *= getPolishFactor(polish, uni);
					baseFactor *= getForeignFactor(foreign, uni);
					baseFactor *= getBiologyFactor(biology, uni);
					baseFactor *= getChemistryFactor(chemistry, uni);
					baseFactor *= getDrawFactor(draw, uni);
					baseFactor *= getArtFactor(music, uni);

					result.put(uni, baseFactor);
					System.out.println(uni.toString() + " " + Float.toString(baseFactor));
				}

			}

			private float getDistanceFactor(Distance expected, WojewodztwoEnum livingIn, University uni) {
				if (uni.getWojewodzctwo().equals(livingIn)) {
					return 1.0f;
				}
				if (uni.getWojewodzctwo().getNeighbours().contains(uni.getWojewodzctwo())) {
					if (expected.equals(Distance.MID))
						return 1.0f;
					return 0.8f;
				}
				if (expected.equals(Distance.CLOSE))
					return 0.3f;
				if (expected.equals(Distance.MID))
					return 0.8f;
				return 1.0f;
			}

			private float getFinanceFactor(Finances expected, University uni) {
				Integer uniOrder = uni.getWojewodzctwo().getExpensivity() / 2;
				Integer expectedOrder = expected.getOrder();

				return Math.min(1.0f, expectedOrder.floatValue() / uniOrder.floatValue());
			}

			private float getAmbitionFactor(Ambition expected, University uni) {
				Integer expectedOrder = expected.getOrder();
				Integer uniOrder = uni.getAmbitious().getOrder();
				Integer diff = Math.abs(expectedOrder - uniOrder);

				return 1.0f - diff.floatValue() / 3.0f;
			}

			private float getAcademicThemeFactor(List<AcademicThemeEnum> expected, University uni) {
				Integer counter = 0;
				for (AcademicThemeEnum theme : uni.getThemesMatching()) {
					if (expected.contains(theme))
						++counter;
				}
				return Math.min(1.0f, counter.floatValue() / 2.0f);
			}

			private float getMathFactor(Grade extected, University uni) {

				return 1.0f;
			}

			private float getPhysicsFactor(Grade extected, University uni) {
				return 1.0f;
			}

			private float getPolishFactor(Grade extected, University uni) {
				return 1.0f;
			}

			private float getForeignFactor(Grade extected, University uni) {
				return 1.0f;
			}

			private float getBiologyFactor(Grade extected, University uni) {
				return 1.0f;
			}

			private float getChemistryFactor(Grade extected, University uni) {
				return 1.0f;
			}

			private float getDrawFactor(Grade extected, University uni) {
				return 1.0f;
			}

			private float getArtFactor(Grade extected, University uni) {
				return 1.0f;
			}

		});
		getContentPane().add(btn_run);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(251, 282, 431, 159);
		getContentPane().add(textPane);

		JLabel lblRezultaty = new JLabel("Rezultaty");
		lblRezultaty.setBounds(251, 258, 129, 20);
		getContentPane().add(lblRezultaty);

		// System.out.println("Hello console");
		// Data.getInstance().getUniversities().stream().forEach(p ->
		// System.out.println(p));

	}

	class ModelList extends AbstractListModel {

		// AcademicThemeEnum.values();
		// String[]
		String[] values = new String[50];
		List<String> valuesList = new ArrayList<>();
		List<AcademicThemeEnum> enums = Arrays.asList(AcademicThemeEnum.values());
		AcademicThemeEnum[] codes = new AcademicThemeEnum[50];

		public ModelList() {

			for (int i = 0; i < 50 && i < enums.size(); ++i) {
				if (!enums.get(i).equals(AcademicThemeEnum.UNKNOWN)) {
					values[i] = enums.get(i).toString();
					codes[i] = enums.get(i);
				}
			}
		}

		@Override
		public int getSize() {
			// TODO Auto-generated method stub
			return enums.size();
		}

		@Override
		public Object getElementAt(int index) {
			return codes[index];
		}

	}
}
