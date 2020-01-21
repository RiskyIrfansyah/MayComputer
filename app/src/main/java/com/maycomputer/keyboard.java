package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "keyboard_table")
public class keyboard
{
    @PrimaryKey
    public int id_keyboard;

    @ColumnInfo(name = "keyboard_name")
    public String nama_keyboard;

    @ColumnInfo(name = "keyboard_price")
    public int harga_keyboard;

    public int getId_keyboard() {
        return id_keyboard;
    }

    public void setId_keyboard(int id_keyboard) {
        this.id_keyboard = id_keyboard;
    }

    public String getNama_keyboard() {
        return nama_keyboard;
    }

    public void setNama_keyboard(String nama_keyboard) {
        this.nama_keyboard = nama_keyboard;
    }

    public int getHarga_keyboard() {
        return harga_keyboard;
    }

    public void setHarga_keyboard(int harga_keyboard) {
        this.harga_keyboard = harga_keyboard;
    }
}
