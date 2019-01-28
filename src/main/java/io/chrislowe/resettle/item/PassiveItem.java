package io.chrislowe.resettle.item;

import io.chrislowe.resettle.event.DamageEvent;
import io.chrislowe.resettle.event.Event;
import lombok.Data;

@Data
public abstract class PassiveItem implements Item {
    private String name;
    private String description;
    private Integer level;

    @Override
    public void handleEvent(Event event) {
        if (event instanceof DamageEvent) {
            handleDamageEvent((DamageEvent) event);
        }
    }

    abstract public void handleDamageEvent(DamageEvent event);
}
