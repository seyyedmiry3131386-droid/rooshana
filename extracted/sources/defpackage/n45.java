package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.ui.detail.review.data.OpenReportReviewData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class n45 {
    public final FragmentActivity a;
    public final m45 b;

    public n45(FragmentActivity fragmentActivity, m45 m45Var) {
        this.a = fragmentActivity;
        this.b = m45Var;
        ApplicationLauncher.o.b().getClass();
    }

    public final void a(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
        js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
        DialogDataModel dialogDataModel = (DialogDataModel) objP;
        Bundle bundle2 = dialogDataModel.c;
        if (dialogDataModel.d == DialogResult.a) {
            int i = bundle2.getInt("BUNDLE_KEY_REVIEW_ID");
            String string = bundle2.getString("movieId");
            if (string == null) {
                string = "";
            }
            if (m88.T(bundle.getString("BUNDLE_KEY_ID"), "REPORT_MOVIE_REVIEW", true)) {
                m45 m45Var = this.b;
                if (m45Var != null) {
                    m45Var.e();
                }
                pk5.d(this.a, new OpenReportReviewData(i, string));
            }
        }
    }

    public final void b(int i, String str, View view, am2 am2Var, String str2) {
        js3.p(str, "movieId");
        js3.p(am2Var, "fragmentNavigation");
        js3.p(str2, "dialogRequest");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LineMenuItemData("REPORT_MOVIE_REVIEW", this.a.getString(rs6.report), sj8.b().A));
        Bundle bundle = new Bundle();
        bundle.putInt("BUNDLE_KEY_REVIEW_ID", i);
        bundle.putString("movieId", str);
        pk5.g(am2Var, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(str2, "DIALOG_KEY_LINE_MENU_MOVIE", bundle, 8), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
        m45 m45Var = this.b;
        if (m45Var != null) {
            m45Var.c();
        }
    }
}
