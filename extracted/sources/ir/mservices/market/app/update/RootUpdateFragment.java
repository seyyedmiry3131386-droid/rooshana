package ir.mservices.market.app.update;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import defpackage.at2;
import defpackage.ba7;
import defpackage.bi5;
import defpackage.da7;
import defpackage.g27;
import defpackage.i30;
import defpackage.js3;
import defpackage.mz3;
import defpackage.pq6;
import defpackage.pz3;
import defpackage.r40;
import defpackage.sq4;
import defpackage.yq2;
import defpackage.yw6;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class RootUpdateFragment extends BaseUpdateFragment implements ba7, pz3 {
    public static final /* synthetic */ int s1 = 0;
    public final Object q1 = kotlin.a.b(LazyThreadSafetyMode.a, new i30(this, 17));
    public final bi5 r1 = new bi5(g27.a(da7.class), new yw6(6, this));

    @Override // ir.mservices.market.app.update.BaseUpdateFragment
    public final boolean Q1() {
        return ((da7) this.r1.getValue()).a;
    }

    @Override // ir.mservices.market.app.update.BaseUpdateFragment
    public final boolean W1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        return r40.g;
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    @Override // ir.mservices.market.app.update.BaseUpdateFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new RootUpdateFragment$onViewCreated$1(this, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        return new PaddingLayoutManager$Padding(0, 0, 0, ((sq4) this.q1.getValue()).g.a.getValue() != null ? K().getDimensionPixelSize(pq6.space_84) : 0);
    }
}
