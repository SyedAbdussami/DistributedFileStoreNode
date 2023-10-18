package com.Amelius.DistFileStoreNode.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NodeRegistrationResponse {
    private String nodeName;

    private String nodeId;

    private int capacity;

    private int fileBlocks;

    private int port;
    private String nodeStatus;

    private String address;
}
