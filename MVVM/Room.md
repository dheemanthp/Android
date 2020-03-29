Please use the below annotations
```
@DataBase , example MusicDatabase extends RoomDataBase
@Dao ,Data Access Objects are the main interface or abstract classes where you define your database interactions. They can include a variety of query methods.
@Entity , example Song Data Class
@PrimaryKey , example SongID
@Query -> you can write the actual DataBase queries , example @Query("SELECT * FROM Song)
```
