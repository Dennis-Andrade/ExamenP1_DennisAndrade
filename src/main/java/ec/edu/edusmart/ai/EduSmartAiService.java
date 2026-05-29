package ec.edu.edusmart.ai;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface EduSmartAiService {

    @UserMessage("""
            Genera un texto publicitario breve para el curso {{nombreCurso}} dirigido a {{publicoObjetivo}}.
            El texto debe ser claro, profesional y orientado a inscripciones.
            """)
    String generarPublicidad(@V("nombreCurso") String nombreCurso, @V("publicoObjetivo") String publicoObjetivo);
}
