package proiect;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDisplay implements IDisplayManager {
	@Override
	public void displayStudents(Student[] students) {
		try {
			File f = new File("afisez_studentii.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			try {
				bw.write("nume, prenume, grupa\r\n");
				for (Student stud : students) {
					bw.write(stud.functie_afisare_in_fisier() + "\r\n");
				}
				bw.flush();
			} catch (IOException e) {
				System.out.println(e);
			} finally {
				bw.close();
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	@Override
	public void displayTeachers(Profesor[] profesors) {
		try {
			File f = new File("afisez_profesorii.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			try {
				bw.write("nume, prenume\n" );
				for (Profesor p:profesors) {
					bw.write(p.afisez_profesorii() + "\r\n");
				}
				bw.flush();
			} catch (IOException e) {
				System.out.println(e);
			} finally {
				bw.close();
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	@Override
	public void displayCourses(Curs[] cursuri) {
		try {
			File f = new File("afisez_cursurile.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			try {
				bw.write("nume, descriere\n");
				for (Curs c : cursuri) {
					bw.write(c.afisare_cursuri() + "\r\n");
				}
				bw.flush();
			} catch (IOException e) {
				System.out.println(e);
			} finally {
				bw.close();
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}