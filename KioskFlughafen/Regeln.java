package KioskFlughafen;

public interface Regeln {
    boolean visumStatusKontroll();
    boolean gültigkeitRPassesKontroll();
    boolean gepaeckKontroll();
    boolean kabinGepaeckKontroll();
    
}