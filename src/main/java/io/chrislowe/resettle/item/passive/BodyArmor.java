package io.chrislowe.resettle.item.passive;

import io.chrislowe.resettle.event.DamageEvent;
import io.chrislowe.resettle.item.PassiveItem;

public class BodyArmor extends PassiveItem {

    private int armorClassDivisor = 5;
    private int maxDamageModifier = 30;

    @Override
    public void handleDamageEvent(DamageEvent event) {
        tryToBlockAllDamage(event);
        reduceDamage(event);
    }

    private void tryToBlockAllDamage(DamageEvent event) {
        final int armorClass = this.getLevel() / armorClassDivisor;
        final double odds = ((double) armorClass / event.getDamageAmount());

        if (odds > Math.random()) {
            event.setDamageAmount(0);
        }
    }

    private void reduceDamage(DamageEvent event) {
        final double modifierScale = this.getLevel() / 100.0;
        final double damageModifier = (modifierScale * maxDamageModifier) / 100.0;
        event.setDamageAmount((int)(event.getDamageAmount() * (1 - damageModifier)));
    }
}
