package com.example.weather_app_mvvp.databinding;
import com.example.weather_app_mvvp.R;
import com.example.weather_app_mvvp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDashBroadBindingImpl extends ActivityDashBroadBinding implements com.example.weather_app_mvvp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rcvDashbroad, 7);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDashBroadBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityDashBroadBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.weather_app_mvvp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vmodel == variableId) {
            setVmodel((com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVmodel(@Nullable com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadViewModel Vmodel) {
        this.mVmodel = Vmodel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmodelCity((androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.CityItem>) object, fieldId);
            case 1 :
                return onChangeVmodelWeatherCityInfo((androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.WeatherInfo>) object, fieldId);
            case 2 :
                return onChangeVmodelWeatherCityInfoGetValue((com.example.weather_app_mvvp.app.model.entity.WeatherInfo) object, fieldId);
            case 3 :
                return onChangeVmodelCityGetValue((com.example.weather_app_mvvp.app.model.entity.CityItem) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmodelCity(androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.CityItem> VmodelCity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmodelWeatherCityInfo(androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.WeatherInfo> VmodelWeatherCityInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmodelWeatherCityInfoGetValue(com.example.weather_app_mvvp.app.model.entity.WeatherInfo VmodelWeatherCityInfoGetValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmodelCityGetValue(com.example.weather_app_mvvp.app.model.entity.CityItem VmodelCityGetValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String vmodelCityLocaleNames0JavaLangString = null;
        androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.CityItem> vmodelCity = null;
        androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.WeatherInfo> vmodelWeatherCityInfo = null;
        java.lang.String vmodelWeatherCityInfoGetTemp = null;
        com.example.weather_app_mvvp.app.model.entity.WeatherInfo vmodelWeatherCityInfoGetValue = null;
        java.lang.String vmodelWeatherCityInfoGetTempJavaLangStringC = null;
        java.util.List<java.lang.String> vmodelCityLocaleNames = null;
        com.example.weather_app_mvvp.app.model.entity.CityItem vmodelCityGetValue = null;
        java.lang.String vmodelCityCountry = null;
        com.example.weather_app_mvvp.app.model.entity.Weather vmodelWeatherCityInfoWeather0 = null;
        java.lang.String vmodelWeatherCityInfoWeather0Main = null;
        com.example.weather_app_mvvp.app.model.entity.Main vmodelWeatherCityInfoMain = null;
        java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather> vmodelWeatherCityInfoWeather = null;
        com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadViewModel vmodel = mVmodel;
        java.lang.String vmodelCityLocaleNames0JavaLangStringVmodelCityCountry = null;
        java.lang.String vmodelCityLocaleNames0 = null;
        java.lang.String vmodelWeatherCityInfoWeather0Icon = null;
        int vmodelWeatherCityInfoMainHumidity = 0;
        java.lang.String vmodelWeatherCityInfoMainHumidityJavaLangString = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x39L) != 0) {

                    if (vmodel != null) {
                        // read vmodel.city
                        vmodelCity = vmodel.getCity();
                    }
                    updateLiveDataRegistration(0, vmodelCity);


                    if (vmodelCity != null) {
                        // read vmodel.city.getValue()
                        vmodelCityGetValue = vmodelCity.getValue();
                    }
                    updateRegistration(3, vmodelCityGetValue);


                    if (vmodelCityGetValue != null) {
                        // read vmodel.city.getValue().localeNames
                        vmodelCityLocaleNames = vmodelCityGetValue.getLocaleNames();
                        // read vmodel.city.getValue().country
                        vmodelCityCountry = vmodelCityGetValue.getCountry();
                    }


                    if (vmodelCityLocaleNames != null) {
                        // read vmodel.city.getValue().localeNames[0]
                        vmodelCityLocaleNames0 = getFromList(vmodelCityLocaleNames, 0);
                    }


                    // read (vmodel.city.getValue().localeNames[0]) + (" - ")
                    vmodelCityLocaleNames0JavaLangString = (vmodelCityLocaleNames0) + (" - ");


                    // read ((vmodel.city.getValue().localeNames[0]) + (" - ")) + (vmodel.city.getValue().country)
                    vmodelCityLocaleNames0JavaLangStringVmodelCityCountry = (vmodelCityLocaleNames0JavaLangString) + (vmodelCityCountry);
            }
            if ((dirtyFlags & 0x36L) != 0) {

                    if (vmodel != null) {
                        // read vmodel.weatherCityInfo
                        vmodelWeatherCityInfo = vmodel.getWeatherCityInfo();
                    }
                    updateLiveDataRegistration(1, vmodelWeatherCityInfo);


                    if (vmodelWeatherCityInfo != null) {
                        // read vmodel.weatherCityInfo.getValue()
                        vmodelWeatherCityInfoGetValue = vmodelWeatherCityInfo.getValue();
                    }
                    updateRegistration(2, vmodelWeatherCityInfoGetValue);


                    if (vmodelWeatherCityInfoGetValue != null) {
                        // read vmodel.weatherCityInfo.getValue().getTemp()
                        vmodelWeatherCityInfoGetTemp = vmodelWeatherCityInfoGetValue.getTemp();
                        // read vmodel.weatherCityInfo.getValue().main
                        vmodelWeatherCityInfoMain = vmodelWeatherCityInfoGetValue.getMain();
                        // read vmodel.weatherCityInfo.getValue().weather
                        vmodelWeatherCityInfoWeather = vmodelWeatherCityInfoGetValue.getWeather();
                    }


                    // read (vmodel.weatherCityInfo.getValue().getTemp()) + ("°C")
                    vmodelWeatherCityInfoGetTempJavaLangStringC = (vmodelWeatherCityInfoGetTemp) + ("°C");
                    if (vmodelWeatherCityInfoMain != null) {
                        // read vmodel.weatherCityInfo.getValue().main.humidity
                        vmodelWeatherCityInfoMainHumidity = vmodelWeatherCityInfoMain.getHumidity();
                    }
                    if (vmodelWeatherCityInfoWeather != null) {
                        // read vmodel.weatherCityInfo.getValue().weather[0]
                        vmodelWeatherCityInfoWeather0 = getFromList(vmodelWeatherCityInfoWeather, 0);
                    }


                    // read (vmodel.weatherCityInfo.getValue().main.humidity) + (" ")
                    vmodelWeatherCityInfoMainHumidityJavaLangString = (vmodelWeatherCityInfoMainHumidity) + (" ");
                    if (vmodelWeatherCityInfoWeather0 != null) {
                        // read vmodel.weatherCityInfo.getValue().weather[0].main
                        vmodelWeatherCityInfoWeather0Main = vmodelWeatherCityInfoWeather0.getMain();
                        // read vmodel.weatherCityInfo.getValue().weather[0].icon
                        vmodelWeatherCityInfoWeather0Icon = vmodelWeatherCityInfoWeather0.getIcon();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x39L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, vmodelCityLocaleNames0JavaLangStringVmodelCityCountry);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x36L) != 0) {
            // api target 1

            com.example.weather_app_mvvp.base.utils.BindingUtilsKt.loadIcon(this.mboundView3, vmodelWeatherCityInfoWeather0Icon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, vmodelWeatherCityInfoGetTempJavaLangStringC);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, vmodelWeatherCityInfoWeather0Main);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, vmodelWeatherCityInfoMainHumidityJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vmodel
        com.example.weather_app_mvvp.app.ui.dashbroad.DashBroadViewModel vmodel = mVmodel;
        // vmodel != null
        boolean vmodelJavaLangObjectNull = false;



        vmodelJavaLangObjectNull = (vmodel) != (null);
        if (vmodelJavaLangObjectNull) {


            vmodel.onSearch();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vmodel.city
        flag 1 (0x2L): vmodel.weatherCityInfo
        flag 2 (0x3L): vmodel.weatherCityInfo.getValue()
        flag 3 (0x4L): vmodel.city.getValue()
        flag 4 (0x5L): vmodel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}