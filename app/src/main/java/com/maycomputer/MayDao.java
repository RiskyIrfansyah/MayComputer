package com.maycomputer;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface MayDao
{
    @Insert
    public void addprocessor(processor proce);
}
