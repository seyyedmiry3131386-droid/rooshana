package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.br2;
import defpackage.fu;
import defpackage.zp8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_TrailerFinishedPlayingView extends ConstraintLayout implements br2 {
    public fu q;
    public final boolean r;

    public Hilt_TrailerFinishedPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.r) {
            return;
        }
        this.r = true;
        ((zp8) e()).getClass();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.q == null) {
            this.q = new fu(this);
        }
        return this.q.e();
    }
}
