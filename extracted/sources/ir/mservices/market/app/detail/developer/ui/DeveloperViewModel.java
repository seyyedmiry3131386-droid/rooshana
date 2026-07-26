package ir.mservices.market.app.detail.developer.ui;

import android.os.Parcelable;
import defpackage.dl1;
import defpackage.el1;
import defpackage.f88;
import defpackage.fl1;
import defpackage.gl1;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.lw;
import defpackage.ml1;
import defpackage.ol1;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.vb7;
import defpackage.yl5;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.developer.data.AppDeveloperDto;
import ir.mservices.market.app.detail.developer.data.DeveloperApplicationListDto;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.developer.ui.recycler.DeveloperPageTitleRowData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.BadgeDTO;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperViewModel extends c {
    public final ol1 t;
    public final a u;
    public final yl5 v;
    public final ml1 w;
    public final l x;
    public final rv6 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeveloperViewModel(ol1 ol1Var, a aVar, yl5 yl5Var, jd7 jd7Var) {
        super(true);
        js3.p(ol1Var, "repository");
        js3.p(aVar, "installQueue");
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(jd7Var, "savedStateHandle");
        this.t = ol1Var;
        this.u = aVar;
        this.v = yl5Var;
        if (!jd7Var.a("developerId")) {
            throw new IllegalArgumentException("Required argument \"developerId\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("developerId");
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("packageName");
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("title");
        if (!jd7Var.a("launcherSource")) {
            throw new IllegalArgumentException("Required argument \"launcherSource\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Tracker.class) && !Serializable.class.isAssignableFrom(Tracker.class)) {
            throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Tracker tracker = (Tracker) jd7Var.b("launcherSource");
        if (tracker == null) {
            throw new IllegalArgumentException("Argument \"launcherSource\" is marked as non-null but was passed a null value");
        }
        this.w = new ml1(str, str2, str3, tracker);
        l lVarB = ja1.b(null);
        this.x = lVarB;
        this.y = new rv6(lVarB);
    }

    public static final ArrayList r(DeveloperViewModel developerViewModel, DeveloperApplicationListDto developerApplicationListDto) {
        ArrayList arrayList = new ArrayList();
        if (!developerViewModel.z) {
            AppDeveloperDto appDeveloperDto = developerApplicationListDto.getAppDeveloperDto();
            if (appDeveloperDto != null) {
                String name = appDeveloperDto.getName();
                String str = null;
                if (name == null || f88.n0(name)) {
                    name = null;
                }
                if (name != null) {
                    BadgeDTO badge = appDeveloperDto.getBadge();
                    boolean z = false;
                    if (badge != null && badge.hasBadge()) {
                        z = true;
                    }
                    arrayList.add(new RecyclerItem(new AppDeveloperInfoModuleData(new el1(name, z))));
                }
                String email = appDeveloperDto.getEmail();
                if (email == null || f88.n0(email)) {
                    email = null;
                }
                if (email != null) {
                    arrayList.add(new RecyclerItem(new AppDeveloperInfoModuleData(new dl1(email))));
                }
                String website = appDeveloperDto.getWebsite();
                if (website == null || f88.n0(website)) {
                    website = null;
                }
                if (website != null) {
                    arrayList.add(new RecyclerItem(new AppDeveloperInfoModuleData(new gl1(website))));
                }
                String phone = appDeveloperDto.getPhone();
                if (phone != null && !f88.n0(phone)) {
                    str = phone;
                }
                if (str != null) {
                    arrayList.add(new RecyclerItem(new AppDeveloperInfoModuleData(new fl1(str))));
                }
            }
            developerViewModel.z = true;
            arrayList.add(new RecyclerItem(new DeveloperPageTitleRowData()));
        }
        List<ApplicationDTO> applications = developerApplicationListDto.getApplications();
        if (applications != null) {
            for (ApplicationDTO applicationDTO : applications) {
                yl5 yl5Var = developerViewModel.v;
                String packageName = applicationDTO.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                arrayList.add(new RecyclerItem(new AppData((vb7) yl5Var.a(packageName), developerViewModel.u.b, applicationDTO)));
            }
        }
        return arrayList;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        this.z = false;
        ml1 ml1Var = this.w;
        String str = ml1Var.a;
        if (str != null && !f88.n0(str)) {
            p(new DeveloperViewModel$doRequest$1(this, null));
            return;
        }
        String str2 = ml1Var.b;
        if (str2 != null && !f88.n0(str2)) {
            p(new DeveloperViewModel$doRequest$2(this, null));
            return;
        }
        ol1 ol1Var = this.t;
        String string = ol1Var.a.getResources().getString(rs6.no_developer_error_message);
        js3.o(string, "getString(...)");
        lw.g(null, string, null);
        String string2 = ol1Var.a.getResources().getString(rs6.no_developer_error_message);
        js3.o(string2, "getString(...)");
        f(string2);
    }

    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem != null && recyclerItem2 != null) {
            MyketRecyclerData myketRecyclerData = recyclerItem.c;
            if ((myketRecyclerData instanceof AppDeveloperInfoModuleData) && (recyclerItem2.c instanceof DeveloperPageTitleRowData)) {
                DividerData dividerData = new DividerData();
                dividerData.e = pq6.horizontal_space_outer;
                dividerData.f = pq6.space_16;
                dividerData.c = pq6.horizontal_space_inner;
                return new RecyclerItem(dividerData);
            }
            if (myketRecyclerData instanceof AppData) {
                DividerData dividerData2 = new DividerData();
                dividerData2.e = pq6.horizontal_space_outer;
                dividerData2.g = pq6.space_8;
                dividerData2.b = false;
                dividerData2.c = pq6.horizontal_space_inner;
                return new RecyclerItem(dividerData2);
            }
        }
        return null;
    }
}
