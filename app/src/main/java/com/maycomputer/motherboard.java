package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "motherboard_table")
public class motherboard
{

    @ForeignKey(entity = cpu.class, parentColumns = "no_socket", childColumns = "nama_socket", onDelete = CASCADE)
    public int no_socket;

    @PrimaryKey
    public int id_motherboard;

    @ColumnInfo(name = "motherboard_name")
    public String nama_motherboard;

    @ColumnInfo(name = "motherboard_price")
    public int harga_motherboard;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public int getId_motherboard() {
        return id_motherboard;
    }

    public void setId_motherboard(int id_motherboard) {
        this.id_motherboard = id_motherboard;
    }

    public String getNama_motherboard() {
        return nama_motherboard;
    }

    public void setNama_motherboard(String nama_motherboard) {
        this.nama_motherboard = nama_motherboard;
    }

    public int getHarga_motherboard() {
        return harga_motherboard;
    }

    public void setHarga_motherboard(int harga_motherboard) {
        this.harga_motherboard = harga_motherboard;
    }
}
