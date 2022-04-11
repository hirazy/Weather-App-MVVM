package com.example.weather_app_mvvp.app.model.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DataBase_Impl extends DataBase {
  private volatile CityItemDbDao _cityItemDbDao;

  private volatile WeatherDbDao _weatherDbDao;

  private volatile WeatherCityTodayDao _weatherCityTodayDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CITY_ITEM` (`country` TEXT, `countryCode` TEXT, `isCity` INTEGER, `isCountry` INTEGER, `administrative` TEXT, `adminLevel` INTEGER, `postcode` TEXT, `county` TEXT, `geoloc` TEXT, `importance` INTEGER, `objectID` TEXT, `isSuburb` INTEGER, `localeNames` TEXT, `id` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Weather5DayData` (`cod` TEXT NOT NULL, `message` INTEGER NOT NULL, `cnt` INTEGER NOT NULL, `listDataDetail` TEXT NOT NULL, `city` TEXT NOT NULL, `id` INTEGER, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WeatherInfo` (`coord` TEXT NOT NULL, `weather` TEXT NOT NULL, `base` TEXT NOT NULL, `main` TEXT NOT NULL, `visibility` INTEGER NOT NULL, `wind` TEXT NOT NULL, `clouds` TEXT NOT NULL, `dt` INTEGER NOT NULL, `sys` TEXT NOT NULL, `timezone` INTEGER NOT NULL, `name` TEXT NOT NULL, `cod` INTEGER NOT NULL, `id` INTEGER, `colorStatus` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2be4a1517df92fa08505234879c209aa')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `CITY_ITEM`");
        _db.execSQL("DROP TABLE IF EXISTS `Weather5DayData`");
        _db.execSQL("DROP TABLE IF EXISTS `WeatherInfo`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
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
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCITYITEM = new HashMap<String, TableInfo.Column>(14);
        _columnsCITYITEM.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("countryCode", new TableInfo.Column("countryCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("isCity", new TableInfo.Column("isCity", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("isCountry", new TableInfo.Column("isCountry", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("administrative", new TableInfo.Column("administrative", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("adminLevel", new TableInfo.Column("adminLevel", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("postcode", new TableInfo.Column("postcode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("county", new TableInfo.Column("county", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("geoloc", new TableInfo.Column("geoloc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("importance", new TableInfo.Column("importance", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("objectID", new TableInfo.Column("objectID", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("isSuburb", new TableInfo.Column("isSuburb", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("localeNames", new TableInfo.Column("localeNames", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCITYITEM.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCITYITEM = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCITYITEM = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCITYITEM = new TableInfo("CITY_ITEM", _columnsCITYITEM, _foreignKeysCITYITEM, _indicesCITYITEM);
        final TableInfo _existingCITYITEM = TableInfo.read(_db, "CITY_ITEM");
        if (! _infoCITYITEM.equals(_existingCITYITEM)) {
          return new RoomOpenHelper.ValidationResult(false, "CITY_ITEM(com.example.weather_app_mvvp.app.model.entity.CityItem).\n"
                  + " Expected:\n" + _infoCITYITEM + "\n"
                  + " Found:\n" + _existingCITYITEM);
        }
        final HashMap<String, TableInfo.Column> _columnsWeather5DayData = new HashMap<String, TableInfo.Column>(6);
        _columnsWeather5DayData.put("cod", new TableInfo.Column("cod", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeather5DayData.put("message", new TableInfo.Column("message", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeather5DayData.put("cnt", new TableInfo.Column("cnt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeather5DayData.put("listDataDetail", new TableInfo.Column("listDataDetail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeather5DayData.put("city", new TableInfo.Column("city", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeather5DayData.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeather5DayData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeather5DayData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeather5DayData = new TableInfo("Weather5DayData", _columnsWeather5DayData, _foreignKeysWeather5DayData, _indicesWeather5DayData);
        final TableInfo _existingWeather5DayData = TableInfo.read(_db, "Weather5DayData");
        if (! _infoWeather5DayData.equals(_existingWeather5DayData)) {
          return new RoomOpenHelper.ValidationResult(false, "Weather5DayData(com.example.weather_app_mvvp.app.model.entity.Weather5DayData).\n"
                  + " Expected:\n" + _infoWeather5DayData + "\n"
                  + " Found:\n" + _existingWeather5DayData);
        }
        final HashMap<String, TableInfo.Column> _columnsWeatherInfo = new HashMap<String, TableInfo.Column>(14);
        _columnsWeatherInfo.put("coord", new TableInfo.Column("coord", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("weather", new TableInfo.Column("weather", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("base", new TableInfo.Column("base", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("main", new TableInfo.Column("main", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("visibility", new TableInfo.Column("visibility", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("wind", new TableInfo.Column("wind", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("clouds", new TableInfo.Column("clouds", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("dt", new TableInfo.Column("dt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("sys", new TableInfo.Column("sys", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("timezone", new TableInfo.Column("timezone", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("cod", new TableInfo.Column("cod", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWeatherInfo.put("colorStatus", new TableInfo.Column("colorStatus", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWeatherInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWeatherInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWeatherInfo = new TableInfo("WeatherInfo", _columnsWeatherInfo, _foreignKeysWeatherInfo, _indicesWeatherInfo);
        final TableInfo _existingWeatherInfo = TableInfo.read(_db, "WeatherInfo");
        if (! _infoWeatherInfo.equals(_existingWeatherInfo)) {
          return new RoomOpenHelper.ValidationResult(false, "WeatherInfo(com.example.weather_app_mvvp.app.model.entity.WeatherInfo).\n"
                  + " Expected:\n" + _infoWeatherInfo + "\n"
                  + " Found:\n" + _existingWeatherInfo);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2be4a1517df92fa08505234879c209aa", "2aede0e27d1dce5c3b030c7148faf267");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CITY_ITEM","Weather5DayData","WeatherInfo");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CITY_ITEM`");
      _db.execSQL("DELETE FROM `Weather5DayData`");
      _db.execSQL("DELETE FROM `WeatherInfo`");
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
  public CityItemDbDao roomCityItemDao() {
    if (_cityItemDbDao != null) {
      return _cityItemDbDao;
    } else {
      synchronized(this) {
        if(_cityItemDbDao == null) {
          _cityItemDbDao = new CityItemDbDao_Impl(this);
        }
        return _cityItemDbDao;
      }
    }
  }

  @Override
  public WeatherDbDao roomWeather5DayDao() {
    if (_weatherDbDao != null) {
      return _weatherDbDao;
    } else {
      synchronized(this) {
        if(_weatherDbDao == null) {
          _weatherDbDao = new WeatherDbDao_Impl(this);
        }
        return _weatherDbDao;
      }
    }
  }

  @Override
  public WeatherCityTodayDao roomWeatherInfoDao() {
    if (_weatherCityTodayDao != null) {
      return _weatherCityTodayDao;
    } else {
      synchronized(this) {
        if(_weatherCityTodayDao == null) {
          _weatherCityTodayDao = new WeatherCityTodayDao_Impl(this);
        }
        return _weatherCityTodayDao;
      }
    }
  }
}
