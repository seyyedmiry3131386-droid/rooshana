package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class n89 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n89(ViewPager2 viewPager2) {
        super(1);
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void G0(b07 b07Var, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.G0(b07Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final void W(l lVar, b07 b07Var, t3 t3Var) {
        super.W(lVar, b07Var, t3Var);
        this.E.t.getClass();
    }

    @Override // androidx.recyclerview.widget.k
    public final void Y(l lVar, b07 b07Var, View view, t3 t3Var) {
        int iH;
        ViewPager2 viewPager2 = (ViewPager2) this.E.t.d;
        int iH2 = 0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.g.getClass();
            iH = k.H(view);
        } else {
            iH = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.g.getClass();
            iH2 = k.H(view);
        }
        t3Var.o(s3.a(iH, 1, iH2, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean k0(l lVar, b07 b07Var, int i, Bundle bundle) {
        this.E.t.getClass();
        return super.k0(lVar, b07Var, i, bundle);
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean q0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
