package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.example.kotlin_study_custom_dialog.DataBinderMapperImpl());
  }
}