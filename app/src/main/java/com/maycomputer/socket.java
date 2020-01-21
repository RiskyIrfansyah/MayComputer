package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "socket_table")
public class socket
{

    @PrimaryKey
    public int  no_socket;

    @ColumnInfo(name = "socket_name")
    public String nama_socket;

    @ForeignKey(entity = cpu.class, parentColumns = "no_cpu", childColumns = "jenis_cpu", onDelete = CASCADE)
    public int no_cpu;

    public int getNo_socket() {
        return no_socket;
    }

    public void setNo_socket(int no_socket) {
        this.no_socket = no_socket;
    }

    public String getNama_socket() {
        return nama_socket;
    }

    public void setNama_socket(String nama_socket) {
        this.nama_socket = nama_socket;
    }

    public int getNo_cpu() {
        return no_cpu;
    }

    public void setNo_cpu(int no_cpu) {
        this.no_cpu = no_cpu;
    }
}
