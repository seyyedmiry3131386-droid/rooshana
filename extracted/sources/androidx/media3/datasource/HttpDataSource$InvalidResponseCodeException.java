package androidx.media3.datasource;

import defpackage.db1;
import defpackage.rm7;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int e;
    public final Map f;

    public HttpDataSource$InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map, db1 db1Var) {
        super(rm7.n(i, "Response code: "), dataSourceException, db1Var, 2004);
        this.e = i;
        this.f = map;
    }
}
