package com.Amelius.DistFileStoreNode.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NodeRegistrationRequest {

    private String nodeName;

    private int capacity;

    private int fileBlocks;

    private int port;

    private String address;
}
