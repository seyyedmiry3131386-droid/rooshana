package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.social.list.common.app.recycler.ProfileAppData;
import ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData;
import ir.mservices.market.social.list.items.recycler.ProfileListAddTitleData;
import ir.mservices.market.social.list.items.recycler.SelectedListAddItemData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class c90 extends a {
    public sm7 l;
    public sm7 m;
    public sm7 n;
    public sm7 o;
    public sm7 p;
    public sm7 q;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == ProfileListAddTitleData.b) {
            sm7 sm7Var = this.p;
            if (sm7Var != null) {
                return new ir.mservices.market.social.list.items.recycler.a(view, sm7Var);
            }
            js3.V("onTitleClickListener");
            throw null;
        }
        if (i == ProfileAppData.c) {
            sm7 sm7Var2 = this.l;
            if (sm7Var2 == null) {
                js3.V("onAppClickListener");
                throw null;
            }
            sm7 sm7Var3 = this.n;
            if (sm7Var3 != null) {
                return new ir.mservices.market.social.list.common.app.recycler.a(view, sm7Var2, sm7Var3);
            }
            js3.V("onMoveAppToTopClickListener");
            throw null;
        }
        if (i != ProfileMovieData.c) {
            if (i != SelectedListAddItemData.b) {
                return null;
            }
            sm7 sm7Var4 = this.q;
            if (sm7Var4 != null) {
                return new vm7(view, sm7Var4);
            }
            js3.V("onAddItemClickListener");
            throw null;
        }
        sm7 sm7Var5 = this.m;
        if (sm7Var5 == null) {
            js3.V("onMovieClickListener");
            throw null;
        }
        sm7 sm7Var6 = this.o;
        if (sm7Var6 != null) {
            return new ir.mservices.market.social.list.common.movie.recycler.a(view, sm7Var5, sm7Var6);
        }
        js3.V("onMoveMovieToTopClickListener");
        throw null;
    }
}
