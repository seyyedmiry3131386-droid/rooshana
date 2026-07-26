package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class qk0 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public qk0(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(qk0 qk0Var) {
        String str = qk0Var.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(qk0Var.a);
        }
        long j = this.b - qk0Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(", ");
        return bl4.s(this.c, "]", sb);
    }
}
