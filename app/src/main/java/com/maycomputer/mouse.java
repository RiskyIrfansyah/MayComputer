package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "mouse_table")
public class mouse
{
    @PrimaryKey
    public int id_mouse;

    @ColumnInfo(name = "mouse_name")
    public String nama_mouse;

    @ColumnInfo(name = "mouse_price")
    public int harga_mouse;

    public int getId_mouse() {
        return id_mouse;
    }

    public void setId_mouse(int id_mouse) {
        this.id_mouse = id_mouse;
    }

    public String getNama_mouse() {
        return nama_mouse;
    }

    public void setNama_mouse(String nama_mouse) {
        this.nama_mouse = nama_mouse;
    }

    public int getHarga_mouse() {
        return harga_mouse;
    }

    public void setHarga_mouse(int harga_mouse) {
        this.harga_mouse = harga_mouse;
    }
}
