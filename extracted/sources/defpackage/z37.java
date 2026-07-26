package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z37 implements Comparable {
    public long b = -9223372036854775807L;
    public final ArrayList a = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.b, ((z37) obj).b);
    }
}
