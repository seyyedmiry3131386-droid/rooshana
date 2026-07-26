package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class yy4 implements iv4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public yy4(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
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
        if (obj != null && yy4.class == obj.getClass()) {
            yy4 yy4Var = (yy4) obj;
            if (this.a == yy4Var.a && this.b == yy4Var.b && this.c == yy4Var.c && this.d == yy4Var.d && this.e == yy4Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return tv8.u(this.e) + ((tv8.u(this.d) + ((tv8.u(this.c) + ((tv8.u(this.b) + ((tv8.u(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
