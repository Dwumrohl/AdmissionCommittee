package com.company.admissioncommittee.screen.branch;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Branch;

@UiController("Branch.browse")
@UiDescriptor("branch-browse.xml")
@LookupComponent("branchesTable")
public class BranchBrowse extends StandardLookup<Branch> {
}