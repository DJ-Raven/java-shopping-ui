package com.raven.event;

import com.raven.model.ModelItem;
import java.awt.Component;

public interface EventItem {

    public void itemClick(Component com, ModelItem item);
}
