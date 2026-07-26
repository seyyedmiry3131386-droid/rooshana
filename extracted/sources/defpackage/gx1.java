package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* JADX INFO: loaded from: classes.dex */
public final class gx1 extends hh2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx1(int i, Object obj) {
        super(12, (byte) 0);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.hh2
    public final Object B(xf4 xf4Var) {
        switch (this.e) {
            case 0:
                Float f = (Float) ((hh2) this.f).B(xf4Var);
                if (f == null) {
                    return null;
                }
                return Float.valueOf(f.floatValue() * 2.55f);
            default:
                return new PorterDuffColorFilter(((u52) this.f).b, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
