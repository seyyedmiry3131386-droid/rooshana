package defpackage;

import androidx.fragment.app.d;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment;
import ir.mservices.market.movie.ui.detail.review.data.MovieLoginData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.version2.fragments.dialog.f;
import ir.mservices.market.views.MyketProgressState;

/* JADX INFO: loaded from: classes3.dex */
public final class n05 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovieCommentFlowFragment b;

    public /* synthetic */ n05(MovieCommentFlowFragment movieCommentFlowFragment, int i) {
        this.a = i;
        this.b = movieCommentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        MovieCommentFlowFragment movieCommentFlowFragment = this.b;
        switch (i) {
            case 0:
                int i2 = MovieCommentFlowFragment.P0;
                String string = movieCommentFlowFragment.K().getString(rs6.report_movie_comment_immoral);
                js3.o(string, "getString(...)");
                ReportDialogFragment.Option option = new ReportDialogFragment.Option(string);
                String string2 = movieCommentFlowFragment.K().getString(rs6.report_movie_comment_unrelated);
                js3.o(string2, "getString(...)");
                ReportDialogFragment.Option option2 = new ReportDialogFragment.Option(string2);
                String string3 = movieCommentFlowFragment.K().getString(rs6.report_movie_comment_wrong);
                js3.o(string3, "getString(...)");
                pk5.g(movieCommentFlowFragment.J0, new NavIntentDirections.Report(new f(new DialogDataModel(movieCommentFlowFragment.E0(), "DIALOG_KEY_REVIEW_REPORT", null, 12), null, movieCommentFlowFragment.K().getString(rs6.report_message), -1, sj8.b().j, sj8.b().k, sj8.b(), false, new ReportDialogFragment.Option[]{option, option2, new ReportDialogFragment.Option(string3)})), -1);
                break;
            case 1:
                int i3 = MovieCommentFlowFragment.P0;
                DialogDataModel dialogDataModel = new DialogDataModel(movieCommentFlowFragment.E0(), "DIALOG_KEY_NICKNAME_COMMENT", null, 12);
                String string4 = movieCommentFlowFragment.K().getString(rs6.nickname_description_movie_comment);
                js3.o(string4, "getString(...)");
                pk5.g(movieCommentFlowFragment.J0, new NavIntentDirections.Nickname(new tn5(dialogDataModel, string4)), -1);
                break;
            case 2:
                MovieLoginData movieLoginData = (MovieLoginData) obj;
                String str = movieLoginData.c;
                int i4 = MovieCommentFlowFragment.P0;
                DialogDataModel dialogDataModel2 = new DialogDataModel(movieCommentFlowFragment.E0(), str, null, 12);
                PhoneBindData phoneBindData = new PhoneBindData("");
                String string5 = movieCommentFlowFragment.K().getString(movieLoginData.a);
                String string6 = movieCommentFlowFragment.K().getString(movieLoginData.b);
                js3.o(string6, "getString(...)");
                pk5.g(movieCommentFlowFragment.J0, new NavIntentDirections.Login(new wd4(dialogDataModel2, new LoginData(phoneBindData, string5, string6, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                break;
            case 3:
                int i5 = MovieCommentFlowFragment.P0;
                if (movieCommentFlowFragment.F() != null) {
                    bt5 bt5VarF = movieCommentFlowFragment.F();
                    js3.n(bt5VarF, "null cannot be cast to non-null type ir.mservices.market.common.navigation.FragmentNavigation");
                    if (((am2) bt5VarF).g() instanceof ReportDialogFragment) {
                        bt5 bt5VarF2 = movieCommentFlowFragment.F();
                        js3.n(bt5VarF2, "null cannot be cast to non-null type ir.mservices.market.common.navigation.FragmentNavigation");
                        ((am2) bt5VarF2).q();
                    }
                    pk5.g(movieCommentFlowFragment.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(movieCommentFlowFragment.E0(), "DIALOG_KEY_NO_RESULT", null, 12), null, yq6.ic_thanks_report, null, movieCommentFlowFragment.K().getString(rs6.thanks_report_dialog_text), null, movieCommentFlowFragment.K().getString(rs6.button_ok), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
                }
                break;
            case 4:
                hh2 hh2Var = new hh2(movieCommentFlowFragment.H(), movieCommentFlowFragment.K().getString(rs6.comment_Like_send_error));
                hh2Var.G();
                hh2.H(hh2Var);
                break;
            default:
                String string7 = (String) obj;
                int i6 = MovieCommentFlowFragment.P0;
                d dVarG = movieCommentFlowFragment.J0.g();
                ReportDialogFragment reportDialogFragment = dVarG instanceof ReportDialogFragment ? (ReportDialogFragment) dVarG : null;
                if (reportDialogFragment != null) {
                    reportDialogFragment.Y0(MyketProgressState.b);
                }
                if (string7 == null || f88.n0(string7)) {
                    string7 = movieCommentFlowFragment.K().getString(rs6.comment_inappropriate_send_error);
                    js3.o(string7, "getString(...)");
                }
                hh2.H(new hh2(movieCommentFlowFragment.H(), string7));
                break;
        }
        return tx8Var;
    }
}
