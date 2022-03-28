package com.example.weather_app_mvvp.app.model.data.local;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weather_app_mvvp.app.model.entity.City5Day;
import com.example.weather_app_mvvp.app.model.entity.Weather5DayData;
import com.example.weather_app_mvvp.app.model.entity.WeatherDetail;
import com.example.weather_app_mvvp.app.model.entity.typeEntityConvert.DataConvertType;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WeatherDbDao_Impl implements WeatherDbDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Weather5DayData> __insertionAdapterOfWeather5DayData;

  private final EntityInsertionAdapter<Weather5DayData> __insertionAdapterOfWeather5DayData_1;

  private final EntityDeletionOrUpdateAdapter<Weather5DayData> __deletionAdapterOfWeather5DayData;

  private final EntityDeletionOrUpdateAdapter<Weather5DayData> __updateAdapterOfWeather5DayData;

  public WeatherDbDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeather5DayData = new EntityInsertionAdapter<Weather5DayData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Weather5DayData` (`cod`,`message`,`cnt`,`listDataDetail`,`city`,`id`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Weather5DayData value) {
        if (value.getCod() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCod());
        }
        stmt.bindLong(2, value.getMessage());
        stmt.bindLong(3, value.getCnt());
        final String _tmp;
        _tmp = DataConvertType.someWeatherDetailListToString(value.getListDataDetail());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = DataConvertType.city5DayToString(value.getCity());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
    this.__insertionAdapterOfWeather5DayData_1 = new EntityInsertionAdapter<Weather5DayData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Weather5DayData` (`cod`,`message`,`cnt`,`listDataDetail`,`city`,`id`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Weather5DayData value) {
        if (value.getCod() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCod());
        }
        stmt.bindLong(2, value.getMessage());
        stmt.bindLong(3, value.getCnt());
        final String _tmp;
        _tmp = DataConvertType.someWeatherDetailListToString(value.getListDataDetail());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = DataConvertType.city5DayToString(value.getCity());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
    this.__deletionAdapterOfWeather5DayData = new EntityDeletionOrUpdateAdapter<Weather5DayData>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Weather5DayData` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Weather5DayData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfWeather5DayData = new EntityDeletionOrUpdateAdapter<Weather5DayData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Weather5DayData` SET `cod` = ?,`message` = ?,`cnt` = ?,`listDataDetail` = ?,`city` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Weather5DayData value) {
        if (value.getCod() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCod());
        }
        stmt.bindLong(2, value.getMessage());
        stmt.bindLong(3, value.getCnt());
        final String _tmp;
        _tmp = DataConvertType.someWeatherDetailListToString(value.getListDataDetail());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = DataConvertType.city5DayToString(value.getCity());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
        if (value.getId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getId());
        }
      }
    };
  }

  @Override
  public void insert(final Weather5DayData t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeather5DayData.insert(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrUpdate(final Weather5DayData weather5DayData) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeather5DayData_1.insert(weather5DayData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final Weather5DayData t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfWeather5DayData.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Weather5DayData t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfWeather5DayData.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Weather5DayData getData(final int id) {
    final String _sql = "select * from Weather5DayData where id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCod = CursorUtil.getColumnIndexOrThrow(_cursor, "cod");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfCnt = CursorUtil.getColumnIndexOrThrow(_cursor, "cnt");
      final int _cursorIndexOfListDataDetail = CursorUtil.getColumnIndexOrThrow(_cursor, "listDataDetail");
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final Weather5DayData _result;
      if(_cursor.moveToFirst()) {
        final String _tmpCod;
        _tmpCod = _cursor.getString(_cursorIndexOfCod);
        final int _tmpMessage;
        _tmpMessage = _cursor.getInt(_cursorIndexOfMessage);
        final int _tmpCnt;
        _tmpCnt = _cursor.getInt(_cursorIndexOfCnt);
        final List<WeatherDetail> _tmpListDataDetail;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfListDataDetail);
        _tmpListDataDetail = DataConvertType.stringToWeatherDetailtList(_tmp);
        final City5Day _tmpCity;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfCity);
        _tmpCity = DataConvertType.stringToCity5Day(_tmp_1);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result = new Weather5DayData(_tmpCod,_tmpMessage,_tmpCnt,_tmpListDataDetail,_tmpCity,_tmpId);
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
