package defpackage;

import ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment;
import ir.mservices.market.app.survey.data.ApplicationSurveyDto;
import ir.mservices.market.data.NavIntentDirections;

/* JADX INFO: loaded from: classes3.dex */
public final class gt implements ze2 {
    public final /* synthetic */ AppSubReviewsFragment a;

    public gt(AppSubReviewsFragment appSubReviewsFragment) {
        this.a = appSubReviewsFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        n99 n99Var = (n99) obj;
        if (n99Var instanceof l99) {
            ApplicationSurveyDto applicationSurveyDto = (ApplicationSurveyDto) ((l99) n99Var).a;
            int i = AppSubReviewsFragment.q1;
            AppSubReviewsFragment appSubReviewsFragment = this.a;
            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.Survey(new sc8(applicationSurveyDto, appSubReviewsFragment.S1().a)), -1);
        }
        return tx8.a;
    }
}
