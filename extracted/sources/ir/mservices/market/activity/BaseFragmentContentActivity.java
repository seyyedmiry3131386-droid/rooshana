package ir.mservices.market.activity;

import android.view.MenuItem;
import androidx.fragment.app.d;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.f88;
import defpackage.js3;
import defpackage.q40;
import defpackage.sb7;
import defpackage.sj8;
import defpackage.t40;
import defpackage.t61;
import defpackage.yq2;
import defpackage.zk8;
import ir.mservices.market.common.base.BaseContentFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseFragmentContentActivity extends Hilt_BaseFragmentContentActivity {
    @Override // ir.mservices.market.activity.BaseContentActivity
    public final void X() {
        super.X();
        zk8 zk8VarP = P();
        if (zk8VarP != null) {
            zk8VarP.i0();
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity
    public void e0(d dVar) {
        js3.p(dVar, "fragment");
        super.e0(dVar);
        d dVarS = s();
        BaseContentFragment baseContentFragment = dVarS instanceof BaseContentFragment ? (BaseContentFragment) dVarS : null;
        if (baseContentFragment != null) {
            BaseContentFragment baseContentFragment2 = baseContentFragment.X0() ? baseContentFragment : null;
            if (baseContentFragment2 != null) {
                String strQ0 = baseContentFragment2.Q0(this);
                if (f88.n0(strQ0)) {
                    c0("");
                } else {
                    c0(strQ0);
                    int i = sj8.b().m;
                    MaterialToolbar materialToolbarV = V();
                    if (materialToolbarV != null) {
                        materialToolbarV.setTitleTextColor(i);
                        materialToolbarV.setSubtitleTextColor(i);
                    }
                }
            }
        }
        b0("");
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity
    public boolean f0(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        d dVarS = s();
        BaseContentFragment baseContentFragment = dVarS instanceof BaseContentFragment ? (BaseContentFragment) dVarS : null;
        if (baseContentFragment != null) {
            BaseContentFragment baseContentFragment2 = baseContentFragment.a >= 7 ? baseContentFragment : null;
            if (baseContentFragment2 != null) {
                yq2 yq2VarE1 = baseContentFragment2.e1();
                sb7.p("MyketContentActivity", t61.i(T(), " Up Click"), baseContentFragment2.I0());
                if (!js3.i(yq2VarE1, t40.g)) {
                    if (!js3.i(yq2VarE1, q40.g)) {
                        return false;
                    }
                    finish();
                    return false;
                }
                if (baseContentFragment2.E0()) {
                    p();
                    return false;
                }
                q();
                return false;
            }
        }
        q();
        return false;
    }
}
