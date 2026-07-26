package com.microsoft.clarity.a;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.SessionStartedCallback;
import com.microsoft.clarity.k.InterfaceC0098d;
import com.microsoft.clarity.models.ConsentStatus;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.ingest.IngestConfigs;
import defpackage.bp2;
import defpackage.ew;
import defpackage.gq1;
import defpackage.js3;
import defpackage.mo7;
import defpackage.oc2;
import defpackage.tx8;
import defpackage.wu0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.microsoft.clarity.a.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0052k extends Lambda implements bp2 {
    public final /* synthetic */ Application a;
    public final /* synthetic */ ClarityConfig b;
    public final /* synthetic */ InterfaceC0098d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052k(Application application, ClarityConfig clarityConfig, InterfaceC0098d interfaceC0098d) {
        super(0);
        this.a = application;
        this.b = clarityConfig;
        this.c = interfaceC0098d;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        boolean z;
        com.microsoft.clarity.i.t tVar;
        tx8 tx8Var;
        tx8 tx8Var2;
        com.microsoft.clarity.i.t tVar2;
        com.microsoft.clarity.i.t tVar3;
        com.microsoft.clarity.i.t tVar4;
        tx8 tx8Var3;
        com.microsoft.clarity.i.t tVar5;
        tx8 tx8Var4;
        com.microsoft.clarity.i.t tVar6;
        DynamicConfig.Companion companion = DynamicConfig.Companion;
        companion.invalidateCachedConfigsIfNeeded(this.a, this.b.getProjectId());
        if (companion.isFetched(this.a)) {
            z = true;
        } else {
            try {
                new C0051j(this.a, this.b).invoke();
            } catch (Exception unused) {
            }
            z = false;
        }
        com.microsoft.clarity.i.t tVar7 = I.a;
        Application application = this.a;
        ClarityConfig clarityConfig = this.b;
        InterfaceC0098d interfaceC0098d = this.c;
        if (companion.isFetched(application)) {
            com.microsoft.clarity.q.l.d("Clarity server config has been fetched.");
            DynamicConfig dynamicConfigA = com.microsoft.clarity.b.a.a(application);
            js3.m(dynamicConfigA);
            if (dynamicConfigA.getDisableForLowEndDevices() && com.microsoft.clarity.q.d.a(application) < 4) {
                com.microsoft.clarity.q.l.d("Low-end device detected - Clarity is disabled on low-end devices (dynamicConfig.disableForLowEndDevices=true).");
                ((com.microsoft.clarity.k.l) interfaceC0098d).a();
                I.b = false;
            } else if (dynamicConfigA.getNetworkMaxDailyDataInMB() != null && dynamicConfigA.getNetworkMaxDailyDataInMB().longValue() <= 0) {
                com.microsoft.clarity.q.l.c("Maximum Daily Network Usage should be either null or positive value (dynamicConfig.networkMaxDailyDataInMB=" + dynamicConfigA.getNetworkMaxDailyDataInMB() + ").");
                ((com.microsoft.clarity.k.l) interfaceC0098d).a();
                I.b = false;
            } else if (dynamicConfigA.isClarityActivated()) {
                synchronized (I.p) {
                    try {
                        I.a = com.microsoft.clarity.b.a.a((Context) application, clarityConfig);
                        if (clarityConfig.getUserId() != null && !clarityConfig.isValidUserId$sdk_prodRelease()) {
                            com.microsoft.clarity.q.l.c("Invalid user id. It cannot be a blank string, it must be a base36 string that is smaller than 1z141z4 and without any uppercase letters. Clarity will generate a random user id and the provided id will be stored as the custom user id, if you would like to override the custom user id, please use Clarity.setCustomUserId(...).");
                            String userId = clarityConfig.getUserId();
                            js3.m(userId);
                            I.a(userId);
                        }
                        ArrayList arrayList = I.d;
                        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            View view = (View) ((WeakReference) it.next()).get();
                            if (view == null || (tVar6 = I.a) == null) {
                                tx8Var4 = null;
                            } else {
                                tVar6.a(view);
                                tx8Var4 = tx8.a;
                            }
                            arrayList2.add(tx8Var4);
                        }
                        ArrayList arrayList3 = I.e;
                        ArrayList arrayList4 = new ArrayList(wu0.V(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            View view2 = (View) ((WeakReference) it2.next()).get();
                            if (view2 == null || (tVar5 = I.a) == null) {
                                tx8Var3 = null;
                            } else {
                                tVar5.b(view2);
                                tx8Var3 = tx8.a;
                            }
                            arrayList4.add(tx8Var3);
                        }
                        SessionStartedCallback sessionStartedCallback = I.k;
                        if (sessionStartedCallback != null) {
                            com.microsoft.clarity.i.t tVar8 = I.a;
                            if (tVar8 != null) {
                                tVar8.a(sessionStartedCallback);
                            }
                            I.k = null;
                        }
                        if (I.l) {
                            com.microsoft.clarity.i.t tVar9 = I.a;
                            if (tVar9 != null) {
                                tVar9.a.a(I.m);
                            }
                            I.l = false;
                            I.m = null;
                        }
                        String str = I.f;
                        if (str != null && (tVar4 = I.a) != null) {
                            tVar4.b.c(str);
                        }
                        String str2 = I.g;
                        if (str2 != null && (tVar3 = I.a) != null) {
                            tVar3.b.b(str2);
                        }
                        String str3 = I.j;
                        com.microsoft.clarity.i.t tVar10 = I.a;
                        if (tVar10 != null) {
                            tVar10.a.v = str3;
                        }
                        ConsentStatus consentStatus = I.o;
                        if (consentStatus != null && (tVar2 = I.a) != null) {
                            tVar2.b.a(consentStatus, new com.microsoft.clarity.i.s(tVar2));
                        }
                        LinkedHashMap linkedHashMap = I.h;
                        ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            com.microsoft.clarity.i.t tVar11 = I.a;
                            if (tVar11 != null) {
                                String str4 = (String) entry.getKey();
                                Set set = (Set) entry.getValue();
                                js3.p(str4, "key");
                                js3.p(set, "values");
                                tVar11.b.a(str4, set);
                                tx8Var2 = tx8.a;
                            } else {
                                tx8Var2 = null;
                            }
                            arrayList5.add(tx8Var2);
                        }
                        ArrayList<String> arrayList6 = I.i;
                        ArrayList arrayList7 = new ArrayList(wu0.V(arrayList6, 10));
                        for (String str5 : arrayList6) {
                            com.microsoft.clarity.i.t tVar12 = I.a;
                            if (tVar12 != null) {
                                js3.p(str5, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                                tVar12.b.a(str5);
                                tx8Var = tx8.a;
                            } else {
                                tx8Var = null;
                            }
                            arrayList7.add(tx8Var);
                        }
                        if (I.n && (tVar = I.a) != null) {
                            com.microsoft.clarity.i.q qVar = tVar.a;
                            qVar.r = true;
                            qVar.b();
                        }
                        I.d.clear();
                        I.e.clear();
                        I.f = null;
                        I.g = null;
                        I.j = null;
                        I.o = null;
                        I.h.clear();
                        I.i.clear();
                        ((com.microsoft.clarity.k.l) interfaceC0098d).a(dynamicConfigA);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                com.microsoft.clarity.q.l.d("Clarity started.");
                com.microsoft.clarity.h.a aVarA = com.microsoft.clarity.b.a.a(application, dynamicConfigA, com.microsoft.clarity.b.a.d);
                aVarA.a(clarityConfig.getProjectId());
                js3.p(application, "context");
                com.microsoft.clarity.q.l.d("Cleanup helper started.");
                long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 172800000);
                com.microsoft.clarity.q.l.b("Cancelling jobs before " + jCurrentTimeMillis + '.');
                aVarA.a(jCurrentTimeMillis);
                com.microsoft.clarity.p.e eVarA = com.microsoft.clarity.b.a.a(application, "");
                long jCurrentTimeMillis2 = System.currentTimeMillis() - ((long) 259200000);
                com.microsoft.clarity.q.l.b("Deleting files before " + jCurrentTimeMillis2 + '.');
                List listA = com.microsoft.clarity.p.f.a(eVarA, null, 3);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj : listA) {
                    if (((File) obj).lastModified() < jCurrentTimeMillis2) {
                        arrayList8.add(obj);
                    }
                }
                Iterator it3 = arrayList8.iterator();
                while (it3.hasNext()) {
                    ((File) it3.next()).delete();
                }
                oc2 oc2Var = new oc2(mo7.r(new gq1(new File(ew.O0(62, String.valueOf(File.separatorChar), new String[]{eVarA.a})), FileWalkDirection.a), com.microsoft.clarity.p.a.a));
                while (oc2Var.hasNext()) {
                    ((File) oc2Var.next()).delete();
                }
            } else {
                com.microsoft.clarity.q.l.e("Clarity is deactivated.");
                ((com.microsoft.clarity.k.l) interfaceC0098d).a();
            }
        } else {
            com.microsoft.clarity.q.l.c("Clarity failed to fetch project configuration from the servers, please check your network.");
            ((com.microsoft.clarity.k.l) interfaceC0098d).a();
            I.b = false;
        }
        if (z) {
            Application application2 = this.a;
            String projectId = this.b.getProjectId();
            js3.p(application2, "context");
            js3.p(projectId, "projectId");
            com.microsoft.clarity.o.f fVar = (com.microsoft.clarity.o.f) com.microsoft.clarity.b.a.a(application2, com.microsoft.clarity.b.a.b(application2, projectId), (com.microsoft.clarity.g.L) null);
            fVar.getClass();
            com.microsoft.clarity.q.s sVarA = com.microsoft.clarity.q.v.a(new com.microsoft.clarity.o.b(fVar, projectId));
            IngestConfigs ingestConfigs = sVarA instanceof com.microsoft.clarity.q.t ? ((com.microsoft.clarity.q.t) sVarA).a : null;
            if (ingestConfigs != null) {
                DynamicConfig.Companion.updateSharedPreferences(application2, projectId, ingestConfigs);
            }
        }
        return tx8.a;
    }
}
