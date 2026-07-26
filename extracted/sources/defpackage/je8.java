package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class je8 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;

    public je8(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        js3.p(str, "referenceTable");
        js3.p(str2, "onDelete");
        js3.p(str3, "onUpdate");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je8)) {
            return false;
        }
        je8 je8Var = (je8) obj;
        if (js3.i(this.a, je8Var.a) && js3.i(this.b, je8Var.b) && js3.i(this.c, je8Var.c) && this.d.equals(je8Var.d)) {
            return this.e.equals(je8Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return g88.N(g88.P("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + o37.r(a.I0(this.d)) + "\n            |   referenceColumnNames = {" + o37.q(a.I0(this.e)) + "\n            |}\n        "));
    }
}
