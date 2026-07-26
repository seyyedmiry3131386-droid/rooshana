package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ke8 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public ke8(String str, boolean z, List list, List list2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(list, "columns");
        js3.p(list2, "orders");
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ke8) {
            ke8 ke8Var = (ke8) obj;
            String str = ke8Var.a;
            if (this.b == ke8Var.b && js3.i(this.c, ke8Var.c) && js3.i(this.d, ke8Var.d)) {
                String str2 = this.a;
                return m88.Z(str2, "index_", false) ? m88.Z(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + rm7.i((((m88.Z(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return g88.N(g88.P("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + o37.r(this.c) + "\n            |   orders = {" + o37.q(this.d) + "\n            |}\n        "));
    }
}
