package defpackage;

import android.os.Bundle;
import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.version2.fragments.dialog.f;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ow0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public ow0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = CommentFlowFragment.P0;
        Bundle bundleG = is3.g(new Pair("comment_scenario", (CommentScenario.ReportReview) obj));
        CommentFlowFragment commentFlowFragment = this.a;
        String string = commentFlowFragment.K().getString(rs6.report_comment_immoral);
        js3.o(string, "getString(...)");
        ReportDialogFragment.Option option = new ReportDialogFragment.Option(string);
        String string2 = commentFlowFragment.K().getString(rs6.report_comment_unrelated);
        js3.o(string2, "getString(...)");
        ReportDialogFragment.Option option2 = new ReportDialogFragment.Option(string2);
        String string3 = commentFlowFragment.K().getString(rs6.report_comment_wrong);
        js3.o(string3, "getString(...)");
        pk5.g(commentFlowFragment.C0(), new NavIntentDirections.Report(new f(new DialogDataModel(commentFlowFragment.I0(), "DIALOG_KEY_COMMENT_REPORT", bundleG, 8), null, commentFlowFragment.K().getString(rs6.report_message), -1, sj8.b().c, sj8.b().d, sj8.b(), false, new ReportDialogFragment.Option[]{option, option2, new ReportDialogFragment.Option(string3)})), -1);
        return tx8.a;
    }
}
