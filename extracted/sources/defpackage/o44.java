package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class o44 extends za7 {
    public final /* synthetic */ int c;
    public final SideSheetBehavior d;

    public /* synthetic */ o44(SideSheetBehavior sideSheetBehavior, int i) {
        this.c = i;
        this.d = sideSheetBehavior;
    }

    @Override // defpackage.za7
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.za7
    public final float c(int i) {
        switch (this.c) {
            case 0:
                float fI = i();
                return (i - fI) / (g() - fI);
            default:
                float f = this.d.m;
                return (f - i) / (f - g());
        }
    }

    @Override // defpackage.za7
    public final int f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // defpackage.za7
    public final int g() {
        switch (this.c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.d;
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.d;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.o);
        }
    }

    @Override // defpackage.za7
    public final int i() {
        switch (this.c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.d;
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return this.d.m;
        }
    }

    @Override // defpackage.za7
    public final int j() {
        switch (this.c) {
            case 0:
                return this.d.o;
            default:
                return this.d.m;
        }
    }

    @Override // defpackage.za7
    public final int k() {
        switch (this.c) {
            case 0:
                return -this.d.l;
            default:
                return g();
        }
    }

    @Override // defpackage.za7
    public final int l(View view) {
        switch (this.c) {
            case 0:
                return view.getRight() + this.d.o;
            default:
                return view.getLeft() - this.d.o;
        }
    }

    @Override // defpackage.za7
    public final int m(CoordinatorLayout coordinatorLayout) {
        switch (this.c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // defpackage.za7
    public final int o() {
        switch (this.c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // defpackage.za7
    public final boolean p(float f) {
        switch (this.c) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.za7
    public final boolean q(View view) {
        switch (this.c) {
            case 0:
                if (view.getRight() < (g() - i()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (g() + this.d.m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.za7
    public final boolean s(float f, float f2) {
        switch (this.c) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.za7
    public final boolean v(View view, float f) {
        switch (this.c) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.d;
                float fAbs = Math.abs((f * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.d;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.za7
    public final void y(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.c) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    @Override // defpackage.za7
    public final void z(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.c) {
            case 0:
                if (i <= this.d.m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.d.m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }
}
