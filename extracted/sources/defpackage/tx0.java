package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tx0 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final ly0 f;
    public final Set g;

    public tx0(String str, Set set, Set set2, int i, int i2, ly0 ly0Var, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = ly0Var;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static sx0 a(so6 so6Var) {
        so6[] so6VarArr = new so6[0];
        sx0 sx0Var = new sx0();
        sx0Var.a = null;
        HashSet hashSet = new HashSet();
        sx0Var.d = hashSet;
        sx0Var.e = new HashSet();
        sx0Var.b = 0;
        sx0Var.c = 0;
        sx0Var.f = new HashSet();
        hashSet.add(so6Var);
        for (so6 so6Var2 : so6VarArr) {
            c26.p(so6Var2, "Null interface");
        }
        Collections.addAll((HashSet) sx0Var.d, so6VarArr);
        return sx0Var;
    }

    public static sx0 b(Class cls) {
        return new sx0(cls, new Class[0]);
    }

    public static tx0 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(so6.a(cls));
        for (Class cls2 : clsArr) {
            c26.p(cls2, "Null interface");
            hashSet.add(so6.a(cls2));
        }
        return new tx0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v4(13, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
