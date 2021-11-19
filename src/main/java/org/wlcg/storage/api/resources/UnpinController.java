package org.wlcg.storage.api.resources;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.wlcg.storage.api.model.ListResponseModel;
import org.wlcg.storage.api.model.RequestStatusType;
import org.wlcg.storage.api.model.unpin.CreatedUnpinBulkRequestModel;
import org.wlcg.storage.api.model.unpin.UnpinBulkRequestModel;
import org.wlcg.storage.api.model.unpin.UnpinBulkRequestStatusModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "unpin", description = "The **Unpin** bulk-request API")
@RequestMapping(path = "/api/v1/unpin")
public class UnpinController extends BaseBulkRequestController {
  
  private static class ObjectFixture {
    
    private static String UNPIN_ACCESS_URL = "https://tape-rest-api.cern.ch/api/v1/unpin/";
    
    public static CreatedUnpinBulkRequestModel getDefaultCreatedRequestModel(UnpinBulkRequestModel request) {
      CreatedUnpinBulkRequestModel ret = new CreatedUnpinBulkRequestModel("93be38df-435c-4322-801d-b95e77ac5bbc", request);
      ret.setAccessURL(UNPIN_ACCESS_URL + ret.getId());
      return ret;
    }
    
    public static UnpinBulkRequestStatusModel getDefaultUnpinRequestStatus() {
      UnpinBulkRequestStatusModel ret = new UnpinBulkRequestStatusModel();
      ret.setId("93be38df-435c-4322-801d-b95e77ac5bbc");
      UnpinBulkRequestModel userRequest = new UnpinBulkRequestModel();
      userRequest.addPath("/test/file.txt");
      userRequest.addPath("/test/file2.txt");
      ret.setRequest(userRequest);
      ret.addNonUnpinnedFile(userRequest.getPaths().get(1));
      ret.addUnpinnedFile(userRequest.getPaths().get(0));
      return ret;
    }
  }
  
  @GetMapping
  @Operation(summary = "Returns requests currently active in the system, potentially filtering by request status")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ListResponseModel.class))),
  })
  public ListResponseModel<URL> findRequests(@RequestParam(required = false) RequestStatusType[] status) {
    return BaseBulkRequestController.ObjectFixture.getDefaultListResponseModel("unpin");
  }
  
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  @Operation(summary = "Creates a request")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "201", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CreatedUnpinBulkRequestModel.class)))
  })
  public CreatedUnpinBulkRequestModel createRequest(@RequestBody UnpinBulkRequestModel request, HttpServletRequest httpRequest ,HttpServletResponse response) {
    return ObjectFixture.getDefaultCreatedRequestModel(request);
  }
  
  @GetMapping(value = "/{id}")
  @Operation(summary = "Returns the status of a request")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "201", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UnpinBulkRequestStatusModel.class)))
  })
  public UnpinBulkRequestStatusModel getRequestStatus(@PathVariable String id) {
    return ObjectFixture.getDefaultUnpinRequestStatus();
  }

}
