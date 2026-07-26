package defpackage;

import android.view.View;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.setting.recycler.SettingNestedData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class zq7 extends a {
    public final og5 K;
    public final pg5 L;
    public final og5 M;
    public final cr7 N;
    public final og5 O;
    public final og5 P;
    public final int Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq7(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, cr7 cr7Var, y45 y45Var, cr7 cr7Var2, cr7 cr7Var3, cr7 cr7Var4, ir.mservices.market.setting.a aVar) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
        js3.p(cr7Var, "onClickListener");
        js3.p(y45Var, "onLongClickListener");
        js3.p(cr7Var2, "onNightModeClickListener");
        js3.p(cr7Var3, "onCheckedChangeListener");
        js3.p(cr7Var4, "onThemeClickListener");
        js3.p(aVar, "onKidsModeClickListener");
        this.K = cr7Var;
        this.L = y45Var;
        this.M = cr7Var2;
        this.N = cr7Var3;
        this.O = cr7Var4;
        this.P = aVar;
        this.Q = 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new yq7(1, true);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void s(SettingNestedData settingNestedData) {
        js3.p(settingNestedData, "data");
        super.s(settingNestedData);
        l06 l06Var = this.C;
        js3.n(l06Var, "null cannot be cast to non-null type ir.mservices.market.setting.SettingNestedAdapter");
        yq7 yq7Var = (yq7) l06Var;
        og5 og5Var = this.K;
        js3.p(og5Var, "<set-?>");
        yq7Var.o = og5Var;
        pg5 pg5Var = this.L;
        js3.p(pg5Var, "<set-?>");
        yq7Var.p = pg5Var;
        og5 og5Var2 = this.M;
        js3.p(og5Var2, "<set-?>");
        yq7Var.q = og5Var2;
        cr7 cr7Var = this.N;
        js3.p(cr7Var, "<set-?>");
        yq7Var.r = cr7Var;
        og5 og5Var3 = this.O;
        js3.p(og5Var3, "<set-?>");
        yq7Var.s = og5Var3;
        og5 og5Var4 = this.P;
        js3.p(og5Var4, "<set-?>");
        yq7Var.t = og5Var4;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p((SettingNestedData) nestedRecyclerData, "data");
        return null;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int z() {
        return this.Q;
    }
}
