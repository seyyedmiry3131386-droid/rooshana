package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class bv implements dv, hv {
    public final /* synthetic */ int a;
    public float b;

    public bv(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 0;
                break;
            case 2:
                this.b = 0;
                break;
            case 3:
                this.b = 0;
                break;
            case 4:
                break;
            default:
                this.b = 0;
                break;
        }
    }

    @Override // defpackage.dv, defpackage.hv
    public float e() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.dv
    public void k(qj1 qj1Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        switch (this.a) {
            case 0:
                if (layoutDirection != LayoutDirection.a) {
                    jv.a(i, iArr, iArr2, true);
                } else {
                    jv.a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (layoutDirection != LayoutDirection.a) {
                    jv.d(i, iArr, iArr2, true);
                } else {
                    jv.d(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (layoutDirection != LayoutDirection.a) {
                    jv.e(i, iArr, iArr2, true);
                } else {
                    jv.e(i, iArr, iArr2, false);
                }
                break;
            default:
                if (layoutDirection != LayoutDirection.a) {
                    jv.f(i, iArr, iArr2, true);
                } else {
                    jv.f(i, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // defpackage.hv
    public void o(int i, el4 el4Var, int[] iArr, int[] iArr2) {
        switch (this.a) {
            case 0:
                jv.a(i, iArr, iArr2, false);
                break;
            case 1:
                jv.d(i, iArr, iArr2, false);
                break;
            case 2:
                jv.e(i, iArr, iArr2, false);
                break;
            default:
                jv.f(i, iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
