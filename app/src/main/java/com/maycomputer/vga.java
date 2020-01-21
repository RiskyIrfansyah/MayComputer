package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "vga_table")
public class vga
{
    @ForeignKey(entity = cpu.class, parentColumns = "no_socket", childColumns = "nama_socket", onDelete = CASCADE)
    public int no_socket;

    @PrimaryKey
    public int id_vga;

    @ColumnInfo(name = "vga_name")
    public String nama_vga;

    @ColumnInfo(name = "vga_price")
    public int harga_vga;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public int getId_vga() {
        return id_vga;
    }

    public void setId_vga(int id_vga) {
        this.id_vga = id_vga;
    }

    public String getNama_vga() {
        return nama_vga;
    }

    public void setNama_vga(String nama_vga) {
        this.nama_vga = nama_vga;
    }

    public int getHarga_vga() {
        return harga_vga;
    }

    public void setHarga_vga(int harga_vga) {
        this.harga_vga = harga_vga;
    }
}
