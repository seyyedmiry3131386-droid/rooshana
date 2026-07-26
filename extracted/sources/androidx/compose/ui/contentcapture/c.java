package androidx.compose.ui.contentcapture;

import defpackage.ck4;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final int a;
    public final long b;
    public final ContentCaptureEventType c;
    public final ck4 d;

    public c(int i, long j, ContentCaptureEventType contentCaptureEventType, ck4 ck4Var) {
        this.a = i;
        this.b = j;
        this.c = contentCaptureEventType;
        this.d = ck4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && js3.i(this.d, cVar.d);
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        int iHashCode = (this.c.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        ck4 ck4Var = this.d;
        return iHashCode + (ck4Var == null ? 0 : ck4Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
