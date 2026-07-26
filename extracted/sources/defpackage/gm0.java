package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gm0 implements ng2 {
    public static final gm0 a = new gm0();
    public static Boolean b;

    @Override // defpackage.ng2
    public final boolean a() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw t61.r("canFocus is read before it is written");
    }

    @Override // defpackage.ng2
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.ng2
    public final /* synthetic */ void c(dp2 dp2Var) {
    }

    @Override // defpackage.ng2
    public final /* synthetic */ void d(dp2 dp2Var) {
    }

    @Override // defpackage.ng2
    public final /* synthetic */ void e(sy6 sy6Var) {
    }
}
