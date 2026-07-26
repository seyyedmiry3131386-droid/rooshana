package ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.br2;
import defpackage.fu;
import defpackage.lw8;
import defpackage.u91;
import defpackage.zk7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_SecondsView extends ConstraintLayout implements br2 {
    public fu q;
    public final boolean r;

    public Hilt_SecondsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.r) {
            return;
        }
        this.r = true;
        ((SecondsView) this).s = (lw8) ((u91) ((zk7) e())).a.E.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.q == null) {
            this.q = new fu(this);
        }
        return this.q.e();
    }
}
