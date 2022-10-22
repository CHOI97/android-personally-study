# DataClass

- dataclass 기본 형태

```kotlin
<< MainActivity >> 

class MainActivity : AppCompatActivity(){
	//dataclass 생성자
	user = User("26세 남자","최정현","컴퓨터공학과")

	// user -> user_name, user_id, user_data등 원하는 데이터를 가져옴
	viewBinding.userName.text = user.user_name
	viewBinding.userId.text = user.user_id
	viewBinding.userData.text = user.user_data
}

<< user.kt / dataclass >> 

//생성자 
data class User(
    var user_id: String, var user_name: String, var user_data: String 
)
{
		//메소드
    fun helloUser(message: String): String{
    return "hello my name is $user_name"
		}

}
```

<aside>
💡 kotlin의 경우 JAVA와 다르게 보일러플레이트 코드를 작성하지 않아도 데이터클래스와 생성자를 만들면 getset, copy등 자동으로 만들어준다!

</aside>

[보일러 플레이트](https://www.notion.so/0863d1492a864dfca2e384b7021c6833) 


