package defpackage;

import android.content.Intent;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myReview.common.MyReviewType;
import ir.mservices.market.version2.fragments.content.UserManagerIntentFragment;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bl3 extends t1 {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        js3.p(er3Var, "intentFragmentFactory");
        lw.d(null, null, q0Var);
        Intent intent = q0Var.b;
        lw.d(null, null, intent);
        lw.d(null, null, intent.getDataString());
        if (er3Var.b.d()) {
            MyReviewType[] myReviewTypeArr = MyReviewType.c;
            return new dr3(new NavIntentDirections.MyReview(new yd5(0)));
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            return new dr3(UserManagerIntentFragment.I0("TYPE_BIND_PHONE", dataString, false));
        }
        return null;
    }

    @Override // defpackage.t1, defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        List listD;
        return super.b(q0Var) && (listD = q0Var.d()) != null && listD.contains(q0Var.b(rs6.external_intent_path_segments_incomplete_review));
    }
}
