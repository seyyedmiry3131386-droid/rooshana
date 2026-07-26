package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xa2 {
    public final String a;
    public final Map b;

    public xa2(Map map, String str) {
        this.a = str;
        this.b = map;
    }

    public static xa2 a(String str) {
        return new xa2(Collections.EMPTY_MAP, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa2)) {
            return false;
        }
        xa2 xa2Var = (xa2) obj;
        return this.a.equals(xa2Var.a) && this.b.equals(xa2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
