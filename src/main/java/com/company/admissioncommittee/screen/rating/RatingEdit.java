package com.company.admissioncommittee.screen.rating;

import io.jmix.core.Sort;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaPropertyPath;
import io.jmix.ui.component.Collapsable;
import io.jmix.ui.model.BaseCollectionLoader;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.impl.CollectionContainerSorter;
import io.jmix.ui.model.impl.EntityValuesComparator;
import io.jmix.ui.screen.*;
import com.company.admissioncommittee.entity.Rating;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.lang.Nullable;

import java.util.Comparator;
import java.util.Objects;

@UiController("Rating.edit")
@UiDescriptor("rating-edit.xml")
@EditedEntityContainer("ratingDc")
public class RatingEdit extends StandardEditor<Rating> {


}
