package com.company.admissioncommittee.screen.admissioncampaign;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.AdmissionCampaign;

@UiController("AdmissionCampaign.edit")
@UiDescriptor("admission-campaign-edit.xml")
@EditedEntityContainer("admissionCampaignDc")
public class AdmissionCampaignEdit extends StandardEditor<AdmissionCampaign> {
}