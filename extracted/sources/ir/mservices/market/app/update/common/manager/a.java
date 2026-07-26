package ir.mservices.market.app.update.common.manager;

import defpackage.bt2;
import defpackage.dp2;
import defpackage.dp3;
import defpackage.f88;
import defpackage.ff5;
import defpackage.g51;
import defpackage.iz8;
import defpackage.ja1;
import defpackage.js3;
import defpackage.jz8;
import defpackage.lu7;
import defpackage.lw;
import defpackage.m88;
import defpackage.o30;
import defpackage.qz8;
import defpackage.rn6;
import defpackage.rv6;
import defpackage.sg4;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.vv2;
import defpackage.vz8;
import defpackage.wu0;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto;
import ir.mservices.market.version2.webapi.responsedto.AppUpdateDTO;
import ir.mservices.market.version2.webapi.responsedto.UpdateDTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final dp3 a;
    public final lu7 b;
    public final ir.mservices.market.core.notification.a c;
    public final qz8 d;
    public final rn6 e;
    public final jz8 f;
    public boolean g;
    public final l h;
    public final rv6 i;
    public final l j;
    public final rv6 k;

    public a(dp3 dp3Var, lu7 lu7Var, ir.mservices.market.core.notification.a aVar, qz8 qz8Var, rn6 rn6Var, jz8 jz8Var) {
        js3.p(dp3Var, "installManager");
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(aVar, "notificationController");
        js3.p(qz8Var, "updateNotificationUtils");
        js3.p(jz8Var, "updateExtensionManager");
        this.a = dp3Var;
        this.b = lu7Var;
        this.c = aVar;
        this.d = qz8Var;
        this.e = rn6Var;
        this.f = jz8Var;
        l lVarB = ja1.b(null);
        this.h = lVarB;
        this.i = new rv6(lVarB);
        l lVarB2 = ja1.b("");
        this.j = lVarB2;
        this.k = new rv6(lVarB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, defpackage.dp2 r10, ir.mservices.market.core.notification.PushMessage r11, ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto r12, java.lang.String r13, java.lang.String r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof ir.mservices.market.app.update.common.manager.AppUpdateManager$refreshAppUpdate$1
            if (r0 == 0) goto L14
            r0 = r15
            ir.mservices.market.app.update.common.manager.AppUpdateManager$refreshAppUpdate$1 r0 = (ir.mservices.market.app.update.common.manager.AppUpdateManager$refreshAppUpdate$1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.g = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ir.mservices.market.app.update.common.manager.AppUpdateManager$refreshAppUpdate$1 r0 = new ir.mservices.market.app.update.common.manager.AppUpdateManager$refreshAppUpdate$1
            r0.<init>(r8, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r6.g
            r7 = 1
            if (r1 == 0) goto L3b
            if (r1 != r7) goto L33
            java.lang.String r14 = r6.d
            java.lang.String r13 = r6.c
            ir.mservices.market.core.notification.PushMessage r11 = r6.b
            dp2 r10 = r6.a
            kotlin.b.b(r15)
        L30:
            r12 = r14
            r14 = r10
            goto L68
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.b.b(r15)
            long r1 = defpackage.wq2.D()
            r12.setFreeMemory(r1)
            long r1 = defpackage.wq2.E()
            r12.setTotalMemory(r1)
            ff5 r5 = defpackage.ff5.b()
            r6.a = r10
            r6.b = r11
            r6.c = r13
            r6.d = r14
            r6.g = r7
            rn6 r1 = r8.e
            r3 = r9
            r2 = r12
            r4 = r13
            java.lang.Object r15 = r1.n(r2, r3, r4, r5, r6)
            if (r15 != r0) goto L66
            return r0
        L66:
            r13 = r4
            goto L30
        L68:
            n99 r15 = (defpackage.n99) r15
            boolean r9 = r15 instanceof defpackage.l99
            if (r9 == 0) goto L7b
            l99 r15 = (defpackage.l99) r15
            java.lang.Object r9 = r15.a
            r13 = r9
            ir.mservices.market.version2.webapi.responsedto.UpdateDTO r13 = (ir.mservices.market.version2.webapi.responsedto.UpdateDTO) r13
            r10 = 1
            r9 = r8
            r9.d(r10, r11, r12, r13, r14)
            goto La1
        L7b:
            r9 = r8
        L7c:
            kotlinx.coroutines.flow.l r10 = r9.h
            java.lang.Object r11 = r10.getValue()
            r12 = r11
            java.util.Map r12 = (java.util.Map) r12
            r12 = 0
            boolean r10 = r10.n(r11, r12)
            if (r10 == 0) goto L7c
            if (r14 == 0) goto L91
            r14.invoke(r12)
        L91:
            java.lang.String r10 = "background"
            boolean r10 = r10.equalsIgnoreCase(r13)
            if (r10 == 0) goto L9e
            qz8 r10 = r9.d
            r10.b(r7)
        L9e:
            r10 = 0
            r9.g = r10
        La1:
            tx8 r10 = defpackage.tx8.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.common.manager.a.a(java.lang.Object, dp2, ir.mservices.market.core.notification.PushMessage, ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(UpdateRequestDto updateRequestDto, Object obj, String str, String str2, ff5 ff5Var, vz8 vz8Var, iz8 iz8Var, g51 g51Var) throws Throwable {
        ug1 ug1Var = up1.a;
        Object objZ = bt2.Z(sg4.a, new AppUpdateManager$refreshUpdates$2(updateRequestDto, this, obj, str, ff5Var, str2, vz8Var, iz8Var, null), g51Var);
        return objZ == CoroutineSingletons.a ? objZ : tx8.a;
    }

    public final void c(String str) {
        l lVar;
        Object value;
        LinkedHashMap linkedHashMap;
        l lVar2;
        Object value2;
        js3.p(str, "packageName");
        do {
            lVar = this.h;
            value = lVar.getValue();
            Map map = (Map) value;
            if (map != null) {
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!js3.i((String) entry.getKey(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap = null;
            }
        } while (!lVar.n(value, linkedHashMap));
        do {
            lVar2 = this.j;
            value2 = lVar2.getValue();
        } while (!lVar2.n(value2, str));
    }

    public final void d(boolean z, PushMessage pushMessage, String str, UpdateDTO updateDTO, dp2 dp2Var) {
        Map map;
        Set setKeySet;
        Object value;
        Map mapI;
        lw.d(null, null, updateDTO);
        String str2 = lu7.t0;
        lu7 lu7Var = this.b;
        lu7Var.j(str2, true);
        if (updateDTO.getCacheTimeMin() >= 0) {
            lu7Var.g(updateDTO.getCacheTimeMin(), lu7.m0);
        }
        PushMessage updateNotification = updateDTO.getUpdateNotification();
        if (updateNotification != null) {
            qz8 qz8Var = this.d;
            ir.mservices.market.core.notification.a aVar = qz8Var.c;
            PushMessage pushMessage2 = (updateNotification.z() && ir.mservices.market.core.notification.a.d(aVar.i, AppStatusDto.Type.UPDATE)) ? null : updateNotification;
            if (pushMessage2 == null) {
                aVar.l(updateNotification);
            } else {
                updateNotification = pushMessage2;
            }
            if (updateNotification.x()) {
                aVar.k(updateNotification);
            } else {
                aVar.a.cancel(6);
                aVar.r(updateNotification);
            }
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b("show_sync_update");
            clickEventBuilder.a();
            ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
            clickEventBuilder2.b("show_sync_update_" + str);
            clickEventBuilder2.a();
            long j = (long) Calendar.getInstance().get(11);
            ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
            long j2 = 6;
            clickEventBuilder3.b("time_sync_update_" + ((j / j2) * j2));
            clickEventBuilder3.a();
            qz8Var.b(updateDTO.getNextSyncHour());
        }
        List<AppUpdateDTO> appUpdates = updateDTO.getAppUpdates();
        l lVar = this.h;
        if (appUpdates != null) {
            ArrayList<AppUpdateDTO> arrayList = new ArrayList();
            for (Object obj : appUpdates) {
                AppUpdateDTO appUpdateDTO = (AppUpdateDTO) obj;
                String packageName = appUpdateDTO.getPackageName();
                int versionCode = appUpdateDTO.getVersionCode();
                ForceUpdateDto forceUpdate = appUpdateDTO.getForceUpdate();
                if (!js3.i(this.a.d(packageName, versionCode, forceUpdate != null ? Long.valueOf(forceUpdate.getFileLength()) : null), Boolean.FALSE)) {
                    arrayList.add(obj);
                }
            }
            int i = 10;
            ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
            for (AppUpdateDTO appUpdateDTO2 : arrayList) {
                String version = appUpdateDTO2.getVersion();
                js3.o(version, "getVersion(...)");
                long lastUpdateTime = appUpdateDTO2.getLastUpdateTime();
                String sizeStr = appUpdateDTO2.getSizeStr();
                js3.o(sizeStr, "getSizeStr(...)");
                String description = appUpdateDTO2.getDescription();
                appUpdateDTO2.isDescriptionRtl();
                appUpdateDTO2.getDeveloperName();
                appUpdateDTO2.getDeveloperId();
                appUpdateDTO2.getRealPrice();
                String price = appUpdateDTO2.getPrice();
                appUpdateDTO2.isHasIap();
                appUpdateDTO2.isHasAd();
                int versionCode2 = appUpdateDTO2.getVersionCode();
                long size = appUpdateDTO2.getSize();
                String title = appUpdateDTO2.getTitle();
                js3.o(title, "getTitle(...)");
                String iconPath = appUpdateDTO2.getIconPath();
                js3.o(iconPath, "getIconPath(...)");
                ForceUpdateDto forceUpdate2 = appUpdateDTO2.getForceUpdate();
                boolean zIsFree = appUpdateDTO2.isFree();
                boolean zHasMainData = appUpdateDTO2.hasMainData();
                boolean zHasPatchData = appUpdateDTO2.hasPatchData();
                String categoryName = appUpdateDTO2.getCategoryName();
                String packageName2 = appUpdateDTO2.getPackageName();
                js3.o(packageName2, "getPackageName(...)");
                arrayList2.add(new o30(version, lastUpdateTime, sizeStr, description, price, versionCode2, size, title, iconPath, forceUpdate2, zIsFree, zHasMainData, zHasPatchData, categoryName, packageName2));
                i = 10;
            }
            int iL = kotlin.collections.b.L(wu0.V(arrayList2, i));
            if (iL < 16) {
                iL = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
            for (Object obj2 : arrayList2) {
                linkedHashMap.put(((o30) obj2).n, obj2);
            }
            do {
                value = lVar.getValue();
                mapI = (Map) value;
                if (mapI == null) {
                    mapI = kotlin.collections.b.I();
                }
            } while (!lVar.n(value, kotlin.collections.b.P(mapI, linkedHashMap)));
        }
        ExtensionPointDto appListExt = updateDTO.getAppListExt();
        jz8 jz8Var = this.f;
        lu7 lu7Var2 = jz8Var.a;
        vv2 vv2Var = jz8Var.b;
        lu7Var2.i(lu7.n0, vv2Var.f(appListExt));
        jz8Var.a.i(lu7.o0, vv2Var.f(updateDTO.getEmptyAppListExt()));
        lu7Var.j(lu7.p0, updateDTO.isShowTrafficHint());
        if (dp2Var != null) {
            dp2Var.invoke(updateDTO);
        }
        if (z && (map = (Map) lVar.getValue()) != null && map.size() == 1) {
            Map map2 = (Map) lVar.getValue();
            String str3 = (map2 == null || (setKeySet = map2.keySet()) == null) ? null : (String) kotlin.collections.a.n0(setKeySet);
            if (str3 != null && !f88.n0(str3) && pushMessage != null && str3.equalsIgnoreCase(pushMessage.p()) && !m88.Z(str3, NearbyRepository.SERVICE_ID, false) && !str3.equalsIgnoreCase("com.google.android.gms")) {
                this.c.p(pushMessage);
            }
        }
        this.g = false;
    }
}
