package ir.mservices.market.download.common.data;

import android.annotation.SuppressLint;
import defpackage.br9;
import defpackage.bs1;
import defpackage.ck4;
import defpackage.dp2;
import defpackage.eq;
import defpackage.es1;
import defpackage.ew;
import defpackage.f88;
import defpackage.hm0;
import defpackage.js3;
import defpackage.k7;
import defpackage.m88;
import defpackage.o40;
import defpackage.r01;
import defpackage.rs1;
import defpackage.s7;
import defpackage.ss1;
import defpackage.t15;
import defpackage.v36;
import defpackage.wu0;
import defpackage.xl5;
import defpackage.y97;
import defpackage.yd1;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.version2.download.DownloadTag;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class AppDownloadInfo {
    private final bs1 apkDownloadInfo;
    private final bs1 dataMainDownloadInfo;
    private final bs1 dataPatchDownloadInfo;
    private final List<bs1> downloadList;
    private final List<bs1> splitDownloadInfoList;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppDownloadInfo(bs1 bs1Var) {
        this(bs1Var, null, null, null, 14, null);
        js3.p(bs1Var, "apkDownloadInfo");
    }

    private final boolean doOperation(ss1 ss1Var) {
        return operateDownloadWithCondition(this.downloadList, ss1Var, new k7(16)) || operateDownloadWithCondition(this.downloadList, ss1Var, new k7(15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doOperation$lambda$0(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        return ((es1) bs1Var).f != 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doOperation$lambda$1(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        return ((es1) bs1Var).f == 100;
    }

    private final boolean doOperationReverse(ss1 ss1Var) {
        r01 r01Var = new r01(3);
        r01Var.a(this.dataMainDownloadInfo);
        r01Var.a(this.dataPatchDownloadInfo);
        Collection collection = this.splitDownloadInfoList;
        if (collection == null) {
            collection = EmptyList.a;
        }
        r01Var.b(collection.toArray(new bs1[0]));
        ArrayList arrayList = r01Var.a;
        Object[] array = arrayList.toArray(new bs1[arrayList.size()]);
        js3.p(array, "elements");
        ArrayList arrayListJ0 = ew.J0(array);
        return operateDownloadWithCondition(br9.B(this.apkDownloadInfo), ss1Var, new k7(14)) || (operateDownloadWithCondition(br9.B(this.apkDownloadInfo), ss1Var, new k7(13)) || (operateDownloadWithCondition(arrayListJ0, ss1Var, new k7(12)) || operateDownloadWithCondition(arrayListJ0, ss1Var, new k7(11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doOperationReverse$lambda$0(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        return ((es1) bs1Var).f != 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doOperationReverse$lambda$1(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        return ((es1) bs1Var).f == 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doOperationReverse$lambda$2(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        return ((es1) bs1Var).f != 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean doOperationReverse$lambda$3(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        return ((es1) bs1Var).f == 100;
    }

    private final long getActualServerSize(bs1 bs1Var, List<Long> list, long j) {
        if (bs1Var == null) {
            return j;
        }
        long j2 = ((es1) bs1Var).h;
        list.add(Long.valueOf(j2));
        return j2 > -1 ? j + j2 : j;
    }

    private final <T> T getFirstOrDefault(dp2 dp2Var, T t) {
        T t2;
        Iterator<T> it = this.downloadList.iterator();
        do {
            t2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object objInvoke = dp2Var.invoke((bs1) it.next());
            if (!js3.i(objInvoke, t)) {
                t2 = (T) objInvoke;
            }
        } while (t2 == null);
        return t2 == null ? t : t2;
    }

    private final boolean isFileExist(String str) {
        Object objA;
        if (str == null || f88.n0(str)) {
            return true;
        }
        try {
            objA = Boolean.valueOf(!new File(str).exists());
        } catch (Throwable th) {
            objA = b.a(th);
        }
        if (Result.a(objA) != null) {
            objA = Boolean.FALSE;
        }
        return ((Boolean) objA).booleanValue();
    }

    private final boolean operateDownloadWithCondition(List<? extends bs1> list, rs1 rs1Var, dp2 dp2Var) {
        while (true) {
            boolean z = false;
            for (bs1 bs1Var : list) {
                if (((Boolean) dp2Var.invoke(bs1Var)).booleanValue()) {
                    if (rs1Var.m(bs1Var) || z) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public final boolean cancelDownload(xl5 xl5Var) {
        js3.p(xl5Var, "nene");
        return doOperation(new ss1(new hm0(xl5Var, 0)));
    }

    public final long getDatabaseTimestamp() {
        Iterator<T> it = this.downloadList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long j = ((es1) ((bs1) it.next())).j;
        while (it.hasNext()) {
            long j2 = ((es1) ((bs1) it.next())).j;
            if (j < j2) {
                j = j2;
            }
        }
        return j;
    }

    public final String getDestFilePath(int i, String str) {
        String destFilePath;
        List<bs1> list;
        Object next;
        if (i == 10 || i == 20 || i == 30) {
            destFilePath = getDestFilePath(i);
        } else {
            destFilePath = null;
            if (i == 40 && (list = this.splitDownloadInfoList) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    bs1 bs1Var = (bs1) next;
                    js3.p(bs1Var, "downloadInfo");
                    Object obj = ((es1) bs1Var).e;
                    js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
                    if (m88.T(((DownloadTag) obj).f, str, true)) {
                        break;
                    }
                }
                bs1 bs1Var2 = (bs1) next;
                if (bs1Var2 != null) {
                    destFilePath = y97.y(bs1Var2);
                }
            }
        }
        return destFilePath == null ? "" : destFilePath;
    }

    public final int getDetailedStatus() {
        List<bs1> list = this.downloadList;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((es1) ((bs1) it.next())).g));
        }
        return s7.u(arrayList);
    }

    public final String getDownloadRef() {
        bs1 bs1Var = this.apkDownloadInfo;
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str = ((DownloadTag) obj).q;
        js3.o(str, "downloadRef");
        return str;
    }

    public final boolean getForceUpdate() {
        return ((Boolean) getFirstOrDefault(new AppDownloadInfo$forceUpdate$1(eq.b), Boolean.FALSE)).booleanValue();
    }

    public final ForceUpdateDto getForceUpdateDto() {
        Long lValueOf;
        DownloadTag tag = getTag();
        tag.getClass();
        try {
            lValueOf = Long.valueOf(Long.parseLong(tag.t));
        } catch (Exception unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return new ForceUpdateDto(lValueOf.longValue(), "", false, 4, null);
        }
        return null;
    }

    public final String getIconPath() {
        return (String) getFirstOrDefault(new AppDownloadInfo$iconPath$1(eq.b), "");
    }

    public final String getInstallCallback() {
        bs1 bs1Var = this.apkDownloadInfo;
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).p;
    }

    public final long getLocalSize() {
        Iterator<T> it = this.downloadList.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((es1) ((bs1) it.next())).i;
        }
        return j;
    }

    public final String getPackageName() {
        return eq.q(this.apkDownloadInfo);
    }

    public final int getPercent() {
        long serverSize = getServerSize();
        if (serverSize <= 0) {
            return -1;
        }
        return (int) ((getLocalSize() * ((long) 100)) / serverSize);
    }

    public final String getPostInstall() {
        bs1 bs1Var = this.apkDownloadInfo;
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str = ((DownloadTag) obj).h;
        js3.o(str, "postInstall");
        return str;
    }

    public final String getPostInstallIntent() {
        bs1 bs1Var = this.apkDownloadInfo;
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).j;
    }

    public final String getPostInstallPackageName() {
        bs1 bs1Var = this.apkDownloadInfo;
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).k;
    }

    public final String getPreInstall() {
        bs1 bs1Var = this.apkDownloadInfo;
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str = ((DownloadTag) obj).g;
        js3.o(str, "preInstall");
        return str;
    }

    public final String getRefId() {
        return eq.r(this.apkDownloadInfo);
    }

    public final long getServerSize() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.downloadList.iterator();
        long actualServerSize = 0;
        while (it.hasNext()) {
            actualServerSize = getActualServerSize((bs1) it.next(), arrayList, actualServerSize);
        }
        if (arrayList.indexOf(-1L) == -1) {
            return actualServerSize;
        }
        Iterator<T> it2 = this.downloadList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        bs1 bs1Var = (bs1) it2.next();
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        long j = ((DownloadTag) obj).l;
        while (it2.hasNext()) {
            bs1 bs1Var2 = (bs1) it2.next();
            js3.p(bs1Var2, "downloadInfo");
            Object obj2 = ((es1) bs1Var2).e;
            js3.n(obj2, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
            long j2 = ((DownloadTag) obj2).l;
            if (j < j2) {
                j = j2;
            }
        }
        return Math.max(j, actualServerSize);
    }

    public final String[] getSplitNames() {
        return eq.t(this.apkDownloadInfo);
    }

    public final int getStatus() {
        List<bs1> list = this.downloadList;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((es1) ((bs1) it.next())).f));
        }
        return s7.v(arrayList);
    }

    public final DownloadTag getTag() {
        Object obj = ((es1) this.apkDownloadInfo).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return (DownloadTag) obj;
    }

    public final String getTitle() {
        return (String) getFirstOrDefault(new AppDownloadInfo$title$1(eq.b), "");
    }

    public final long getTransferRate() {
        Iterator<T> it = this.downloadList.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((es1) ((bs1) it.next())).k;
        }
        return j;
    }

    public final int getVersionCode() {
        return eq.u(this.apkDownloadInfo);
    }

    @SuppressLint({"MissingPermission"})
    public final boolean isAllFileExist() {
        Iterator<T> it = this.downloadList.iterator();
        while (it.hasNext()) {
            if (isFileRemoved((bs1) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isDownloadSplit() {
        List<bs1> list = this.splitDownloadInfoList;
        return !(list == null || list.isEmpty());
    }

    public final boolean isDownloadWithData() {
        return (this.dataMainDownloadInfo == null && this.dataPatchDownloadInfo == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isFileRemoved(defpackage.bs1 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "downloadInfo"
            defpackage.js3.p(r7, r0)
            int r0 = defpackage.eq.o(r7)
            r1 = 20
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L15
            r1 = 30
            if (r0 == r1) goto L15
        L13:
            r0 = r3
            goto L56
        L15:
            java.lang.String r0 = defpackage.k68.e
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r1 = defpackage.y97.y(r7)
            java.lang.String r1 = defpackage.bc2.a(r1)
            java.lang.String r4 = "getName(...)"
            defpackage.js3.o(r1, r4)
            java.lang.String r5 = "packageName"
            defpackage.js3.p(r0, r5)
            java.lang.String r0 = defpackage.a77.h(r0)
            java.lang.String r0 = defpackage.t61.i(r0, r1)
            boolean r0 = r6.isFileExist(r0)
            if (r0 == 0) goto L55
            java.lang.String r0 = defpackage.y97.y(r7)
            java.lang.String r0 = defpackage.bc2.a(r0)
            defpackage.js3.o(r0, r4)
            java.lang.String r1 = defpackage.a77.k()
            java.lang.String r0 = defpackage.t61.i(r1, r0)
            boolean r0 = r6.isFileExist(r0)
            if (r0 == 0) goto L55
            goto L13
        L55:
            r0 = r2
        L56:
            java.lang.String r7 = defpackage.y97.y(r7)
            boolean r7 = r6.isFileExist(r7)
            if (r7 == 0) goto L63
            if (r0 == 0) goto L63
            return r3
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.download.common.data.AppDownloadInfo.isFileRemoved(bs1):boolean");
    }

    public final boolean pauseDownload(xl5 xl5Var) {
        js3.p(xl5Var, "nene");
        return doOperation(new ss1(new v36(xl5Var)));
    }

    public final boolean removeDownload(xl5 xl5Var) {
        js3.p(xl5Var, "nene");
        return doOperationReverse(new ss1(new t15(9, xl5Var)));
    }

    public final boolean startDownload(xl5 xl5Var) {
        js3.p(xl5Var, "nene");
        return doOperation(new ss1(new ck4(xl5Var)));
    }

    public String toString() {
        StringBuilder sbA = o40.A(64, "AppDownloadInfo{apkDownloadInfo=");
        sbA.append(this.apkDownloadInfo);
        if (this.dataMainDownloadInfo != null) {
            sbA.append(", dataMainDownloadInfo=");
            sbA.append(this.dataMainDownloadInfo);
        }
        if (this.dataPatchDownloadInfo != null) {
            sbA.append(", dataPatchDownloadInfo=");
            sbA.append(this.dataPatchDownloadInfo);
        }
        List<bs1> list = this.splitDownloadInfoList;
        if (list != null) {
            for (bs1 bs1Var : list) {
                sbA.append(", splitDownloadInfo=");
                sbA.append(bs1Var);
            }
        }
        sbA.append('}');
        String string = sbA.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppDownloadInfo(bs1 bs1Var, bs1 bs1Var2) {
        this(bs1Var, bs1Var2, null, null, 12, null);
        js3.p(bs1Var, "apkDownloadInfo");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppDownloadInfo(bs1 bs1Var, bs1 bs1Var2, bs1 bs1Var3) {
        this(bs1Var, bs1Var2, bs1Var3, null, 8, null);
        js3.p(bs1Var, "apkDownloadInfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppDownloadInfo(bs1 bs1Var, bs1 bs1Var2, bs1 bs1Var3, List<? extends bs1> list) {
        js3.p(bs1Var, "apkDownloadInfo");
        this.apkDownloadInfo = bs1Var;
        this.dataMainDownloadInfo = bs1Var2;
        this.dataPatchDownloadInfo = bs1Var3;
        this.splitDownloadInfoList = list;
        r01 r01Var = new r01(4);
        r01Var.a(bs1Var);
        r01Var.a(bs1Var2);
        r01Var.a(bs1Var3);
        r01Var.b((list == 0 ? EmptyList.a : list).toArray(new bs1[0]));
        ArrayList arrayList = r01Var.a;
        Object[] array = arrayList.toArray(new bs1[arrayList.size()]);
        js3.p(array, "elements");
        this.downloadList = ew.J0(array);
    }

    public final String getDestFilePath(int i) {
        if (i == 10) {
            return y97.y(this.apkDownloadInfo);
        }
        if (i == 20) {
            return y97.y(this.dataMainDownloadInfo);
        }
        if (i == 30) {
            return y97.y(this.dataPatchDownloadInfo);
        }
        throw new RuntimeException();
    }

    public /* synthetic */ AppDownloadInfo(bs1 bs1Var, bs1 bs1Var2, bs1 bs1Var3, List list, int i, yd1 yd1Var) {
        this(bs1Var, (i & 2) != 0 ? null : bs1Var2, (i & 4) != 0 ? null : bs1Var3, (i & 8) != 0 ? null : list);
    }
}
