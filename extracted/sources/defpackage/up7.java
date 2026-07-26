package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class up7 {
    public static final tp7 Companion = new tp7();
    public static final c24[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        c = new c24[]{a.b(lazyThreadSafetyMode, new js5(27)), a.b(lazyThreadSafetyMode, new js5(28))};
    }

    public /* synthetic */ up7(int i, List list, List list2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, sp7.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up7)) {
            return false;
        }
        up7 up7Var = (up7) obj;
        return js3.i(this.a, up7Var.a) && js3.i(this.b, up7Var.b);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ServiceServerListDto(serviceList=" + this.a + ", serverList=" + this.b + ")";
    }
}
