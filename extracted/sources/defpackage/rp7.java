package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class rp7 {
    public static final qp7 Companion = new qp7();
    public static final c24[] c = {a.b(LazyThreadSafetyMode.b, new js5(26)), null};
    public final List a;
    public final ap7 b;

    public /* synthetic */ rp7(int i, List list, ap7 ap7Var) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, pp7.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = ap7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp7)) {
            return false;
        }
        rp7 rp7Var = (rp7) obj;
        return js3.i(this.a, rp7Var.a) && js3.i(this.b, rp7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServiceServerList(serviceList=" + this.a + ", serverList=" + this.b + ")";
    }

    public rp7(ArrayList arrayList, ap7 ap7Var) {
        this.a = arrayList;
        this.b = ap7Var;
    }
}
