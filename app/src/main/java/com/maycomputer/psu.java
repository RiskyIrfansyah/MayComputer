package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "psu_table")
public class psu
{
    @ForeignKey(entity = cpu.class, parentColumns = "no_socket", childColumns = "nama_socket", onDelete = CASCADE)
    public int no_socket;

    @PrimaryKey
    public int id_psu;

    @ColumnInfo(name = "psu_name")
    public String nama_psu;

    @ColumnInfo(name = "psu_price")
    public int harga_psu;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public int getId_psu() {
        return id_psu;
    }

    public void setId_psu(int id_psu) {
        this.id_psu = id_psu;
    }

    public String getNama_psu() {
        return nama_psu;
    }

    public void setNama_psu(String nama_psu) {
        this.nama_psu = nama_psu;
    }

    public int getHarga_psu() {
        return harga_psu;
    }

    public void setHarga_psu(int harga_psu) {
        this.harga_psu = harga_psu;
    }
}
