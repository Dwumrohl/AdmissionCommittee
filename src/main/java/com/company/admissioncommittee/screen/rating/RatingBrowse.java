package com.company.admissioncommittee.screen.rating;

import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Rating;

@UiController("Rating.browse")
@UiDescriptor("rating-browse.xml")
@LookupComponent("ratingsTable")
public class RatingBrowse extends StandardLookup<Rating> {
}