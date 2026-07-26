package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.b;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class dg8 implements ag8 {
    public final long a;
    public final /* synthetic */ eg8 b;

    public dg8(eg8 eg8Var, long j) {
        this.b = eg8Var;
        this.a = j;
    }

    @Override // defpackage.ag8
    public final zf8 K() {
        return b.a(this.b);
    }

    @Override // defpackage.ag8
    public final long g(v04 v04Var) {
        v04 v04Var2 = (v04) ((s08) this.b.r).getValue();
        if (v04Var2 != null) {
            return v04Var.C(v04Var2, this.a);
        }
        un3.d("Tried to open context menu before the anchor was placed.");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.ag8
    public final sy6 j(v04 v04Var) {
        return ry7.c(g(v04Var), 0L);
    }
}
