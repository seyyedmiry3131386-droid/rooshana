package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import defpackage.br2;
import defpackage.d04;
import defpackage.fu;
import defpackage.mg5;
import defpackage.u91;
import defpackage.w91;
import defpackage.x57;
import ir.mservices.market.version2.services.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MyketVideoView extends CardView implements br2 {
    public fu h;
    public final boolean i;

    public Hilt_MyketVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.i) {
            return;
        }
        this.i = true;
        MyketVideoView myketVideoView = (MyketVideoView) this;
        w91 w91Var = ((u91) ((mg5) e())).a;
        myketVideoView.j = (d) w91Var.S.get();
        myketVideoView.k = (x57) w91Var.G.get();
        myketVideoView.l = (d04) w91Var.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.h == null) {
            this.h = new fu(this);
        }
        return this.h.e();
    }
}
