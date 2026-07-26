package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oo3 extends mu0 {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public oo3(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // defpackage.mu0
    public final void g(ue9 ue9Var) {
        this.c.setTranslationY(0.0f);
    }

    @Override // defpackage.mu0
    public final void h(ue9 ue9Var) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        this.d = iArr[1];
    }

    @Override // defpackage.mu0
    public final lf9 i(lf9 lf9Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((ue9) it.next()).a.d() & 8) != 0) {
                this.c.setTranslationY(yk.c(r0.a.c(), this.e, 0));
                break;
            }
        }
        return lf9Var;
    }

    @Override // defpackage.mu0
    public final rn6 j(ue9 ue9Var, rn6 rn6Var) {
        View view = this.c;
        int[] iArr = this.f;
        view.getLocationOnScreen(iArr);
        int i = this.d - iArr[1];
        this.e = i;
        view.setTranslationY(i);
        return rn6Var;
    }
}
