package defpackage;

import ir.mservices.market.app.survey.SurveyFragment;
import ir.mservices.market.version2.ui.recycler.adapter.a;
import ir.mservices.market.views.DialogButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class rc8 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SurveyFragment b;

    public /* synthetic */ rc8(SurveyFragment surveyFragment, int i) {
        this.a = i;
        this.b = surveyFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        SurveyFragment surveyFragment = this.b;
        switch (i) {
            case 0:
                ((Number) obj).intValue();
                a aVar = surveyFragment.Z0;
                if (aVar != null) {
                    aVar.A();
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                DialogButtonComponent dialogButtonComponent = surveyFragment.k1;
                if (dialogButtonComponent != null) {
                    DialogButtonComponent.setTitles$default(dialogButtonComponent, surveyFragment.K().getString(rs6.submit_survey), null, 2, null);
                }
                break;
            case 2:
                int i2 = SurveyFragment.l1;
                surveyFragment.J0.q();
                break;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                DialogButtonComponent dialogButtonComponent2 = surveyFragment.k1;
                if (dialogButtonComponent2 != null) {
                    dialogButtonComponent2.setCancelButtonEnable(true);
                    dialogButtonComponent2.setCommitButtonEnable(iIntValue != -1, sj8.b().d);
                }
                break;
            default:
                hh2.H(new hh2(surveyFragment.H(), (String) obj));
                break;
        }
        return tx8Var;
    }
}
