package exception;
import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//permite que classe “aconselhadoras” sejam criadas
//para que erros ( @ExceptionHandler ) e respostas HTTPs sejam obtidas
// e manipuladas de maneira adequada.
@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    // é uma anotação que permite lidar com exceções
    // em classes e/ou métodos manipuladores. O parâmetro ConversionFailedException.class
    // é exceção a ser lançada quando uma tentativa de conversão de tipo real falhar.
    @ExceptionHandler(ConversionFailedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> handleConnversion(RuntimeException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    // EntityNotFoundException.class é uma exceção customizada
    // para entidade que se pretende manipular. Para isso, crie uma classe com o mesmo nome no
    // pacote exception
    @ExceptionHandler(EntityNotFoundException.class)

    // @ResponseStatus (Linhas 18 e 24) é um anotação que serve para sinalizar para um método
    // ou uma classe de exceção o código de status e o motivo que devem ser retornados.
    // HttpStatus é um enum para os códigos de status HTTP, onde BAD_REQUEST é o código 400
    // (Bad request) e NOT_FOUND é o código 404 (Not found).
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleEntityNotFound(RuntimeException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
