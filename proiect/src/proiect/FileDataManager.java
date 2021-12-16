package proiect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class FileDataManager implements IDataLoader {
	@Override
	public Student[] createStudentsData() {
		ArrayList<Student> studenti = new ArrayList<Student>();
		try {
			Scanner scanner = new Scanner(new File("studenti.csv"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] vector = line.split(",");
				Student s = new Student(vector[0], vector[1], Integer.parseInt(vector[2]));
				studenti.add(s);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		return studenti.toArray(new Student[studenti.size()]);
	}

	@Override
	public Profesor[] createProfesorData() {
			ArrayList<Profesor> profesori = new ArrayList<Profesor>();
			try {
				Scanner scanner = new Scanner(new File("profesori.csv"));
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					String[] vector = line.split(",");
					Profesor p = new Profesor(vector[0], vector[1]);
					profesori.add(p);
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

			return profesori.toArray(new Profesor[profesori.size()]);
		
	}

	@Override
	public Curs[] createCoursesData() {
		ArrayList<Curs> cursuri = new ArrayList<Curs>();
		try {
			Scanner scanner = new Scanner(new File("cursuri.csv"));
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] vector = line.split(",");
				Curs c = new Curs(vector[0], vector[1]);
				cursuri.add(c);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return cursuri.toArray(new Curs[cursuri.size()]);
	
		
	}
}