package defpackage;

import ir.myket.callback.domain.models.CallbackUrlType;

/* JADX INFO: loaded from: classes3.dex */
public final class ql0 {
    public final String a;
    public final CallbackUrlType b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ql0(String str, CallbackUrlType callbackUrlType) {
        this(str, callbackUrlType, 0);
        js3.p(str, "url");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql0)) {
            return false;
        }
        ql0 ql0Var = (ql0) obj;
        return js3.i(this.a, ql0Var.a) && this.b == ql0Var.b && this.c == ql0Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallbackUrl(url=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", retryCount=");
        return dw1.k(this.c, ")", sb);
    }

    public ql0(String str, CallbackUrlType callbackUrlType, int i) {
        js3.p(str, "url");
        js3.p(callbackUrlType, "type");
        this.a = str;
        this.b = callbackUrlType;
        this.c = i;
    }
}
