package io.chrislowe.resettle.event;

import io.chrislowe.resettle.jpa.User;
import lombok.Getter;
import lombok.Setter;

public abstract class Event {

    @Getter @Setter
    private User target;
}
