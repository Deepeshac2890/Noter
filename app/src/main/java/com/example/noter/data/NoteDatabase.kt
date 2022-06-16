package com.example.noter.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.noter.model.Note
import com.example.noter.utils.UUIDConvertor

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(UUIDConvertor::class)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}