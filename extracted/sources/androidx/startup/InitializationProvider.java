package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import defpackage.ia7;
import defpackage.wv8;
import io.sentry.android.core.performance.g;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        g.e(this);
        Context context = getContext();
        if (context == null) {
            StartupException startupException = new StartupException("Context cannot be null");
            g.f(this);
            throw startupException;
        }
        if (context.getApplicationContext() != null) {
            wv8 wv8VarY = wv8.y(context);
            Class<?> cls = getClass();
            Context context2 = (Context) wv8VarY.d;
            try {
                try {
                    ia7.d("Startup");
                    wv8VarY.s(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new StartupException(e);
                }
            } finally {
                Trace.endSection();
            }
        }
        g.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
