package com.Amelius.DistFileStoreNode.Controllers;


import com.Amelius.DistFileStoreNode.Models.FileChunk;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @PostMapping("/receive")
    private void getFileData(@RequestBody FileChunk fileChunk){
        System.out.println(fileChunk.getChunkId());
        System.out.println(fileChunk.getChunkSize());
        System.out.println(fileChunk.getOrder());
        System.out.println(new String(fileChunk.getChunkData()));
    }
}
