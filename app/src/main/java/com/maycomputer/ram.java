package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "ram_table")
public class ram
{
    @ForeignKey(entity = cpu.class, parentColumns = "no_socket", childColumns = "nama_socket", onDelete = CASCADE)
    public int no_socket;

    @PrimaryKey
    public int id_ram;

    @ColumnInfo(name = "ram_name")
    public String nama_ram;

    @ColumnInfo(name = "ram_price")
    public int harga_ram;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public int getId_ram() {
        return id_ram;
    }

    public void setId_ram(int id_ram) {
        this.id_ram = id_ram;
    }

    public String getNama_ram() {
        return nama_ram;
    }

    public void setNama_ram(String nama_ram) {
        this.nama_ram = nama_ram;
    }

    public int getHarga_ram() {
        return harga_ram;
    }

    public void setHarga_ram(int harga_ram) {
        this.harga_ram = harga_ram;
    }
}
