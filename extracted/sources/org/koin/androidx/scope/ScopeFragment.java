package org.koin.androidx.scope;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.d;
import defpackage.c24;
import defpackage.js3;
import defpackage.lf7;
import defpackage.rh;
import defpackage.x2;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScopeFragment extends d implements rh {
    public final c24 A0 = a.a(new x2(25, this));

    @Override // defpackage.rh
    public final lf7 b() {
        return (lf7) this.A0.getValue();
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        if (b() == null) {
            throw new IllegalStateException("Required value was null.");
        }
    }
}
