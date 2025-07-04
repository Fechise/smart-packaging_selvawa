package com.smartPackaging.selvawa.game.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.smartPackaging.selvawa.game.DAO.ImageQuestionDAO
import com.smartPackaging.selvawa.game.DAO.MultipleChoiceQuestionDAO
import com.smartPackaging.selvawa.game.DAO.TrueFalseOrQuestionDAO
import com.smartPackaging.selvawa.game.entity.EntityImageQuestion
import com.smartPackaging.selvawa.game.entity.EntityMultipleChoiceQuestion
import com.smartPackaging.selvawa.game.entity.EntityTrueOrFalseQuestion


@Database(
    entities = [EntityMultipleChoiceQuestion::class,
        EntityTrueOrFalseQuestion::class,
        EntityImageQuestion::class], version = 2
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun multipleChoiceQuestionDAO(): MultipleChoiceQuestionDAO
    abstract fun trueFalseQuestionDAO(): TrueFalseOrQuestionDAO
    abstract fun imageQuestionDAO(): ImageQuestionDAO
}