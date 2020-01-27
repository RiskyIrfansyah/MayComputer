package com.maycomputer;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {casing.class, cpu.class, cpuCooler.class, fanCase.class, hdd.class, keyboard.class, monitor.class, motherboard.class, mouse.class, processor.class, psu.class, ram.class, socket.class, ssd.class, vga.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MayDao mayDao();
}
