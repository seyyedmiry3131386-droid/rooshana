package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class px6 {
    public static final ox6 Companion = new ox6();
    public static final c24[] e = {null, null, a.b(LazyThreadSafetyMode.b, new js5(9)), null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ px6(int i, String str, String str2, List list, String str3) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, nx6.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px6)) {
            return false;
        }
        px6 px6Var = (px6) obj;
        return js3.i(this.a, px6Var.a) && js3.i(this.b, px6Var.b) && js3.i(this.c, px6Var.c) && js3.i(this.d, px6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + rm7.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("RecommendationDto(title=", this.a, ", analyticsName=", this.b, ", movies=");
        sbT.append(this.c);
        sbT.append(", displayMode=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
