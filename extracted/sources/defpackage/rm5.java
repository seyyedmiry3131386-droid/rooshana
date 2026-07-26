package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class rm5 {
    public static final rm5 b = new rm5(b.T(new LinkedHashMap()));
    public final Map a;

    public rm5(Map map) {
        this.a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        List list = (List) this.a.get(lowerCase);
        if (list != null) {
            return (String) a.v0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm5) && js3.i(this.a, ((rm5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ')';
    }
}
