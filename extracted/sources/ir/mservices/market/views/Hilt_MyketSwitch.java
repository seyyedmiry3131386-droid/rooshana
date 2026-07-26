package ir.mservices.market.views;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.switchmaterial.SwitchMaterial;
import defpackage.br2;
import defpackage.d04;
import defpackage.fu;
import defpackage.nf5;
import defpackage.u91;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_MyketSwitch extends SwitchMaterial implements br2 {
    public final boolean A0;
    public fu z0;

    public Hilt_MyketSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode() || this.A0) {
            return;
        }
        this.A0 = true;
        ((MyketSwitch) this).B0 = (d04) ((u91) ((nf5) e())).a.p.get();
    }

    @Override // defpackage.br2
    public final Object e() {
        if (this.z0 == null) {
            this.z0 = new fu(this);
        }
        return this.z0.e();
    }
}
