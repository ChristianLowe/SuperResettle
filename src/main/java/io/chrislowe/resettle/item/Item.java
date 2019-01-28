package io.chrislowe.resettle.item;

import io.chrislowe.resettle.event.Event;

public interface Item {
    String getName();
    String getDescription();
    Integer getLevel();

    void handleEvent(Event event);
}
