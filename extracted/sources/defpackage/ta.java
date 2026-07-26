package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ta {
    public static final sa Companion = new sa();
    public static final c24[] c = {null, a.b(LazyThreadSafetyMode.b, new v7(1))};
    public final int a;
    public final Map b;

    public /* synthetic */ ta(int i, int i2, Map map) {
        if (3 != (i & 3)) {
            wq2.S(i, 3, ra.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return this.a == taVar.a && js3.i(this.b, taVar.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        Map map = this.b;
        return i + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "AdInfoDto(time=" + this.a + ", queryStrings=" + this.b + ")";
    }
}
