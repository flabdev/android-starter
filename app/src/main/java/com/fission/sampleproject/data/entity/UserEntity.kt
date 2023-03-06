package com.fission.sampleproject.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class UserEntity {

    @ColumnInfo(name = "user_id")
    @PrimaryKey
    var userId: String = ""

    @ColumnInfo(name = "user_name")
    var userName: String = ""
}
