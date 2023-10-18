package com.Amelius.DistFileStoreNode.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileChunk {
    private String chunkId;
    private byte[] chunkData;
    private long chunkSize;
    private int order;
}
