package henriquesantos.com.pipeline.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

import henriquesantos.com.pipeline.domain.TimeLocal;

@Service
public class PipelineService {

    public String run() {
        return "Hello World";
    }

    public TimeLocal dateTimeNow() {
        return new TimeLocal(this.dateTimeFormat(), this.getZone());
    }

    public String dateTimeFormat(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    private String getZone(){
        return ZoneId.of("America/Sao_Paulo").toString();
    }
}
