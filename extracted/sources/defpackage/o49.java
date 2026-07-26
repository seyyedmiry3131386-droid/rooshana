package defpackage;

import android.os.Bundle;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class o49 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        return new dr3(new NavIntentDirections.VersionNote(new m49(new DialogDataModel(o49.class.getSimpleName(), "DIALOG_KEY_NO_RESULT", new Bundle(), 8))));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_version_note), true);
    }
}
