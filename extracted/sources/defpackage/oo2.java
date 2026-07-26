package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class oo2 implements cc8 {
    public static final String[] b = new String[0];
    public static final Object c;
    public static final Object d;
    public final SQLiteDatabase a;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        c = a.b(lazyThreadSafetyMode, new qq1(7));
        d = a.b(lazyThreadSafetyMode, new qq1(8));
    }

    public oo2(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.cc8
    public final boolean B() {
        return this.a.isDatabaseIntegrityOk();
    }

    @Override // defpackage.cc8
    public final ic8 F(String str) {
        js3.p(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement(str);
        js3.o(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new so2(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.cc8
    public final Cursor G0(ut4 ut4Var) {
        final bh bhVar = new bh(1, ut4Var);
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: no2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) bhVar.g(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ((gc8) ut4Var.b).b, b, null);
        js3.o(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [c24, java.lang.Object] */
    @Override // defpackage.cc8
    public final void O() throws IllegalAccessException, InvocationTargetException {
        ?? r2 = d;
        if (((Method) r2.getValue()) != null) {
            ?? r3 = c;
            if (((Method) r3.getValue()) != null) {
                Method method = (Method) r2.getValue();
                js3.m(method);
                Method method2 = (Method) r3.getValue();
                js3.m(method2);
                Object objInvoke = method2.invoke(this.a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        p();
    }

    @Override // defpackage.cc8
    public final boolean V0() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.cc8
    public final long X() {
        return this.a.getPageSize();
    }

    @Override // defpackage.cc8
    public final boolean Z() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // defpackage.cc8
    public final void b0() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.cc8
    public final long c0() {
        return this.a.getMaximumSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.cc8
    public final void d0() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.cc8
    public final int getVersion() {
        return this.a.getVersion();
    }

    @Override // defpackage.cc8
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.cc8
    public final boolean isReadOnly() {
        return this.a.isReadOnly();
    }

    @Override // defpackage.cc8
    public final String m() {
        return this.a.getPath();
    }

    @Override // defpackage.cc8
    public final boolean n() {
        return this.a.inTransaction();
    }

    @Override // defpackage.cc8
    public final void p() {
        this.a.beginTransaction();
    }

    @Override // defpackage.cc8
    public final boolean q0() {
        return this.a.yieldIfContendedSafely();
    }

    @Override // defpackage.cc8
    public final List s() {
        return this.a.getAttachedDbs();
    }

    @Override // defpackage.cc8
    public final void w() {
        this.a.disableWriteAheadLogging();
    }

    @Override // defpackage.cc8
    public final boolean x0() {
        return this.a.isDbLockedByCurrentThread();
    }

    @Override // defpackage.cc8
    public final void y0() {
        this.a.endTransaction();
    }
}
