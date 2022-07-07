package com.company.admissioncommittee.screen.branch;

import com.company.admissioncommittee.app.BranchService;
import io.jmix.ui.Notifications;
import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Branch;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Branch.edit")
@UiDescriptor("branch-edit.xml")
@EditedEntityContainer("branchDc")
public class BranchEdit extends StandardEditor<Branch> {
    /*@Autowired
    private BranchService branchService;

    @Subscribe
    public void onAfterCommitChanges(AfterCommitChangesEvent event) {
        branchService.fillBranchInRating();
    }*/


}