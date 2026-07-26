package ir.mservices.market.version2.ui.recycler;

import android.os.Parcelable;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.ja1;
import defpackage.js3;
import defpackage.rv6;
import defpackage.wz6;
import ir.mservices.market.app.home.ui.recycler.HomeSingleAppData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NestedRecyclerData implements MyketRecyclerData {
    public dp2 a;
    public final rv6 b;
    public wz6 c;
    public Float d;
    public Integer e;
    public Parcelable f;

    public NestedRecyclerData(bz6 bz6Var, dp2 dp2Var) {
        js3.p(bz6Var, "recyclerData");
        js3.p(dp2Var, "removeIfEmptyCallback");
        this.a = dp2Var;
        this.b = new rv6(ja1.b(bz6Var));
        this.c = new wz6();
    }

    public Integer b() {
        return null;
    }

    public abstract int c();

    public boolean e() {
        return this instanceof HomeSingleAppData;
    }

    public boolean f() {
        return this instanceof HomeSingleAppData;
    }
}
