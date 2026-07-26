package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class wj5 extends ot4 {
    public final int A;
    public final boolean B;
    public final Class z;

    public wj5(Context context, Class cls, int i, boolean z) {
        super(context);
        this.z = cls;
        this.A = i;
        this.B = z;
    }

    @Override // defpackage.ot4
    public final vt4 a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.A;
        if (size > i4) {
            String simpleName = this.z.getSimpleName();
            throw new IllegalArgumentException(dw1.s(o40.B(i4, "Maximum number of items supported by ", simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
        }
        y();
        vt4 vt4VarA = super.a(i, i2, i3, charSequence);
        x();
        return vt4VarA;
    }

    @Override // defpackage.ot4, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        if (!this.B) {
            throw new UnsupportedOperationException(this.z.getSimpleName().concat(" does not support submenus"));
        }
        vt4 vt4VarA = a(i, i2, i3, charSequence);
        zj5 zj5Var = new zj5(this.a, this, vt4VarA, 0);
        vt4VarA.o = zj5Var;
        zj5Var.setHeaderTitle(vt4VarA.e);
        return zj5Var;
    }
}
