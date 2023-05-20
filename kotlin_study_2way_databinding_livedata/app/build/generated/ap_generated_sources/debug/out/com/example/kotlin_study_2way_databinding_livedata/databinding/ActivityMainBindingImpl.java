package com.example.kotlin_study_2way_databinding_livedata.databinding;
import com.example.kotlin_study_2way_databinding_livedata.R;
import com.example.kotlin_study_2way_databinding_livedata.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cb, 3);
        sViewsWithIds.put(R.id.btn, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel._editLiveData.getValue()
            //         is viewmodel._editLiveData.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edt);
            // localize variables for thread safety
            // viewmodel._editLiveData
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEditLiveData = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel._editLiveData != null
            boolean viewmodelEditLiveDataJavaLangObjectNull = false;
            // viewmodel
            com.example.kotlin_study_2way_databinding_livedata.MyViewModel viewmodel = mViewmodel;
            // viewmodel._editLiveData.getValue()
            java.lang.String viewmodelEditLiveDataGetValue = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEditLiveData = viewmodel.get_editLiveData();

                viewmodelEditLiveDataJavaLangObjectNull = (viewmodelEditLiveData) != (null);
                if (viewmodelEditLiveDataJavaLangObjectNull) {




                    viewmodelEditLiveData.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel._editLiveData.getValue()
            //         is viewmodel._editLiveData.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tv);
            // localize variables for thread safety
            // viewmodel._editLiveData
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEditLiveData = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel._editLiveData != null
            boolean viewmodelEditLiveDataJavaLangObjectNull = false;
            // viewmodel
            com.example.kotlin_study_2way_databinding_livedata.MyViewModel viewmodel = mViewmodel;
            // viewmodel._editLiveData.getValue()
            java.lang.String viewmodelEditLiveDataGetValue = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEditLiveData = viewmodel.get_editLiveData();

                viewmodelEditLiveDataJavaLangObjectNull = (viewmodelEditLiveData) != (null);
                if (viewmodelEditLiveDataJavaLangObjectNull) {




                    viewmodelEditLiveData.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[4]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.edt.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tv.setTag(null);
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.example.kotlin_study_2way_databinding_livedata.MyViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.example.kotlin_study_2way_databinding_livedata.MyViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelEditLiveData((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelEditLiveData(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelEditLiveData, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEditLiveData = null;
        com.example.kotlin_study_2way_databinding_livedata.MyViewModel viewmodel = mViewmodel;
        java.lang.String viewmodelEditLiveDataGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel._editLiveData
                    viewmodelEditLiveData = viewmodel.get_editLiveData();
                }
                updateLiveDataRegistration(0, viewmodelEditLiveData);


                if (viewmodelEditLiveData != null) {
                    // read viewmodel._editLiveData.getValue()
                    viewmodelEditLiveDataGetValue = viewmodelEditLiveData.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edt, viewmodelEditLiveDataGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tv, viewmodelEditLiveDataGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edt, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tv, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel._editLiveData
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}