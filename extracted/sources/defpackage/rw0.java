package defpackage;

import androidx.fragment.app.d;
import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.views.MyketProgressState;

/* JADX INFO: loaded from: classes3.dex */
public final class rw0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public rw0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        n99 n99Var = (n99) obj;
        CommentFlowFragment commentFlowFragment = this.a;
        bt5 bt5VarF = commentFlowFragment.F();
        am2 am2Var = bt5VarF instanceof am2 ? (am2) bt5VarF : null;
        d dVarG = am2Var != null ? am2Var.g() : null;
        if (n99Var instanceof l99) {
            if (dVarG instanceof ReportDialogFragment) {
                commentFlowFragment.C0().q();
            }
            pk5.g(commentFlowFragment.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(commentFlowFragment.I0(), "DIALOG_KEY_NO_RESULT", null, 12), null, yq6.ic_thanks_report, null, commentFlowFragment.K().getString(rs6.thanks_report_dialog_text), null, commentFlowFragment.K().getString(rs6.button_ok), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
        } else if (n99Var instanceof h99) {
            if (dVarG instanceof ReportDialogFragment) {
                ((ReportDialogFragment) dVarG).Y0(MyketProgressState.b);
            }
            String translatedMessage = ((h99) n99Var).a.getTranslatedMessage();
            if (translatedMessage == null || f88.n0(translatedMessage)) {
                translatedMessage = commentFlowFragment.K().getString(rs6.comment_inappropriate_send_error);
                js3.o(translatedMessage, "getString(...)");
            }
            hh2.H(new hh2(commentFlowFragment.F(), translatedMessage));
        }
        return tx8.a;
    }
}
