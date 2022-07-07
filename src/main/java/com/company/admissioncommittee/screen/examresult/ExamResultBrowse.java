package com.company.admissioncommittee.screen.examresult;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.ExamResult;

@UiController("ExamResult.browse")
@UiDescriptor("exam-result-browse.xml")
@LookupComponent("examResultsTable")
public class ExamResultBrowse extends StandardLookup<ExamResult> {
}