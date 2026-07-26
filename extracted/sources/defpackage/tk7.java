package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class tk7 {
    public static final sk7 Companion = new sk7();
    public static final c24[] e = {null, null, a.b(LazyThreadSafetyMode.b, new js5(19)), null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;

    public /* synthetic */ tk7(int i, String str, String str2, List list, String str3) {
        if (15 != (i & 15)) {
            wq2.S(i, 15, rk7.a.getDescriptor());
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
        if (!(obj instanceof tk7)) {
            return false;
        }
        tk7 tk7Var = (tk7) obj;
        return js3.i(this.a, tk7Var.a) && js3.i(this.b, tk7Var.b) && js3.i(this.c, tk7Var.c) && js3.i(this.d, tk7Var.d);
    }

    public final int hashCode() {
        int i = rm7.i(rm7.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("SeasonDto(id=", this.a, ", title=", this.b, ", episodes=");
        sbT.append(this.c);
        sbT.append(", analyticsName=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
