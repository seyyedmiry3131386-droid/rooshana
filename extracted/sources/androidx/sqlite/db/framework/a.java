package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import androidx.sqlite.db.framework.a;
import defpackage.ca7;
import defpackage.cc8;
import defpackage.dc0;
import defpackage.js3;
import defpackage.mk6;
import defpackage.oo2;
import defpackage.xj1;
import defpackage.yh0;
import io.sentry.android.core.t0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SQLiteOpenHelper {
    public static final /* synthetic */ int g = 0;
    public final Context a;
    public final ca7 b;
    public final dc0 c;
    public boolean d;
    public final mk6 e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, final ca7 ca7Var, final dc0 dc0Var) {
        String string;
        super(context, str, null, dc0Var.b, new DatabaseErrorHandler() { // from class: po2
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = a.g;
                js3.m(sQLiteDatabase);
                oo2 oo2VarW = yh0.w(ca7Var, sQLiteDatabase);
                dc0Var.getClass();
                t0.d("SupportSQLite", "Corruption reported by sqlite on database: " + oo2VarW + ".path");
                SQLiteDatabase sQLiteDatabase2 = oo2VarW.a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        dc0.h(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                js3.o(obj, "second");
                                dc0.h((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                dc0.h(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    oo2VarW.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        js3.p(context, "context");
        js3.p(dc0Var, "callback");
        this.a = context;
        this.b = ca7Var;
        this.c = dc0Var;
        if (str == null) {
            string = UUID.randomUUID().toString();
            js3.o(string, "toString(...)");
        } else {
            string = str;
        }
        this.e = new mk6(string, context.getCacheDir(), false);
    }

    public final cc8 b(boolean z) {
        mk6 mk6Var = this.e;
        try {
            mk6Var.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            SQLiteDatabase sQLiteDatabaseD = d(z);
            if (!this.d) {
                oo2 oo2VarW = yh0.w(this.b, sQLiteDatabaseD);
                mk6Var.b();
                return oo2VarW;
            }
            close();
            cc8 cc8VarB = b(z);
            mk6Var.b();
            return cc8VarB;
        } catch (Throwable th) {
            mk6Var.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        mk6 mk6Var = this.e;
        try {
            mk6Var.a(mk6Var.a);
            super.close();
            this.b.b = null;
            this.f = false;
        } finally {
            mk6Var.b();
        }
    }

    public final SQLiteDatabase d(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f;
        if (databaseName != null && !z2 && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                t0.m("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                js3.m(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            js3.m(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    js3.m(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    js3.m(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof FrameworkSQLiteOpenHelper$OpenHelper$CallbackException) {
                    FrameworkSQLiteOpenHelper$OpenHelper$CallbackException frameworkSQLiteOpenHelper$OpenHelper$CallbackException = (FrameworkSQLiteOpenHelper$OpenHelper$CallbackException) th;
                    int iOrdinal = frameworkSQLiteOpenHelper$OpenHelper$CallbackException.a.ordinal();
                    th = frameworkSQLiteOpenHelper$OpenHelper$CallbackException.b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        js3.p(sQLiteDatabase, "db");
        boolean z = this.d;
        dc0 dc0Var = this.c;
        if (!z && dc0Var.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            yh0.w(this.b, sQLiteDatabase);
            dc0Var.getClass();
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        js3.p(sQLiteDatabase, "sqLiteDatabase");
        try {
            ((xj1) this.c.c).j(new androidx.sqlite.driver.a(yh0.w(this.b, sQLiteDatabase)));
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        js3.p(sQLiteDatabase, "db");
        this.d = true;
        try {
            this.c.q(yh0.w(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        js3.p(sQLiteDatabase, "db");
        if (!this.d) {
            try {
                dc0 dc0Var = this.c;
                oo2 oo2VarW = yh0.w(this.b, sQLiteDatabase);
                xj1 xj1Var = (xj1) dc0Var.c;
                xj1Var.l(new androidx.sqlite.driver.a(oo2VarW));
                xj1Var.i = oo2VarW;
            } catch (Throwable th) {
                throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.e, th);
            }
        }
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        js3.p(sQLiteDatabase, "sqLiteDatabase");
        this.d = true;
        try {
            this.c.q(yh0.w(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName.c, th);
        }
    }
}
