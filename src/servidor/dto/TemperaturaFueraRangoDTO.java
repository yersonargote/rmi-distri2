package servidor.dto;

import java.time.LocalDateTime;

/**
 *
 * @author yerso
 */
public class TemperaturaFueraRangoDTO implements java.io.Serializable {
    private final Double temperatura;
    private final LocalDateTime dateTime;

    public TemperaturaFueraRangoDTO(Double temperatura, LocalDateTime dateTime) {
        this.temperatura = temperatura;
        this.dateTime = dateTime;
    }
    
    public Double getTemperatura() {
        return temperatura;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
