package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u06 extends x06 {
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u06(int i, Object obj) {
        super(i);
        js3.p(obj, "key");
        this.b = obj;
    }

    @Override // defpackage.x06
    public final Object a() {
        return this.b;
    }
}
