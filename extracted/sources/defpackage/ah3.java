package defpackage;

import android.view.View;
import ir.mservices.market.version2.fragments.IbexFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ah3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ IbexFragment b;

    public /* synthetic */ ah3(IbexFragment ibexFragment, int i) {
        this.a = i;
        this.b = ibexFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        IbexFragment ibexFragment = this.b;
        switch (i) {
            case 0:
                js3.m(ibexFragment.i1);
                ibexFragment.y1(!r2.v.isShown());
                return;
            case 1:
                js3.m(ibexFragment.i1);
                ibexFragment.y1(!r2.v.isShown());
                return;
            default:
                int i2 = IbexFragment.r1;
                ibexFragment.q1(false);
                e62 e62Var = ibexFragment.l1;
                if (e62Var != null) {
                    e62Var.c();
                    return;
                } else {
                    js3.V("exoPlayer");
                    throw null;
                }
        }
    }
}
