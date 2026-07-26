package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wp0 implements px3 {
    public static final wp0 a = new wp0();
    public static final bk6 b = new bk6("kotlin.Char", xj6.d);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Character.valueOf(cc1Var.h());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.r(((Character) obj).charValue());
    }
}
