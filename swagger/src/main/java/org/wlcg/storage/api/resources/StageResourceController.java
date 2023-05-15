package org.wlcg.storage.api.resources;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
import org.wlcg.storage.api.error.NotImplementedError;
import org.wlcg.storage.api.model.FileStatusModel;
import org.wlcg.storage.api.model.ListResponseModel;
import org.wlcg.storage.api.model.RequestStatusType;
import org.wlcg.storage.api.model.stage.CreatedStageBulkRequestModel;
import org.wlcg.storage.api.model.stage.File;
import org.wlcg.storage.api.model.stage.Metadata;
import org.wlcg.storage.api.model.stage.StageBulkRequestModel;
import org.wlcg.storage.api.model.stage.StageBulkRequestStatusModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "stage", description = "The **Stage** bulk-request API")
@RequestMapping(path = "/api/v1/stage")
public class StageResourceController extends BaseBulkRequestController {

  private static class ObjectFixture {
   
    
    public static StageBulkRequestStatusModel getDefautBulkRequestStatus() {
      StageBulkRequestStatusModel ret = new StageBulkRequestStatusModel();
      ret.setId("93be38df-435c-4322-801d-b95e77ac5bbc");
      StageBulkRequestModel bulkRequest = new StageBulkRequestModel();
      Metadata metadata = new Metadata("eoscta.cern.ch");
      metadata.addData("activity", "atlasdaq");
      File file1 = new File("/test/file.txt");
      File file2 = new File("/test/file2.txt");
      file1.getMetadata().add(metadata);
      file2.getMetadata().add(metadata);
      bulkRequest.getFiles().add(file1);
      bulkRequest.getFiles().add(file2);
      ret.setRequest(bulkRequest);
      List<String> pathsStaged = new ArrayList<String>();
      pathsStaged.add(bulkRequest.getFiles().get(0).getPath());
      ret.setPathsStaged(pathsStaged);
      List<FileStatusModel> failures = new ArrayList<FileStatusModel>();
      FileStatusModel failure = new FileStatusModel();
      failure.setPath(bulkRequest.getFiles().get(1).getPath());
      failure.setReason("Tape backend is unreachable");
      failures.add(failure);
      ret.setFailures(failures);
      ret.setStatus(RequestStatusType.COMPLETED);
      return ret;
    }
    
    public static CreatedStageBulkRequestModel getDefaultCreatedBulkRequestModel(StageBulkRequestModel request) {
      CreatedStageBulkRequestModel createdRequest = new CreatedStageBulkRequestModel("93be38df-435c-4322-801d-b95e77ac5bb", request);
      createdRequest.setAccessURL("https://tape-rest-api.cern.ch/api/v1/stage/" + createdRequest.getId());
      return createdRequest;
    }
  }
  
  @GetMapping
  @Operation(summary = "Returns requests currently active in the system, potentially filtering by request status")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ListResponseModel.class))),
  })
  public ListResponseModel<URL> findRequests(@RequestParam(required = false) RequestStatusType[] status) {
    return BaseBulkRequestController.ObjectFixture.getDefaultListResponseModel("stage");
  }
  
  @PostMapping(value = "/{id}/cancel")
  @Operation(summary = "Cancels a equest")
  @ResponseStatus(code = HttpStatus.NO_CONTENT)
  public void cancelRequest(@PathVariable String id) {
    throw new NotImplementedError();
  }
  
  @GetMapping(value = "/{id}")
  @ResponseStatus(code = HttpStatus.CREATED)
  @Operation(summary = "Returns the status of a request")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = StageBulkRequestStatusModel.class)))
  })
  public StageBulkRequestStatusModel getRequestStatus(@PathVariable String id) {
    return ObjectFixture.getDefautBulkRequestStatus();
  }

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  @Operation(summary = "Creates a stage bulk request")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "201", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CreatedStageBulkRequestModel.class)))
  })
  public CreatedStageBulkRequestModel createRequest(@RequestBody StageBulkRequestModel request, HttpServletRequest httpRequest ,HttpServletResponse response) {
    return ObjectFixture.getDefaultCreatedBulkRequestModel(request);
  }
  
}
