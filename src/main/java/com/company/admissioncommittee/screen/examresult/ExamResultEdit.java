package com.company.admissioncommittee.screen.examresult;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.ExamResult;

@UiController("ExamResult.edit")
@UiDescriptor("exam-result-edit.xml")
@EditedEntityContainer("examResultDc")
public class ExamResultEdit extends StandardEditor<ExamResult> {
}