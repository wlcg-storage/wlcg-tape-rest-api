package org.wlcg.storage.api.resources;




import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "unpin", description = "The **Unpin** bulk-request API")
@RequestMapping(path = "/v1/unpin")
public class UnpinController extends BaseBulkRequestController {

}
