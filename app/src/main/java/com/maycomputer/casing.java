package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "casing_table")
public class casing
{
    @PrimaryKey
    public int id_casing;

    @ColumnInfo(name = "casing_name")
    public String nama;

    @ColumnInfo(name = "casing_price")
    public int harga_casing;

    public int getId_casing() {
        return id_casing;
    }

    public void setId_casing(int id_casing) {
        this.id_casing = id_casing;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga_casing() {
        return harga_casing;
    }

    public void setHarga_casing(int harga_casing) {
        this.harga_casing = harga_casing;
    }
}
