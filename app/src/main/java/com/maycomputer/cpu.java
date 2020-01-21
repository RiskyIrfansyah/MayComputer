package com.maycomputer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "cpu_table")
public class cpu
{
    @PrimaryKey
    public int no_cpu;

    @ColumnInfo(name = "cpu_name")
    public String jenis_cpu;

    public int getNo_cpu() {
        return no_cpu;
    }

    public void setNo_cpu(int no_cpu) {
        this.no_cpu = no_cpu;
    }

    public String getJenis_cpu() {
        return jenis_cpu;
    }

    public void setJenis_cpu(String jenis_cpu) {
        this.jenis_cpu = jenis_cpu;
    }
}
