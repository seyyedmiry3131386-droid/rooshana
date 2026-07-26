package androidx.sqlite.db.framework;

/* JADX INFO: loaded from: classes.dex */
final class FrameworkSQLiteOpenHelper$OpenHelper$CallbackException extends RuntimeException {
    public final FrameworkSQLiteOpenHelper$OpenHelper$CallbackName a;
    public final Throwable b;

    public FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(FrameworkSQLiteOpenHelper$OpenHelper$CallbackName frameworkSQLiteOpenHelper$OpenHelper$CallbackName, Throwable th) {
        super(th);
        this.a = frameworkSQLiteOpenHelper$OpenHelper$CallbackName;
        this.b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.b;
    }
}
