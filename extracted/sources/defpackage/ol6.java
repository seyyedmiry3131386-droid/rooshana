package defpackage;

import androidx.fragment.app.d;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.views.MyketProgressState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ol6 implements ze2 {
    public final /* synthetic */ ProfileMovieListMoreFragment a;

    public ol6(ProfileMovieListMoreFragment profileMovieListMoreFragment) {
        this.a = profileMovieListMoreFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        n99 n99Var = (n99) obj;
        boolean z = n99Var instanceof h99;
        ProfileMovieListMoreFragment profileMovieListMoreFragment = this.a;
        if (z) {
            int i = ProfileMovieListMoreFragment.l1;
            d dVarG = profileMovieListMoreFragment.J0.g();
            ReportDialogFragment reportDialogFragment = dVarG instanceof ReportDialogFragment ? (ReportDialogFragment) dVarG : null;
            if (reportDialogFragment != null) {
                reportDialogFragment.Y0(MyketProgressState.b);
            }
            String translatedMessage = ((h99) n99Var).a.getTranslatedMessage();
            if (translatedMessage == null || f88.n0(translatedMessage)) {
                translatedMessage = profileMovieListMoreFragment.K().getString(rs6.error_dto_default_message);
                js3.o(translatedMessage, "getString(...)");
            }
            hh2 hh2Var = new hh2(profileMovieListMoreFragment.F(), translatedMessage);
            hh2Var.G();
            hh2.H(hh2Var);
        } else if (n99Var instanceof l99) {
            int i2 = ProfileMovieListMoreFragment.l1;
            if (profileMovieListMoreFragment.J0.g() instanceof ReportDialogFragment) {
                profileMovieListMoreFragment.J0.q();
            }
            pk5.g(profileMovieListMoreFragment.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(profileMovieListMoreFragment.Q1(), "DIALOG_KEY_NO_RESULT", null, 12), null, yq6.ic_thanks_report, null, profileMovieListMoreFragment.K().getString(rs6.thanks_report_dialog_text), null, profileMovieListMoreFragment.K().getString(rs6.button_ok), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
        } else if (!(n99Var instanceof j99)) {
            throw new NoWhenBranchMatchedException();
        }
        return tx8.a;
    }
}
