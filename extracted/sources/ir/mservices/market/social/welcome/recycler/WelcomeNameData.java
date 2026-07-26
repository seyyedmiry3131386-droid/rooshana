package ir.mservices.market.social.welcome.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class WelcomeNameData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_welcome_name;
    public final v48 a;
    public final v48 b;

    public WelcomeNameData(v48 v48Var, v48 v48Var2) {
        js3.p(v48Var, "nameFlow");
        js3.p(v48Var2, "nameErrorFlow");
        this.a = v48Var;
        this.b = v48Var2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WelcomeNameData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.social.welcome.recycler.WelcomeNameData");
        return js3.i(this.a.getValue(), ((WelcomeNameData) obj).a.getValue());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        Object value = this.a.getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }
}
