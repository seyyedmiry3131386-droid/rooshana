package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.o;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.nearby.zzar;
import com.google.android.gms.internal.nearby.zzib;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.gson.reflect.TypeToken;
import io.sentry.android.core.t0;
import ir.mservices.market.app.update.data.StateAppsRequestDto;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.requestdto.UpdateRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto;
import ir.mservices.market.version2.webapi.responsedto.UpdateDTO;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class rn6 implements lb0, ms5, at5, tl9, q37, tt5, h51 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ rn6(int i, boolean z) {
        this.a = i;
    }

    public static rn6 k(Activity activity2, Uri uri) {
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(activity2, uri)) {
            treeDocumentId = DocumentsContract.getDocumentId(uri);
        }
        if (treeDocumentId == null) {
            throw new IllegalArgumentException(rm7.p(uri, "Could not get document ID from Uri: "));
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, treeDocumentId);
        if (uriBuildDocumentUriUsingTree != null) {
            return new rn6(activity2, uriBuildDocumentUriUsingTree, 10);
        }
        throw new NullPointerException(rm7.p(uri, "Failed to build documentUri from a tree: "));
    }

    public void A(Status status, boolean z) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.b;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.c;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).q0(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((cf8) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    public Object B() {
        Uri uri;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String string;
        ir9 ir9Var = (ir9) this.b;
        String str = (String) this.c;
        Context context = (Context) ir9Var.c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        go8 go8Var = zq9.a;
        if (contentResolver == null) {
            go8Var.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (go8Var) {
            try {
                if (((HashMap) go8Var.b) == null) {
                    ((AtomicBoolean) go8Var.a).set(false);
                    go8Var.b = new HashMap(16, 1.0f);
                    go8Var.g = new Object();
                    contentResolver.registerContentObserver(ar9.a, true, new q81(go8Var));
                } else if (((AtomicBoolean) go8Var.a).getAndSet(false)) {
                    ((HashMap) go8Var.b).clear();
                    ((HashMap) go8Var.c).clear();
                    ((HashMap) go8Var.d).clear();
                    ((HashMap) go8Var.e).clear();
                    ((HashMap) go8Var.f).clear();
                    go8Var.g = new Object();
                }
                Object obj = go8Var.g;
                String str2 = null;
                if (((HashMap) go8Var.b).containsKey(str)) {
                    String str3 = (String) ((HashMap) go8Var.b).get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                try {
                    uri = ar9.a;
                    contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                } catch (zzjk unused) {
                }
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new zzjk("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                        try {
                            if (cursorQuery == null) {
                                throw new zzjk("ContentProvider query returned null cursor");
                            }
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(1);
                                cursorQuery.close();
                            } else {
                                cursorQuery.close();
                                string = null;
                            }
                            if (string != null && string.equals(null)) {
                                string = null;
                            }
                            synchronized (go8Var) {
                                try {
                                    if (obj == go8Var.g) {
                                        ((HashMap) go8Var.b).put(str, string);
                                    }
                                } finally {
                                }
                            }
                            if (string != null) {
                                return string;
                            }
                            return null;
                        } finally {
                        }
                    } catch (RemoteException e) {
                        throw new zzjk("ContentProvider query failed", e);
                    }
                } finally {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                }
            } finally {
            }
        }
    }

    public void C(el9 el9Var) {
        Iterator it = el9Var.a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.b).put(Integer.valueOf(((zzbk) it.next()).a).toString(), el9Var);
        }
    }

    public xk9 D(o77 o77Var, xk9 xk9Var) {
        c67.y(o77Var);
        if (!(xk9Var instanceof zk9)) {
            return xk9Var;
        }
        zk9 zk9Var = (zk9) xk9Var;
        ArrayList arrayList = zk9Var.b;
        String str = zk9Var.a;
        HashMap map = (HashMap) this.b;
        return (map.containsKey(str) ? (el9) map.get(str) : (el9) this.c).a(str, o77Var, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c A[EDGE_INSN: B:68:0x011c->B:52:0x011c BREAK  A[LOOP:1: B:38:0x00e3->B:51:0x010b], SYNTHETIC] */
    @Override // defpackage.lb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.kb0 a(defpackage.w72 r17, long r18) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn6.a(w72, long):kb0");
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        int i = 21;
        zm9 zm9Var = (zm9) obj;
        cf8 cf8Var = (cf8) obj2;
        switch (this.a) {
            case 22:
                vo4 vo4Var = new vo4(i, cf8Var);
                String str = Build.MODEL;
                x41 x41Var = (x41) this.b;
                AdvertisingOptions advertisingOptions = (AdvertisingOptions) this.c;
                zm9Var.getClass();
                vl9 vl9Var = new vl9(x41Var);
                zm9Var.g.add(vl9Var);
                kp9 kp9Var = (kp9) zm9Var.getService();
                zzib zzibVar = new zzib();
                zzibVar.a = new xm9(vo4Var);
                zzibVar.c = str;
                zzibVar.d = NearbyRepository.SERVICE_ID;
                zzibVar.f = advertisingOptions;
                zzibVar.g = vl9Var;
                Parcel parcelN0 = kp9Var.n0();
                int i2 = lm9.a;
                parcelN0.writeInt(1);
                zzibVar.writeToParcel(parcelN0, 0);
                kp9Var.o0(2001, parcelN0);
                break;
            default:
                vo4 vo4Var2 = new vo4(i, cf8Var);
                String str2 = (String) this.b;
                x41 x41Var2 = (x41) this.c;
                zm9Var.getClass();
                vm9 vm9Var = new vm9(zm9Var.getContext(), x41Var2, zm9Var.i);
                zm9Var.e.add(vm9Var);
                kp9 kp9Var2 = (kp9) zm9Var.getService();
                zzar zzarVar = new zzar();
                zzarVar.a = new wm9(vo4Var2);
                zzarVar.c = str2;
                zzarVar.e = vm9Var;
                Parcel parcelN02 = kp9Var2.n0();
                int i3 = lm9.a;
                parcelN02.writeInt(1);
                zzarVar.writeToParcel(parcelN02, 0);
                kp9Var2.o0(2006, parcelN02);
                break;
        }
    }

    @Override // defpackage.tl9
    public o77 b(xk9 xk9Var) {
        o77 o77VarK = ((o77) this.b).K();
        o77VarK.N((String) this.c, xk9Var);
        return o77VarK;
    }

    @Override // defpackage.lb0
    public void c() {
        h26 h26Var = (h26) this.c;
        byte[] bArr = j29.b;
        h26Var.getClass();
        h26Var.H(bArr.length, bArr);
    }

    public void d(o oVar, ba4 ba4Var) {
        fw7 fw7Var = (fw7) this.b;
        f79 f79VarA = (f79) fw7Var.get(oVar);
        if (f79VarA == null) {
            f79VarA = f79.a();
            fw7Var.put(oVar, f79VarA);
        }
        f79VarA.c = ba4Var;
        f79VarA.a |= 8;
    }

    public String e(sx3 sx3Var) {
        String str;
        bc7 bc7Var = (bc7) ((wv8) this.c).e();
        try {
            sx3Var.b(bc7Var.a);
            byte[] bArrDigest = bc7Var.a.digest();
            char[] cArr = i29.b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = i29.a;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((wv8) this.c).d(bc7Var);
        }
    }

    @Override // defpackage.h51
    public Object f(bf8 bf8Var) {
        Bundle bundle;
        fb7 fb7Var = (fb7) this.b;
        Bundle bundle2 = (Bundle) this.c;
        fb7Var.getClass();
        return (bf8Var.f() && (bundle = (Bundle) bf8Var.d()) != null && bundle.containsKey("google.messenger")) ? fb7Var.a(bundle2).l(ko9.c, eq.P) : bf8Var;
    }

    public boolean g() {
        Context context = (Context) this.b;
        Uri uri = (Uri) this.c;
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(dy3.J(context, uri, "mime_type"));
    }

    public boolean h() {
        Context context = (Context) this.b;
        Uri uri = (Uri) this.c;
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strJ = dy3.J(context, uri, "mime_type");
        long j = 0;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(uri, new String[]{"flags"}, null, null, null);
                if (cursorQuery.moveToFirst() && !cursorQuery.isNull(0)) {
                    j = cursorQuery.getLong(0);
                }
            } catch (Exception e) {
                t0.m("DocumentFile", "Failed query: " + e);
            }
            int i = (int) j;
            if (TextUtils.isEmpty(strJ)) {
                return false;
            }
            return (i & 4) != 0 || ("vnd.android.document/directory".equals(strJ) && (i & 8) != 0) || !(TextUtils.isEmpty(strJ) || (i & 2) == 0);
        } finally {
            dy3.l(cursorQuery);
        }
    }

    public boolean i() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = ((Context) this.b).getContentResolver().query((Uri) this.c, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e) {
            t0.m("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            dy3.l(cursorQuery);
        }
    }

    public rn6 j(String str) {
        for (rn6 rn6Var : r()) {
            if (str.equals(dy3.J((Context) rn6Var.b, (Uri) rn6Var.c, "_display_name"))) {
                return rn6Var;
            }
        }
        return null;
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        ((Map) ((rn6) this.c).c).remove((cf8) this.b);
    }

    public String m(sx3 sx3Var) {
        String strE;
        synchronized (((nd1) this.b)) {
            strE = (String) ((nd1) this.b).b(sx3Var);
        }
        if (strE == null) {
            strE = e(sx3Var);
        }
        synchronized (((nd1) this.b)) {
            ((nd1) this.b).e(sx3Var, strE);
        }
        return strE;
    }

    public Object n(UpdateRequestDto updateRequestDto, Object obj, String str, ff5 ff5Var, ContinuationImpl continuationImpl) {
        uz8 uz8Var = (uz8) this.b;
        uz8Var.getClass();
        z57 z57VarCreateRequestUrl = uz8Var.createRequestUrl("v2/applications", "updates", null, uz8Var.getCommonQueryParam(b.O(new Pair("source", str))));
        Map<String, String> headers = uz8Var.getHeaders(new HashMap());
        js3.o(headers, "getHeaders(...)");
        Type type = new TypeToken<UpdateDTO>() { // from class: ir.mservices.market.app.update.service.UpdateService$getUpdateApps$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.G(uz8Var, type, z57VarCreateRequestUrl, updateRequestDto, obj, headers, ff5Var, continuationImpl, 160);
    }

    public Object o(String str, StateAppsRequestDto stateAppsRequestDto, Object obj, ContinuationImpl continuationImpl) {
        uz8 uz8Var = (uz8) this.b;
        uz8Var.getClass();
        z57 z57VarCreateRequestUrl = uz8Var.createRequestUrl("v1/applications", "state", null, uz8Var.getCommonQueryParam(b.O(new Pair("source", str))));
        Type type = new TypeToken<ApplicationStateListDto>() { // from class: ir.mservices.market.app.update.service.UpdateService$getUpdateAppsState$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.G(uz8Var, type, z57VarCreateRequestUrl, stateAppsRequestDto, obj, null, null, continuationImpl, 496);
    }

    @Override // defpackage.tt5
    public void onSuccess(Object obj) {
        bo9 bo9Var = (bo9) this.b;
        DiscoveryOptions discoveryOptions = (DiscoveryOptions) this.c;
        bo9Var.getClass();
        boolean z = discoveryOptions.h;
    }

    public boolean p() {
        return "vnd.android.document/directory".equals(dy3.J((Context) this.b, (Uri) this.c, "mime_type"));
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        z99 z99Var = (z99) this.b;
        aa9 aa9Var = (aa9) this.c;
        aa9 aa9Var2 = new aa9();
        aa9Var2.a = aa9Var.a;
        aa9Var2.b = aa9Var.b;
        aa9Var2.c = aa9Var.c;
        aa9Var2.d = aa9Var.d;
        return z99Var.t(view, lf9Var, aa9Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[LOOP:1: B:23:0x006e->B:25:0x0071, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.rn6[] r() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.b
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            android.content.ContentResolver r2 = r1.getContentResolver()
            java.lang.Object r0 = r11.c
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r3 = android.provider.DocumentsContract.getDocumentId(r0)
            android.net.Uri r3 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r0, r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 0
            java.lang.String r4 = "document_id"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
        L29:
            boolean r2 = r10.moveToNext()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            if (r2 == 0) goto L3f
            java.lang.String r2 = r10.getString(r9)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            android.net.Uri r2 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r0, r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r8.add(r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            goto L29
        L3b:
            r0 = move-exception
            goto L80
        L3d:
            r0 = move-exception
            goto L45
        L3f:
            defpackage.o40.G(r10)     // Catch: java.lang.RuntimeException -> L43 java.lang.Exception -> L63
            goto L63
        L43:
            r0 = move-exception
            throw r0
        L45:
            java.lang.String r2 = "DocumentFile"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "Failed query: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L3b
            r3.append(r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L3b
            io.sentry.android.core.t0.m(r2, r0)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            defpackage.o40.G(r10)     // Catch: java.lang.RuntimeException -> L61 java.lang.Exception -> L63
            goto L63
        L61:
            r0 = move-exception
            throw r0
        L63:
            android.net.Uri[] r0 = new android.net.Uri[r9]
            java.lang.Object[] r0 = r8.toArray(r0)
            android.net.Uri[] r0 = (android.net.Uri[]) r0
            int r2 = r0.length
            rn6[] r2 = new defpackage.rn6[r2]
        L6e:
            int r3 = r0.length
            if (r9 >= r3) goto L7f
            rn6 r3 = new rn6
            r4 = r0[r9]
            r5 = 10
            r3.<init>(r1, r4, r5)
            r2[r9] = r3
            int r9 = r9 + 1
            goto L6e
        L7f:
            return r2
        L80:
            if (r10 == 0) goto L88
            defpackage.o40.G(r10)     // Catch: java.lang.RuntimeException -> L86 java.lang.Exception -> L88
            goto L88
        L86:
            r0 = move-exception
            throw r0
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn6.r():rn6[]");
    }

    public void s(int i, String str, String str2) {
        ((ee) this.b).b("search_recommended_app", AppMeasurementSdk.ConditionalUserProperty.NAME, str, "position", String.valueOf(i), "mode", str2);
    }

    public void t(String str, String str2, String str3) {
        ((ee) this.b).b("search_suggest_".concat(str), "query", str2, AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "Bounds{lower=" + ((no3) this.b) + " upper=" + ((no3) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u() {
        ((bp4) this.b).a();
    }

    public void v(Bundle bundle) {
        bp4 bp4Var = (bp4) this.b;
        qd7 qd7Var = (qd7) bp4Var.d;
        if (!bp4Var.a) {
            bp4Var.a();
        }
        if (qd7Var.D().d.compareTo(Lifecycle$State.d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + qd7Var.D().d).toString());
        }
        if (bp4Var.b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleC = t17.c(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        bp4Var.h = bundleC;
        bp4Var.b = true;
    }

    public void w(Bundle bundle) {
        bp4 bp4Var = (bp4) this.b;
        b.I();
        Bundle bundleG = is3.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = (Bundle) bp4Var.h;
        if (bundle2 != null) {
            bundleG.putAll(bundle2);
        }
        synchronized (((ql3) bp4Var.f)) {
            for (Map.Entry entry : ((LinkedHashMap) bp4Var.g).entrySet()) {
                h27.l(bundleG, (String) entry.getKey(), ((pd7) entry.getValue()).a());
            }
        }
        if (bundleG.isEmpty()) {
            return;
        }
        h27.l(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleG);
    }

    public ba4 x(o oVar, int i) {
        f79 f79Var;
        ba4 ba4Var;
        fw7 fw7Var = (fw7) this.b;
        int iD = fw7Var.d(oVar);
        if (iD >= 0 && (f79Var = (f79) fw7Var.j(iD)) != null) {
            int i2 = f79Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                f79Var.a = i3;
                if (i == 4) {
                    ba4Var = f79Var.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    ba4Var = f79Var.c;
                }
                if ((i3 & 12) == 0) {
                    fw7Var.h(iD);
                    f79Var.a = 0;
                    f79Var.b = null;
                    f79Var.c = null;
                    f79.d.d(f79Var);
                }
                return ba4Var;
            }
        }
        return null;
    }

    public void y(o oVar) {
        f79 f79Var = (f79) ((fw7) this.b).get(oVar);
        if (f79Var == null) {
            return;
        }
        f79Var.a &= -2;
    }

    public void z(o oVar) {
        ue4 ue4Var = (ue4) this.c;
        int iK = ue4Var.k() - 1;
        while (true) {
            if (iK < 0) {
                break;
            }
            if (oVar == ue4Var.l(iK)) {
                Object[] objArr = ue4Var.c;
                Object obj = objArr[iK];
                Object obj2 = c26.b;
                if (obj != obj2) {
                    objArr[iK] = obj2;
                    ue4Var.a = true;
                }
            } else {
                iK--;
            }
        }
        f79 f79Var = (f79) ((fw7) this.b).remove(oVar);
        if (f79Var != null) {
            f79Var.a = 0;
            f79Var.b = null;
            f79Var.c = null;
            f79.d.d(f79Var);
        }
    }

    public rn6(fp7 fp7Var, AlertDialog alertDialog) {
        this.a = 18;
        this.b = alertDialog;
        this.c = fp7Var;
    }

    public /* synthetic */ rn6(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ rn6(bo9 bo9Var, x41 x41Var, AdvertisingOptions advertisingOptions) {
        this.a = 22;
        String str = Build.MODEL;
        this.b = x41Var;
        this.c = advertisingOptions;
    }

    public /* synthetic */ rn6(bo9 bo9Var, String str, x41 x41Var) {
        this.a = 23;
        this.b = str;
        this.c = x41Var;
    }

    public rn6(rn6 rn6Var, cf8 cf8Var) {
        this.a = 19;
        this.b = cf8Var;
        Objects.requireNonNull(rn6Var);
        this.c = rn6Var;
    }

    public rn6(IBinder iBinder) throws RemoteException {
        this.a = 26;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new zzd(iBinder);
            this.b = null;
        } else {
            t0.m("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public rn6(uz8 uz8Var, Context context) {
        this.a = 12;
        js3.p(uz8Var, "updateService");
        this.b = uz8Var;
        this.c = context;
    }

    public rn6(t98 t98Var, uc8 uc8Var, a97 a97Var) {
        this.a = 8;
        js3.p(t98Var, "subReviewService");
        js3.p(uc8Var, "surveyService");
        js3.p(a97Var, "reviewService");
        this.b = t98Var;
        this.c = uc8Var;
    }

    public rn6(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = new rl3();
                this.c = new lg4(16);
                break;
            case 13:
                this.b = new fw7(0);
                this.c = new ue4((Object) null);
                break;
            case 15:
                this.b = new zb5(0, new Reference[16]);
                this.c = new ReferenceQueue();
                break;
            case 17:
                this.b = DesugarCollections.synchronizedMap(new WeakHashMap());
                this.c = DesugarCollections.synchronizedMap(new WeakHashMap());
                break;
            case 20:
                this.b = new HashMap();
                this.c = new el9(6);
                el9 el9Var = new el9(0);
                zzbk zzbkVar = zzbk.BITWISE_AND;
                ArrayList arrayList = el9Var.a;
                arrayList.add(zzbkVar);
                arrayList.add(zzbk.BITWISE_LEFT_SHIFT);
                arrayList.add(zzbk.BITWISE_NOT);
                arrayList.add(zzbk.BITWISE_OR);
                arrayList.add(zzbk.BITWISE_RIGHT_SHIFT);
                arrayList.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(zzbk.BITWISE_XOR);
                C(el9Var);
                el9 el9Var2 = new el9(1);
                zzbk zzbkVar2 = zzbk.EQUALS;
                ArrayList arrayList2 = el9Var2.a;
                arrayList2.add(zzbkVar2);
                arrayList2.add(zzbk.GREATER_THAN);
                arrayList2.add(zzbk.GREATER_THAN_EQUALS);
                arrayList2.add(zzbk.IDENTITY_EQUALS);
                arrayList2.add(zzbk.IDENTITY_NOT_EQUALS);
                arrayList2.add(zzbk.LESS_THAN);
                arrayList2.add(zzbk.LESS_THAN_EQUALS);
                arrayList2.add(zzbk.NOT_EQUALS);
                C(el9Var2);
                el9 el9Var3 = new el9(2);
                zzbk zzbkVar3 = zzbk.APPLY;
                ArrayList arrayList3 = el9Var3.a;
                arrayList3.add(zzbkVar3);
                arrayList3.add(zzbk.BLOCK);
                arrayList3.add(zzbk.BREAK);
                arrayList3.add(zzbk.CASE);
                arrayList3.add(zzbk.DEFAULT);
                arrayList3.add(zzbk.CONTINUE);
                arrayList3.add(zzbk.DEFINE_FUNCTION);
                arrayList3.add(zzbk.FN);
                arrayList3.add(zzbk.IF);
                arrayList3.add(zzbk.QUOTE);
                arrayList3.add(zzbk.RETURN);
                arrayList3.add(zzbk.SWITCH);
                arrayList3.add(zzbk.TERNARY);
                C(el9Var3);
                el9 el9Var4 = new el9(3);
                zzbk zzbkVar4 = zzbk.AND;
                ArrayList arrayList4 = el9Var4.a;
                arrayList4.add(zzbkVar4);
                arrayList4.add(zzbk.NOT);
                arrayList4.add(zzbk.OR);
                C(el9Var4);
                el9 el9Var5 = new el9(4);
                zzbk zzbkVar5 = zzbk.FOR_IN;
                ArrayList arrayList5 = el9Var5.a;
                arrayList5.add(zzbkVar5);
                arrayList5.add(zzbk.FOR_IN_CONST);
                arrayList5.add(zzbk.FOR_IN_LET);
                arrayList5.add(zzbk.FOR_LET);
                arrayList5.add(zzbk.FOR_OF);
                arrayList5.add(zzbk.FOR_OF_CONST);
                arrayList5.add(zzbk.FOR_OF_LET);
                arrayList5.add(zzbk.WHILE);
                C(el9Var5);
                el9 el9Var6 = new el9(5);
                zzbk zzbkVar6 = zzbk.ADD;
                ArrayList arrayList6 = el9Var6.a;
                arrayList6.add(zzbkVar6);
                arrayList6.add(zzbk.DIVIDE);
                arrayList6.add(zzbk.MODULUS);
                arrayList6.add(zzbk.MULTIPLY);
                arrayList6.add(zzbk.NEGATE);
                arrayList6.add(zzbk.POST_DECREMENT);
                arrayList6.add(zzbk.POST_INCREMENT);
                arrayList6.add(zzbk.PRE_DECREMENT);
                arrayList6.add(zzbk.PRE_INCREMENT);
                arrayList6.add(zzbk.SUBTRACT);
                C(el9Var6);
                el9 el9Var7 = new el9(7);
                zzbk zzbkVar7 = zzbk.ASSIGN;
                ArrayList arrayList7 = el9Var7.a;
                arrayList7.add(zzbkVar7);
                arrayList7.add(zzbk.CONST);
                arrayList7.add(zzbk.CREATE_ARRAY);
                arrayList7.add(zzbk.CREATE_OBJECT);
                arrayList7.add(zzbk.EXPRESSION_LIST);
                arrayList7.add(zzbk.GET);
                arrayList7.add(zzbk.GET_INDEX);
                arrayList7.add(zzbk.GET_PROPERTY);
                arrayList7.add(zzbk.NULL);
                arrayList7.add(zzbk.SET_PROPERTY);
                arrayList7.add(zzbk.TYPEOF);
                arrayList7.add(zzbk.UNDEFINED);
                arrayList7.add(zzbk.VAR);
                C(el9Var7);
                break;
            default:
                this.b = new nd1(1000L);
                this.c = ml9.y(10, new rl3());
                break;
        }
    }

    public rn6(Context context, uc8 uc8Var) {
        this.a = 9;
        js3.p(uc8Var, "service");
        this.b = context;
        this.c = uc8Var;
    }

    public rn6(bp4 bp4Var) {
        this.a = 3;
        this.b = bp4Var;
        this.c = new bn6(bp4Var);
    }

    public rn6(hm8 hm8Var) {
        this.a = 0;
        this.b = hm8Var;
        this.c = new h26();
    }

    public rn6(WindowInsetsAnimation.Bounds bounds) {
        this.a = 16;
        this.b = se9.g(bounds);
        this.c = se9.f(bounds);
    }
}
