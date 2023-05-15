package org.wlcg.storage.api.error;

import java.util.ArrayList;
import java.util.List;

public class InvalidRequestError extends ApiError {

    public class InvalidParam {
      
      String name;
      String reason;
      
      public String getName() {
        return name;
      }
      
      public void setName(String name) {
        this.name = name;
      }
      
      public String getReason() {
        return reason;
      }
      
      public void setReason(String reason) {
        this.reason = reason;
      }
    }
    
    private static final long serialVersionUID = 1L;

    private List<InvalidParam> invalidParameters;
    
    public InvalidRequestError(String message) {
      super(message);
      this.invalidParameters = new ArrayList<InvalidRequestError.InvalidParam>();
    }
    
    public void addInvalidParameter(InvalidParam invalidParameter) {
      this.invalidParameters.add(invalidParameter);
    }
    
    public List<InvalidParam> getInvalidParameters(){
      return this.invalidParameters;
    }
    
    
}
