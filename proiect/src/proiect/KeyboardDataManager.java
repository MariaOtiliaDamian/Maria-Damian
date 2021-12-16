package proiect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class KeyboardDataManager implements IDataLoader {
	@Override
	public Student[] createStudentsData() {
		char c;
		ArrayList <Student> studenti= new ArrayList <Student>();
		try{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduceti numele studentului:");
		
		String line=br.readLine();
		System.out.println(line);
		}catch(Exception e) {};
		return studenti.toArray(new Student[studenti.size()]);
	}

	@Override
	public Profesor[] createProfesorData() {
		return new Profesor[0];
	}

	@Override
	public Curs[] createCoursesData() {
		return new Curs[0];
	}
}
