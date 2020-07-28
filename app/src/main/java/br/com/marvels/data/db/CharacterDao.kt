package br.com.marvels.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import br.com.marvels.data.models.Character

@Dao
interface CharacterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: Character): Long

    @Query("SELECT * FROM characters")
    fun getAllCharacters(): LiveData<List<Character>>

    @Delete
    suspend fun deleteCharacter(character: Character)
}