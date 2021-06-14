package org.wlcg.storage.api.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "fileinfo", description = "The **Fileinfo** bulk-request API")
@RequestMapping(path = "/v1/fileinfo")
public class FileinfoController extends BaseBulkRequestController {



}
