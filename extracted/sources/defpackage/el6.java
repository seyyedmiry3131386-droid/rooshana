package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.social.profile.list.app.recycler.ProfileListAppListData;
import ir.mservices.market.social.profile.list.movie.recycler.ProfileListMovieListData;
import ir.mservices.market.social.profile.list.recycler.ProfileListAddData;
import ir.mservices.market.social.profile.list.recycler.ProfileListButtonsData;
import ir.mservices.market.social.profile.list.recycler.ProfileListEmptyData;
import ir.mservices.market.social.profile.list.recycler.ProfileListTitleData;
import ir.mservices.market.social.profile.list.recycler.b;
import ir.mservices.market.social.profile.list.recycler.c;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class el6 extends a {
    public final boolean l;
    public gl6 m;
    public gl6 n;
    public gl6 o;
    public gl6 p;
    public gl6 q;
    public gl6 r;
    public gl6 s;
    public gl6 t;
    public gl6 u;
    public gl6 v;
    public GraphicUtils$Dimension w;

    public el6(boolean z) {
        super(1);
        this.l = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == ProfileListEmptyData.d) {
            gl6 gl6Var = this.m;
            if (gl6Var != null) {
                return new c(view, gl6Var);
            }
            js3.V("onEmptyAddClickListener");
            throw null;
        }
        if (i == ProfileListAddData.b) {
            gl6 gl6Var2 = this.n;
            if (gl6Var2 != null) {
                return new ir.mservices.market.social.profile.list.recycler.a(view, gl6Var2);
            }
            js3.V("onAddClickListener");
            throw null;
        }
        if (i == ProfileListTitleData.d) {
            gl6 gl6Var3 = this.o;
            if (gl6Var3 == null) {
                js3.V("onMoreClickListener");
                throw null;
            }
            gl6 gl6Var4 = this.q;
            if (gl6Var4 != null) {
                return new ml6(view, gl6Var3, gl6Var4);
            }
            js3.V("onTitleClickListener");
            throw null;
        }
        int i2 = ProfileListAppListData.h;
        boolean z = this.l;
        if (i == i2) {
            GraphicUtils$Dimension graphicUtils$Dimension = this.w;
            if (graphicUtils$Dimension == null) {
                js3.V("dimension");
                throw null;
            }
            gl6 gl6Var5 = this.u;
            if (gl6Var5 != null) {
                return new fl6(view, graphicUtils$Dimension, z, gl6Var5);
            }
            js3.V("onAppClickListener");
            throw null;
        }
        if (i == ProfileListMovieListData.h) {
            GraphicUtils$Dimension graphicUtils$Dimension2 = this.w;
            if (graphicUtils$Dimension2 == null) {
                js3.V("dimension");
                throw null;
            }
            gl6 gl6Var6 = this.v;
            if (gl6Var6 != null) {
                return new fl6(view, graphicUtils$Dimension2, z, gl6Var6, (byte) 0);
            }
            js3.V("onMovieClickListener");
            throw null;
        }
        if (i != ProfileListButtonsData.h) {
            if (i == DividerData.k) {
                return new oq1(view);
            }
            return null;
        }
        gl6 gl6Var7 = this.p;
        if (gl6Var7 == null) {
            js3.V("onChatClickListener");
            throw null;
        }
        gl6 gl6Var8 = this.t;
        if (gl6Var8 == null) {
            js3.V("onAddListToOwnClickListener");
            throw null;
        }
        gl6 gl6Var9 = this.r;
        if (gl6Var9 == null) {
            js3.V("onLikeClickListener");
            throw null;
        }
        gl6 gl6Var10 = this.s;
        if (gl6Var10 != null) {
            return new b(view, gl6Var7, gl6Var8, gl6Var9, gl6Var10);
        }
        js3.V("onRemoveLikeClickListener");
        throw null;
    }
}
