package org.wlcg.storage.api.resources;

import java.net.URL;
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
import org.wlcg.storage.api.model.BulkRequestModel;
import org.wlcg.storage.api.model.CreatedBulkRequestModel;
import org.wlcg.storage.api.model.ListResponseModel;
import org.wlcg.storage.api.model.RequestStatusType;
import org.wlcg.storage.api.model.fileinfo.ChecksumModel;
import org.wlcg.storage.api.model.fileinfo.FileInfoBulkRequestModel;
import org.wlcg.storage.api.model.fileinfo.FileInfoBulkRequestStatusModel;
import org.wlcg.storage.api.model.fileinfo.FileInfoModel;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "fileinfo", description = "The **Fileinfo** bulk-request API")
@RequestMapping(path = "/v1/fileinfo")
public class FileinfoController extends BaseBulkRequestController {
  
  /**
   * class that creates objects for API response simulation
   */
  private static class ObjectFixture {
    
    public static CreatedBulkRequestModel getDefaultCreatedRequest(BulkRequestModel request) {
      CreatedBulkRequestModel ret = new CreatedBulkRequestModel("93be38df-435c-4322-801d-b95e77ac5bbc", request);
      ret.setAccessURL("/api/v1/fileinfo/" + ret.getId());
      ret.setNumTargets(request.getPaths().size());
      return ret;
    }
    
    public static FileInfoBulkRequestStatusModel getDefaultFileInfoStatus() {
      FileInfoBulkRequestStatusModel ret = new FileInfoBulkRequestStatusModel();
      FileInfoBulkRequestModel bulkRequest = new FileInfoBulkRequestModel();
      String path1 = "/test/file.txt";
      String path2 = "/test/file.txt2";
      bulkRequest.getPaths().add(path1);
      bulkRequest.getPaths().add(path2);
      ret.setId("93be38df-435c-4322-801d-b95e77ac5bbc");
      ret.setRequest(bulkRequest);
      ret.setNumProcessed(2);
      List<FileInfoModel> fileInfos = ret.getFileInformation();
      FileInfoModel file1 = new FileInfoModel();
      file1.setPath(path1);
      file1.setExists(true);
      file1.setOnDisk(true);
      file1.setOnTape(false);
      file1.getChecksums().add(new ChecksumModel("adler32","file1checksumadler32"));
      fileInfos.add(file1);
      FileInfoModel file2 = new FileInfoModel();
      file2.setPath(path2);
      file2.setExists(true);
      file2.setOnDisk(true);
      file2.setOnTape(false);
      file2.getChecksums().add(new ChecksumModel("adler32","file2checksumadler32"));
      fileInfos.add(file2);
      return ret;
    }
    
  }
  
  @GetMapping
  @Operation(summary = "Returns requests currently active in the system, potentially filtering by request status")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ListResponseModel.class))),
  })
  public ListResponseModel<URL> findRequests(@RequestParam(required = false) RequestStatusType[] status) {
    return BaseBulkRequestController.ObjectFixture.getDefaultListResponseModel("fileinfo");
  }
	
  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  @Operation(summary = "Creates a request")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CreatedBulkRequestModel.class)))
  })
  public CreatedBulkRequestModel createRequest(@RequestBody FileInfoBulkRequestModel request, HttpServletRequest httpRequest ,HttpServletResponse response) {
    return ObjectFixture.getDefaultCreatedRequest(request);
  }
  
	@GetMapping(value = "/{id}")
	@Operation(summary = "Returns the status of a request")
	@ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FileInfoBulkRequestStatusModel.class)))
  })
	public FileInfoBulkRequestStatusModel getRequestStatus(@PathVariable String id) {
	  return ObjectFixture.getDefaultFileInfoStatus();
	}
	
}
