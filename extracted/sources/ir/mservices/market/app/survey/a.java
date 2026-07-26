package ir.mservices.market.app.survey;

import defpackage.rm1;
import ir.mservices.market.app.survey.SurveyAction;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rm1 {
    public final /* synthetic */ SurveyFragment a;

    public a(SurveyFragment surveyFragment) {
        this.a = surveyFragment;
    }

    @Override // defpackage.rm1
    public final void onCancel() {
        int i = SurveyFragment.l1;
        this.a.R1();
    }

    @Override // defpackage.rm1
    public final void onCommit() {
        int i = SurveyFragment.l1;
        this.a.Q1().r(SurveyAction.Submit.INSTANCE);
    }
}
