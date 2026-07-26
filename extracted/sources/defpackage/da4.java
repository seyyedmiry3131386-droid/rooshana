package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class da4 {
    public static final AtomicLong d = new AtomicLong();
    public final db1 a;
    public final Uri b;
    public final long c;

    /* JADX WARN: Illegal instructions before constructor call */
    public da4(db1 db1Var) {
        Uri uri = db1Var.a;
        Map map = Collections.EMPTY_MAP;
        this(db1Var, uri, 0L);
    }

    public da4(db1 db1Var, Uri uri, long j) {
        this.a = db1Var;
        this.b = uri;
        this.c = j;
    }
}
