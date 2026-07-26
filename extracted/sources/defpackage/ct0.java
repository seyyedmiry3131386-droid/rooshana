package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.a;
import androidx.compose.foundation.gestures.p;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import androidx.compose.ui.platform.l;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ct0 extends a {
    public ah6 M;

    @Override // androidx.compose.foundation.a, defpackage.dh6
    public final void B() {
        super.B();
        if (this.M != null) {
            this.M = null;
            J0(false);
        }
    }

    @Override // androidx.compose.foundation.a
    public final f G0() {
        return null;
    }

    @Override // androidx.compose.foundation.a
    public final boolean O0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.a
    public final void P0(KeyEvent keyEvent) {
        this.w.invoke();
    }

    @Override // androidx.compose.foundation.a, defpackage.dh6
    public final void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        super.t(vg6Var, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.b) {
            if (pointerEventPass != PointerEventPass.c || this.M == null) {
                return;
            }
            List list = vg6Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ah6 ah6Var = (ah6) list.get(i);
                if (ah6Var.b() && !ah6Var.equals(this.M)) {
                    this.M = null;
                    J0(false);
                    return;
                }
            }
            return;
        }
        ah6 ah6Var2 = this.M;
        if (ah6Var2 == null) {
            if (p.g(vg6Var, true, false)) {
                ah6 ah6Var3 = (ah6) vg6Var.a.get(0);
                ah6Var3.a();
                this.M = ah6Var3;
                if (this.v) {
                    L0(ah6Var3.c, false);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = vg6Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!at2.P((ah6) list2.get(i2))) {
                long jH0 = y40.H(this).A.h0(((v69) y97.t(this, l.s)).d());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jH0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jH0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ah6 ah6Var4 = (ah6) list2.get(i3);
                    if (ah6Var4.b() || at2.e0(ah6Var4, j, jFloatToRawIntBits)) {
                        this.M = null;
                        J0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((ah6) list2.get(0)).a();
        if (this.v) {
            K0(ah6Var2.c, false);
            this.w.invoke();
        }
        this.M = null;
    }
}
