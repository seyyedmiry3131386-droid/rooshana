package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yp5 implements px3 {
    public final px3 a;
    public final oo7 b;

    public yp5(px3 px3Var) {
        js3.p(px3Var, "serializer");
        this.a = px3Var;
        this.b = new oo7(px3Var.getDescriptor());
    }

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        if (cc1Var.y()) {
            return cc1Var.e(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && yp5.class == obj.getClass() && js3.i(this.a, ((yp5) obj).a);
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        if (obj != null) {
            q12Var.g(this.a, obj);
        } else {
            q12Var.e();
        }
    }
}
