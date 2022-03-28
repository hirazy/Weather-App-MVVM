package com.example.weather_app_mvvp.databinding;
import com.example.weather_app_mvvp.R;
import com.example.weather_app_mvvp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWeatherDetailBindingImpl extends ActivityWeatherDetailBinding implements com.example.weather_app_mvvp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rcvWeatherDetail, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityWeatherDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityWeatherDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.weather_app_mvvp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setVmodel((com.example.weather_app_mvvp.app.ui.weatherDetail.WeatherDetailViewmodel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVmodel(@Nullable com.example.weather_app_mvvp.app.ui.weatherDetail.WeatherDetailViewmodel Vmodel) {
        this.mVmodel = Vmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmodelWeather1DayDetailGetValue((com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail) object, fieldId);
            case 1 :
                return onChangeVmodelWeather1DayDetail((androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail>) object, fieldId);
            case 2 :
                return onChangeVmodelWeather1DayDetailWeatherShow((com.example.weather_app_mvvp.app.model.entity.WeatherDetail) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmodelWeather1DayDetailGetValue(com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail VmodelWeather1DayDetailGetValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmodelWeather1DayDetail(androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail> VmodelWeather1DayDetail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmodelWeather1DayDetailWeatherShow(com.example.weather_app_mvvp.app.model.entity.WeatherDetail VmodelWeather1DayDetailWeatherShow, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.example.weather_app_mvvp.app.model.entity.Weather5Day vmodelWeather1DayDetailWeatherShowWeather0 = null;
        java.lang.String vmodelWeather1DayDetailGetTempShowJavaLangString = null;
        double vmodelWeather1DayDetailTempMax = 0.0;
        com.example.weather_app_mvvp.app.ui.weatherDetail.WeatherDetailViewmodel vmodel = mVmodel;
        com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail vmodelWeather1DayDetailGetValue = null;
        java.lang.String vmodelWeather1DayDetailWeatherShowWeather0Icon = null;
        java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> vmodelWeather1DayDetailWeatherShowWeather = null;
        java.lang.String vmodelWeather1DayDetailTempMinJavaLangString = null;
        androidx.lifecycle.MutableLiveData<com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail> vmodelWeather1DayDetail = null;
        java.lang.String vmodelWeather1DayDetailSetDate = null;
        double vmodelWeather1DayDetailGetTempShow = 0.0;
        double vmodelWeather1DayDetailTempMin = 0.0;
        int vmodelWeather1DayDetailSetColor = 0;
        com.example.weather_app_mvvp.app.model.entity.WeatherDetail vmodelWeather1DayDetailWeatherShow = null;
        java.lang.String vmodelWeather1DayDetailTempMaxJavaLangString = null;

        if ((dirtyFlags & 0x1fL) != 0) {



                if (vmodel != null) {
                    // read vmodel.weather1DayDetail
                    vmodelWeather1DayDetail = vmodel.getWeather1DayDetail();
                }
                updateLiveDataRegistration(1, vmodelWeather1DayDetail);


                if (vmodelWeather1DayDetail != null) {
                    // read vmodel.weather1DayDetail.getValue()
                    vmodelWeather1DayDetailGetValue = vmodelWeather1DayDetail.getValue();
                }
                updateRegistration(0, vmodelWeather1DayDetailGetValue);

            if ((dirtyFlags & 0x1bL) != 0) {

                    if (vmodelWeather1DayDetailGetValue != null) {
                        // read vmodel.weather1DayDetail.getValue().tempMax
                        vmodelWeather1DayDetailTempMax = vmodelWeather1DayDetailGetValue.getTempMax();
                        // read vmodel.weather1DayDetail.getValue().setDate()
                        vmodelWeather1DayDetailSetDate = vmodelWeather1DayDetailGetValue.setDate();
                        // read vmodel.weather1DayDetail.getValue().getTempShow()
                        vmodelWeather1DayDetailGetTempShow = vmodelWeather1DayDetailGetValue.getTempShow();
                        // read vmodel.weather1DayDetail.getValue().tempMin
                        vmodelWeather1DayDetailTempMin = vmodelWeather1DayDetailGetValue.getTempMin();
                        // read vmodel.weather1DayDetail.getValue().setColor()
                        vmodelWeather1DayDetailSetColor = vmodelWeather1DayDetailGetValue.setColor();
                    }


                    // read (vmodel.weather1DayDetail.getValue().tempMax) + ("°")
                    vmodelWeather1DayDetailTempMaxJavaLangString = (vmodelWeather1DayDetailTempMax) + ("°");
                    // read (vmodel.weather1DayDetail.getValue().getTempShow()) + ("°")
                    vmodelWeather1DayDetailGetTempShowJavaLangString = (vmodelWeather1DayDetailGetTempShow) + ("°");
                    // read (vmodel.weather1DayDetail.getValue().tempMin) + ("°")
                    vmodelWeather1DayDetailTempMinJavaLangString = (vmodelWeather1DayDetailTempMin) + ("°");
            }

                if (vmodelWeather1DayDetailGetValue != null) {
                    // read vmodel.weather1DayDetail.getValue().weatherShow
                    vmodelWeather1DayDetailWeatherShow = vmodelWeather1DayDetailGetValue.getWeatherShow();
                }
                updateRegistration(2, vmodelWeather1DayDetailWeatherShow);


                if (vmodelWeather1DayDetailWeatherShow != null) {
                    // read vmodel.weather1DayDetail.getValue().weatherShow.weather
                    vmodelWeather1DayDetailWeatherShowWeather = vmodelWeather1DayDetailWeatherShow.getWeather();
                }


                if (vmodelWeather1DayDetailWeatherShowWeather != null) {
                    // read vmodel.weather1DayDetail.getValue().weatherShow.weather[0]
                    vmodelWeather1DayDetailWeatherShowWeather0 = getFromList(vmodelWeather1DayDetailWeatherShowWeather, 0);
                }


                if (vmodelWeather1DayDetailWeatherShowWeather0 != null) {
                    // read vmodel.weather1DayDetail.getValue().weatherShow.weather[0].icon
                    vmodelWeather1DayDetailWeatherShowWeather0Icon = vmodelWeather1DayDetailWeatherShowWeather0.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x1bL) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView2, androidx.databinding.adapters.Converters.convertColorToDrawable(vmodelWeather1DayDetailSetColor));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, vmodelWeather1DayDetailSetDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, vmodelWeather1DayDetailGetTempShowJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, vmodelWeather1DayDetailTempMinJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, vmodelWeather1DayDetailTempMaxJavaLangString);
        }
        if ((dirtyFlags & 0x1fL) != 0) {
            // api target 1

            com.example.weather_app_mvvp.base.utils.BindingUtilsKt.loadIcon(this.mboundView4, vmodelWeather1DayDetailWeatherShowWeather0Icon);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // vmodel
        com.example.weather_app_mvvp.app.ui.weatherDetail.WeatherDetailViewmodel vmodel = mVmodel;
        // vmodel != null
        boolean vmodelJavaLangObjectNull = false;



        vmodelJavaLangObjectNull = (vmodel) != (null);
        if (vmodelJavaLangObjectNull) {


            vmodel.finish();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vmodel.weather1DayDetail.getValue()
        flag 1 (0x2L): vmodel.weather1DayDetail
        flag 2 (0x3L): vmodel.weather1DayDetail.getValue().weatherShow
        flag 3 (0x4L): vmodel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}