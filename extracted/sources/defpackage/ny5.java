package defpackage;

import android.content.Intent;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class ny5 extends r0 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        Intent intent = q0Var.b;
        String stringExtra = intent.getStringExtra("BUNDLE_KEY_TITLE");
        String stringExtra2 = intent.getStringExtra("BUNDLE_KEY_PACKAGE_KEY");
        String stringExtra3 = intent.getStringExtra("BUNDLE_KEY_LAUNCH_SOURCE");
        String stringExtra4 = intent.getStringExtra("refId");
        if (stringExtra == null || stringExtra.length() == 0 || stringExtra2 == null || stringExtra2.length() == 0 || stringExtra3 == null || stringExtra3.length() == 0) {
            return null;
        }
        return new dr3(new NavIntentDirections.Package(new oy5(stringExtra, stringExtra2, stringExtra3, stringExtra4)));
    }

    @Override // defpackage.r0
    public final boolean b(q0 q0Var) {
        return "ir.mservices.market.ACTION_PACKAGE".equalsIgnoreCase(q0Var.b.getAction());
    }
}
