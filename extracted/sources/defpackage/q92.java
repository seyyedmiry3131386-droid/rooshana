package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.core.analytics.ViewEventBuilder;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.feedback.FeedbackFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketProgressState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class q92 implements ze2 {
    public final /* synthetic */ FeedbackFragment a;

    public q92(FeedbackFragment feedbackFragment) {
        this.a = feedbackFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        n99 n99Var = (n99) obj;
        boolean z = n99Var instanceof l99;
        FeedbackFragment feedbackFragment = this.a;
        if (z) {
            xn7 xn7Var = feedbackFragment.q1;
            js3.m(xn7Var);
            xn7Var.w.setState(MyketProgressState.b);
            a aVar = feedbackFragment.p1;
            if (aVar == null) {
                js3.V("notificationController");
                throw null;
            }
            if (a.d(aVar.i, "download")) {
                ViewEventBuilder viewEventBuilder = new ViewEventBuilder();
                viewEventBuilder.b("notification_support_dialog");
                viewEventBuilder.a();
                FragmentActivity fragmentActivityF = feedbackFragment.F();
                if (fragmentActivityF != null) {
                    d56 d56Var = feedbackFragment.o1;
                    if (d56Var == null) {
                        js3.V("permissionHelper");
                        throw null;
                    }
                    d56Var.d(fragmentActivityF, PermissionReasonId.f);
                }
            } else {
                pk5.g(feedbackFragment.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(feedbackFragment.Q1(), "DIALOG_KEY_THANKS_REPORT", null, 12), feedbackFragment.L(rs6.feedback), yq6.ic_report_support, null, feedbackFragment.K().getString(rs6.feedback_thanks), null, feedbackFragment.L(rs6.button_ok), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
            }
        } else if (n99Var instanceof h99) {
            xn7 xn7Var2 = feedbackFragment.q1;
            js3.m(xn7Var2);
            xn7Var2.w.setState(MyketProgressState.b);
            Context contextH = feedbackFragment.H();
            hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.connection_problem) : null);
            hh2Var.G();
            hh2.H(hh2Var);
        } else {
            if (!(n99Var instanceof j99)) {
                throw new NoWhenBranchMatchedException();
            }
            xn7 xn7Var3 = feedbackFragment.q1;
            js3.m(xn7Var3);
            xn7Var3.w.setState(MyketProgressState.c);
        }
        return tx8.a;
    }
}
