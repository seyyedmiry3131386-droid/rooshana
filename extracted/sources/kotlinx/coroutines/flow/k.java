package kotlinx.coroutines.flow;

import defpackage.bl4;
import defpackage.br9;
import defpackage.gf2;
import defpackage.ia8;
import defpackage.su7;
import defpackage.xe2;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements su7 {
    public final long a;

    public k(long j) {
        this.a = j;
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // defpackage.su7
    public final xe2 a(ia8 ia8Var) {
        return d.k(new gf2(d.C(ia8Var, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(2, null), 2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.a == ((k) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) 9223372034707292160L);
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j = this.a;
        if (j > 0) {
            listBuilder.add("stopTimeout=" + j + "ms");
        }
        return bl4.y(new StringBuilder("SharingStarted.WhileSubscribed("), kotlin.collections.a.t0(br9.q(listBuilder), null, null, null, null, 63), ')');
    }
}
