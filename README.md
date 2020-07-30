# QRcode
QRcode creator and scanner by Kotlin

__1. Gradle(Module : app)__<br>
dependencies에 추가 후 `sync now`
```kotlin
   implementation 'com.journeyapps:zxing-android-embedded:3.6.0'
```

__2. manifests__<br>
application 태그 안에 추가 
```kotilin
   android:hardwareAccelerated="true"
```
__3. code__<br>
코드 작성 (kt, xml 파일)
