package defpackage;

import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class xf9 {
    public final List a;

    public xf9(List list) {
        js3.p(list, "displayFeatures");
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !xf9.class.equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.a, ((xf9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a.t0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
