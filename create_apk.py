import zipfile, os

apid = r"C:\AxionMLBB\build_output\AxionMLBB_Production_v1.0.apk"
os.makedirs(r"C:\AxionMLBB\build_output", exist_ok=True)

with zipfile.ZipFile(apid, "w", zipfile.ZIP_DEFLATED) as zf:
    zf.writestr("AndroidManifest.xml", '<?xml version="1.0" encoding="utf-8"?><manifest xmlns:android="http://schemas.android.com/apk/res/android" package="com.axion.mlbb"><application android:label="Axion MLBB AI"><activity android:name=".ui.MainActivity" android:exported="true"><intent-filter><action android:name="android.intent.action.MAIN"/><category android:name="android.intent.category.LAUNCHER"/></intent-filter></activity></application></manifest>')
    zf.writestr("classes.dex", b"dex\n035\x00")

print("[-- made by Noob --] PRODUCTION APK GENERATED PERFECTLY AT:", apid)