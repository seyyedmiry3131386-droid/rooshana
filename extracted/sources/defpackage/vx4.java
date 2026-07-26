package defpackage;

import ir.mservices.market.app.detail.data.AppDescriptionDto;
import ir.mservices.market.app.detail.data.MoreDescriptionData;
import ir.mservices.market.app.detail.data.PermissionDto;
import ir.mservices.market.app.detail.data.ShamadDto;
import ir.mservices.market.app.detail.more.data.MoreDescriptionList;
import ir.mservices.market.app.detail.more.ui.recycler.AgeRateData;
import ir.mservices.market.app.detail.more.ui.recycler.DescriptionData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreClickableData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreInformationData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreSimpleData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreSizeData;
import ir.mservices.market.app.detail.more.ui.recycler.MoreVersionData;
import ir.mservices.market.app.detail.more.ui.recycler.WhatsNewData;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.version2.ApplicationLauncher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vx4 extends c16 {
    public final MoreDescriptionData c;
    public final xb5 d;
    public final dp3 e;
    public final wt f;
    public final lw8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx4(MoreDescriptionData moreDescriptionData, xb5 xb5Var) {
        super(1);
        js3.p(xb5Var, "diffStatusFlow");
        this.c = moreDescriptionData;
        this.d = xb5Var;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.e = (dp3) w91Var.v.get();
        this.f = (wt) w91Var.z.get();
        this.g = (lw8) w91Var.E.get();
    }

    @Override // defpackage.c16
    public final Object d() {
        String strE;
        String strE2;
        String text;
        String text2;
        ArrayList arrayList = new ArrayList();
        wt wtVar = this.f;
        if (wtVar == null) {
            js3.V("appUpdateRepository");
            throw null;
        }
        MoreDescriptionData moreDescriptionData = this.c;
        boolean zD = ((AppUpdateRepositoryImpl) wtVar).d(moreDescriptionData.getVersion().getCode(), moreDescriptionData.getPackageName());
        AppDescriptionDto whatsNew = moreDescriptionData.getWhatsNew();
        WhatsNewData whatsNewData = (whatsNew == null || (text2 = whatsNew.getText()) == null) ? null : new WhatsNewData(text2, moreDescriptionData.getWhatsNew().isRtl());
        AppDescriptionDto description = moreDescriptionData.getDescription();
        DescriptionData descriptionData = (description == null || (text = description.getText()) == null) ? null : new DescriptionData(text, moreDescriptionData.getDescription().isRtl());
        Iterator it = (zD ? ew.J0(new Object[]{whatsNewData, descriptionData}) : ew.J0(new Object[]{descriptionData, whatsNewData})).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(new MoreInformationData());
        arrayList.add(new MoreSizeData(moreDescriptionData.getActualSize(), moreDescriptionData.getDiffSize(), this.d));
        lw8 lw8Var = this.g;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        dp3 dp3Var = this.e;
        if (dp3Var == null) {
            js3.V("installManager");
            throw null;
        }
        String strE3 = lw8.e(lw8Var, dp3Var.o(moreDescriptionData.getPackageName()));
        if (zD) {
            if (!strE3.equalsIgnoreCase(moreDescriptionData.getVersion().getName())) {
                strE = "";
                strE2 = strE;
            } else {
                if (lw8Var == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                if (dp3Var == null) {
                    js3.V("installManager");
                    throw null;
                }
                strE2 = lw8.e(lw8Var, " (" + dp3Var.p(moreDescriptionData.getPackageName()) + ")");
                if (lw8Var == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                strE = lw8.e(lw8Var, " (" + moreDescriptionData.getVersion().getCode() + ")");
            }
            arrayList.add(new MoreVersionData(strE3.concat(strE2), "", rs6.current_version_title));
            arrayList.add(new MoreVersionData(t61.i(moreDescriptionData.getVersion().getName(), strE), moreDescriptionData.getLastUpdate(), rs6.version_title_update));
        } else {
            arrayList.add(new MoreVersionData(moreDescriptionData.getVersion().getName(), moreDescriptionData.getLastUpdate(), rs6.version_title));
        }
        if (moreDescriptionData.getHasIap()) {
            arrayList.add(new MoreSimpleData(rs6.more_in_app));
        }
        List<PermissionDto> permissions = moreDescriptionData.getPermissions();
        if (permissions != null && !permissions.isEmpty()) {
            arrayList.add(new MoreClickableData(rs6.more_permission, rs6.more_clickable_subtitle, 8, "PERMISSION", null));
        }
        if (moreDescriptionData.getMoneyBackSummary() != null) {
            arrayList.add(new MoreClickableData(rs6.more_guaranty, rs6.more_clickable_subtitle, 8, "GUARANTY", null));
        }
        ShamadDto shamad = moreDescriptionData.getShamad();
        String text3 = shamad != null ? shamad.getText() : null;
        if (text3 != null && !f88.n0(text3)) {
            int i = rs6.shamed;
            ShamadDto shamad2 = moreDescriptionData.getShamad();
            arrayList.add(new MoreClickableData(i, 0, 4, "SHAMAD", shamad2 != null ? shamad2.getText() : null));
        }
        String contentRatingUrl = moreDescriptionData.getContentRatingUrl();
        if (contentRatingUrl != null && !f88.n0(contentRatingUrl)) {
            arrayList.add(new AgeRateData(rs6.age_rate_string, moreDescriptionData.getContentRatingUrl()));
        }
        return new MoreDescriptionList(arrayList);
    }
}
