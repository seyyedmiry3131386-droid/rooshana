package defpackage;

import ir.myket.movie.common.domain.common.ItemType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class pk7 {
    public static final ok7 Companion = new ok7();
    public static final c24[] f;
    public final String a;
    public final String b;
    public final pj3 c;
    public final String d;
    public final ItemType e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.b;
        f = new c24[]{null, null, a.b(lazyThreadSafetyMode, new js5(17)), null, a.b(lazyThreadSafetyMode, new js5(18))};
    }

    public /* synthetic */ pk7(int i, String str, String str2, pj3 pj3Var, String str3, ItemType itemType) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, nk7.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = pj3Var;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = ItemType.a;
        } else {
            this.e = itemType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk7)) {
            return false;
        }
        pk7 pk7Var = (pk7) obj;
        return js3.i(this.a, pk7Var.a) && js3.i(this.b, pk7Var.b) && js3.i(this.c, pk7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("Season(id=", this.a, ", title=", this.b, ", episodes=");
        sbT.append(this.c);
        sbT.append(", analyticsName=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }

    public pk7(String str, String str2, pj3 pj3Var, String str3) {
        js3.p(str, "id");
        js3.p(str2, "title");
        js3.p(pj3Var, "episodes");
        this.a = str;
        this.b = str2;
        this.c = pj3Var;
        this.d = str3;
        this.e = ItemType.a;
    }
}
