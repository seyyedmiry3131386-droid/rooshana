package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xw8 implements px3 {
    public static final xw8 a = new xw8();
    public static final nn3 b = ub1.c(se4.a, "kotlin.ULong");

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return new tw8(cc1Var.r(b).x());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.m(b).A(((tw8) obj).a);
    }
}
