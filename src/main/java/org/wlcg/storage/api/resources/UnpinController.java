package org.wlcg.storage.api.resources;




import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.wlcg.storage.api.model.BulkRequestModel;
import org.wlcg.storage.api.model.BulkRequestStatusModel;
import org.wlcg.storage.api.model.CreatedBulkRequestModel;
import org.wlcg.storage.api.model.ListResponseModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "unpin", description = "The **Unpin** bulk-request API")
@RequestMapping(path = "/v1/unpin")
public class UnpinController extends BaseBulkRequestController {
  
  private static class ObjectFixture {
    public static ListResponseModel<URL>  getDefaultListResponseModel() {
      ListResponseModel<URL> ret  = new ListResponseModel<URL>();
      try {
        ret.getItems().add(new URL("https://api/v1/unpin/93be38df-435c-4322-801d-b95e77ac5bbc"));
      } catch (MalformedURLException e) {
        
      }
      return ret;
    }
    
    public static CreatedBulkRequestModel getDefaultCreatedRequestModel(BulkRequestModel request) {
      CreatedBulkRequestModel ret = new CreatedBulkRequestModel("93be38df-435c-4322-801d-b95e77ac5bbc", request);
      ret.setAccessURL("https://api/v1/unpin/" + ret.getId());
      return ret;
    }
    
    public static BulkRequestStatusModel getDefaultUnpinRequestStatus() {
      BulkRequestStatusModel ret = new BulkRequestStatusModel();
      ret.setId("93be38df-435c-4322-801d-b95e77ac5bbc");
      BulkRequestModel bulkRequest = new BulkRequestModel();
      bulkRequest.getPaths().add("/test/file.txt");
      bulkRequest.getPaths().add("/test/file2.txt");
      ret.setRequest(bulkRequest);
      ret.setNumProcessed(2);
      return ret;
    }
  }
  
  @GetMapping
  @Operation(summary = "Returns requests currently active in the system, potentially filtering by request status")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ListResponseModel.class))),
  })
  public ListResponseModel<URL> findRequests() {
    return ObjectFixture.getDefaultListResponseModel();
  }
  
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  @Operation(summary = "Creates a request")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CreatedBulkRequestModel.class)))
  })
  public CreatedBulkRequestModel createRequest(@RequestBody BulkRequestModel request, HttpServletRequest httpRequest ,HttpServletResponse response) {
    return ObjectFixture.getDefaultCreatedRequestModel(request);
  }
  
  @GetMapping(value = "/{id}")
  @Operation(summary = "Returns the status of a request")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = BulkRequestStatusModel.class)))
  })
  public BulkRequestStatusModel getRequestStatus(@PathVariable String id) {
    return ObjectFixture.getDefaultUnpinRequestStatus();
  }

}
