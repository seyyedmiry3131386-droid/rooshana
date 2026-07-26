package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.social.list.add.BaseAddProfileListFragment;
import ir.mservices.market.social.list.items.SelectedItemsAction;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseAddProfileListFragment b;

    public /* synthetic */ t50(BaseAddProfileListFragment baseAddProfileListFragment, int i) {
        this.a = i;
        this.b = baseAddProfileListFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BaseAddProfileListFragment baseAddProfileListFragment = this.b;
        switch (i) {
            case 0:
                int i2 = BaseAddProfileListFragment.c1;
                if (baseAddProfileListFragment.V0 == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                lw8.a(view);
                if (baseAddProfileListFragment.b1) {
                    wk2 wk2Var = baseAddProfileListFragment.Z0;
                    js3.m(wk2Var);
                    FrameLayout frameLayout = wk2Var.w;
                    js3.o(frameLayout, "searchFragment");
                    frameLayout.setVisibility(8);
                    return;
                }
                return;
            case 1:
                int i3 = BaseAddProfileListFragment.c1;
                if (baseAddProfileListFragment.k1().equals(t40.g)) {
                    baseAddProfileListFragment.J0.q();
                    return;
                }
                return;
            case 2:
                if (!baseAddProfileListFragment.b1) {
                    wk2 wk2Var2 = baseAddProfileListFragment.Z0;
                    js3.m(wk2Var2);
                    FrameLayout frameLayout2 = wk2Var2.w;
                    js3.o(frameLayout2, "searchFragment");
                    if (frameLayout2.getVisibility() == 0) {
                        baseAddProfileListFragment.l1();
                        return;
                    }
                }
                baseAddProfileListFragment.t1().r(baseAddProfileListFragment.q1());
                return;
            default:
                int i4 = BaseAddProfileListFragment.c1;
                baseAddProfileListFragment.t1().r(SelectedItemsAction.AddMoreItem.INSTANCE);
                return;
        }
    }
}
