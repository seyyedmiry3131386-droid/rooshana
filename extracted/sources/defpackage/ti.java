package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.e;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.window.g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ti extends mu0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ti(ViewGroup viewGroup, int i) {
        super(1);
        this.c = i;
        this.d = viewGroup;
    }

    @Override // defpackage.mu0
    public final lf9 i(lf9 lf9Var, List list) {
        int i = this.c;
        ViewGroup viewGroup = this.d;
        switch (i) {
            case 0:
                dp2 dp2Var = AndroidViewHolder.A;
                return ((AndroidViewHolder) viewGroup).l(lf9Var);
            default:
                g gVar = (g) viewGroup;
                if (gVar.l) {
                    return lf9Var;
                }
                View childAt = gVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, gVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, gVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? lf9Var : lf9Var.a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // defpackage.mu0
    public final rn6 j(ue9 ue9Var, rn6 rn6Var) {
        switch (this.c) {
            case 0:
                e eVar = (e) ((AndroidViewHolder) this.d).z.H.d;
                if (!eVar.V.n) {
                    return rn6Var;
                }
                long jI = is3.I(eVar.K(0L));
                int i = (int) (jI >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jI & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jK = c26.t(eVar).k();
                int i3 = (int) (jK >> 32);
                int i4 = (int) (jK & 4294967295L);
                long j = eVar.c;
                long jI2 = is3.I(eVar.K((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jI2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jI2));
                int i7 = i6 >= 0 ? i6 : 0;
                return (i == 0 && i2 == 0 && i5 == 0 && i7 == 0) ? rn6Var : new rn6(AndroidViewHolder.k((no3) rn6Var.b, i, i2, i5, i7), AndroidViewHolder.k((no3) rn6Var.c, i, i2, i5, i7), 16);
            default:
                g gVar = (g) this.d;
                if (gVar.l) {
                    return rn6Var;
                }
                View childAt = gVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, gVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, gVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return rn6Var;
                }
                no3 no3VarC = no3.c(iMax, iMax2, iMax3, iMax4);
                int i8 = no3VarC.a;
                no3 no3Var = (no3) rn6Var.b;
                int i9 = no3VarC.b;
                int i10 = no3VarC.c;
                int i11 = no3VarC.d;
                return new rn6(lf9.e(no3Var, i8, i9, i10, i11), lf9.e((no3) rn6Var.c, i8, i9, i10, i11), 16);
        }
    }
}
