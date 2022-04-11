package com.example.weather_app_mvvp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.weather_app_mvvp.databinding.ActivityDashBroadBindingImpl;
import com.example.weather_app_mvvp.databinding.ActivityLauncherBindingImpl;
import com.example.weather_app_mvvp.databinding.ActivityMainBindingImpl;
import com.example.weather_app_mvvp.databinding.ActivitySettingBindingImpl;
import com.example.weather_app_mvvp.databinding.ActivitySplashBindingImpl;
import com.example.weather_app_mvvp.databinding.ActivityWeatherDetailBindingImpl;
import com.example.weather_app_mvvp.databinding.ItemCityBindingImpl;
import com.example.weather_app_mvvp.databinding.ItemRcvDashbroadBindingImpl;
import com.example.weather_app_mvvp.databinding.ItemRcvWeatherDetailBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDASHBROAD = 1;

  private static final int LAYOUT_ACTIVITYLAUNCHER = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYSETTING = 4;

  private static final int LAYOUT_ACTIVITYSPLASH = 5;

  private static final int LAYOUT_ACTIVITYWEATHERDETAIL = 6;

  private static final int LAYOUT_ITEMCITY = 7;

  private static final int LAYOUT_ITEMRCVDASHBROAD = 8;

  private static final int LAYOUT_ITEMRCVWEATHERDETAIL = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.activity_dash_broad, LAYOUT_ACTIVITYDASHBROAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.activity_launcher, LAYOUT_ACTIVITYLAUNCHER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.activity_setting, LAYOUT_ACTIVITYSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.activity_weather_detail, LAYOUT_ACTIVITYWEATHERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.item_city, LAYOUT_ITEMCITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.item_rcv_dashbroad, LAYOUT_ITEMRCVDASHBROAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.weather_app_mvvp.R.layout.item_rcv_weather_detail, LAYOUT_ITEMRCVWEATHERDETAIL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDASHBROAD: {
          if ("layout/activity_dash_broad_0".equals(tag)) {
            return new ActivityDashBroadBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dash_broad is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLAUNCHER: {
          if ("layout/activity_launcher_0".equals(tag)) {
            return new ActivityLauncherBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_launcher is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSETTING: {
          if ("layout/activity_setting_0".equals(tag)) {
            return new ActivitySettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYWEATHERDETAIL: {
          if ("layout/activity_weather_detail_0".equals(tag)) {
            return new ActivityWeatherDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_weather_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCITY: {
          if ("layout/item_city_0".equals(tag)) {
            return new ItemCityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_city is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRCVDASHBROAD: {
          if ("layout/item_rcv_dashbroad_0".equals(tag)) {
            return new ItemRcvDashbroadBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_rcv_dashbroad is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRCVWEATHERDETAIL: {
          if ("layout/item_rcv_weather_detail_0".equals(tag)) {
            return new ItemRcvWeatherDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_rcv_weather_detail is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "model");
      sKeys.put(2, "viewModel");
      sKeys.put(3, "vmode");
      sKeys.put(4, "vmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_dash_broad_0", com.example.weather_app_mvvp.R.layout.activity_dash_broad);
      sKeys.put("layout/activity_launcher_0", com.example.weather_app_mvvp.R.layout.activity_launcher);
      sKeys.put("layout/activity_main_0", com.example.weather_app_mvvp.R.layout.activity_main);
      sKeys.put("layout/activity_setting_0", com.example.weather_app_mvvp.R.layout.activity_setting);
      sKeys.put("layout/activity_splash_0", com.example.weather_app_mvvp.R.layout.activity_splash);
      sKeys.put("layout/activity_weather_detail_0", com.example.weather_app_mvvp.R.layout.activity_weather_detail);
      sKeys.put("layout/item_city_0", com.example.weather_app_mvvp.R.layout.item_city);
      sKeys.put("layout/item_rcv_dashbroad_0", com.example.weather_app_mvvp.R.layout.item_rcv_dashbroad);
      sKeys.put("layout/item_rcv_weather_detail_0", com.example.weather_app_mvvp.R.layout.item_rcv_weather_detail);
    }
  }
}
