package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sw8 implements px3 {
    public static final sw8 a = new sw8();
    public static final nn3 b = ub1.c(xq3.a, "kotlin.UInt");

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return new ow8(cc1Var.r(b).p());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.m(b).y(((ow8) obj).a);
    }
}
