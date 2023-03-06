package com.fission.sampleproject.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.fission.sampleproject.data.entity.UserEntity

@Dao
interface UserDao : BaseDao<UserEntity> {
    @Query("SELECT * from user")
    fun getUser(): List<UserEntity>
}
