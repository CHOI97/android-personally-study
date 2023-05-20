package com.example.kotlin_modern_kakao_book_api.data.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class BookSearchDatabase_Impl extends BookSearchDatabase {
  private volatile BookSearchDao _bookSearchDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `books` (`authors` TEXT NOT NULL, `contents` TEXT NOT NULL, `datetime` TEXT NOT NULL, `isbn` TEXT NOT NULL, `price` INTEGER NOT NULL, `publisher` TEXT NOT NULL, `sale_price` INTEGER NOT NULL, `status` TEXT NOT NULL, `thumbnail` TEXT NOT NULL, `title` TEXT NOT NULL, `translators` TEXT NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`isbn`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd59d29a1f897afaeed25cd3f12076956')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `books`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsBooks = new HashMap<String, TableInfo.Column>(12);
        _columnsBooks.put("authors", new TableInfo.Column("authors", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("contents", new TableInfo.Column("contents", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("datetime", new TableInfo.Column("datetime", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("isbn", new TableInfo.Column("isbn", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("price", new TableInfo.Column("price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("publisher", new TableInfo.Column("publisher", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("sale_price", new TableInfo.Column("sale_price", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("thumbnail", new TableInfo.Column("thumbnail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("translators", new TableInfo.Column("translators", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBooks.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBooks = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBooks = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBooks = new TableInfo("books", _columnsBooks, _foreignKeysBooks, _indicesBooks);
        final TableInfo _existingBooks = TableInfo.read(_db, "books");
        if (! _infoBooks.equals(_existingBooks)) {
          return new RoomOpenHelper.ValidationResult(false, "books(com.example.kotlin_modern_kakao_book_api.data.model.Book).\n"
                  + " Expected:\n" + _infoBooks + "\n"
                  + " Found:\n" + _existingBooks);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d59d29a1f897afaeed25cd3f12076956", "e2076ec404e09d86588509dd560ad19f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "books");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `books`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(BookSearchDao.class, BookSearchDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public BookSearchDao bookSearchDao() {
    if (_bookSearchDao != null) {
      return _bookSearchDao;
    } else {
      synchronized(this) {
        if(_bookSearchDao == null) {
          _bookSearchDao = new BookSearchDao_Impl(this);
        }
        return _bookSearchDao;
      }
    }
  }
}
