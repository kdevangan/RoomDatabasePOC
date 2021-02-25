package com.google.roomdatebasepoc.room_database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM UserDetailModel")
    List<UserDetailModel> getAll();

/*
    @Query("SELECT * FROM ")
    List<UserDetailModel> getAllUser(int[] userIds);
*/

    /*@Query("SELECT * FROM UserDetailModel WHERE firstName LIKE :first AND " +
            "lastName LIKE :last LIMIT 1")
    UserDetailModel findByName(String first, String last);*/

    @Insert
    void insertUser(UserDetailModel user);

    @Delete
    void delete(UserDetailModel user);

    @Update
    void updateUser(UserDetailModel model);

}
