package defpackage;

import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import me.relex.circleindicator.CircleIndicator2;

/* JADX INFO: loaded from: classes3.dex */
public final class kr0 extends mz6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mz6
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = CircleIndicator2.l;
                ((CircleIndicator2) obj).getClass();
                break;
            case 1:
                ((wm2) obj).e(true);
                break;
            case 2:
                cm5 cm5Var = (cm5) obj;
                cm5Var.e = cm5Var.c.c();
                bl0 bl0Var = cm5Var.d;
                ((u01) bl0Var.a).f();
                bl0Var.b();
                break;
            case 3:
                ((PagingRecyclerListContentFragment) obj).Y0 = false;
                break;
            default:
                ((ai0) obj).u();
                break;
        }
    }

    @Override // defpackage.mz6
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                a();
                break;
            case 1:
                a();
                break;
            case 2:
                cm5 cm5Var = (cm5) this.b;
                bl0 bl0Var = cm5Var.d;
                ((u01) bl0Var.a).h(i + bl0Var.c(cm5Var), i2, null);
                break;
            case 3:
                ((PagingRecyclerListContentFragment) this.b).Y0 = false;
                break;
            default:
                ((ai0) this.b).u();
                break;
        }
    }

    @Override // defpackage.mz6
    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                b(i, i2);
                a();
                break;
            case 1:
                a();
                break;
            case 2:
                cm5 cm5Var = (cm5) this.b;
                bl0 bl0Var = cm5Var.d;
                ((u01) bl0Var.a).h(i + bl0Var.c(cm5Var), i2, obj);
                break;
            case 3:
            default:
                super.c(i, i2, obj);
                break;
            case 4:
                ((ai0) this.b).u();
                break;
        }
    }

    @Override // defpackage.mz6
    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                a();
                break;
            case 1:
                a();
                break;
            case 2:
                cm5 cm5Var = (cm5) this.b;
                cm5Var.e += i2;
                bl0 bl0Var = cm5Var.d;
                ((u01) bl0Var.a).i(i + bl0Var.c(cm5Var), i2);
                if (cm5Var.e > 0 && cm5Var.c.c == RecyclerView$Adapter$StateRestorationPolicy.b) {
                    cm5Var.d.b();
                    break;
                }
                break;
            case 3:
                ((PagingRecyclerListContentFragment) this.b).Y0 = false;
                break;
            default:
                ((ai0) this.b).u();
                break;
        }
    }

    @Override // defpackage.mz6
    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                a();
                break;
            case 1:
                a();
                break;
            case 2:
                cm5 cm5Var = (cm5) this.b;
                bl0 bl0Var = cm5Var.d;
                int iC = bl0Var.c(cm5Var);
                ((u01) bl0Var.a).g(i + iC, i2 + iC);
                break;
            case 3:
                ((PagingRecyclerListContentFragment) this.b).Y0 = false;
                break;
            default:
                ((ai0) this.b).u();
                break;
        }
    }

    @Override // defpackage.mz6
    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                a();
                break;
            case 1:
                a();
                break;
            case 2:
                cm5 cm5Var = (cm5) this.b;
                cm5Var.e -= i2;
                bl0 bl0Var = cm5Var.d;
                ((u01) bl0Var.a).j(i + bl0Var.c(cm5Var), i2);
                if (cm5Var.e < 1 && cm5Var.c.c == RecyclerView$Adapter$StateRestorationPolicy.b) {
                    cm5Var.d.b();
                    break;
                }
                break;
            case 3:
                ((PagingRecyclerListContentFragment) this.b).Y0 = false;
                break;
            default:
                ((ai0) this.b).u();
                break;
        }
    }

    @Override // defpackage.mz6
    public void g() {
        switch (this.a) {
            case 2:
                ((cm5) this.b).d.b();
                break;
        }
    }
}
