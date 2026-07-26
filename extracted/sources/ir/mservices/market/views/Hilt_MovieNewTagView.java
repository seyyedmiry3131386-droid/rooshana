package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.br2;
import defpackage.d04;
import defpackage.fu;
import defpackage.q45;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MovieNewTagView extends MyketTextView implements br2 {
    public fu l;
    public final boolean m;

    public Hilt_MovieNewTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.m) {
            return;
        }
        this.m = true;
        ((MovieNewTagView) this).n = (d04) ((u91) ((q45) e())).a.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.l == null) {
            this.l = new fu(this);
        }
        return this.l.e();
    }
}
