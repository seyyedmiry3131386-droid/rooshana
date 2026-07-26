package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class jp7 {
    public static final ip7 Companion = new ip7();
    public static final c24[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        c = new c24[]{a.b(lazyThreadSafetyMode, new js5(22)), a.b(lazyThreadSafetyMode, new js5(23))};
    }

    public /* synthetic */ jp7(int i, List list, List list2) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, hp7.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp7)) {
            return false;
        }
        jp7 jp7Var = (jp7) obj;
        return js3.i(this.a, jp7Var.a) && js3.i(this.b, jp7Var.b);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "ServerUrlDto(asl=" + this.a + ", serviceServerLists=" + this.b + ")";
    }
}
