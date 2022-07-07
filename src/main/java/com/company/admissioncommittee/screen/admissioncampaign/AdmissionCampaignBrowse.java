package com.company.admissioncommittee.screen.admissioncampaign;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.AdmissionCampaign;

@UiController("AdmissionCampaign.browse")
@UiDescriptor("admission-campaign-browse.xml")
@LookupComponent("admissionCampaignsTable")
public class AdmissionCampaignBrowse extends StandardLookup<AdmissionCampaign> {
    
}