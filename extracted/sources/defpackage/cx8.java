package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cx8 implements px3 {
    public static final cx8 a = new cx8();
    public static final nn3 b = ub1.c(jv7.a, "kotlin.UShort");

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return new yw8(cc1Var.r(b).C());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.m(b).i(((yw8) obj).a);
    }
}
