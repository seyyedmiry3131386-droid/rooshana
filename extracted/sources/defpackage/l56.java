package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class l56 extends e1 implements f66 {
    public static final l56 c = new l56(ps8.e, 0);
    public final ps8 a;
    public final int b;

    public l56(ps8 ps8Var, int i) {
        this.a = ps8Var;
        this.b = i;
    }

    @Override // defpackage.e1
    public final Set a() {
        return new y56(this, 0);
    }

    @Override // defpackage.e1
    public final Set b() {
        return new y56(this, 1);
    }

    @Override // defpackage.e1
    public final int c() {
        return this.b;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.e1
    public final Collection d() {
        return new hj4(2, this);
    }

    @Override // defpackage.f66
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public o56 builder() {
        return new o56(this);
    }

    public final l56 f(Object obj, i84 i84Var) {
        dc0 dc0VarU = this.a.u(obj, obj != null ? obj.hashCode() : 0, i84Var, 0);
        return dc0VarU == null ? this : new l56((ps8) dc0VarU.c, this.b + dc0VarU.b);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
