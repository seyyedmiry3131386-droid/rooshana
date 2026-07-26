package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.compose.ui.layout.m;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import coil3.disk.a;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.ApiException;
import com.google.common.collect.ImmutableMap;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ry implements dq2, nt2, x72, dt5 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;

    public ry(yk9 yk9Var, bo9 bo9Var, o94 o94Var, boolean z) {
        this.a = 14;
        this.c = bo9Var;
        this.d = o94Var;
        this.b = z;
        this.e = yk9Var;
    }

    public static void d(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }

    public void a() {
        switch (this.a) {
            case 1:
                np1.b((np1) this.e, this, false);
                return;
            default:
                mp1 mp1Var = (mp1) this.e;
                synchronized (mp1Var) {
                    try {
                        if (this.b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (js3.i(((fp1) this.c).g, this)) {
                            mp1Var.d(this, false);
                        }
                        this.b = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void b() {
        mp1 mp1Var = (mp1) this.e;
        synchronized (mp1Var) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (js3.i(((fp1) this.c).g, this)) {
                    mp1Var.d(this, true);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(boolean z) {
        a aVar = (a) this.e;
        synchronized (aVar.h) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (js3.i(((gp1) this.c).g, this)) {
                    a.b(aVar, this, z);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        fp1 fp1Var = (fp1) this.c;
        if (js3.i(fp1Var.g, this)) {
            mp1 mp1Var = (mp1) this.e;
            if (mp1Var.l) {
                mp1Var.d(this, false);
            } else {
                fp1Var.f = true;
            }
        }
    }

    public byte[] f(UUID uuid, k52 k52Var) throws MediaDrmCallbackException {
        String str = k52Var.b;
        if (this.b || TextUtils.isEmpty(str)) {
            str = (String) this.d;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            vy2.u(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new db1(uri, 0L, 1, null, map, 0L, -1L, null, 0), uri, ImmutableMap.l(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = xj0.e;
        map2.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : xj0.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.e)) {
            map2.putAll((HashMap) this.e);
        }
        return ub1.t(((aj0) this.c).k(), str, k52Var.a, map2);
    }

    public byte[] g(l52 l52Var) {
        return ub1.t(((aj0) this.c).k(), l52Var.b + "&signedRequest=" + j29.q(l52Var.a), null, Collections.EMPTY_MAP);
    }

    @Override // defpackage.nt2
    public Object get() {
        if (this.b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        ia7.d("Glide registry");
        this.b = true;
        try {
            return z27.e((com.bumptech.glide.a) this.c, (List) this.d, (za9) this.e);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    public s26 h(int i) {
        s26 s26Var;
        a aVar = (a) this.e;
        synchronized (aVar.h) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.d)[i] = true;
            Object obj = ((gp1) this.c).d.get(i);
            xq2.p(aVar.q, (s26) obj);
            s26Var = (s26) obj;
        }
        return s26Var;
    }

    public File i() {
        File file;
        synchronized (((np1) this.e)) {
            try {
                ep1 ep1Var = (ep1) this.c;
                if (ep1Var.f != this) {
                    throw new IllegalStateException();
                }
                if (!ep1Var.e) {
                    ((boolean[]) this.d)[0] = true;
                }
                file = ep1Var.d[0];
                ((np1) this.e).a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public synchronized void j() {
        try {
            if (this.b) {
                return;
            }
            Boolean boolQ = q();
            this.d = boolQ;
            if (boolQ == null) {
                vv1 vv1Var = new vv1(20);
                u32 u32Var = (u32) ((da8) this.c);
                u32Var.a(u32Var.c, vv1Var);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean k() {
        if (this.b) {
            return false;
        }
        synchronized (((rl3) this.d)) {
            if (this.b) {
                return false;
            }
            this.b = true;
            List listP0 = kotlin.collections.a.P0((ArrayList) this.e);
            ((ArrayList) this.e).clear();
            sm5 sm5Var = (sm5) this.c;
            Iterator it = listP0.iterator();
            while (it.hasNext()) {
                sm5Var.invoke(it.next());
            }
            return true;
        }
    }

    @Override // defpackage.x72
    public void l() {
        SparseArray sparseArray = (SparseArray) this.e;
        ((x72) this.c).l();
        if (this.b) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((eb8) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public synchronized boolean m() {
        Boolean bool;
        try {
            j();
            bool = (Boolean) this.d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.e).a.h();
    }

    public boolean n() {
        boolean z;
        synchronized (this.c) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.x72
    public cp8 o(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.e;
        x72 x72Var = (x72) this.c;
        if (i2 != 3) {
            this.b = true;
            return x72Var.o(i, i2);
        }
        eb8 eb8Var = (eb8) sparseArray.get(i);
        if (eb8Var != null) {
            return eb8Var;
        }
        eb8 eb8Var2 = new eb8(x72Var.o(i, i2), (ab8) this.d);
        sparseArray.put(i, eb8Var2);
        return eb8Var2;
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        int i;
        synchronized (((yk9) this.e)) {
            try {
                if (!(exc instanceof ApiException) || ((i = ((ApiException) exc).a.a) != 8001 && i != 8002)) {
                    ((yk9) this.e).d((bo9) this.c, (o94) this.d);
                } else if (this.b) {
                    ((yk9) this.e).b.remove((o94) this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dq2
    public void onSuccess(Object obj) {
        xq4 xq4Var = (xq4) this.e;
        hq4 hq4Var = (hq4) this.c;
        boolean z = this.b;
        cb6 cb6Var = (cb6) this.d;
        y97.Y(xq4Var.t, (iq4) obj);
        j29.M(xq4Var.t);
        if (z) {
            xq4Var.q(hq4Var, cb6Var);
        }
    }

    public by7 p(int i) {
        mp1 mp1Var = (mp1) this.e;
        synchronized (mp1Var) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!js3.i(((fp1) this.c).g, this)) {
                    return new sc0();
                }
                if (!((fp1) this.c).e) {
                    boolean[] zArr = (boolean[]) this.d;
                    js3.m(zArr);
                    zArr[i] = true;
                }
                s26 s26Var = (s26) ((fp1) this.c).d.get(i);
                try {
                    kp1 kp1Var = mp1Var.b;
                    kp1Var.getClass();
                    js3.p(s26Var, "file");
                    return new z82(kp1Var.U(s26Var, false), new m(mp1Var, this, 13));
                } catch (FileNotFoundException unused) {
                    return new sc0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        xc2 xc2Var = ((FirebaseMessaging) this.e).a;
        xc2Var.a();
        Context context = xc2Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void r() {
        wd8 wd8Var = (wd8) this.e;
        if (this.b) {
            wd8Var.c(new b7(6, this));
            this.b = false;
        }
    }

    @Override // defpackage.x72
    public void t(kl7 kl7Var) {
        ((x72) this.c).t(kl7Var);
    }

    public ry(sm5 sm5Var) {
        this.a = 7;
        this.c = sm5Var;
        this.d = new rl3();
        this.e = new ArrayList();
    }

    public ry(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.c = new Object();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.b = true;
                break;
            default:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new aj0(10, (byte) 0);
                break;
        }
    }

    @Override // defpackage.dq2
    public void onFailure(Throwable th) {
        xq4 xq4Var = (xq4) this.e;
        if (th instanceof UnsupportedOperationException) {
            wn5.l0("MediaSessionImpl", "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService.", th);
        } else {
            wn5.H("MediaSessionImpl", "Failure calling MediaSession.Callback.onPlaybackResumption(): " + th.getMessage(), th);
        }
        j29.M(xq4Var.t);
        if (this.b) {
            xq4Var.q((hq4) this.c, (cb6) this.d);
        }
    }

    public ry(x72 x72Var, ab8 ab8Var) {
        this.a = 13;
        this.c = x72Var;
        this.d = ab8Var;
        this.e = new SparseArray();
    }

    public ry(Context context, Looper looper, Looper looper2, b62 b62Var, td8 td8Var) {
        this.a = 0;
        this.c = context.getApplicationContext();
        this.e = td8Var.a(looper, null);
        this.d = new qy(this, td8Var.a(looper2, null), b62Var);
    }

    public ry(Object obj, bk0 bk0Var) {
        this.a = 12;
        this.b = false;
        this.c = obj;
        this.d = bk0Var;
        this.e = null;
    }

    public ry(String str, boolean z, aj0 aj0Var) {
        this.a = 6;
        vy2.j((z && TextUtils.isEmpty(str)) ? false : true);
        this.c = aj0Var;
        this.d = str;
        this.b = z;
        this.e = new HashMap();
    }

    public ry(VolleyError volleyError) {
        this.a = 12;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = volleyError;
    }

    public ry(com.bumptech.glide.a aVar, List list, za9 za9Var) {
        this.a = 11;
        this.c = aVar;
        this.d = list;
        this.e = za9Var;
    }

    public ry(x24 x24Var, m mVar, nj6 nj6Var) {
        this.a = 10;
        this.c = x24Var;
        this.d = mVar;
        this.e = nj6Var;
        this.b = true;
    }

    public ry(a aVar, gp1 gp1Var) {
        this.a = 3;
        this.e = aVar;
        this.c = gp1Var;
        this.d = new boolean[2];
    }

    public ry(FirebaseMessaging firebaseMessaging, da8 da8Var) {
        this.a = 4;
        this.e = firebaseMessaging;
        this.c = da8Var;
    }

    public ry(np1 np1Var, ep1 ep1Var) {
        this.a = 1;
        this.e = np1Var;
        this.c = ep1Var;
        this.d = ep1Var.e ? null : new boolean[np1Var.g];
    }

    public ry(mp1 mp1Var, fp1 fp1Var) {
        boolean[] zArr;
        this.a = 2;
        this.e = mp1Var;
        this.c = fp1Var;
        if (fp1Var.e) {
            zArr = null;
        } else {
            mp1Var.getClass();
            zArr = new boolean[2];
        }
        this.d = zArr;
    }

    public ry(xq4 xq4Var, hq4 hq4Var, boolean z, cb6 cb6Var) {
        this.a = 9;
        this.e = xq4Var;
        this.c = hq4Var;
        this.b = z;
        this.d = cb6Var;
    }
}
