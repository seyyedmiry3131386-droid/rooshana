package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class kv2 extends mz5 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public kv2(int i, float f, boolean z, boolean z2) {
        jv2 jv2Var = new jv2();
        jv2Var.c = new gp(6, jv2Var);
        jv2Var.d = f;
        jv2Var.e = i;
        jv2Var.f = z;
        jv2Var.g = z2;
        this.g = jv2Var;
    }

    @Override // defpackage.a08
    public void a(RecyclerView recyclerView) {
        switch (this.f) {
            case 0:
                if (recyclerView != null && !(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                    throw new IllegalStateException("GravityPagerSnapHelper needs a RecyclerView with a LinearLayoutManager");
                }
                jv2 jv2Var = (jv2) this.g;
                jv2Var.getClass();
                if (recyclerView != null) {
                    recyclerView.setOnFlingListener(null);
                    recyclerView.j(jv2Var.c);
                }
                super.a(recyclerView);
                return;
            default:
                super.a(recyclerView);
                return;
        }
    }

    @Override // defpackage.mz5, defpackage.a08
    public int[] b(k kVar, View view) {
        int iG;
        int iG2;
        switch (this.f) {
            case 0:
                jv2 jv2Var = (jv2) this.g;
                int i = jv2Var.e;
                int[] iArr = new int[2];
                if (!kVar.e()) {
                    iArr[0] = 0;
                } else if (jv2Var.g) {
                    if (jv2Var.f) {
                        vz1 vz1VarB = jv2Var.b(kVar);
                        iG = vz1VarB.d(view) - vz1VarB.n();
                    } else {
                        iG = jv2Var.b(kVar).g(view);
                    }
                    iArr[0] = iG;
                } else {
                    if (jv2Var.b) {
                        vz1 vz1VarB2 = jv2Var.b(kVar);
                        iG2 = (vz1VarB2.d(view) - vz1VarB2.n()) + i;
                    } else {
                        iG2 = jv2Var.b(kVar).g(view) - i;
                    }
                    iArr[0] = iG2;
                }
                iArr[1] = 0;
                return iArr;
            default:
                return super.b(kVar, view);
        }
    }

    @Override // defpackage.mz5, defpackage.a08
    public final View d(k kVar) {
        switch (this.f) {
            case 0:
                return ((jv2) this.g).a(kVar);
            default:
                if (((ViewPager2) this.g).n.b.m) {
                    return null;
                }
                return super.d(kVar);
        }
    }

    @Override // defpackage.mz5, defpackage.a08
    public int e(k kVar, int i, int i2) {
        int iH;
        switch (this.f) {
            case 0:
                View viewA = ((jv2) this.g).a(kVar);
                if (viewA == null || (iH = k.H(viewA)) == -1) {
                    return -1;
                }
                return iH;
            default:
                return super.e(kVar, i, i2);
        }
    }

    public kv2(ViewPager2 viewPager2) {
        this.g = viewPager2;
    }
}
