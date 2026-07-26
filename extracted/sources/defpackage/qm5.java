package defpackage;

import android.R;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.c;
import com.airbnb.lottie.network.FileExtension;
import com.android.volley.Request$Priority;
import com.bumptech.glide.load.engine.a;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.zzd;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.j;
import ir.mservices.market.app.detail.ui.recycler.h;
import ir.mservices.market.version2.activity.WebViewActivityImpl.InAppPurchaseWebview;
import ir.mservices.market.version2.fragments.dialog.AppInstallSuccessDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.requestdto.HarmFulAppData;
import ir.mservices.market.version2.webapi.requestdto.HarmfulAppsRequestDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class qm5 implements gl8, h32, x31, rm1, hg5, tt4, ms5, xo1, f82, at5 {
    public static final String[] c = {"_data"};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ qm5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public xj a(boolean z) {
        xj xjVar = (xj) this.b;
        xjVar.getClass();
        sj sjVar = xjVar.a;
        if (sjVar != null) {
            sjVar.e = z;
            GradientDrawable gradientDrawable = new GradientDrawable();
            tj tjVar = sjVar.a;
            gradientDrawable.setStroke(0, tjVar.g);
            dk dkVar = tjVar.k;
            gradientDrawable.setCornerRadii((float[]) dkVar.a(sjVar.e).a);
            gradientDrawable.setColor(tjVar.h ? ((Number) tjVar.a.a(sjVar.e).a).intValue() : sj8.b().N);
            sjVar.b = gradientDrawable;
            sjVar.d = y97.E((float[]) dkVar.a(sjVar.e).a, tjVar.i);
            GradientDrawable gradientDrawable2 = sjVar.b;
            Drawable drawableMutate = gradientDrawable2 != null ? gradientDrawable2.mutate() : null;
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, sjVar.d);
            sjVar.c = new LayerDrawable(new Drawable[]{drawableMutate, stateListDrawable});
        }
        int[] iArr = {R.attr.state_enabled, -16842908, -16842919};
        sj sjVar2 = xjVar.a;
        xjVar.addState(iArr, sjVar2 != null ? sjVar2.b : null);
        int[] iArr2 = {R.attr.state_enabled, -16842908, R.attr.state_pressed};
        sj sjVar3 = xjVar.a;
        xjVar.addState(iArr2, sjVar3 != null ? sjVar3.c : null);
        xjVar.addState(new int[]{R.attr.state_enabled, R.attr.state_focused, -16842919}, null);
        xjVar.addState(new int[]{R.attr.state_enabled, R.attr.state_focused, R.attr.state_pressed}, null);
        xjVar.addState(new int[]{-16842910}, null);
        return xjVar;
    }

    public my b() {
        return new my(((AudioAttributes.Builder) this.b).build(), 0);
    }

    @Override // defpackage.gl8
    public Cursor c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.tt4
    public void d(ot4 ot4Var, MenuItem menuItem) {
        ((on0) this.b).f.removeCallbacksAndMessages(ot4Var);
    }

    public long f() {
        int i = zu0.i;
        long j = ((Parcel) this.b).readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    @Override // defpackage.f82
    public Object g() {
        pg pgVar = (pg) this.b;
        return new a((x41) pgVar.c, (wv8) pgVar.d);
    }

    @Override // defpackage.xo1
    public File get() {
        return (File) this.b;
    }

    @Override // defpackage.hg5
    public void h() {
        f70 f70Var;
        h hVar = (h) this.b;
        String str = hVar.y;
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str == null || (f70Var = hVar.x) == null) {
                return;
            }
            f70Var.g(str);
        }
    }

    public long i() {
        Parcel parcel = (Parcel) this.b;
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        return kj8.a(j, 0L) ? jj8.c : w07.h(parcel.readFloat(), j);
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        switch (this.a) {
            case 2:
                ErrorDTO errorDTO = (ErrorDTO) serializable;
                om0 om0Var = (om0) this.b;
                js3.m(errorDTO);
                om0Var.resumeWith(new h99(errorDTO));
                break;
            default:
                ErrorDTO errorDTO2 = (ErrorDTO) serializable;
                sb7.p("MyketIabWebView", "jsFallbackRunner, Service error!, " + errorDTO2, null);
                InAppPurchaseWebview inAppPurchaseWebview = (InAppPurchaseWebview) this.b;
                InAppPurchaseWebview.y0(inAppPurchaseWebview);
                errorDTO2.assertToastMessage(inAppPurchaseWebview);
                zk8.X(new Exception("Javascript Fallback Scenario, ErrorCallback, message:" + errorDTO2.getTranslatedMessage()), true);
                break;
        }
    }

    public bg4 k(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        bg4 bg4VarG;
        bg4 bg4VarD;
        FileExtension fileExtension;
        nm5 nm5Var = (nm5) this.b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            qd4.a();
            FileExtension fileExtension2 = FileExtension.ZIP;
            if (str3 != null) {
                File fileB = nm5Var.B(str, inputStream, fileExtension2);
                bg4VarG = lf4.g(context, new ZipInputStream(io.sentry.config.a.g(fileB, new FileInputStream(fileB))), str);
            } else {
                bg4VarG = lf4.g(context, new ZipInputStream(inputStream), null);
            }
            bg4VarD = bg4VarG;
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            qd4.a();
            fileExtension = FileExtension.GZIP;
            if (str3 != null) {
                File fileB2 = nm5Var.B(str, inputStream, fileExtension);
                bg4VarD = lf4.d(new GZIPInputStream(io.sentry.config.a.g(fileB2, new FileInputStream(fileB2))), str);
            } else {
                bg4VarD = lf4.d(new GZIPInputStream(inputStream), null);
            }
        } else {
            qd4.a();
            fileExtension = FileExtension.JSON;
            if (str3 != null) {
                String absolutePath = nm5Var.B(str, inputStream, fileExtension).getAbsolutePath();
                bg4VarD = lf4.d(io.sentry.config.a.i(new FileInputStream(absolutePath), absolutePath), str);
            } else {
                bg4VarD = lf4.d(inputStream, null);
            }
        }
        if (str3 != null && bg4VarD.a != null) {
            File file = new File(nm5Var.v(), nm5.h(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            qd4.a();
            if (!zRenameTo) {
                qd4.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return bg4VarD;
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        hx2 hx2Var = (hx2) this.b;
        if (!bf8Var.f()) {
            hx2Var.i(false);
            return;
        }
        zzd zzdVar = ((zj9) ((f87) ((ic7) bf8Var.d()).b)).b;
        List<HarmfulAppsData> listAsList = zzdVar == null ? Collections.EMPTY_LIST : Arrays.asList(zzdVar.b);
        if (!listAsList.isEmpty()) {
            HarmfulAppsRequestDTO harmfulAppsRequestDTO = new HarmfulAppsRequestDTO();
            for (HarmfulAppsData harmfulAppsData : listAsList) {
                dp3 dp3Var = hx2Var.m;
                String str = harmfulAppsData.a;
                Integer numP = dp3Var.p(str);
                if (numP != null) {
                    harmfulAppsRequestDTO.getApps().add(new HarmFulAppData(str, numP.intValue(), harmfulAppsData.c, hx2Var.m.q(str)));
                } else {
                    StringBuilder sbN = t61.n("HarmfulAppsSync sendHarmfulAppsData() versionCode for ", str, " is null, isAppInstalled =");
                    sbN.append(hx2Var.m.G(str));
                    lw.g(null, sbN.toString(), null);
                }
            }
            ix2 ix2Var = hx2Var.l;
            ix2Var.getClass();
            xv2 xv2Var = new xv2(1, ix2Var.createRequestUrl("v1/harmfuls", null, null, ix2Var.getCommonQueryParam()), harmfulAppsRequestDTO, Request$Priority.a, false, null, ix2Var.createVolleyErrorListener(null), ix2Var.createVolleySuccessListener(null, null, true), false);
            xv2Var.u = false;
            xv2Var.p = ix2Var.getHeaders(new HashMap());
            xv2Var.w = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.version2.services.HarmfulService$sendHarmFulApps$gsonRequest$1$1
            }.getType();
            ix2Var.performRequest(xv2Var, null);
        }
        hx2Var.i(true);
    }

    @Override // defpackage.tt4
    public void m(ot4 ot4Var, vt4 vt4Var) {
        on0 on0Var = (on0) this.b;
        Handler handler = on0Var.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = on0Var.h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ot4Var == ((nn0) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new mn0(this, i2 < arrayList.size() ? (nn0) arrayList.get(i2) : null, vt4Var, ot4Var, 0), ot4Var, SystemClock.uptimeMillis() + 200);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        if (r1.equals(r19.toString()) != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.it4 n(defpackage.pi3 r17, defpackage.ht4 r18, defpackage.dy7 r19, coil3.size.Scale r20) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm5.n(pi3, ht4, dy7, coil3.size.Scale):it4");
    }

    public u48 o() {
        zz1 zz1VarA = zz1.a();
        if (zz1VarA.c() == 1) {
            return new jj3(true);
        }
        wb5 wb5VarH = g.h(Boolean.FALSE);
        zz1VarA.h(new gf1(wb5VarH, this));
        return wb5VarH;
    }

    @Override // defpackage.rm1
    public void onCancel() {
        AppInstallSuccessDialogFragment appInstallSuccessDialogFragment = (AppInstallSuccessDialogFragment) this.b;
        appInstallSuccessDialogFragment.f1 = true;
        appInstallSuccessDialogFragment.N0(DialogResult.b, new Bundle());
    }

    @Override // defpackage.rm1
    public void onCommit() {
        AppInstallSuccessDialogFragment appInstallSuccessDialogFragment = (AppInstallSuccessDialogFragment) this.b;
        appInstallSuccessDialogFragment.f1 = true;
        if (appInstallSuccessDialogFragment.d1.d) {
            appInstallSuccessDialogFragment.N0(DialogResult.a, new Bundle());
        } else {
            appInstallSuccessDialogFragment.N0(DialogResult.b, new Bundle());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.ht4 p(defpackage.pi3 r9, java.lang.Object r10, defpackage.uv5 r11, defpackage.hy2 r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm5.p(pi3, java.lang.Object, uv5, hy2):ht4");
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        if9 if9Var = lf9Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        if (!Objects.equals(coordinatorLayout.n, lf9Var)) {
            coordinatorLayout.n = lf9Var;
            boolean z = lf9Var.d() > 0;
            coordinatorLayout.o = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!if9Var.o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = q69.a;
                    if (childAt.getFitsSystemWindows() && ((c) childAt.getLayoutParams()).a != null && if9Var.o()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return lf9Var;
    }

    public void r(Exception exc) {
        wn5.H("MediaCodecAudioRenderer", "Audio sink error", exc);
        n00 n00Var = ((qm4) this.b).f1;
        Handler handler = n00Var.b;
        if (handler != null) {
            handler.post(new h00(n00Var, exc, 1));
        }
    }

    public boolean s(ht4 ht4Var, pi3 pi3Var, d22 d22Var) {
        dw6 dw6VarC;
        if (ht4Var == null || !pi3Var.j.b || !d22Var.a.d() || (dw6VarC = ((coil3.a) this.b).c()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(d22Var.b));
        String str = d22Var.d;
        if (str != null) {
            linkedHashMap.put("coil#disk_cache_key", str);
        }
        wh3 wh3Var = d22Var.a;
        Map mapV = hs9.V(linkedHashMap);
        synchronized (dw6VarC.c) {
            long jC = wh3Var.c();
            if (jC < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + jC).toString());
            }
            dw6VarC.a.b(ht4Var, wh3Var, mapV, jC);
        }
        return true;
    }

    public qm5 t(int i) {
        if (i == 16) {
            i = 12;
        }
        ((AudioAttributes.Builder) this.b).setUsage(i);
        return this;
    }

    public /* bridge */ void u(int i) {
        t(i);
    }

    public void v(int i, Object obj, gf7 gf7Var) {
        j jVar = (j) this.b;
        jVar.y0(i, 3);
        gf7Var.f((ev4) obj, jVar.i);
        jVar.y0(i, 4);
    }

    public /* synthetic */ qm5(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
    }

    public qm5(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = new AudioAttributes.Builder();
                break;
            case 25:
                this.b = new zb5(0, new m24[16]);
                break;
            default:
                xj xjVar = new xj();
                xjVar.a = null;
                this.b = xjVar;
                break;
        }
    }

    public qm5(ir.mservices.market.common.model.a aVar) {
        this.a = 22;
        js3.p(aVar, "submitCommentRepository");
        this.b = aVar;
    }

    public qm5(fy4 fy4Var) {
        this.a = 29;
        js3.p(fy4Var, "moreStreamersService");
        this.b = fy4Var;
    }

    public qm5(dp3 dp3Var, wd5 wd5Var) {
        this.a = 13;
        js3.p(dp3Var, "installManager");
        js3.p(wd5Var, "myReviewService");
        this.b = wd5Var;
    }

    public qm5(j jVar) {
        this.a = 12;
        tr3.a(jVar, "output");
        this.b = jVar;
        jVar.i = this;
    }

    public qm5(boolean z, boolean z2, ByteBuffer byteBuffer, RandomAccessFile randomAccessFile) throws IOException {
        long j;
        short s;
        short s2;
        short s3;
        byte b;
        this.a = 18;
        this.b = new ArrayList();
        if (z) {
            j = byteBuffer.getLong(40);
            s = byteBuffer.getShort(58);
            s2 = byteBuffer.getShort(60);
            s3 = byteBuffer.getShort(62);
        } else {
            j = byteBuffer.getInt(32);
            s = byteBuffer.getShort(46);
            s2 = byteBuffer.getShort(48);
            s3 = byteBuffer.getShort(50);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s2 * s);
        byteBufferAllocate.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.getChannel().read(byteBufferAllocate, j);
        for (int i = 0; i < s2; i++) {
            byteBufferAllocate.position(i * s);
            ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
            byteBufferSlice.order(byteBufferAllocate.order());
            byteBufferSlice.limit(s);
            ((ArrayList) this.b).add(new vy1(byteBufferSlice, z));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(((vy1) ((ArrayList) this.b).get(s3)).f);
        byteBufferAllocate2.order(z2 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.getChannel().read(byteBufferAllocate2, r8.e);
        byteBufferAllocate2.rewind();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
        for (vy1 vy1Var : (ArrayList) this.b) {
            byteArrayOutputStream.reset();
            byteBufferAllocate2.position(vy1Var.a);
            while (byteBufferAllocate2.position() < byteBufferAllocate2.limit() && (b = byteBufferAllocate2.get()) != 0) {
                byteArrayOutputStream.write(b);
            }
            vy1Var.b = byteArrayOutputStream.toString("ASCII");
        }
    }

    @Override // defpackage.hg5
    public void e() {
    }

    public qm5(String str) {
        this.a = 15;
        Parcel parcelObtain = Parcel.obtain();
        this.b = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }
}
