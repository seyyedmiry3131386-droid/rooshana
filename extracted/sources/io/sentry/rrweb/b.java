package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public RRWebEventType a;
    public long b = System.currentTimeMillis();

    public b(RRWebEventType rRWebEventType) {
        this.a = rRWebEventType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.a == bVar.a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }
}
