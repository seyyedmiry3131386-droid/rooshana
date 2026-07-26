package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class h7 implements hu4 {
    public final /* synthetic */ qp2 a;
    public final /* synthetic */ dp2 b;

    public h7(dp2 dp2Var, qp2 qp2Var) {
        this.a = qp2Var;
        this.b = dp2Var;
    }

    @Override // defpackage.hu4
    public final boolean a(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        return ((Boolean) this.b.invoke(menuItem)).booleanValue();
    }

    @Override // defpackage.hu4
    public final /* synthetic */ void b(Menu menu) {
    }

    @Override // defpackage.hu4
    public final void c(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        this.a.invoke(menu, menuInflater);
    }

    @Override // defpackage.hu4
    public final /* synthetic */ void d(Menu menu) {
    }
}
