package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class hp1 implements Closeable {
    public final String a;
    public final long b;
    public final ArrayList c;
    public final /* synthetic */ mp1 d;

    public hp1(mp1 mp1Var, String str, long j, ArrayList arrayList, long[] jArr) {
        js3.p(str, "key");
        js3.p(jArr, "lengths");
        this.d = mp1Var;
        this.a = str;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            gh9.b((t18) it.next());
        }
    }
}
