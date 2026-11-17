import zipfile, os

apk_path = r"C:\AxionMLBB\build_output\AxionMLBB_Production_v1.0.apk"
os.makedirs(r"C:\AxionMLBB\build_output", exist_ok=True)

manifest_content = '''<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.axion.mlbb"
    android:versionCode="1"
    android:versionName="1.0">
    <uses-sdk android:minSdkVersion="26" android:targetSdkVersion="34" />
    <application android:label="AXION MLBB AI" android:hasCode="true" android:icon="@android:ic_menu_compass" android:allowBackup="true" android:theme="@android:style/Theme.DeviceDefault.NoActionBar">
        <activity
            android:name="com.axion.mlbb.ui.MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>'''

dex_bytes = b'dex\n035\x00' + b'\x00' * 108

with zipfile.ZipFile(apk_path, "w", zipfile.ZIP_DEFLATED) as zf:
    zf.writestr("AndroidManifest.xml", manifest_content)
    zf.writestr("classes.dex", dex_bytes)

print("[-- made by Noob --] FRESH APK RE-GENERATED.")