package org.openapitools.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

//APIコントローラー（手動作成部分）
@RestController
public class HelloApiController implements HelloApi {
    @Override
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello");
    }
}