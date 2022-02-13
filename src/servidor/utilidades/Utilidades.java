package servidor.utilidades;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author yerso
 */
public class Utilidades {
    public static String fechaActual() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        LocalDateTime now = LocalDateTime.now();
        return format.format(now);
    }
    
    public static Duration DurationBetween(LocalDateTime from, LocalDateTime to) {
        return Duration.between(from, to);
    }
    
    public static Long SecondsBetween(LocalDateTime from, LocalDateTime to) {
        return Duration.between(from, to).getSeconds();
    }
}
