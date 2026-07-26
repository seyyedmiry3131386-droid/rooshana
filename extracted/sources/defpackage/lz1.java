package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class lz1 {
    public static final long[] e = new long[0];
    public long a;
    public final Object b;
    public final Object c;
    public final Object d;

    public lz1(File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
        this.b = file;
        this.c = parcelFileDescriptor;
        this.a = j;
        this.d = uri;
    }

    public int a(yv6 yv6Var, long j) {
        TimeZone timeZone = ih9.a;
        ArrayList arrayList = yv6Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + yv6Var.c.a.h + " was leaked. Did you forget to close a response body?";
                k96 k96Var = k96.a;
                k96.a.k(((vv6) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    yv6Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public lz1(no7 no7Var, qp2 qp2Var) {
        js3.p(no7Var, "descriptor");
        this.b = no7Var;
        this.c = qp2Var;
        int iE = no7Var.e();
        if (iE <= 64) {
            this.a = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.a = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.d = jArr;
    }

    public lz1(gf8 gf8Var) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        js3.p(gf8Var, "taskRunner");
        js3.p(timeUnit, "timeUnit");
        this.a = timeUnit.toNanos(5L);
        this.b = gf8Var.d();
        this.c = new jp1(this, dw1.s(new StringBuilder(), ih9.b, " ConnectionPool connection closer"), 1);
        this.d = new ConcurrentLinkedQueue();
    }
}
