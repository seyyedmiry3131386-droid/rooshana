package ir.mservices.market.social.list.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.br2;
import defpackage.fu;
import defpackage.ul6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_ProfileSearchView extends ConstraintLayout implements br2 {
    public fu q;
    public final boolean r;

    public Hilt_ProfileSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.r) {
            return;
        }
        this.r = true;
        ((ul6) e()).getClass();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.q == null) {
            this.q = new fu(this);
        }
        return this.q.e();
    }
}
