package defpackage;

import ir.mservices.market.app.detail.reivews.AppReviewsFragment;
import ir.mservices.market.app.survey.data.ApplicationSurveyDto;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class xr implements ze2 {
    public final /* synthetic */ AppReviewsFragment a;

    public xr(AppReviewsFragment appReviewsFragment) {
        this.a = appReviewsFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        n99 n99Var = (n99) obj;
        if (n99Var instanceof l99) {
            ApplicationSurveyDto applicationSurveyDto = (ApplicationSurveyDto) ((l99) n99Var).a;
            int i = AppReviewsFragment.o1;
            AppReviewsFragment appReviewsFragment = this.a;
            pk5.g(appReviewsFragment.J0, new NavIntentDirections.Survey(new sc8(applicationSurveyDto, appReviewsFragment.R1().a)), -1);
        }
        return tx8.a;
    }
}
