package com.example.base.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
/*
* @HiltAndroidApp
* 위 어노테이션은 모든 작업의 시작점 Hilt를 사용하는 모든 앱은 이 어노테이션을 Application class에 정의해아한다.
* Hilt 의존성 주입 프레임워크를 초기화시키는데 사용
* 의존성 주입에 필요한 다양한 컴포넌트를 앱 생명주기와 동기화 시켜줌
*/
@HiltAndroidApp
class MyApplication: Application() {
}