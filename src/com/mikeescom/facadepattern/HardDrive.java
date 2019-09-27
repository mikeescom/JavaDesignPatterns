package com.mikeescom.facadepattern;

import java.nio.ByteBuffer;

public class HardDrive {
    public byte[] read(long lba, int size) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(lba);
        return buffer.array();
    }
}
