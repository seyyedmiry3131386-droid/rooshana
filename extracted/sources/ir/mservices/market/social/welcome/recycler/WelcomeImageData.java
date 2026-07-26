package ir.mservices.market.social.welcome.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class WelcomeImageData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_welcome_image;
    public final v48 a;
    public final v48 b;
    public final fu7 c;

    public WelcomeImageData(v48 v48Var, v48 v48Var2, fu7 fu7Var) {
        js3.p(v48Var, "currentAvatarFlow");
        js3.p(v48Var2, "uploadAvatarPathFlow");
        js3.p(fu7Var, "avatarProgressStateFlow");
        this.a = v48Var;
        this.b = v48Var2;
        this.c = fu7Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return WelcomeImageData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(WelcomeImageData.class.hashCode());
    }

    public final int hashCode() {
        return WelcomeImageData.class.hashCode();
    }
}
