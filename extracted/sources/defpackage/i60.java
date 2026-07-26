package defpackage;

import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.activity.PermissionDialogActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class i60 {
    public final /* synthetic */ BaseContentActivity a;

    public i60(BaseContentActivity baseContentActivity) {
        this.a = baseContentActivity;
    }

    public final void onEvent(h60 h60Var) {
        js3.p(h60Var, "event");
        BaseContentActivity baseContentActivity = this.a;
        if (baseContentActivity instanceof PermissionDialogActivity) {
            return;
        }
        t32.b().m(h60Var);
        if (baseContentActivity.I != null) {
            d56.f(baseContentActivity, h60Var.a);
        } else {
            js3.V("permissionHelper");
            throw null;
        }
    }
}
