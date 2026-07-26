package ir.mservices.market.download.recentDownload.model;

import defpackage.dp2;
import defpackage.ek6;
import defpackage.ex6;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.l99;
import defpackage.ps1;
import defpackage.sk6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.download.recentDownload.model.RecentDownloadRepositoryImpl$getRecentDownloads$1$1", f = "RecentDownloadRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentDownloadRepositoryImpl$getRecentDownloads$1$1 extends SuspendLambda implements dp2 {
    public final /* synthetic */ sk6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentDownloadRepositoryImpl$getRecentDownloads$1$1(sk6 sk6Var, g51 g51Var) {
        super(1, g51Var);
        this.a = sk6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new RecentDownloadRepositoryImpl$getRecentDownloads$1$1(this.a, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((RecentDownloadRepositoryImpl$getRecentDownloads$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        sk6 sk6Var = this.a;
        Collection collectionValues = ((ps1) sk6Var.b).h().values();
        ArrayList<AppDownloadInfo> arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues) {
            String str = ((AppDownloadInfo) obj2).getTag().r;
            if (str != null && !f88.n0(str)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
        for (AppDownloadInfo appDownloadInfo : arrayList2) {
            js3.m(appDownloadInfo);
            arrayList3.add(new ex6(appDownloadInfo, ((ir.mservices.market.version2.manager.a) sk6Var.c).c(appDownloadInfo)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList3) {
            AppDownloadFlowStatus appDownloadFlowStatus = ((ex6) obj3).b;
            Object arrayList4 = linkedHashMap.get(appDownloadFlowStatus);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(appDownloadFlowStatus, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        AppDownloadFlowStatus appDownloadFlowStatus2 = AppDownloadFlowStatus.d;
        List list = (List) linkedHashMap.get(appDownloadFlowStatus2);
        ?? arrayList5 = 0;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (((ex6) obj4).a.getStatus() == 100) {
                    arrayList.add(obj4);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = EmptyList.a;
        }
        List listJ0 = kotlin.collections.a.J0(arrayList, new ek6(3));
        List list2 = (List) linkedHashMap.get(appDownloadFlowStatus2);
        if (list2 != null) {
            arrayList5 = new ArrayList();
            for (Object obj5 : list2) {
                if (((ex6) obj5).a.getStatus() == 110) {
                    arrayList5.add(obj5);
                }
            }
        }
        if (arrayList5 == 0) {
            arrayList5 = EmptyList.a;
        }
        List listJ02 = kotlin.collections.a.J0(arrayList5, new ek6(4));
        Collection collection = (List) linkedHashMap.get(AppDownloadFlowStatus.e);
        if (collection == null) {
            collection = EmptyList.a;
        }
        Iterable iterable = (List) linkedHashMap.get(AppDownloadFlowStatus.f);
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        ArrayList arrayListZ0 = kotlin.collections.a.z0(kotlin.collections.a.J0(kotlin.collections.a.z0(iterable, collection), new ek6(5)), kotlin.collections.a.z0(listJ02, listJ0));
        sk6Var.d = arrayListZ0;
        return new l99(arrayListZ0);
    }
}
