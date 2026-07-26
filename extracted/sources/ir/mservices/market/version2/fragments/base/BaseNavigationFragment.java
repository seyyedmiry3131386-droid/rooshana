package ir.mservices.market.version2.fragments.base;

import android.content.Context;
import androidx.fragment.app.d;
import defpackage.am2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNavigationFragment extends BaseFragment {
    public am2 J0;

    public final am2 C0() {
        d dVar = this;
        am2 am2Var = null;
        while (dVar != null) {
            if (dVar instanceof am2) {
                am2Var = (am2) dVar;
                dVar = null;
            } else {
                dVar = dVar.y;
            }
        }
        return am2Var != null ? am2Var : this.J0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cz2, androidx.fragment.app.d
    public void W(Context context) {
        super.W(context);
        if (!(context instanceof am2)) {
            throw new IllegalArgumentException("context must implements FragmentNavigation");
        }
        if (this.J0 == null) {
            this.J0 = (am2) context;
        }
    }
}
