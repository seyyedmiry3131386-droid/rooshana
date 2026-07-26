package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class pa8 {
    public static final oa8 Companion = new oa8();
    public static final c24[] e = {null, null, a.b(LazyThreadSafetyMode.b, new mw7(2)), null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ pa8(int i, String str, String str2, List list, String str3) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, na8.a.getDescriptor());
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
        if (!(obj instanceof pa8)) {
            return false;
        }
        pa8 pa8Var = (pa8) obj;
        return js3.i(this.a, pa8Var.a) && js3.i(this.b, pa8Var.b) && js3.i(this.c, pa8Var.c) && js3.i(this.d, pa8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rm7.i(rm7.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SubscriptionInfoDto(title=", this.a, ", actionText=", this.b, ", items=");
        sbT.append(this.c);
        sbT.append(", subTitle=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
