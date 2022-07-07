package com.company.admissioncommittee.screen.preferedbranch;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.PreferedBranch;

@UiController("PreferedBranch.edit")
@UiDescriptor("prefered-branch-edit.xml")
@EditedEntityContainer("preferedBranchDc")
public class PreferedBranchEdit extends StandardEditor<PreferedBranch> {
}