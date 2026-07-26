package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class ap7 {
    public static final zo7 Companion = new zo7();
    public static final c24[] d = {null, null, a.b(LazyThreadSafetyMode.b, new js5(21))};
    public final int a;
    public int b;
    public final List c;

    public /* synthetic */ ap7(int i, int i2, int i3, List list) {
        if (7 != (i & 7)) {
            wq2.S(i, 7, yo7.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap7)) {
            return false;
        }
        ap7 ap7Var = (ap7) obj;
        return this.a == ap7Var.a && this.b == ap7Var.b && js3.i(this.c, ap7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sbB = bl4.B(this.a, this.b, "ServerList(id=", ", index=", ", servers=");
        sbB.append(this.c);
        sbB.append(")");
        return sbB.toString();
    }

    public ap7(int i, ArrayList arrayList) {
        this.a = i;
        this.b = 0;
        this.c = arrayList;
    }
}
