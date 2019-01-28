package io.chrislowe.resettle.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DamageEvent extends Event {

    public enum DamageType {
        NORMAL,
    }

    private DamageType damageType;
    private int damageAmount;
}
