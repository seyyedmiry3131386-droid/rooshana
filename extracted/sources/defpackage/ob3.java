package defpackage;

import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.app.home.HomeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ob3 implements r7, og5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeFragment b;

    public /* synthetic */ ob3(HomeFragment homeFragment, int i) {
        this.a = i;
        this.b = homeFragment;
    }

    @Override // defpackage.r7
    public void g(Object obj) {
        Boolean bool = (Boolean) obj;
        int i = HomeFragment.y1;
        js3.p(bool, "it");
        HomeFragment homeFragment = this.b;
        FragmentActivity fragmentActivityF = homeFragment.F();
        if (fragmentActivityF != null) {
            d56 d56Var = homeFragment.v1;
            if (d56Var != null) {
                d56Var.a(fragmentActivityF, bool.booleanValue());
            } else {
                js3.V("permissionHelper");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0514  */
    @Override // defpackage.og5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.view.View r21, defpackage.qg5 r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 1952
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob3.m(android.view.View, qg5, java.lang.Object):void");
    }
}
