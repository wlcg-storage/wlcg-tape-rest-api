package org.wlcg.storage.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.wlcg.storage.api.model.ErrorModel;



@RestControllerAdvice
public class ApiExceptionHandler {

  @ResponseStatus(code = HttpStatus.NOT_FOUND)
  @ExceptionHandler(NotFoundError.class)
  public ErrorModel handleNotFoundError(NotFoundError e) {
    ErrorModel error = new ErrorModel();
    error.setError(HttpStatus.NOT_FOUND.name());
    error.setErrorDescription(e.getMessage());
    return error;
  }

  @ResponseStatus(code = HttpStatus.NOT_IMPLEMENTED)
  @ExceptionHandler(NotImplementedError.class)
  public ErrorModel handleNotImplementedError(NotImplementedError e) {
    ErrorModel error = new ErrorModel();
    error.setError(HttpStatus.NOT_IMPLEMENTED.name());
    error.setErrorDescription(e.getMessage());
    return error;
  }
}
