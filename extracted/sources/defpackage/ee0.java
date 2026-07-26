package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ee0 implements px3 {
    public static final ee0 a = new ee0();
    public static final bk6 b = new bk6("kotlin.Boolean", xj6.b);

    @Override // defpackage.px3
    public final Object deserialize(cc1 cc1Var) {
        return Boolean.valueOf(cc1Var.g());
    }

    @Override // defpackage.px3
    public final no7 getDescriptor() {
        return b;
    }

    @Override // defpackage.px3
    public final void serialize(q12 q12Var, Object obj) {
        q12Var.l(((Boolean) obj).booleanValue());
    }
}
