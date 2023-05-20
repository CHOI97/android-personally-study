package com.example.kotlin_modern_kakao_book_api.data.db;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.kotlin_modern_kakao_book_api.data.model.Book;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class BookSearchDao_Impl implements BookSearchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Book> __insertionAdapterOfBook;

  private final OrmConverter __ormConverter = new OrmConverter();

  private final EntityDeletionOrUpdateAdapter<Book> __deletionAdapterOfBook;

  public BookSearchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBook = new EntityInsertionAdapter<Book>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `books` (`authors`,`contents`,`datetime`,`isbn`,`price`,`publisher`,`sale_price`,`status`,`thumbnail`,`title`,`translators`,`url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Book value) {
        final String _tmp = __ormConverter.fromList(value.getAuthors());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        if (value.getContents() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContents());
        }
        if (value.getDatetime() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDatetime());
        }
        if (value.getIsbn() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getIsbn());
        }
        stmt.bindLong(5, value.getPrice());
        if (value.getPublisher() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPublisher());
        }
        stmt.bindLong(7, value.getSalePrice());
        if (value.getStatus() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getStatus());
        }
        if (value.getThumbnail() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getThumbnail());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTitle());
        }
        final String _tmp_1 = __ormConverter.fromList(value.getTranslators());
        if (_tmp_1 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_1);
        }
        if (value.getUrl() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getUrl());
        }
      }
    };
    this.__deletionAdapterOfBook = new EntityDeletionOrUpdateAdapter<Book>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `books` WHERE `isbn` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Book value) {
        if (value.getIsbn() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getIsbn());
        }
      }
    };
  }

  @Override
  public Object insertBook(final Book book, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfBook.insert(book);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteBook(final Book book, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfBook.handle(book);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Book>> getFavoriteBooks() {
    final String _sql = "SELECT * FROM books";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"books"}, new Callable<List<Book>>() {
      @Override
      public List<Book> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAuthors = CursorUtil.getColumnIndexOrThrow(_cursor, "authors");
          final int _cursorIndexOfContents = CursorUtil.getColumnIndexOrThrow(_cursor, "contents");
          final int _cursorIndexOfDatetime = CursorUtil.getColumnIndexOrThrow(_cursor, "datetime");
          final int _cursorIndexOfIsbn = CursorUtil.getColumnIndexOrThrow(_cursor, "isbn");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(_cursor, "publisher");
          final int _cursorIndexOfSalePrice = CursorUtil.getColumnIndexOrThrow(_cursor, "sale_price");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfTranslators = CursorUtil.getColumnIndexOrThrow(_cursor, "translators");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final List<Book> _result = new ArrayList<Book>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Book _item;
            final List<String> _tmpAuthors;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfAuthors)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfAuthors);
            }
            _tmpAuthors = __ormConverter.toList(_tmp);
            final String _tmpContents;
            if (_cursor.isNull(_cursorIndexOfContents)) {
              _tmpContents = null;
            } else {
              _tmpContents = _cursor.getString(_cursorIndexOfContents);
            }
            final String _tmpDatetime;
            if (_cursor.isNull(_cursorIndexOfDatetime)) {
              _tmpDatetime = null;
            } else {
              _tmpDatetime = _cursor.getString(_cursorIndexOfDatetime);
            }
            final String _tmpIsbn;
            if (_cursor.isNull(_cursorIndexOfIsbn)) {
              _tmpIsbn = null;
            } else {
              _tmpIsbn = _cursor.getString(_cursorIndexOfIsbn);
            }
            final int _tmpPrice;
            _tmpPrice = _cursor.getInt(_cursorIndexOfPrice);
            final String _tmpPublisher;
            if (_cursor.isNull(_cursorIndexOfPublisher)) {
              _tmpPublisher = null;
            } else {
              _tmpPublisher = _cursor.getString(_cursorIndexOfPublisher);
            }
            final int _tmpSalePrice;
            _tmpSalePrice = _cursor.getInt(_cursorIndexOfSalePrice);
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final String _tmpThumbnail;
            if (_cursor.isNull(_cursorIndexOfThumbnail)) {
              _tmpThumbnail = null;
            } else {
              _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final List<String> _tmpTranslators;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfTranslators)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfTranslators);
            }
            _tmpTranslators = __ormConverter.toList(_tmp_1);
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item = new Book(_tmpAuthors,_tmpContents,_tmpDatetime,_tmpIsbn,_tmpPrice,_tmpPublisher,_tmpSalePrice,_tmpStatus,_tmpThumbnail,_tmpTitle,_tmpTranslators,_tmpUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public PagingSource<Integer, Book> getFavoritePagingBooks() {
    final String _sql = "SELECT * FROM books";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<Book>(_statement, __db, "books") {
      @Override
      protected List<Book> convertRows(Cursor cursor) {
        final int _cursorIndexOfAuthors = CursorUtil.getColumnIndexOrThrow(cursor, "authors");
        final int _cursorIndexOfContents = CursorUtil.getColumnIndexOrThrow(cursor, "contents");
        final int _cursorIndexOfDatetime = CursorUtil.getColumnIndexOrThrow(cursor, "datetime");
        final int _cursorIndexOfIsbn = CursorUtil.getColumnIndexOrThrow(cursor, "isbn");
        final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(cursor, "price");
        final int _cursorIndexOfPublisher = CursorUtil.getColumnIndexOrThrow(cursor, "publisher");
        final int _cursorIndexOfSalePrice = CursorUtil.getColumnIndexOrThrow(cursor, "sale_price");
        final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(cursor, "status");
        final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(cursor, "thumbnail");
        final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(cursor, "title");
        final int _cursorIndexOfTranslators = CursorUtil.getColumnIndexOrThrow(cursor, "translators");
        final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
        final List<Book> _result = new ArrayList<Book>(cursor.getCount());
        while(cursor.moveToNext()) {
          final Book _item;
          final List<String> _tmpAuthors;
          final String _tmp;
          if (cursor.isNull(_cursorIndexOfAuthors)) {
            _tmp = null;
          } else {
            _tmp = cursor.getString(_cursorIndexOfAuthors);
          }
          _tmpAuthors = __ormConverter.toList(_tmp);
          final String _tmpContents;
          if (cursor.isNull(_cursorIndexOfContents)) {
            _tmpContents = null;
          } else {
            _tmpContents = cursor.getString(_cursorIndexOfContents);
          }
          final String _tmpDatetime;
          if (cursor.isNull(_cursorIndexOfDatetime)) {
            _tmpDatetime = null;
          } else {
            _tmpDatetime = cursor.getString(_cursorIndexOfDatetime);
          }
          final String _tmpIsbn;
          if (cursor.isNull(_cursorIndexOfIsbn)) {
            _tmpIsbn = null;
          } else {
            _tmpIsbn = cursor.getString(_cursorIndexOfIsbn);
          }
          final int _tmpPrice;
          _tmpPrice = cursor.getInt(_cursorIndexOfPrice);
          final String _tmpPublisher;
          if (cursor.isNull(_cursorIndexOfPublisher)) {
            _tmpPublisher = null;
          } else {
            _tmpPublisher = cursor.getString(_cursorIndexOfPublisher);
          }
          final int _tmpSalePrice;
          _tmpSalePrice = cursor.getInt(_cursorIndexOfSalePrice);
          final String _tmpStatus;
          if (cursor.isNull(_cursorIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = cursor.getString(_cursorIndexOfStatus);
          }
          final String _tmpThumbnail;
          if (cursor.isNull(_cursorIndexOfThumbnail)) {
            _tmpThumbnail = null;
          } else {
            _tmpThumbnail = cursor.getString(_cursorIndexOfThumbnail);
          }
          final String _tmpTitle;
          if (cursor.isNull(_cursorIndexOfTitle)) {
            _tmpTitle = null;
          } else {
            _tmpTitle = cursor.getString(_cursorIndexOfTitle);
          }
          final List<String> _tmpTranslators;
          final String _tmp_1;
          if (cursor.isNull(_cursorIndexOfTranslators)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = cursor.getString(_cursorIndexOfTranslators);
          }
          _tmpTranslators = __ormConverter.toList(_tmp_1);
          final String _tmpUrl;
          if (cursor.isNull(_cursorIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = cursor.getString(_cursorIndexOfUrl);
          }
          _item = new Book(_tmpAuthors,_tmpContents,_tmpDatetime,_tmpIsbn,_tmpPrice,_tmpPublisher,_tmpSalePrice,_tmpStatus,_tmpThumbnail,_tmpTitle,_tmpTranslators,_tmpUrl);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
