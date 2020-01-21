package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "monitor_table")
public class monitor
{
    @PrimaryKey
    public int id_monitor;

    @ColumnInfo(name = "monitor_name")
    public String nama_monitor;

    @ColumnInfo(name = "monitor_price")
    public int harga_monitor;

    public int getId_monitor() {
        return id_monitor;
    }

    public void setId_monitor(int id_monitor) {
        this.id_monitor = id_monitor;
    }

    public String getNama_monitor() {
        return nama_monitor;
    }

    public void setNama_monitor(String nama_monitor) {
        this.nama_monitor = nama_monitor;
    }

    public int getHarga_monitor() {
        return harga_monitor;
    }

    public void setHarga_monitor(int harga_monitor) {
        this.harga_monitor = harga_monitor;
    }
}
