package com.example.kotlin_modern_databinding.databinding;
import com.example.kotlin_modern_databinding.R;
import com.example.kotlin_modern_databinding.BR;
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
        sViewsWithIds.put(R.id.btn, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener checkBoxandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.hasChecked.getValue()
            //         is viewModel.hasChecked.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = checkBox.isChecked();
            // localize variables for thread safety
            // viewModel.hasChecked.getValue()
            java.lang.Boolean viewModelHasCheckedGetValue = null;
            // viewModel.hasChecked
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHasChecked = null;
            // viewModel.hasChecked != null
            boolean viewModelHasCheckedJavaLangObjectNull = false;
            // viewModel
            com.example.kotlin_modern_databinding.MyViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelHasChecked = viewModel.getHasChecked();

                viewModelHasCheckedJavaLangObjectNull = (viewModelHasChecked) != (null);
                if (viewModelHasCheckedJavaLangObjectNull) {




                    viewModelHasChecked.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[5]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.checkBox.setTag(null);
        this.checkBoxView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.tv.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.kotlin_modern_databinding.MyViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.kotlin_modern_databinding.MyViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLiveCounter((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelHasChecked((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelCounterFromRepository((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLiveCounter(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLiveCounter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHasChecked(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelHasChecked, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCounterFromRepository(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelCounterFromRepository, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLiveCounter = null;
        java.lang.Boolean viewModelHasCheckedGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelLiveCounterGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHasChecked = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelCounterFromRepository = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHasCheckedGetValue = false;
        java.lang.Integer viewModelCounterFromRepositoryGetValue = null;
        com.example.kotlin_modern_databinding.MyViewModel viewModel = mViewModel;
        java.lang.Integer viewModelLiveCounterGetValue = null;
        java.lang.String viewModelHasCheckedToString = null;
        java.lang.String viewModelCounterFromRepositoryToString = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.liveCounter
                        viewModelLiveCounter = viewModel.getLiveCounter();
                    }
                    updateLiveDataRegistration(0, viewModelLiveCounter);


                    if (viewModelLiveCounter != null) {
                        // read viewModel.liveCounter.getValue()
                        viewModelLiveCounterGetValue = viewModelLiveCounter.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.liveCounter.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLiveCounterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLiveCounterGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasChecked
                        viewModelHasChecked = viewModel.getHasChecked();
                    }
                    updateLiveDataRegistration(1, viewModelHasChecked);


                    if (viewModelHasChecked != null) {
                        // read viewModel.hasChecked.getValue()
                        viewModelHasCheckedGetValue = viewModelHasChecked.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasChecked.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelHasCheckedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHasCheckedGetValue);
                    if (viewModelHasCheckedGetValue != null) {
                        // read viewModel.hasChecked.getValue().toString()
                        viewModelHasCheckedToString = viewModelHasCheckedGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.counterFromRepository
                        viewModelCounterFromRepository = viewModel.getCounterFromRepository();
                    }
                    updateLiveDataRegistration(2, viewModelCounterFromRepository);


                    if (viewModelCounterFromRepository != null) {
                        // read viewModel.counterFromRepository.getValue()
                        viewModelCounterFromRepositoryGetValue = viewModelCounterFromRepository.getValue();
                    }


                    if (viewModelCounterFromRepositoryGetValue != null) {
                        // read viewModel.counterFromRepository.getValue().toString()
                        viewModelCounterFromRepositoryToString = viewModelCounterFromRepositoryGetValue.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.checkBox, androidxDatabindingViewDataBindingSafeUnboxViewModelHasCheckedGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.checkBoxView, viewModelHasCheckedToString);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.checkBox, (android.widget.CompoundButton.OnCheckedChangeListener)null, checkBoxandroidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.example.kotlin_modern_databinding.BindingAdaptersKt.setProgress(this.progressBar, androidxDatabindingViewDataBindingSafeUnboxViewModelLiveCounterGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tv, viewModelCounterFromRepositoryToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.liveCounter
        flag 1 (0x2L): viewModel.hasChecked
        flag 2 (0x3L): viewModel.counterFromRepository
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}