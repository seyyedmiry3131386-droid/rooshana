package ir.mservices.market.virtualKeyboard;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.br2;
import defpackage.d04;
import defpackage.fu;
import defpackage.ra9;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_VirtualKeyboardView extends ConstraintLayout implements br2 {
    public fu q;
    public final boolean r;

    public Hilt_VirtualKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.r) {
            return;
        }
        this.r = true;
        ((VirtualKeyboardView) this).s = (d04) ((u91) ((ra9) e())).a.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.q == null) {
            this.q = new fu(this);
        }
        return this.q.e();
    }
}
