package com.mikeescom.facadepattern;

public class ComputerFacade {
    private static final long BOOT_ADDRESS = 15165L;
    private static final long BOOT_SECTOR = 5156556L;
    private static final int SECTOR_SIZE = 60;

    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
