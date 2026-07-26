package ir.mservices.market.common.comment;

import defpackage.d04;
import defpackage.d56;
import defpackage.ew0;
import defpackage.pr7;
import defpackage.q91;
import defpackage.sm;
import defpackage.w91;
import ir.mservices.market.core.BaseDialogActivity;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_CommentActivity extends BaseDialogActivity {
    public boolean N = false;

    public Hilt_CommentActivity() {
        I(new sm(this, 7));
    }

    @Override // ir.mservices.market.core.Hilt_BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity
    public final void R() {
        if (this.N) {
            return;
        }
        this.N = true;
        CommentActivity commentActivity = (CommentActivity) this;
        w91 w91Var = ((q91) ((ew0) e())).a;
        commentActivity.G = (d04) w91Var.p.get();
        commentActivity.H = (pr7) w91Var.s.get();
        commentActivity.I = (d56) w91Var.U.get();
    }
}
