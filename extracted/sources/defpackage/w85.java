package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class w85 implements iv4 {
    public final long a;
    public final long b;
    public final long c;

    public w85(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.iv4
    public final /* synthetic */ b a() {
        return null;
    }

    @Override // defpackage.iv4
    public final /* synthetic */ void b(pp4 pp4Var) {
    }

    @Override // defpackage.iv4
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w85)) {
            return false;
        }
        w85 w85Var = (w85) obj;
        return this.a == w85Var.a && this.b == w85Var.b && this.c == w85Var.c;
    }

    public final int hashCode() {
        return tv8.u(this.c) + ((tv8.u(this.b) + ((tv8.u(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
