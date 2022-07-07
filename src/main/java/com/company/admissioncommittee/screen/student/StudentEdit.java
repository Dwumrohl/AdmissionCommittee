package com.company.admissioncommittee.screen.student;

import com.company.admissioncommittee.app.BranchService;
import com.company.admissioncommittee.entity.Contact;
import com.company.admissioncommittee.entity.ExamResult;
import com.company.admissioncommittee.entity.Rating;
import com.company.admissioncommittee.screen.rating.RatingEdit;
import io.jmix.ui.Dialogs;
import io.jmix.ui.Notifications;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.HasValue;
import io.jmix.ui.component.Table;
import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Student.edit")
@UiDescriptor("student-edit.xml")
@EditedEntityContainer("studentDc")
public class StudentEdit extends StandardEditor<Student> {
    @Autowired
    private BranchService branchService;


    @Subscribe
    public void onAfterCommitChanges(AfterCommitChangesEvent event) {
        //branchService.fillStudentInRating();
    }




    





}