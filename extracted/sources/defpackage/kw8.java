package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kw8 implements px3 {
    public static final kw8 a = new kw8();
    public static final nn3 b = ub1.c(mj0.a, "kotlin.UByte");

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return new gw8(cc1Var.r(b).B());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.m(b).k(((gw8) obj).a);
    }
}
