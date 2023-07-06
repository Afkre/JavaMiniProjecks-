package com.mycompany.kioskflughafen;

public interface Regeln {
    boolean visumStatusKontroll();
    boolean gültigkeitRPassesKontroll();
    boolean ausReiseVerbotKontroll();
    boolean gepaeckKontroll();
    boolean kabinGepaeckKontroll();
    
}