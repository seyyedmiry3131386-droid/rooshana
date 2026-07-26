package defpackage;

import androidx.media3.ui.PlayerControlView;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.appDetail.DetailToolbarView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ep implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ep(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                AppDetailFragment appDetailFragment = (AppDetailFragment) obj;
                if (!z) {
                    DetailToolbarView detailToolbarView = appDetailFragment.F1;
                    if (detailToolbarView != null) {
                        detailToolbarView.setVisibility(8);
                    }
                } else {
                    int i2 = AppDetailFragment.M1;
                }
                break;
            case 1:
                b62 b62Var = ((n00) obj).c;
                String str = j29.a;
                e62 e62Var = b62Var.a;
                if (e62Var.b0 != z) {
                    e62Var.b0 = z;
                    e62Var.m.f(23, new x52(1, z));
                    break;
                }
                break;
            default:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                if (!z) {
                    playerControlView.g();
                }
                break;
        }
    }

    public /* synthetic */ ep(n00 n00Var, boolean z) {
        this.a = 1;
        this.c = n00Var;
        this.b = z;
    }
}
