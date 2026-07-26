package defpackage;

import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public final class qk5 extends ot4 {
    @Override // defpackage.ot4, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        vt4 vt4VarA = a(i, i2, i3, charSequence);
        zj5 zj5Var = new zj5(this.a, this, vt4VarA, 1);
        vt4VarA.o = zj5Var;
        zj5Var.setHeaderTitle(vt4VarA.e);
        return zj5Var;
    }
}
