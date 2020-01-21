package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "hdd_table")
public class hdd
{
    @ForeignKey(entity = cpu.class, parentColumns = "no_socket", childColumns = "nama_socket", onDelete = CASCADE)
    public int no_socket;

    @PrimaryKey
    public int id_hdd;

    @ColumnInfo(name = "hdd_name")
    public String nama_hdd;

    @ColumnInfo(name = "hdd_price")
    public int harga_hdd;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public int getId_hdd() {
        return id_hdd;
    }

    public void setId_hdd(int id_hdd) {
        this.id_hdd = id_hdd;
    }

    public String getNama_hdd() {
        return nama_hdd;
    }

    public void setNama_hdd(String nama_hdd) {
        this.nama_hdd = nama_hdd;
    }

    public int getHarga_hdd() {
        return harga_hdd;
    }

    public void setHarga_hdd(int harga_hdd) {
        this.harga_hdd = harga_hdd;
    }
}
