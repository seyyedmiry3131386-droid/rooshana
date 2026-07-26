package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import defpackage.br2;
import defpackage.d04;
import defpackage.fu;
import defpackage.s75;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MovieTabView extends TabLayout implements br2 {
    public final boolean A0;
    public fu z0;

    public Hilt_MovieTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode() || this.A0) {
            return;
        }
        this.A0 = true;
        ((MovieTabView) this).C0 = (d04) ((u91) ((s75) e())).a.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.z0 == null) {
            this.z0 = new fu(this);
        }
        return this.z0.e();
    }
}
