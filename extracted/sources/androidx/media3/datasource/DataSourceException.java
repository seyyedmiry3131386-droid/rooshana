package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public DataSourceException(int i) {
        this.a = i;
    }

    public DataSourceException(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.a = i;
    }

    public DataSourceException(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
