# CrashHandler
全局异常捕获类CrashHandler，可导出崩溃日志到指定路径，该项目默认保存路径为sd卡根目录下的CrashFolder文件夹里，打开文件管理就可以直接看到

### 针对程序crash查看日志的两种方式
#### 控制台日志
一般crash后整个控制台日志也会被清空，别着急，打开Logcat，点击Show only selected application选择框，在下拉列表中选择Edit Filter Configuration,输入以下自定义项内容，填写完成后点击保存

- Filter Name: 比如叫MyApplication
- Package Name:包名
- Log Tag：过滤关键词

下次程序crash后控制台日志也不会被清空了
#### 记录日志到本地文件
如果想记录更详细的crash信息，我们可以用著名的CrashHandler来将崩溃日志保存到本地，并可以导出查看

### 如何使用
1.在程序的入口处加入以下代码

```
CrashHandler handler = CrashHandler.getInstance();
handler.init(this);
```
2.在AndroidManifest.xml中添加相关权限

```
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```
### 注意事项
Android 6.0以后对sd卡的读写权限需要动态申请一下，例程中已添加相关代码
```
PermisionUtils.verifyStoragePermissions(mActivity);
```







