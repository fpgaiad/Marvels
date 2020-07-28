package br.com.marvels.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.marvels.data.models.Character

private const val DATABASE = "characters"

@Database(
    entities = [Character::class],
    version = 1
)
abstract class CharacterDatabase : RoomDatabase() {

    abstract fun getCharacterDao(): CharacterDao

    companion object {
        @Volatile
        private var instance: CharacterDatabase? = null

        fun getInstance(context: Context): CharacterDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): CharacterDatabase {
            return Room.databaseBuilder(context, CharacterDatabase::class.java, DATABASE)
                .build()
        }
    }
}