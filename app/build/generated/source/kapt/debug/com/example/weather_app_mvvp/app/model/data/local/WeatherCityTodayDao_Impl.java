package com.example.weather_app_mvvp.app.model.data.local;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weather_app_mvvp.app.model.entity.Clouds;
import com.example.weather_app_mvvp.app.model.entity.Coord;
import com.example.weather_app_mvvp.app.model.entity.Main;
import com.example.weather_app_mvvp.app.model.entity.Sys;
import com.example.weather_app_mvvp.app.model.entity.Weather;
import com.example.weather_app_mvvp.app.model.entity.WeatherInfo;
import com.example.weather_app_mvvp.app.model.entity.Wind;
import com.example.weather_app_mvvp.app.model.entity.typeEntityConvert.DataConvertType;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherCityTodayDao_Impl implements WeatherCityTodayDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherInfo> __insertionAdapterOfWeatherInfo;

  private final EntityInsertionAdapter<WeatherInfo> __insertionAdapterOfWeatherInfo_1;

  private final EntityDeletionOrUpdateAdapter<WeatherInfo> __deletionAdapterOfWeatherInfo;

  private final EntityDeletionOrUpdateAdapter<WeatherInfo> __updateAdapterOfWeatherInfo;

  public WeatherCityTodayDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherInfo = new EntityInsertionAdapter<WeatherInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `WeatherInfo` (`colorStatus`,`coord`,`weather`,`base`,`main`,`visibility`,`wind`,`clouds`,`dt`,`sys`,`timezone`,`name`,`cod`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherInfo value) {
        stmt.bindLong(1, value.getColorStatus());
        final String _tmp;
        _tmp = DataConvertType.coordToString(value.getCoord());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = DataConvertType.weatherListToString(value.getWeather());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        if (value.getBase() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBase());
        }
        final String _tmp_2;
        _tmp_2 = DataConvertType.mainToString(value.getMain());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        stmt.bindLong(6, value.getVisibility());
        final String _tmp_3;
        _tmp_3 = DataConvertType.windToString(value.getWind());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = DataConvertType.cloudsToString(value.getClouds());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        stmt.bindLong(9, value.getDt());
        final String _tmp_5;
        _tmp_5 = DataConvertType.sysToString(value.getSys());
        if (_tmp_5 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_5);
        }
        stmt.bindLong(11, value.getTimezone());
        if (value.getName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getName());
        }
        stmt.bindLong(13, value.getCod());
        if (value.getId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getId());
        }
      }
    };
    this.__insertionAdapterOfWeatherInfo_1 = new EntityInsertionAdapter<WeatherInfo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `WeatherInfo` (`colorStatus`,`coord`,`weather`,`base`,`main`,`visibility`,`wind`,`clouds`,`dt`,`sys`,`timezone`,`name`,`cod`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherInfo value) {
        stmt.bindLong(1, value.getColorStatus());
        final String _tmp;
        _tmp = DataConvertType.coordToString(value.getCoord());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = DataConvertType.weatherListToString(value.getWeather());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        if (value.getBase() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBase());
        }
        final String _tmp_2;
        _tmp_2 = DataConvertType.mainToString(value.getMain());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        stmt.bindLong(6, value.getVisibility());
        final String _tmp_3;
        _tmp_3 = DataConvertType.windToString(value.getWind());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = DataConvertType.cloudsToString(value.getClouds());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        stmt.bindLong(9, value.getDt());
        final String _tmp_5;
        _tmp_5 = DataConvertType.sysToString(value.getSys());
        if (_tmp_5 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_5);
        }
        stmt.bindLong(11, value.getTimezone());
        if (value.getName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getName());
        }
        stmt.bindLong(13, value.getCod());
        if (value.getId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getId());
        }
      }
    };
    this.__deletionAdapterOfWeatherInfo = new EntityDeletionOrUpdateAdapter<WeatherInfo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `WeatherInfo` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherInfo value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfWeatherInfo = new EntityDeletionOrUpdateAdapter<WeatherInfo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `WeatherInfo` SET `colorStatus` = ?,`coord` = ?,`weather` = ?,`base` = ?,`main` = ?,`visibility` = ?,`wind` = ?,`clouds` = ?,`dt` = ?,`sys` = ?,`timezone` = ?,`name` = ?,`cod` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherInfo value) {
        stmt.bindLong(1, value.getColorStatus());
        final String _tmp;
        _tmp = DataConvertType.coordToString(value.getCoord());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = DataConvertType.weatherListToString(value.getWeather());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        if (value.getBase() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBase());
        }
        final String _tmp_2;
        _tmp_2 = DataConvertType.mainToString(value.getMain());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        stmt.bindLong(6, value.getVisibility());
        final String _tmp_3;
        _tmp_3 = DataConvertType.windToString(value.getWind());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = DataConvertType.cloudsToString(value.getClouds());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        stmt.bindLong(9, value.getDt());
        final String _tmp_5;
        _tmp_5 = DataConvertType.sysToString(value.getSys());
        if (_tmp_5 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_5);
        }
        stmt.bindLong(11, value.getTimezone());
        if (value.getName() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getName());
        }
        stmt.bindLong(13, value.getCod());
        if (value.getId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindLong(15, value.getId());
        }
      }
    };
  }

  @Override
  public void insert(final WeatherInfo t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherInfo.insert(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrUpdate(final WeatherInfo weather5DayData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherInfo_1.insert(weather5DayData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final WeatherInfo t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWeatherInfo.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final WeatherInfo t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfWeatherInfo.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public WeatherInfo getData(final int id) {
    final String _sql = "select * from WeatherInfo where id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfColorStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "colorStatus");
      final int _cursorIndexOfCoord = CursorUtil.getColumnIndexOrThrow(_cursor, "coord");
      final int _cursorIndexOfWeather = CursorUtil.getColumnIndexOrThrow(_cursor, "weather");
      final int _cursorIndexOfBase = CursorUtil.getColumnIndexOrThrow(_cursor, "base");
      final int _cursorIndexOfMain = CursorUtil.getColumnIndexOrThrow(_cursor, "main");
      final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibility");
      final int _cursorIndexOfWind = CursorUtil.getColumnIndexOrThrow(_cursor, "wind");
      final int _cursorIndexOfClouds = CursorUtil.getColumnIndexOrThrow(_cursor, "clouds");
      final int _cursorIndexOfDt = CursorUtil.getColumnIndexOrThrow(_cursor, "dt");
      final int _cursorIndexOfSys = CursorUtil.getColumnIndexOrThrow(_cursor, "sys");
      final int _cursorIndexOfTimezone = CursorUtil.getColumnIndexOrThrow(_cursor, "timezone");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final WeatherInfo _result;
      if(_cursor.moveToFirst()) {
        final Coord _tmpCoord;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfCoord);
        _tmpCoord = DataConvertType.stringToCityCoord(_tmp);
        final List<Weather> _tmpWeather;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfWeather);
        _tmpWeather = DataConvertType.stringToSomeWeather(_tmp_1);
        final String _tmpBase;
        _tmpBase = _cursor.getString(_cursorIndexOfBase);
        final Main _tmpMain;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfMain);
        _tmpMain = DataConvertType.stringToCityMain(_tmp_2);
        final int _tmpVisibility;
        _tmpVisibility = _cursor.getInt(_cursorIndexOfVisibility);
        final Wind _tmpWind;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfWind);
        _tmpWind = DataConvertType.stringToCityWind(_tmp_3);
        final Clouds _tmpClouds;
        final String _tmp_4;
        _tmp_4 = _cursor.getString(_cursorIndexOfClouds);
        _tmpClouds = DataConvertType.stringToCityClouds(_tmp_4);
        final long _tmpDt;
        _tmpDt = _cursor.getLong(_cursorIndexOfDt);
        final Sys _tmpSys;
        final String _tmp_5;
        _tmp_5 = _cursor.getString(_cursorIndexOfSys);
        _tmpSys = DataConvertType.stringToCitySys(_tmp_5);
        final int _tmpTimezone;
        _tmpTimezone = _cursor.getInt(_cursorIndexOfTimezone);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final int _tmpCod;
        _tmpCod = _cursor.getInt(_cursorIndexOfCod);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result = new WeatherInfo(_tmpCoord,_tmpWeather,_tmpBase,_tmpMain,_tmpVisibility,_tmpWind,_tmpClouds,_tmpDt,_tmpSys,_tmpTimezone,_tmpName,_tmpCod,_tmpId);
        final int _tmpColorStatus;
        _tmpColorStatus = _cursor.getInt(_cursorIndexOfColorStatus);
        _result.setColorStatus(_tmpColorStatus);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
