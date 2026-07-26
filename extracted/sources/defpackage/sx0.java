package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class sx0 {
    public String a = null;
    public int b;
    public int c;
    public Object d;
    public Serializable e;
    public Serializable f;
    public Object g;

    public sx0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.b = 0;
        this.c = 0;
        this.f = new HashSet();
        hashSet.add(so6.a(cls));
        for (Class cls2 : clsArr) {
            c26.p(cls2, "Null interface");
            ((HashSet) this.d).add(so6.a(cls2));
        }
    }

    public void a(vj1 vj1Var) {
        if (((HashSet) this.d).contains(vj1Var.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.e).add(vj1Var);
    }

    public tx0 b() {
        if (((ly0) this.g) != null) {
            return new tx0(this.a, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.b, this.c, (ly0) this.g, (HashSet) this.f);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }
}
