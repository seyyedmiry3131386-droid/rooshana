package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class po6 implements la1 {
    public static final String[] k = {"_data"};
    public final Context a;
    public final ax4 b;
    public final ax4 c;
    public final Uri d;
    public final int e;
    public final int f;
    public final sv5 g;
    public final Class h;
    public volatile boolean i;
    public volatile la1 j;

    public po6(Context context, ax4 ax4Var, ax4 ax4Var2, Uri uri, int i, int i2, sv5 sv5Var, Class cls) {
        this.a = context.getApplicationContext();
        this.b = ax4Var;
        this.c = ax4Var2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.g = sv5Var;
        this.h = cls;
    }

    public final la1 a() throws Throwable {
        zw4 zw4VarA;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.a;
        sv5 sv5Var = this.g;
        int i = this.f;
        int i2 = this.e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, k, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            zw4VarA = this.b.a(file, i2, i, sv5Var);
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            Uri requireOriginal = this.d;
            boolean zG = r3.g(requireOriginal);
            ax4 ax4Var = this.c;
            if (zG && requireOriginal.getPathSegments().contains("picker")) {
                zw4VarA = ax4Var.a(requireOriginal, i2, i, sv5Var);
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                zw4VarA = ax4Var.a(requireOriginal, i2, i, sv5Var);
            }
        }
        if (zw4VarA != null) {
            return zw4VarA.c;
        }
        return null;
    }

    @Override // defpackage.la1
    public final void c() {
        la1 la1Var = this.j;
        if (la1Var != null) {
            la1Var.c();
        }
    }

    @Override // defpackage.la1
    public final void cancel() {
        this.i = true;
        la1 la1Var = this.j;
        if (la1Var != null) {
            la1Var.cancel();
        }
    }

    @Override // defpackage.la1
    public final DataSource d() {
        return DataSource.a;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) throws Throwable {
        try {
            la1 la1VarA = a();
            if (la1VarA == null) {
                ka1Var.a(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.j = la1VarA;
                if (this.i) {
                    cancel();
                } else {
                    la1VarA.e(priority, ka1Var);
                }
            }
        } catch (FileNotFoundException e) {
            ka1Var.a(e);
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        return this.h;
    }
}
