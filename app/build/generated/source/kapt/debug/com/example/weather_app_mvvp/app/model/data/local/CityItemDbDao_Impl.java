package com.example.weather_app_mvvp.app.model.data.local;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weather_app_mvvp.app.model.entity.CityItem;
import com.example.weather_app_mvvp.app.model.entity.Geoloc;
import com.example.weather_app_mvvp.app.model.entity.typeEntityConvert.DataConvertType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CityItemDbDao_Impl implements CityItemDbDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CityItem> __insertionAdapterOfCityItem;

  private final EntityInsertionAdapter<CityItem> __insertionAdapterOfCityItem_1;

  private final EntityDeletionOrUpdateAdapter<CityItem> __deletionAdapterOfCityItem;

  private final EntityDeletionOrUpdateAdapter<CityItem> __updateAdapterOfCityItem;

  public CityItemDbDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCityItem = new EntityInsertionAdapter<CityItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `CITY_ITEM` (`country`,`countryCode`,`isCity`,`isCountry`,`administrative`,`adminLevel`,`postcode`,`county`,`geoloc`,`importance`,`objectID`,`isSuburb`,`localeNames`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CityItem value) {
        if (value.getCountry() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCountry());
        }
        if (value.getCountryCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountryCode());
        }
        final Integer _tmp;
        _tmp = value.isCity() == null ? null : (value.isCity() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = value.isCountry() == null ? null : (value.isCountry() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = DataConvertType.someObjectListToString(value.getAdministrative());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        if (value.getAdminLevel() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getAdminLevel());
        }
        final String _tmp_3;
        _tmp_3 = DataConvertType.someObjectListToString(value.getPostcode());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = DataConvertType.someObjectListToString(value.getCounty());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        final String _tmp_5;
        _tmp_5 = DataConvertType.someObjectToString(value.getGeoloc());
        if (_tmp_5 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_5);
        }
        if (value.getImportance() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getImportance());
        }
        if (value.getObjectID() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getObjectID());
        }
        final Integer _tmp_6;
        _tmp_6 = value.isSuburb() == null ? null : (value.isSuburb() ? 1 : 0);
        if (_tmp_6 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_6);
        }
        final String _tmp_7;
        _tmp_7 = DataConvertType.someObjectListToString(value.getLocaleNames());
        if (_tmp_7 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, _tmp_7);
        }
        if (value.getId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getId());
        }
      }
    };
    this.__insertionAdapterOfCityItem_1 = new EntityInsertionAdapter<CityItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CITY_ITEM` (`country`,`countryCode`,`isCity`,`isCountry`,`administrative`,`adminLevel`,`postcode`,`county`,`geoloc`,`importance`,`objectID`,`isSuburb`,`localeNames`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CityItem value) {
        if (value.getCountry() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCountry());
        }
        if (value.getCountryCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountryCode());
        }
        final Integer _tmp;
        _tmp = value.isCity() == null ? null : (value.isCity() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = value.isCountry() == null ? null : (value.isCountry() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = DataConvertType.someObjectListToString(value.getAdministrative());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        if (value.getAdminLevel() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getAdminLevel());
        }
        final String _tmp_3;
        _tmp_3 = DataConvertType.someObjectListToString(value.getPostcode());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = DataConvertType.someObjectListToString(value.getCounty());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        final String _tmp_5;
        _tmp_5 = DataConvertType.someObjectToString(value.getGeoloc());
        if (_tmp_5 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_5);
        }
        if (value.getImportance() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getImportance());
        }
        if (value.getObjectID() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getObjectID());
        }
        final Integer _tmp_6;
        _tmp_6 = value.isSuburb() == null ? null : (value.isSuburb() ? 1 : 0);
        if (_tmp_6 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_6);
        }
        final String _tmp_7;
        _tmp_7 = DataConvertType.someObjectListToString(value.getLocaleNames());
        if (_tmp_7 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, _tmp_7);
        }
        if (value.getId() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindLong(14, value.getId());
        }
      }
    };
    this.__deletionAdapterOfCityItem = new EntityDeletionOrUpdateAdapter<CityItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CITY_ITEM` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CityItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfCityItem = new EntityDeletionOrUpdateAdapter<CityItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `CITY_ITEM` SET `country` = ?,`countryCode` = ?,`isCity` = ?,`isCountry` = ?,`administrative` = ?,`adminLevel` = ?,`postcode` = ?,`county` = ?,`geoloc` = ?,`importance` = ?,`objectID` = ?,`isSuburb` = ?,`localeNames` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CityItem value) {
        if (value.getCountry() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCountry());
        }
        if (value.getCountryCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCountryCode());
        }
        final Integer _tmp;
        _tmp = value.isCity() == null ? null : (value.isCity() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = value.isCountry() == null ? null : (value.isCountry() ? 1 : 0);
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = DataConvertType.someObjectListToString(value.getAdministrative());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_2);
        }
        if (value.getAdminLevel() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getAdminLevel());
        }
        final String _tmp_3;
        _tmp_3 = DataConvertType.someObjectListToString(value.getPostcode());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
        final String _tmp_4;
        _tmp_4 = DataConvertType.someObjectListToString(value.getCounty());
        if (_tmp_4 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_4);
        }
        final String _tmp_5;
        _tmp_5 = DataConvertType.someObjectToString(value.getGeoloc());
        if (_tmp_5 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_5);
        }
        if (value.getImportance() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getImportance());
        }
        if (value.getObjectID() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getObjectID());
        }
        final Integer _tmp_6;
        _tmp_6 = value.isSuburb() == null ? null : (value.isSuburb() ? 1 : 0);
        if (_tmp_6 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, _tmp_6);
        }
        final String _tmp_7;
        _tmp_7 = DataConvertType.someObjectListToString(value.getLocaleNames());
        if (_tmp_7 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, _tmp_7);
        }
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
  public void insert(final CityItem t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCityItem.insert(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertOrUpdate(final CityItem cityItem) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCityItem_1.insert(cityItem);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CityItem t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCityItem.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final CityItem t) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCityItem.handle(t);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public CityItem getData(final int id) {
    final String _sql = "select * from CITY_ITEM where id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
      final int _cursorIndexOfIsCity = CursorUtil.getColumnIndexOrThrow(_cursor, "isCity");
      final int _cursorIndexOfIsCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "isCountry");
      final int _cursorIndexOfAdministrative = CursorUtil.getColumnIndexOrThrow(_cursor, "administrative");
      final int _cursorIndexOfAdminLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "adminLevel");
      final int _cursorIndexOfPostcode = CursorUtil.getColumnIndexOrThrow(_cursor, "postcode");
      final int _cursorIndexOfCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "county");
      final int _cursorIndexOfGeoloc = CursorUtil.getColumnIndexOrThrow(_cursor, "geoloc");
      final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
      final int _cursorIndexOfObjectID = CursorUtil.getColumnIndexOrThrow(_cursor, "objectID");
      final int _cursorIndexOfIsSuburb = CursorUtil.getColumnIndexOrThrow(_cursor, "isSuburb");
      final int _cursorIndexOfLocaleNames = CursorUtil.getColumnIndexOrThrow(_cursor, "localeNames");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final CityItem _result;
      if(_cursor.moveToFirst()) {
        _result = new CityItem();
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        _result.setCountry(_tmpCountry);
        final String _tmpCountryCode;
        _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
        _result.setCountryCode(_tmpCountryCode);
        final Boolean _tmpIsCity;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsCity)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsCity);
        }
        _tmpIsCity = _tmp == null ? null : _tmp != 0;
        _result.setCity(_tmpIsCity);
        final Boolean _tmpIsCountry;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsCountry)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsCountry);
        }
        _tmpIsCountry = _tmp_1 == null ? null : _tmp_1 != 0;
        _result.setCountry(_tmpIsCountry);
        final List<String> _tmpAdministrative;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfAdministrative);
        _tmpAdministrative = DataConvertType.stringToSomeObjectList(_tmp_2);
        _result.setAdministrative(_tmpAdministrative);
        final Integer _tmpAdminLevel;
        if (_cursor.isNull(_cursorIndexOfAdminLevel)) {
          _tmpAdminLevel = null;
        } else {
          _tmpAdminLevel = _cursor.getInt(_cursorIndexOfAdminLevel);
        }
        _result.setAdminLevel(_tmpAdminLevel);
        final List<String> _tmpPostcode;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfPostcode);
        _tmpPostcode = DataConvertType.stringToSomeObjectList(_tmp_3);
        _result.setPostcode(_tmpPostcode);
        final List<String> _tmpCounty;
        final String _tmp_4;
        _tmp_4 = _cursor.getString(_cursorIndexOfCounty);
        _tmpCounty = DataConvertType.stringToSomeObjectList(_tmp_4);
        _result.setCounty(_tmpCounty);
        final Geoloc _tmpGeoloc;
        final String _tmp_5;
        _tmp_5 = _cursor.getString(_cursorIndexOfGeoloc);
        _tmpGeoloc = DataConvertType.stringToSomeObject(_tmp_5);
        _result.setGeoloc(_tmpGeoloc);
        final Integer _tmpImportance;
        if (_cursor.isNull(_cursorIndexOfImportance)) {
          _tmpImportance = null;
        } else {
          _tmpImportance = _cursor.getInt(_cursorIndexOfImportance);
        }
        _result.setImportance(_tmpImportance);
        final String _tmpObjectID;
        _tmpObjectID = _cursor.getString(_cursorIndexOfObjectID);
        _result.setObjectID(_tmpObjectID);
        final Boolean _tmpIsSuburb;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIsSuburb)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfIsSuburb);
        }
        _tmpIsSuburb = _tmp_6 == null ? null : _tmp_6 != 0;
        _result.setSuburb(_tmpIsSuburb);
        final List<String> _tmpLocaleNames;
        final String _tmp_7;
        _tmp_7 = _cursor.getString(_cursorIndexOfLocaleNames);
        _tmpLocaleNames = DataConvertType.stringToSomeObjectList(_tmp_7);
        _result.setLocaleNames(_tmpLocaleNames);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<CityItem> getAllData() {
    final String _sql = "select * from CITY_ITEM";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
      final int _cursorIndexOfCountryCode = CursorUtil.getColumnIndexOrThrow(_cursor, "countryCode");
      final int _cursorIndexOfIsCity = CursorUtil.getColumnIndexOrThrow(_cursor, "isCity");
      final int _cursorIndexOfIsCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "isCountry");
      final int _cursorIndexOfAdministrative = CursorUtil.getColumnIndexOrThrow(_cursor, "administrative");
      final int _cursorIndexOfAdminLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "adminLevel");
      final int _cursorIndexOfPostcode = CursorUtil.getColumnIndexOrThrow(_cursor, "postcode");
      final int _cursorIndexOfCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "county");
      final int _cursorIndexOfGeoloc = CursorUtil.getColumnIndexOrThrow(_cursor, "geoloc");
      final int _cursorIndexOfImportance = CursorUtil.getColumnIndexOrThrow(_cursor, "importance");
      final int _cursorIndexOfObjectID = CursorUtil.getColumnIndexOrThrow(_cursor, "objectID");
      final int _cursorIndexOfIsSuburb = CursorUtil.getColumnIndexOrThrow(_cursor, "isSuburb");
      final int _cursorIndexOfLocaleNames = CursorUtil.getColumnIndexOrThrow(_cursor, "localeNames");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<CityItem> _result = new ArrayList<CityItem>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CityItem _item;
        _item = new CityItem();
        final String _tmpCountry;
        _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
        _item.setCountry(_tmpCountry);
        final String _tmpCountryCode;
        _tmpCountryCode = _cursor.getString(_cursorIndexOfCountryCode);
        _item.setCountryCode(_tmpCountryCode);
        final Boolean _tmpIsCity;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfIsCity)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfIsCity);
        }
        _tmpIsCity = _tmp == null ? null : _tmp != 0;
        _item.setCity(_tmpIsCity);
        final Boolean _tmpIsCountry;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfIsCountry)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfIsCountry);
        }
        _tmpIsCountry = _tmp_1 == null ? null : _tmp_1 != 0;
        _item.setCountry(_tmpIsCountry);
        final List<String> _tmpAdministrative;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfAdministrative);
        _tmpAdministrative = DataConvertType.stringToSomeObjectList(_tmp_2);
        _item.setAdministrative(_tmpAdministrative);
        final Integer _tmpAdminLevel;
        if (_cursor.isNull(_cursorIndexOfAdminLevel)) {
          _tmpAdminLevel = null;
        } else {
          _tmpAdminLevel = _cursor.getInt(_cursorIndexOfAdminLevel);
        }
        _item.setAdminLevel(_tmpAdminLevel);
        final List<String> _tmpPostcode;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfPostcode);
        _tmpPostcode = DataConvertType.stringToSomeObjectList(_tmp_3);
        _item.setPostcode(_tmpPostcode);
        final List<String> _tmpCounty;
        final String _tmp_4;
        _tmp_4 = _cursor.getString(_cursorIndexOfCounty);
        _tmpCounty = DataConvertType.stringToSomeObjectList(_tmp_4);
        _item.setCounty(_tmpCounty);
        final Geoloc _tmpGeoloc;
        final String _tmp_5;
        _tmp_5 = _cursor.getString(_cursorIndexOfGeoloc);
        _tmpGeoloc = DataConvertType.stringToSomeObject(_tmp_5);
        _item.setGeoloc(_tmpGeoloc);
        final Integer _tmpImportance;
        if (_cursor.isNull(_cursorIndexOfImportance)) {
          _tmpImportance = null;
        } else {
          _tmpImportance = _cursor.getInt(_cursorIndexOfImportance);
        }
        _item.setImportance(_tmpImportance);
        final String _tmpObjectID;
        _tmpObjectID = _cursor.getString(_cursorIndexOfObjectID);
        _item.setObjectID(_tmpObjectID);
        final Boolean _tmpIsSuburb;
        final Integer _tmp_6;
        if (_cursor.isNull(_cursorIndexOfIsSuburb)) {
          _tmp_6 = null;
        } else {
          _tmp_6 = _cursor.getInt(_cursorIndexOfIsSuburb);
        }
        _tmpIsSuburb = _tmp_6 == null ? null : _tmp_6 != 0;
        _item.setSuburb(_tmpIsSuburb);
        final List<String> _tmpLocaleNames;
        final String _tmp_7;
        _tmp_7 = _cursor.getString(_cursorIndexOfLocaleNames);
        _tmpLocaleNames = DataConvertType.stringToSomeObjectList(_tmp_7);
        _item.setLocaleNames(_tmpLocaleNames);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
