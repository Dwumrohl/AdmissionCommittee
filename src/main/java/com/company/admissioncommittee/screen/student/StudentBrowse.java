package com.company.admissioncommittee.screen.student;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Student;

@UiController("Student.browse")
@UiDescriptor("student-browse.xml")
@LookupComponent("studentsTable")
public class StudentBrowse extends StandardLookup<Student> {
}