package org.wlcg.storage.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.wlcg.storage.api.error.InvalidRequestError.InvalidParam;
import org.wlcg.storage.api.model.error.ErrorModel;
import org.wlcg.storage.api.model.error.InvalidParamModel;
import org.wlcg.storage.api.model.error.InvalidRequestErrorModel;



@RestControllerAdvice
public class ApiExceptionHandler {

  @ResponseStatus(code = HttpStatus.NOT_FOUND)
  @ExceptionHandler(NotFoundError.class)
  public ErrorModel handleNotFoundError(NotFoundError e) {
    ErrorModel error = new ErrorModel();
    error.setType("about:blank");
    error.setStatus(HttpStatus.NOT_FOUND.value());
    error.setTitle("The resource has not been found");
    error.setDetail(e.getMessage());
    return error;
  }

  @ResponseStatus(code = HttpStatus.NOT_IMPLEMENTED)
  @ExceptionHandler(NotImplementedError.class)
  public ErrorModel handleNotImplementedError(NotImplementedError e) {
    ErrorModel error = new ErrorModel();
    error.setType("about:blank");
    error.setStatus(HttpStatus.NOT_IMPLEMENTED.value());
    error.setTitle("This functionality has not been implemented yet");
    error.setDetail(e.getMessage());
    return error;
  }
  
  @ResponseStatus(code = HttpStatus.BAD_REQUEST)
  @ExceptionHandler(InvalidRequestError.class)
  public InvalidRequestErrorModel handleInvalidRequestError(InvalidRequestError e) {
    InvalidRequestErrorModel error = new InvalidRequestErrorModel();
    error.setType("about:blank");
    error.setStatus(HttpStatus.BAD_REQUEST.value());
    error.setTitle("The request provided is invalid");
    error.setDetail(e.getMessage());
    for(InvalidParam invalidParam: e.getInvalidParameters()) {
      error.addInvalidParam(new InvalidParamModel(invalidParam.getName(),invalidParam.getReason()));
    }
    return error;
  }
 
}
