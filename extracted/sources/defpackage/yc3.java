package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.social.users.common.recycler.UserCardData;

/* JADX INFO: loaded from: classes3.dex */
public final class yc3 extends l06 {
    public z09 m;
    public z09 n;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == UserCardData.c) {
            int i2 = this.l;
            z09 z09Var = this.m;
            if (z09Var != null) {
                return new b29(view, i2, z09Var);
            }
            js3.V("onUserClickListener");
            throw null;
        }
        if (i != UserCardData.d) {
            return null;
        }
        int i3 = this.l;
        z09 z09Var2 = this.n;
        if (z09Var2 != null) {
            return new d19(i3, z09Var2, view);
        }
        js3.V("onHorizontalUserClickListener");
        throw null;
    }
}
