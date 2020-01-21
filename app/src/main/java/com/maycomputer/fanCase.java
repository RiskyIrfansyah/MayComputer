package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "fanCase_table")
public class fanCase
{
    @PrimaryKey
    public int id_fanCase;

    @ColumnInfo(name = "fanCase_name")
    public String nama_fanCase;

    @ColumnInfo(name = "fanCase_price")
    public int harga_fanCase;

    public int getId_fanCase() {
        return id_fanCase;
    }

    public void setId_fanCase(int id_fanCase) {
        this.id_fanCase = id_fanCase;
    }

    public String getNama_fanCase() {
        return nama_fanCase;
    }

    public void setNama_fanCase(String nama_fanCase) {
        this.nama_fanCase = nama_fanCase;
    }

    public int getHarga_fanCase() {
        return harga_fanCase;
    }

    public void setHarga_fanCase(int harga_fanCase) {
        this.harga_fanCase = harga_fanCase;
    }
}
