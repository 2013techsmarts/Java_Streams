package org.smarttechie;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		if (student1.getTotalMarks() > student2.getTotalMarks()) {
			return -11;
		} else if (student1.getTotalMarks() < student2.getTotalMarks()) {
			return 1;
		} else {
			return 0;
		}
	}

}
