package com.knob.simplealarmclock;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.knob.simplealarmclock.data.Alarm;

import java.util.List;

    @Dao
    public interface AlarmDao {

    @Insert
    void insert(Alarm alarm);

    @Query("DELETE FROM alarm_table")
    void deleteAll();

    @Query("SELECT * FROM alarm_table ORDER BY created ASC")
    LiveData<List<Alarm>> getAlarms();

    @Update
    void update(Alarm alarm);
}
