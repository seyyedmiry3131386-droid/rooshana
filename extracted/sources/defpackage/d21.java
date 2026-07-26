package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d21 extends lg4 {
    public final /* synthetic */ e21 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d21(e21 e21Var) {
        super(25);
        this.a = e21Var;
    }

    @Override // defpackage.lg4
    public final Object create(Object obj) {
        return this.a.a.m1((String) obj);
    }

    @Override // defpackage.lg4
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) throws Exception {
        Object obj4 = (String) obj;
        rb7 rb7Var = (rb7) obj2;
        js3.p(obj4, "key");
        js3.p(rb7Var, "oldValue");
        rb7Var.close();
        super.entryRemoved(z, obj4, rb7Var, (rb7) obj3);
    }
}
