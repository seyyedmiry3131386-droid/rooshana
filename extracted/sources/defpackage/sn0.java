package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class sn0 {
    public static final rn0 Companion = new rn0();
    public static final c24[] c = {null, a.b(LazyThreadSafetyMode.b, new v7(21))};
    public final String a;
    public final List b;

    public /* synthetic */ sn0(int i, String str, List list) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, qn0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn0)) {
            return false;
        }
        sn0 sn0Var = (sn0) obj;
        return js3.i(this.a, sn0Var.a) && js3.i(this.b, sn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CastDto(title=" + this.a + ", people=" + this.b + ")";
    }
}
