package defpackage;

import android.os.Bundle;
import ir.mservices.market.version2.fragments.IbexFragment;
import ir.myket.callback.manager.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dh3 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IbexFragment b;

    public /* synthetic */ dh3(IbexFragment ibexFragment, int i) {
        this.a = i;
        this.b = ibexFragment;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return at2.c0(this.b).b(g27.a(a.class), null, null);
            default:
                IbexFragment ibexFragment = this.b;
                Bundle bundle = ibexFragment.g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + ibexFragment + " has null arguments");
        }
    }
}
