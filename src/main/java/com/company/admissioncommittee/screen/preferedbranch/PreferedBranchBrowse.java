package com.company.admissioncommittee.screen.preferedbranch;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.PreferedBranch;

@UiController("PreferedBranch.browse")
@UiDescriptor("prefered-branch-browse.xml")
@LookupComponent("preferedBranchesTable")
public class PreferedBranchBrowse extends StandardLookup<PreferedBranch> {
}