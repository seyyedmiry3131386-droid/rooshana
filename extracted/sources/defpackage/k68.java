package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import androidx.core.content.ContextCompat;
import io.sentry.config.a;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import kotlin.Result;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class k68 {
    public static final String e;
    public static final String f;
    public final lu7 a;
    public final Context b;
    public final d56 c;
    public final fw4 d;

    static {
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(LinkDTO.LINK_TYPE_MYKET_INTENT.charAt(0));
        js3.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        js3.o(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        sb.append("yket");
        e = t61.i(sb.toString(), "Movies");
        String string = Environment.getExternalStorageDirectory().toString();
        String str = File.separator;
        f = string + str + "Android" + str + "obb" + str;
    }

    public k68(lu7 lu7Var, Context context, d56 d56Var, fw4 fw4Var) {
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(d56Var, "permissionHelper");
        js3.p(fw4Var, "miuiUtils");
        this.a = lu7Var;
        this.b = context;
        this.c = d56Var;
        this.d = fw4Var;
    }

    public static final String b(int i, String str) {
        js3.p(str, "packageName");
        File file = new File(a77.h(str));
        if (!file.exists() || !file.isDirectory()) {
            file = null;
        }
        return file != null ? a77.c(file, i) : "";
    }

    public static String f() {
        return t61.j(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString(), File.separator, e);
    }

    public static boolean q(String str) {
        js3.p(str, "movieFileName");
        return new File(t61.j(f(), File.separator, str)).exists();
    }

    public static boolean r(String str) {
        js3.p(str, "id");
        String str2 = "reels_" + str + ".mp4";
        String string = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString();
        String str3 = File.separator;
        return new File(t61.j(t61.j(string, str3, "reels"), str3, str2)).exists();
    }

    public final void a(String str, String str2) {
        js3.p(str, "filePath");
        if (f88.n0(str)) {
            lw.g(null, "filePath must be provided", null);
            return;
        }
        File file = new File(str);
        sb7.p("StorageUtils", "Copy to downloads", "fileName: " + file.getName());
        int i = Build.VERSION.SDK_INT;
        Context context = this.b;
        if (i < 29) {
            try {
                if (!this.c.b(context, 2)) {
                    throw new IllegalStateException("Storage permission denied, but user wants to keep downloads");
                }
                File file2 = new File(str2 != null ? String.format("%1s/%2s/%3s", i(), Environment.DIRECTORY_DOWNLOADS, str2) : String.format("%1s/%2s", i(), Environment.DIRECTORY_DOWNLOADS));
                if (!file2.exists()) {
                    file2.mkdir();
                }
                zb2.c(file, file2);
                return;
            } catch (IOException e2) {
                lw.g(e2, "Copy to downloads failed", "android: " + Build.VERSION.SDK_INT);
                return;
            }
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", file.getName());
            contentValues.put("_size", Long.valueOf(file.length()));
            contentValues.put("is_pending", (Integer) 1);
            if (str2 != null) {
                String str3 = Environment.DIRECTORY_DOWNLOADS;
                String str4 = File.separator;
                contentValues.put("relative_path", str3 + str4 + str2 + str4);
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("is_pending", (Integer) 0);
            Uri uriInsert = context.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                return;
            }
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
            int i2 = zb2.a;
            FileInputStream fileInputStreamG = a.g(file, new FileInputStream(file));
            try {
                int i3 = jg3.a;
                byte[] bArr = new byte[4096];
                while (true) {
                    int i4 = fileInputStreamG.read(bArr);
                    if (-1 == i4) {
                        fileInputStreamG.close();
                        context.getContentResolver().update(uriInsert, contentValues2, null, null);
                        return;
                    }
                    outputStreamOpenOutputStream.write(bArr, 0, i4);
                }
            } catch (Throwable th) {
                fileInputStreamG.close();
                throw th;
            }
        } catch (Exception e3) {
            lw.g(e3, "Copy to downloads failed", "android: " + Build.VERSION.SDK_INT);
        }
    }

    public final String c(String str, int i, boolean z) {
        js3.p(str, "packageName");
        String strE = e();
        String str2 = File.separator;
        String str3 = z ? "dff" : "apk";
        StringBuilder sb = new StringBuilder();
        sb.append(strE);
        sb.append(str2);
        sb.append(str);
        sb.append("_");
        sb.append(i);
        return dw1.s(sb, ".", str3);
    }

    public final String d(String str, String str2, boolean z) {
        js3.p(str2, "fileName");
        lw.c(str, null);
        lw.c(str2, null);
        String strI = z ? null : str2;
        if (strI == null) {
            char c = bc2.a;
            int iLastIndexOf = str2.lastIndexOf(46);
            if (Math.max(str2.lastIndexOf(47), str2.lastIndexOf(92)) > iLastIndexOf) {
                iLastIndexOf = -1;
            }
            if (iLastIndexOf != -1) {
                str2 = str2.substring(0, iLastIndexOf);
            }
            strI = t61.i(str2, ".dff");
        }
        return t61.j(e(), File.separator, strI);
    }

    public final String e() {
        String str = lu7.a0;
        js3.o(str, "KEY_DOWNLOAD_DIRECTORY_PATH");
        return g(str, "download");
    }

    public final String g(String str, String str2) throws IOException {
        File externalFilesDir;
        File[] externalFilesDirs = ContextCompat.getExternalFilesDirs(this.b, str2);
        js3.o(externalFilesDirs, "getExternalFilesDirs(...)");
        if (externalFilesDirs.length == 0 || (externalFilesDir = externalFilesDirs[0]) == null) {
            externalFilesDir = ApplicationLauncher.o.getApplicationContext().getApplicationContext().getExternalFilesDir(str2);
        }
        lu7 lu7Var = this.a;
        if (externalFilesDir != null) {
            String absolutePath = externalFilesDir.getAbsolutePath();
            js3.o(absolutePath, "getAbsolutePath(...)");
            lu7Var.i(str, absolutePath);
            return absolutePath;
        }
        String strF = lu7Var.f(str, "");
        js3.o(strF, "getString(...)");
        if (f88.n0(strF)) {
            throw new IOException("Cannot access file file directory, maybe external storage is not mounted.");
        }
        return strF;
    }

    public final String h(String str) {
        String strE = e();
        String str2 = File.separator;
        return strE + str2 + e + str2 + str;
    }

    public final String i() {
        String absolutePath;
        if (Build.VERSION.SDK_INT < 30) {
            String absolutePath2 = Environment.getExternalStorageDirectory().getAbsolutePath();
            js3.m(absolutePath2);
            return absolutePath2;
        }
        Object systemService = this.b.getSystemService("storage");
        js3.n(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
        File directory = ((StorageManager) systemService).getPrimaryStorageVolume().getDirectory();
        return (directory == null || (absolutePath = directory.getAbsolutePath()) == null) ? "" : absolutePath;
    }

    public final String j() {
        String str = lu7.b0;
        js3.o(str, "KEY_EXTERNAL_FILE_DIRECTORY_PATH");
        return new File(g(str, "photo")) + "/invite.png";
    }

    public final String k(String str) {
        js3.p(str, "packageName");
        return rm7.q(n(), File.separator, str, ".apk");
    }

    public final String l(String str) {
        js3.p(str, "packageName");
        return t61.j(n(), File.separator, str);
    }

    public final String m(String str) {
        js3.p(str, "packageName");
        return rm7.q(n(), File.separator, str, ".apks");
    }

    public final String n() {
        String str = lu7.a0;
        js3.o(str, "KEY_DOWNLOAD_DIRECTORY_PATH");
        return g(str, "share/receive");
    }

    public final Intent o() {
        Intent intent;
        this.d.getClass();
        if (fw4.c()) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.optimizecenter.storage.StorageActivity"));
        } else {
            intent = null;
        }
        return gu9.v(this.b, intent, new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"), new Intent("android.settings.MEMORY_CARD_SETTINGS"));
    }

    public final Intent p() {
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        intent.setData(Uri.parse("package:ir.mservices.market"));
        return gu9.v(this.b, intent, new Intent("android.settings.USAGE_ACCESS_SETTINGS"), new Intent("android.settings.SETTINGS"));
    }

    public final boolean s(String str) {
        js3.p(str, "packageName");
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || !dp3.c(this.b)) {
            return false;
        }
        String strH = a77.h(str);
        js3.p(strH, "destFilePath");
        if (i <= 29) {
            return false;
        }
        File file = new File(strH);
        return ((file.mkdirs() || file.isDirectory()) && file.canWrite()) ? false : true;
    }

    public final void t(String str) {
        Object objA;
        Object e87Var;
        Context context = this.b;
        js3.p(str, "folder");
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                Uri uriBuildDocumentUri = DocumentsContract.buildDocumentUri("com.android.externalstorage.documents", "primary:Download/".concat(str));
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriBuildDocumentUri, "vnd.android.document/directory");
                intent.addFlags(268435456);
                context.startActivity(gu9.v(context, intent));
                objA = tx8.a;
            } catch (Throwable th) {
                objA = b.a(th);
            }
            if (Result.a(objA) != null) {
                u();
            }
            e87Var = new e87(new Result(objA));
        } else {
            e87Var = new d87();
        }
        if (e87Var instanceof d87) {
            u();
        }
    }

    public final void u() {
        Object objA;
        Intent intent = new Intent("android.intent.action.VIEW");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        js3.o(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
        Intent intentAddFlags = intent.setDataAndType(Uri.fromFile(externalStoragePublicDirectory), "vnd.android.document/directory").addFlags(268435456);
        js3.o(intentAddFlags, "addFlags(...)");
        Intent[] intentArr = {intentAddFlags};
        Context context = this.b;
        Intent intentV = gu9.v(context, intentArr);
        if (intentV == null) {
            lw.g(null, "No activity found to open Downloads folder", null);
            return;
        }
        try {
            context.startActivity(intentV);
            objA = tx8.a;
        } catch (Throwable th) {
            objA = b.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            lw.g(thA, "Failed to open Downloads folder", null);
        }
    }

    public final void v(String str) {
        js3.p(str, "packageName");
        Context context = this.b;
        Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(new Intent(context, (Class<?>) LaunchContentActivity.class).getComponent());
        intentMakeRestartActivityTask.setAction("android.intent.action.VIEW");
        intentMakeRestartActivityTask.setData(Uri.parse("myket://download/".concat(str)));
        context.startActivity(intentMakeRestartActivityTask);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
