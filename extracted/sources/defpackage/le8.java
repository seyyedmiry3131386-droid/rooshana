package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class le8 {
    public final String a;
    public final Object b;
    public final Set c;
    public final Set d;

    public le8(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        js3.p(abstractSet, "foreignKeys");
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le8)) {
            return false;
        }
        le8 le8Var = (le8) obj;
        if (!this.a.equals(le8Var.a) || !this.b.equals(le8Var.b) || !js3.i(this.c, le8Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = le8Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        Collection collectionJ0;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(o37.k(a.J0(this.b.values(), new ek6(9))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(o37.k(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set == null || (collectionJ0 = a.J0(set, new ek6(10))) == null) {
            collectionJ0 = EmptyList.a;
        }
        sb.append(o37.k(collectionJ0));
        sb.append("\n            |}\n        ");
        return g88.P(sb.toString());
    }
}
