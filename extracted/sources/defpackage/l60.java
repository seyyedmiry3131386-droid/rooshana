package defpackage;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.g;
import ir.mservices.market.common.base.BaseContentFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class l60 implements hu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l60(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final /* synthetic */ void e(Menu menu) {
    }

    private final /* synthetic */ void f(Menu menu) {
    }

    @Override // defpackage.hu4
    public final boolean a(MenuItem menuItem) {
        switch (this.a) {
            case 0:
                js3.p(menuItem, "menuItem");
                return ((BaseContentFragment) this.b).g1(menuItem);
            default:
                return ((g) this.b).q();
        }
    }

    @Override // defpackage.hu4
    public final void b(Menu menu) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((g) this.b).r();
                break;
        }
    }

    @Override // defpackage.hu4
    public final void c(Menu menu, MenuInflater menuInflater) {
        switch (this.a) {
            case 0:
                js3.p(menu, "menu");
                js3.p(menuInflater, "menuInflater");
                ((BaseContentFragment) this.b).f1(menu, menuInflater);
                break;
            default:
                ((g) this.b).l();
                break;
        }
    }

    @Override // defpackage.hu4
    public final void d(Menu menu) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((g) this.b).u();
                break;
        }
    }
}
