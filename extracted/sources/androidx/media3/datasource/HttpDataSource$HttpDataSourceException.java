package androidx.media3.datasource;

import defpackage.db1;
import defpackage.wu8;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final db1 c;
    public final int d;

    public HttpDataSource$HttpDataSourceException(db1 db1Var, int i) {
        super(i == 2000 ? 2001 : i);
        this.c = db1Var;
        this.d = 1;
    }

    public static HttpDataSource$HttpDataSourceException a(IOException iOException, db1 db1Var, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !wu8.L(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, db1Var, 2007) : new HttpDataSource$HttpDataSourceException(iOException, db1Var, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, db1 db1Var, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.c = db1Var;
        this.d = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, db1 db1Var, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.c = db1Var;
        this.d = i2;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, db1 db1Var, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.c = db1Var;
        this.d = 1;
    }
}
