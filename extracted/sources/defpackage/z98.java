package defpackage;

import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.common.comment.SubmitCommentFragment;
import ir.mservices.market.common.comment.data.CommentResultState;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class z98 implements ze2 {
    public final /* synthetic */ SubmitCommentFragment a;

    public z98(SubmitCommentFragment submitCommentFragment) {
        this.a = submitCommentFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        SubmitCommentFragment submitCommentFragment = this.a;
        gw0 gw0Var = submitCommentFragment.b1;
        js3.m(gw0Var);
        gw0Var.v.setState(MyketProgressState.b);
        if (commentResultState instanceof CommentResultState.Success) {
            FragmentActivity fragmentActivityF = submitCommentFragment.F();
            if (fragmentActivityF != null) {
                CommentResultState.Success success = (CommentResultState.Success) commentResultState;
                String translatedMessage = success.getData().getTranslatedMessage();
                if (translatedMessage != null && !f88.n0(translatedMessage)) {
                    hh2.H(new hh2(fragmentActivityF, success.getData().getTranslatedMessage()));
                } else if (m88.T(success.getData().getPostAction(), "none", true)) {
                    String str = submitCommentFragment.a1;
                    hh2 hh2Var = new hh2(fragmentActivityF, (str == null || str.length() != 0) ? submitCommentFragment.L(rs6.comment_send_ok_with_comment) : submitCommentFragment.L(rs6.comment_send_ok));
                    hh2Var.G();
                    hh2.H(hh2Var);
                }
                fragmentActivityF.finish();
            }
        } else if (commentResultState instanceof CommentResultState.Cancel) {
            FragmentActivity fragmentActivityF2 = submitCommentFragment.F();
            if (fragmentActivityF2 != null) {
                fragmentActivityF2.finish();
            }
        } else {
            if (!(commentResultState instanceof CommentResultState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            gw0 gw0Var2 = submitCommentFragment.b1;
            js3.m(gw0Var2);
            MyketTextView myketTextView = gw0Var2.x;
            js3.o(myketTextView, "errorMessage");
            myketTextView.setVisibility(0);
            gw0 gw0Var3 = submitCommentFragment.b1;
            js3.m(gw0Var3);
            gw0Var3.x.setText(((CommentResultState.Error) commentResultState).getErrorDto().getTranslatedMessage());
        }
        return tx8.a;
    }
}
