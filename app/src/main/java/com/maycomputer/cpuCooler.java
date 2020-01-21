package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "cpuCooler_table")
public class cpuCooler
{
    @PrimaryKey
    public int id_cooler;

    @ColumnInfo(name = "cooler_name")
    public String nama_cooler;

    public int getId_cooler() {
        return id_cooler;
    }

    @ColumnInfo(name = "cooler_price")
    public int harga_cooler;

    public void setId_cooler(int id_cooler) {
        this.id_cooler = id_cooler;
    }

    public String getNama_cooler() {
        return nama_cooler;
    }

    public void setNama_cooler(String nama_cooler) {
        this.nama_cooler = nama_cooler;
    }

    public int getHarga_cooler() {
        return harga_cooler;
    }

    public void setHarga_cooler(int harga_cooler) {
        this.harga_cooler = harga_cooler;
    }
}
