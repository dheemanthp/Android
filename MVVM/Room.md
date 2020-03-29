Please use the below annotations
```
@DataBase , example MusicDatabase extends RoomDataBase
@Dao ,Data Access Objects are the main interface or abstract classes where you define your database interactions. They can include a variety of query methods.
@Entity , example Song Data Class
@PrimaryKey , example SongID
@Query -> you can write the actual DataBase queries , example @Query("SELECT * FROM Song)
```
In KOTLIN Using ROOM 2.1 "suspend is supported" , if you want to do a work Asynchronously you will add "Suspend" Keyword

```
In Room 2.1 Full TEXT search has been added
there is a MATCH keyword introduced , where you can do huge queries efficiently.
```
Database Views:
You can use views just like normal SQL
hence you can query the VIews as though they are normal Database

Expand RX support:
```
@Insert returns completable
The Completable class represents a deferred computation without any value but only indication for completion or exception.
@Update returns Single
The Single class implements the Reactive Pattern for a single value response.
Single behaves similarly to Observable except that it can only emit either a single successful value or an error (there is no "onComplete" notification as there is for an Observable).
@Query returns completable
The Completable class represents a deferred computation without any value but only indication for completion or exception.
```
