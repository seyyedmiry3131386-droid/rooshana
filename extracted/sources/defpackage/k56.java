package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k56 extends e1 implements e66 {
    public static final k56 c = new k56(os8.e, 0);
    public final os8 a;
    public final int b;

    public k56(os8 os8Var, int i) {
        js3.p(os8Var, "node");
        this.a = os8Var;
        this.b = i;
    }

    @Override // defpackage.e1
    public final Set a() {
        return new x56(this, 0);
    }

    @Override // defpackage.e1
    public final Set b() {
        return new x56(this, 1);
    }

    @Override // defpackage.e1
    public final int c() {
        return this.b;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.e1
    public final Collection d() {
        return new hj4(1, this);
    }

    @Override // defpackage.e1, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (c() != map.size()) {
            return false;
        }
        boolean z = map instanceof h66;
        os8 os8Var = this.a;
        return z ? os8Var.g(((h66) obj).c.a, vy0.d) : map instanceof i66 ? os8Var.g(((i66) obj).d.c, vy0.e) : map instanceof k56 ? os8Var.g(((k56) obj).a, vy0.f) : map instanceof n56 ? os8Var.g(((n56) obj).c, vy0.g) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
