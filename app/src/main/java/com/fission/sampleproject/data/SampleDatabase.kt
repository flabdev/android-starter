package com.fission.sampleproject.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fission.sampleproject.data.dao.UserDao
import com.fission.sampleproject.data.entity.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class SampleDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object {
        private var INSTANCE: SampleDatabase? = null

        fun getAppDataBase(context: Context): SampleDatabase? {
            val dbName = "sampledatabase.db"
            if (INSTANCE == null) {
                Room.databaseBuilder(
                    context.applicationContext,
                    SampleDatabase::class.java,
                    dbName
                ).build()
            }
            return INSTANCE
        }
    }

    fun clearDatabase() {
        INSTANCE?.runInTransaction {
            INSTANCE?.clearAllTables()
        }
    }
}
