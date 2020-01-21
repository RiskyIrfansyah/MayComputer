package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "processor_table")
public class processor
{

    @ForeignKey(entity = cpu.class, parentColumns = "no_socket", childColumns = "nama_socket", onDelete = CASCADE)
    public int no_socket;

    @PrimaryKey
    public int no_processor;

    @ColumnInfo(name = "processor_name")
    public String nama_processor;

    @ColumnInfo(name = "processor_price")
    public int harga_processor;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public int getNo_processor() {
        return no_processor;
    }

    public void setNo_processor(int no_processor) {
        this.no_processor = no_processor;
    }

    public String getNama_processor() {
        return nama_processor;
    }

    public void setNama_processor(String nama_processor) {
        this.nama_processor = nama_processor;
    }

    public int getHarga_processor() {
        return harga_processor;
    }

    public void setHarga_processor(int harga_processor) {
        this.harga_processor = harga_processor;
    }
}
