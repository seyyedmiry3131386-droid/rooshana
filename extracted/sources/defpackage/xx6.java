package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class xx6 {
    public static final wx6 Companion = new wx6();
    public static final c24[] b = {a.b(LazyThreadSafetyMode.b, new js5(11))};
    public final List a;

    public /* synthetic */ xx6(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            wq2.S(i, 1, vx6.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xx6) && js3.i(this.a, ((xx6) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "RecommendationMovieListDto(movies=" + this.a + ")";
    }
}
