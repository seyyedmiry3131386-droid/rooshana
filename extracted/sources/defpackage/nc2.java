package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.ui.layout.g;
import androidx.media3.session.legacy.MediaSessionCompat$Token;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.paging.k;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import io.sentry.android.core.t0;
import io.sentry.config.a;
import ir.mservices.market.app.home.ui.recycler.HomeVideoData;
import ir.mservices.market.app.home.ui.recycler.c;
import ir.mservices.market.version2.activity.WebViewActivityImpl.InAppPurchaseWebview;
import ir.mservices.market.version2.webapi.responsedto.IapInvoiceDTO;
import ir.mservices.market.version2.webapi.responsedto.PurchaseDTO;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;
import ir.mservices.market.views.MyketVideoView;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class nc2 implements l26, hg5, gb8, u98, y98, hl0, pm0, fx8 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ nc2(int i, Object obj) {
        this.a = i;
        this.b = obj;
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.nc2 w(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            okio.ByteString[] r0 = new okio.ByteString[r0]     // Catch: java.io.IOException -> L6d
            gh0 r1 = new gh0     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = com.airbnb.lottie.parser.moshi.a.e     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.R0(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.j1(r4, r9, r8)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.h1(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.j1(r4, r9, r7)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.R0(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.b     // Catch: java.io.IOException -> L6d
            okio.ByteString r4 = r1.v(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            nc2 r1 = new nc2     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            tv5 r0 = defpackage.at2.h0(r0)     // Catch: java.io.IOException -> L6d
            r2 = 11
            r1.<init>(r12, r0, r2)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.w(java.lang.String[]):nc2");
    }

    public void A(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((wv) this.c)) {
            ((wv) this.c).put(new j95(cls, cls2, cls3), list);
        }
    }

    public x20 B() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File fileQ = q();
            FileInputStream fileInputStreamG = a.g(fileQ, new FileInputStream(fileQ));
            while (true) {
                try {
                    int i = fileInputStreamG.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStreamG.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = x20.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = PersistedInstallation$RegistrationStatus.values()[iOptInt];
        if (persistedInstallation$RegistrationStatus == null) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3) {
            return new x20(strOptString, persistedInstallation$RegistrationStatus, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public Object C() {
        rv2 rv2Var = (rv2) this.b;
        rv2 rv2Var2 = rv2Var.d;
        while (true) {
            boolean zEquals = rv2Var2.equals(rv2Var);
            Object obj = rv2Var2.a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = rv2Var2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? rv2Var2.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            rv2 rv2Var3 = rv2Var2.d;
            rv2Var3.c = rv2Var2.c;
            rv2Var2.c.d = rv2Var3;
            ((HashMap) this.c).remove(obj);
            ((uh6) obj).a();
            rv2Var2 = rv2Var2.d;
        }
    }

    @Override // defpackage.fx8
    public void a() {
        ((do3) this.b).C(tx8.a);
    }

    @Override // defpackage.u98
    public v98 apply() {
        return ((g) this.b).f(this.c);
    }

    @Override // defpackage.hl0
    public void b(g77 g77Var) {
        il0 il0Var = (il0) this.b;
        fs5 fs5Var = (fs5) this.c;
        try {
            try {
                il0Var.e(fs5Var, fs5Var.c(g77Var));
            } catch (Throwable th) {
                rq4.P(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            rq4.P(th2);
            try {
                il0Var.o(fs5Var, th2);
            } catch (Throwable th3) {
                rq4.P(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // defpackage.u98
    public boolean c() {
        return true;
    }

    @Override // defpackage.u98
    public void cancel() {
        switch (this.a) {
            case 12:
                break;
            default:
                if (!((AtomicInt) this.c).compareAndSet(1, 1)) {
                    ((f8) this.b).invoke();
                }
                break;
        }
    }

    @Override // defpackage.y98
    public void d(x98 x98Var) {
        ib5 ib5Var = (ib5) this.c;
        ib5Var.a();
        nb5 nb5Var = x98Var.a;
        Object[] objArr = nb5Var.b;
        long[] jArr = nb5Var.c;
        int i = nb5Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((x24) this.b).b(obj);
            int iD = ib5Var.d(objB);
            int i3 = iD >= 0 ? ib5Var.c[iD] : 0;
            if (i3 == 7) {
                x98Var.remove(obj);
            } else {
                ib5Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // defpackage.hg5
    public void e() {
        c cVar = (c) this.b;
        og5 og5Var = cVar.x;
        if (og5Var != null) {
            MyketVideoView myketVideoView = cVar.z().x;
            js3.o(myketVideoView, "videoView");
            og5Var.m(myketVideoView, cVar, (HomeVideoData) this.c);
        }
    }

    @Override // defpackage.u98
    public boolean f(ur4 ur4Var) {
        return true;
    }

    @Override // defpackage.l26
    public o03 g(Uri uri, bb1 bb1Var) {
        o03 o03VarG = ((l26) this.b).g(uri, bb1Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? o03VarG : (o03) o03VarG.a(list);
    }

    @Override // defpackage.hg5
    public void h() {
        String id;
        f70 f70Var;
        VideoRowDto videoRowDto = ((HomeVideoData) this.c).a;
        if (videoRowDto == null || (id = videoRowDto.getId()) == null || (f70Var = ((c) this.b).y) == null) {
            return;
        }
        f70Var.g(id);
    }

    public void i(List list) {
        ri4 ri4Var = (ri4) this.c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kd3 kd3Var = (kd3) it.next();
            if (kd3Var.m()) {
                re8 re8VarM = ri4Var.M((String) kd3Var.c);
                if (re8VarM != null) {
                    re8VarM.a((vp7) this.b, ri4Var, kd3Var);
                } else {
                    ArrayList arrayList = kd3Var.f;
                    i(arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList));
                }
            }
        }
    }

    @Override // defpackage.y98
    public boolean j(Object obj, Object obj2) {
        x24 x24Var = (x24) this.b;
        return js3.i(x24Var.b(obj), x24Var.b(obj2));
    }

    @Override // defpackage.fx8
    public void k() {
        ((k) this.c).c.C(Boolean.TRUE);
    }

    @Override // defpackage.hl0
    public void l(xv6 xv6Var, IOException iOException) {
        try {
            ((il0) this.b).o((fs5) this.c, iOException);
        } catch (Throwable th) {
            rq4.P(th);
            th.printStackTrace();
        }
    }

    public synchronized void n(p46 p46Var) {
        try {
            p46 p46Var2 = (p46) this.c;
            if (p46Var2 != null) {
                p46Var2.c = p46Var;
                this.c = p46Var;
            } else {
                if (((p46) this.b) != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.c = p46Var;
                this.b = p46Var;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory o(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc2.o(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 8:
                List list = (List) obj;
                InAppPurchaseWebview inAppPurchaseWebview = (InAppPurchaseWebview) this.c;
                if (list == null || list.size() <= 0) {
                    sb7.p("MyketIabWebView", "jsFallbackRunner, Server list null or empty!", null);
                } else {
                    vv2 vv2Var = new vv2();
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            PurchaseDTO purchaseDTO = (PurchaseDTO) it.next();
                            if (purchaseDTO != null && ((IapInvoiceDTO) vv2Var.c(purchaseDTO.getInvoice(), IapInvoiceDTO.class)).productId.equals((String) this.b)) {
                                sb7.p("MyketIabWebView", "jsFallbackRunner, Payment done :)", null);
                                int i = InAppPurchaseWebview.R0;
                                inAppPurchaseWebview.z0(purchaseDTO);
                                inAppPurchaseWebview.finish();
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    sb7.p("MyketIabWebView", "jsFallbackRunner, Could not find PurchaseDTO.", null);
                    InAppPurchaseWebview.y0(inAppPurchaseWebview);
                }
                zk8.X(new Exception("Javascript Fallback Scenario SuccessCallback, success:" + z), true);
                break;
            default:
                ul3 ul3Var = (ul3) this.c;
                int size = ((List) obj).size();
                ul3Var.b = size;
                if (size <= 0) {
                    ul3Var.d.j(lu7.P, false);
                }
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }

    public Object p(uh6 uh6Var) {
        HashMap map = (HashMap) this.c;
        rv2 rv2Var = (rv2) map.get(uh6Var);
        if (rv2Var == null) {
            rv2Var = new rv2(uh6Var);
            map.put(uh6Var, rv2Var);
        } else {
            uh6Var.a();
        }
        rv2 rv2Var2 = rv2Var.d;
        rv2Var2.c = rv2Var.c;
        rv2Var.c.d = rv2Var2;
        rv2 rv2Var3 = (rv2) this.b;
        rv2Var.d = rv2Var3;
        rv2 rv2Var4 = rv2Var3.c;
        rv2Var.c = rv2Var4;
        rv2Var4.d = rv2Var;
        rv2Var.d.c = rv2Var;
        ArrayList arrayList = rv2Var.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return rv2Var.b.remove(size - 1);
        }
        return null;
    }

    public File q() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        xc2 xc2Var = (xc2) this.c;
                        xc2Var.a();
                        this.b = new File(xc2Var.a.getFilesDir(), "PersistedInstallation." + ((xc2) this.c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public s57 r(Context context, com.bumptech.glide.a aVar, i64 i64Var, androidx.fragment.app.g gVar, boolean z) {
        i29.a();
        i29.a();
        HashMap map = (HashMap) this.b;
        s57 s57Var = (s57) map.get(i64Var);
        if (s57Var != null) {
            return s57Var;
        }
        d64 d64Var = new d64(i64Var);
        s57 s57VarA = ((t57) this.c).a(aVar, d64Var, new ql3(), context);
        map.put(i64Var, s57VarA);
        d64Var.c(new k64(this, i64Var));
        if (z) {
            s57VarA.k();
        }
        return s57VarA;
    }

    public PlaybackStateCompat s() {
        androidx.media3.session.legacy.a aVar = (androidx.media3.session.legacy.a) this.b;
        yf3 yf3VarA = aVar.e.a();
        if (yf3VarA != null) {
            try {
                return yf3VarA.e();
            } catch (RemoteException | SecurityException e) {
                t0.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = aVar.a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public synchronized Map t() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                rv2 rv2Var = (rv2) this.b;
                rv2 rv2Var2 = rv2Var.c;
                boolean z = false;
                while (!rv2Var2.equals(rv2Var)) {
                    sb.append('{');
                    sb.append(rv2Var2.a);
                    sb.append(':');
                    ArrayList arrayList = rv2Var2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    rv2Var2 = rv2Var2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public nn4 u() {
        MediaController.TransportControls transportControls = ((androidx.media3.session.legacy.a) this.b).a.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        return i >= 29 ? new pn4(transportControls) : i >= 24 ? new on4(transportControls) : new nn4(transportControls);
    }

    public void v(x20 x20Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", x20Var.a);
            jSONObject.put("Status", x20Var.b.ordinal());
            jSONObject.put("AuthToken", x20Var.c);
            jSONObject.put("RefreshToken", x20Var.d);
            jSONObject.put("TokenCreationEpochInSecs", x20Var.f);
            jSONObject.put("ExpiresInSecs", x20Var.e);
            jSONObject.put("FisError", x20Var.g);
            xc2 xc2Var = (xc2) this.c;
            xc2Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", xc2Var.a.getFilesDir());
            FileOutputStream fileOutputStreamK = a.k(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            fileOutputStreamK.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStreamK.close();
            if (fileCreateTempFile.renameTo(q())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public synchronized p46 x() {
        p46 p46Var;
        p46Var = (p46) this.b;
        if (p46Var != null) {
            p46 p46Var2 = p46Var.c;
            this.b = p46Var2;
            if (p46Var2 == null) {
                this.c = null;
            }
        }
        return p46Var;
    }

    public synchronized p46 y() {
        try {
            if (((p46) this.b) == null) {
                wait(1000);
            }
        } catch (Throwable th) {
            throw th;
        }
        return x();
    }

    public void z(uh6 uh6Var, Object obj) {
        HashMap map = (HashMap) this.c;
        rv2 rv2Var = (rv2) map.get(uh6Var);
        if (rv2Var == null) {
            rv2Var = new rv2(uh6Var);
            rv2Var.d = rv2Var;
            rv2 rv2Var2 = (rv2) this.b;
            rv2Var.d = rv2Var2.d;
            rv2Var.c = rv2Var2;
            rv2Var2.d = rv2Var;
            rv2Var.d.c = rv2Var;
            map.put(uh6Var, rv2Var);
        } else {
            uh6Var.a();
        }
        if (rv2Var.b == null) {
            rv2Var.b = new ArrayList();
        }
        rv2Var.b.add(obj);
    }

    public /* synthetic */ nc2(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ nc2(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public nc2(o25 o25Var, n25 n25Var) {
        this.a = 21;
        js3.p(o25Var, "movieService");
        js3.p(n25Var, "movieDownloadRepository");
        this.b = o25Var;
        this.c = n25Var;
    }

    public nc2(t57 t57Var) {
        this.a = 14;
        this.b = new HashMap();
        this.c = t57Var;
    }

    public nc2(f8 f8Var) {
        this.a = 25;
        this.b = f8Var;
        this.c = new AtomicInt(0);
    }

    public nc2(xc2 xc2Var) {
        this.a = 28;
        this.c = xc2Var;
    }

    public nc2(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new rv2(null);
                this.c = new HashMap();
                break;
            case 7:
                this.b = new HashMap();
                break;
            case 20:
                this.b = new AtomicReference();
                this.c = new wv(0);
                break;
            case 27:
                break;
            default:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
        }
    }

    private final void m() {
    }

    public nc2(x24 x24Var) {
        this.a = 13;
        this.b = x24Var;
        ib5 ib5Var = xq5.a;
        this.c = new ib5();
    }

    public nc2(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 18;
        this.c = DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new kn4(context, mediaSessionCompat$Token);
        } else {
            this.b = new androidx.media3.session.legacy.a(context, mediaSessionCompat$Token);
        }
    }

    public nc2(Animator animator) {
        this.a = 3;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public nc2(k kVar, do3 do3Var) {
        this.a = 26;
        js3.p(do3Var, "retryEventBus");
        this.c = kVar;
        this.b = do3Var;
    }

    public nc2(IBinder iBinder, Bundle bundle) {
        this.a = 17;
        this.b = new Messenger(iBinder);
        this.c = bundle;
    }
}
