package com.example.weather_app_mvvp.databinding;
import com.example.weather_app_mvvp.R;
import com.example.weather_app_mvvp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCityBindingImpl extends ItemCityBinding  {

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
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ItemCityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.example.weather_app_mvvp.app.model.entity.CityItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.weather_app_mvvp.app.model.entity.CityItem Model) {
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
                return onChangeModel((com.example.weather_app_mvvp.app.model.entity.CityItem) object, fieldId);
        }
        return false;
    }
    private boolean onChangeModel(com.example.weather_app_mvvp.app.model.entity.CityItem Model, int fieldId) {
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
        com.example.weather_app_mvvp.app.model.entity.CityItem model = mModel;
        java.lang.String modelCountry = null;
        java.lang.String modelLocaleNames0JavaLangStringModelCountry = null;
        java.lang.String modelLocaleNames0 = null;
        java.lang.String modelLocaleNames0JavaLangString = null;
        java.util.List<java.lang.String> modelLocaleNames = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.country
                    modelCountry = model.getCountry();
                    // read model.localeNames
                    modelLocaleNames = model.getLocaleNames();
                }


                if (modelLocaleNames != null) {
                    // read model.localeNames[0]
                    modelLocaleNames0 = getFromList(modelLocaleNames, 0);
                }


                // read (model.localeNames[0]) + (" ")
                modelLocaleNames0JavaLangString = (modelLocaleNames0) + (" ");


                // read ((model.localeNames[0]) + (" ")) + (model.country)
                modelLocaleNames0JavaLangStringModelCountry = (modelLocaleNames0JavaLangString) + (modelCountry);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, modelLocaleNames0JavaLangStringModelCountry);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}