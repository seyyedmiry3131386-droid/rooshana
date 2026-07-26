package ir.mservices.market.version2.fragments.base;

import android.os.Bundle;
import defpackage.cz2;
import defpackage.d04;
import defpackage.is3;
import defpackage.lw;
import defpackage.x57;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseFragment extends cz2 {
    public static final String I0 = BaseFragment.class + "_BUNDLE_KEY_SUBSCRIBER_ID";
    public d04 F0;
    public x57 G0;
    public String H0;

    public String B0() {
        return getClass().getName();
    }

    @Override // androidx.fragment.app.d
    public void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null || bundle.isEmpty()) {
            long j = is3.p + 1;
            is3.p = j;
            this.H0 = String.valueOf(j);
        } else {
            this.H0 = bundle.getString(I0);
        }
        lw.c(this.H0, null);
    }

    @Override // androidx.fragment.app.d
    public void b0() {
        this.G0.a(this);
        this.H = true;
    }

    @Override // androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        bundle.putString(I0, this.H0);
    }
}
