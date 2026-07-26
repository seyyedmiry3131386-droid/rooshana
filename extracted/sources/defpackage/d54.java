package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.social.level.recycler.LevelDetailData;
import ir.mservices.market.social.level.recycler.LevelInfoData;
import ir.mservices.market.social.level.recycler.LevelNestedData;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class d54 extends a {
    public final GraphicUtils$Dimension l;
    public final boolean m;

    public d54(GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(1);
        this.l = graphicUtils$Dimension;
        this.m = z;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == LevelInfoData.d) {
            ft1 ft1Var = new ft1(2, view);
            ft1Var.x = (lw8) ((w91) qg5.r()).E.get();
            return ft1Var;
        }
        if (i == LevelDetailData.b) {
            ft1 ft1Var2 = new ft1(1, view);
            ft1Var2.x = (lw8) ((w91) qg5.r()).E.get();
            return ft1Var2;
        }
        if (i != LevelNestedData.h) {
            return null;
        }
        GraphicUtils$Dimension graphicUtils$Dimension = this.l;
        js3.p(graphicUtils$Dimension, "dimension");
        l54 l54Var = new l54(view, graphicUtils$Dimension, this.m);
        l54Var.K = 1;
        return l54Var;
    }
}
