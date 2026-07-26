package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.br2;
import defpackage.d04;
import defpackage.ef5;
import defpackage.fu;
import defpackage.lw8;
import defpackage.ps1;
import defpackage.u91;
import defpackage.w91;
import defpackage.yl5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MyketRecentDownloadView extends ConstraintLayout implements br2 {
    public fu q;
    public final boolean r;

    public Hilt_MyketRecentDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.r) {
            return;
        }
        this.r = true;
        MyketRecentDownloadView myketRecentDownloadView = (MyketRecentDownloadView) this;
        w91 w91Var = ((u91) ((ef5) e())).a;
        myketRecentDownloadView.s = (lw8) w91Var.E.get();
        myketRecentDownloadView.t = (yl5) w91Var.D0.get();
        myketRecentDownloadView.u = (ps1) w91Var.w.get();
        myketRecentDownloadView.v = (d04) w91Var.p.get();
        myketRecentDownloadView.w = (ir.mservices.market.version2.manager.a) w91Var.D.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.q == null) {
            this.q = new fu(this);
        }
        return this.q.e();
    }
}
