package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "ssd_table")
public class ssd
{
    @ForeignKey(entity = cpu.class, parentColumns = "no_socket", childColumns = "nama_socket", onDelete = CASCADE)
    public int no_socket;

    @PrimaryKey
    public int id_ssd;

    @ColumnInfo(name = "ssd_name")
    public String nama_ssd;

    @ColumnInfo(name = "ssd_price")
    public int harga_ssd;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public int getId_ssd() {
        return id_ssd;
    }

    public void setId_ssd(int id_ssd) {
        this.id_ssd = id_ssd;
    }

    public String getNama_ssd() {
        return nama_ssd;
    }

    public void setNama_ssd(String nama_ssd) {
        this.nama_ssd = nama_ssd;
    }

    public int getHarga_ssd() {
        return harga_ssd;
    }

    public void setHarga_ssd(int harga_ssd) {
        this.harga_ssd = harga_ssd;
    }
}
