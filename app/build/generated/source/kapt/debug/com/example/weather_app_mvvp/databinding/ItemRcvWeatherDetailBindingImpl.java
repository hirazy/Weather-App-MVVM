package com.example.weather_app_mvvp.databinding;
import com.example.weather_app_mvvp.R;
import com.example.weather_app_mvvp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRcvWeatherDetailBindingImpl extends ItemRcvWeatherDetailBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRcvWeatherDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemRcvWeatherDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setVmodel((com.example.weather_app_mvvp.app.model.entity.WeatherDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVmodel(@Nullable com.example.weather_app_mvvp.app.model.entity.WeatherDetail Vmodel) {
        updateRegistration(0, Vmodel);
        this.mVmodel = Vmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.vmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmodel((com.example.weather_app_mvvp.app.model.entity.WeatherDetail) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmodel(com.example.weather_app_mvvp.app.model.entity.WeatherDetail Vmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.util.List<com.example.weather_app_mvvp.app.model.entity.Weather5Day> vmodelWeather = null;
        com.example.weather_app_mvvp.app.model.entity.Weather5Day vmodelWeather0 = null;
        java.lang.String vmodelGetTemp = null;
        com.example.weather_app_mvvp.app.model.entity.WeatherDetail vmodel = mVmodel;
        java.lang.String vmodelGetTime = null;
        java.lang.String vmodelWeather0Icon = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (vmodel != null) {
                    // read vmodel.weather
                    vmodelWeather = vmodel.getWeather();
                    // read vmodel.getTemp()
                    vmodelGetTemp = vmodel.getTemp();
                    // read vmodel.getTime()
                    vmodelGetTime = vmodel.getTime();
                }


                if (vmodelWeather != null) {
                    // read vmodel.weather[0]
                    vmodelWeather0 = getFromList(vmodelWeather, 0);
                }


                if (vmodelWeather0 != null) {
                    // read vmodel.weather[0].icon
                    vmodelWeather0Icon = vmodelWeather0.getIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, vmodelGetTime);
            com.example.weather_app_mvvp.base.utils.BindingUtilsKt.loadIcon(this.mboundView2, vmodelWeather0Icon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, vmodelGetTemp);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}