package ir.mservices.market.social.welcome.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class WelcomeGenderData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_welcome_gender;
    public final v48 a;

    public WelcomeGenderData(v48 v48Var) {
        js3.p(v48Var, "genderFlow");
        this.a = v48Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WelcomeGenderData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.social.welcome.recycler.WelcomeGenderData");
        return this.a.getValue() == ((WelcomeGenderData) obj).a.getValue();
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
