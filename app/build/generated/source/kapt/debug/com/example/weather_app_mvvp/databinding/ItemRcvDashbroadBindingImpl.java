package com.example.weather_app_mvvp.databinding;
import com.example.weather_app_mvvp.R;
import com.example.weather_app_mvvp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRcvDashbroadBindingImpl extends ItemRcvDashbroadBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRcvDashbroadBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemRcvDashbroadBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
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
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.model == variableId) {
            setModel((com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail Model) {
        updateRegistration(0, Model);
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeModel((com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail) object, fieldId);
            case 1 :
                return onChangeModelWeatherShow((com.example.weather_app_mvvp.app.model.entity.WeatherDetail) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModel(com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail Model, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeModelWeatherShow(com.example.weather_app_mvvp.app.model.entity.WeatherDetail ModelWeatherShow, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.example.weather_app_mvvp.app.model.entity.Weather1DayDetail model = mModel;
        java.lang.String modelSetDate = null;
        com.example.weather_app_mvvp.app.model.entity.Weather5Day modelWeatherShowWeather0 = null;
        int modelSetColor = 0;
        java.lang.String modelSetTime = null;
        double modelGetTempShow = 0.0;
        java.lang.String modelWeatherShowWeather0Icon = null;
        double modelTempMax = 0.0;
        java.lang.String modelGetTempShowJavaLangStringC = null;
        java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> modelWeatherShowWeather = null;
        java.lang.String modelTempMaxJavaLangStringC = null;
        com.example.weather_app_mvvp.app.model.entity.WeatherDetail modelWeatherShow = null;
        double modelTempMin = 0.0;
        java.lang.String modelTempMinJavaLangStringC = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (model != null) {
                        // read model.setDate()
                        modelSetDate = model.setDate();
                        // read model.setColor()
                        modelSetColor = model.setColor();
                        // read model.setTime()
                        modelSetTime = model.setTime();
                        // read model.getTempShow()
                        modelGetTempShow = model.getTempShow();
                        // read model.tempMax
                        modelTempMax = model.getTempMax();
                        // read model.tempMin
                        modelTempMin = model.getTempMin();
                    }


                    // read (model.getTempShow()) + ("°C")
                    modelGetTempShowJavaLangStringC = (modelGetTempShow) + ("°C");
                    // read (model.tempMax) + ("°C")
                    modelTempMaxJavaLangStringC = (modelTempMax) + ("°C");
                    // read (model.tempMin) + ("°C")
                    modelTempMinJavaLangStringC = (modelTempMin) + ("°C");
            }

                if (model != null) {
                    // read model.weatherShow
                    modelWeatherShow = model.getWeatherShow();
                }
                updateRegistration(1, modelWeatherShow);


                if (modelWeatherShow != null) {
                    // read model.weatherShow.weather
                    modelWeatherShowWeather = modelWeatherShow.getWeather();
                }


                if (modelWeatherShowWeather != null) {
                    // read model.weatherShow.weather[0]
                    modelWeatherShowWeather0 = getFromList(modelWeatherShowWeather, 0);
                }


                if (modelWeatherShowWeather0 != null) {
                    // read model.weatherShow.weather[0].icon
                    modelWeatherShowWeather0Icon = modelWeatherShowWeather0.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, androidx.databinding.adapters.Converters.convertColorToDrawable(modelSetColor));
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, modelSetTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, modelSetDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, modelGetTempShowJavaLangStringC);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, modelTempMinJavaLangStringC);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, modelTempMaxJavaLangStringC);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.weather_app_mvvp.base.utils.BindingUtilsKt.loadIcon(this.mboundView3, modelWeatherShowWeather0Icon);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): model.weatherShow
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}