package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class l71 {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(k71 k71Var);

    public final boolean equals(Object obj) {
        if (obj instanceof l71) {
            return js3.i(this.a, ((l71) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
