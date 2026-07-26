package defpackage;

import android.view.View;
import androidx.recyclerview.widget.o;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qg5 extends o {
    public BaseNavigationFragment u;
    public BaseNavigationFragment v;

    public static e79 r() {
        ApplicationLauncher applicationLauncher = ApplicationLauncher.o;
        applicationLauncher.getClass();
        e79 e79Var = (e79) rq4.x(e79.class, applicationLauncher);
        js3.o(e79Var, "viewHolderComponent(...)");
        return e79Var;
    }

    public static void v(View view, og5 og5Var, qg5 qg5Var, Object obj) {
        js3.p(view, "view");
        js3.p(qg5Var, "viewHolder");
        if (og5Var != null) {
            view.setOnClickListener(new tf5(og5Var, qg5Var, obj, 1));
        }
    }

    public void s(MyketRecyclerData myketRecyclerData) {
        js3.p(myketRecyclerData, "data");
    }

    public abstract void t(MyketRecyclerData myketRecyclerData);

    @Override // androidx.recyclerview.widget.o
    public String toString() {
        return super.toString() + getClass();
    }

    public void u(MyketRecyclerData myketRecyclerData) {
        js3.p(myketRecyclerData, "data");
    }

    public void w(a79 a79Var) {
    }
}
