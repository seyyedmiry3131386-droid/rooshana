package defpackage;

import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.bumptech.glide.a;
import com.bumptech.glide.integration.volley.VolleyGlideModule;
import io.sentry.android.core.t0;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class z27 {
    public static final /* synthetic */ int a = 0;
    public static long b = -1;

    public static final void a(qz0 qz0Var, hx4 hx4Var) {
        lh lhVar = lh.g;
        long j = qz0Var.T;
        int i = (int) (j ^ (j >>> 32));
        hx4 hx4VarC = b.c(qz0Var, hx4Var);
        j56 j56VarL = qz0Var.l();
        hz0.d0.getClass();
        bp2 bp2Var = d.b;
        sk6 sk6Var = qz0Var.a;
        qz0Var.e0();
        if (qz0Var.S) {
            qz0Var.k(bp2Var);
        } else {
            qz0Var.o0();
        }
        ia7.o(qz0Var, d.f, lhVar);
        ia7.o(qz0Var, d.e, j56VarL);
        ia7.n(qz0Var, d.h);
        ia7.o(qz0Var, d.d, hx4VarC);
        ia7.g(qz0Var, Integer.valueOf(i), d.g);
        qz0Var.q(true);
    }

    public static final po7 b(String str, no7[] no7VarArr, dp2 dp2Var) {
        if (f88.n0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        qs0 qs0Var = new qs0(str);
        dp2Var.invoke(qs0Var);
        return new po7(str, g98.b, qs0Var.c.size(), ew.X0(no7VarArr), qs0Var);
    }

    public static final po7 c(String str, o37 o37Var, no7[] no7VarArr, dp2 dp2Var) {
        js3.p(str, "serialName");
        if (f88.n0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (o37Var.equals(g98.b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        qs0 qs0Var = new qs0(str);
        dp2Var.invoke(qs0Var);
        return new po7(str, o37Var, qs0Var.c.size(), ew.X0(no7VarArr), qs0Var);
    }

    public static po7 d(String str, o37 o37Var, no7[] no7VarArr) {
        js3.p(str, "serialName");
        if (f88.n0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (o37Var.equals(g98.b)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        qs0 qs0Var = new qs0(str);
        return new po7(str, o37Var, qs0Var.c.size(), ew.X0(no7VarArr), qs0Var);
    }

    public static y27 e(a aVar, List list, za9 za9Var) {
        j67 ec0Var;
        j67 ej0Var;
        pc0 pc0Var;
        int i;
        ContentResolver contentResolver;
        Class cls;
        pc0 pc0Var2 = aVar.a;
        dr3 dr3Var = aVar.d;
        ft2 ft2Var = aVar.c;
        Context applicationContext = ft2Var.getApplicationContext();
        pt2 pt2Var = ft2Var.h;
        y27 y27Var = new y27();
        ff1 ff1Var = new ff1();
        dj djVar = y27Var.g;
        synchronized (djVar) {
            djVar.a.add(ff1Var);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            y27Var.j(new f52());
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListF = y27Var.f();
        hj0 hj0Var = new hj0(applicationContext, arrayListF, pc0Var2, dr3Var);
        j67 bVar = new com.bumptech.glide.load.resource.bitmap.b(pc0Var2, new js8());
        yt1 yt1Var = new yt1(y27Var.f(), resources.getDisplayMetrics(), pc0Var2, dr3Var);
        if (i2 < 28 || !((Map) pt2Var.b).containsKey(at2.class)) {
            j67 dj0Var = new dj0(0, yt1Var);
            ec0Var = new ec0(yt1Var, dr3Var, 2);
            ej0Var = dj0Var;
        } else {
            j67 ej0Var2 = new ej0(1);
            ej0Var = new ej0(0);
            ec0Var = ej0Var2;
        }
        if (i2 >= 28) {
            i = i2;
            pc0Var = pc0Var2;
            y27Var.d("Animation", InputStream.class, Drawable.class, new vj(new wj(arrayListF, dr3Var), 1));
            y27Var.d("Animation", ByteBuffer.class, Drawable.class, new vj(new wj(arrayListF, dr3Var), 0));
        } else {
            pc0Var = pc0Var2;
            i = i2;
        }
        j67 l67Var = new l67(applicationContext);
        m67 fc0Var = new fc0(dr3Var);
        w67 dc0Var = new dc0(0, (byte) 0);
        w67 gvVar = new gv(24);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        y27Var.a(ByteBuffer.class, new fv(4));
        y27Var.a(InputStream.class, new c35(14, dr3Var));
        y27Var.d("Bitmap", ByteBuffer.class, Bitmap.class, ej0Var);
        y27Var.d("Bitmap", InputStream.class, Bitmap.class, ec0Var);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
            y27Var.d("Bitmap", cls, Bitmap.class, new dj0(1, yt1Var));
        }
        pc0 pc0Var3 = pc0Var;
        y27Var.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new com.bumptech.glide.load.resource.bitmap.b(pc0Var3, new vs8()));
        y27Var.d("Bitmap", cls, Bitmap.class, bVar);
        bx4 bx4Var = ux8.b;
        y27Var.c(Bitmap.class, Bitmap.class, bx4Var);
        y27Var.d("Bitmap", Bitmap.class, Bitmap.class, new fb2(1));
        y27Var.b(Bitmap.class, fc0Var);
        y27Var.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ec0(resources, ej0Var));
        y27Var.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ec0(resources, ec0Var));
        y27Var.d("BitmapDrawable", cls, BitmapDrawable.class, new ec0(resources, bVar));
        y27Var.b(BitmapDrawable.class, new qq4(pc0Var3, fc0Var));
        y27Var.d("Animation", InputStream.class, ns2.class, new n68(arrayListF, hj0Var, dr3Var));
        y27Var.d("Animation", ByteBuffer.class, ns2.class, hj0Var);
        y27Var.b(ns2.class, new av(25));
        y27Var.c(k48.class, k48.class, bx4Var);
        y27Var.d("Bitmap", k48.class, Bitmap.class, new dj0(2, pc0Var3));
        y27Var.d("legacy_append", Uri.class, Drawable.class, l67Var);
        y27Var.d("legacy_append", Uri.class, Bitmap.class, new ec0(l67Var, pc0Var3, 1));
        y27Var.i(new jj0(0));
        y27Var.c(File.class, ByteBuffer.class, new ux8(3));
        y27Var.c(File.class, InputStream.class, new lb2(new cv(21)));
        y27Var.d("legacy_append", File.class, File.class, new fb2(0));
        y27Var.c(File.class, cls, new lb2(new av(21)));
        y27Var.c(File.class, File.class, bx4Var);
        y27Var.i(new io3(dr3Var));
        if (!"robolectric".equals(str)) {
            y27Var.i(new jj0(2));
        }
        bx4 po1Var = new po1(applicationContext, 2);
        bx4 po1Var2 = new po1(applicationContext, 0);
        bx4 po1Var3 = new po1(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        y27Var.c(cls2, InputStream.class, po1Var);
        y27Var.c(Integer.class, InputStream.class, po1Var);
        y27Var.c(cls2, AssetFileDescriptor.class, po1Var2);
        y27Var.c(Integer.class, AssetFileDescriptor.class, po1Var2);
        y27Var.c(cls2, Drawable.class, po1Var3);
        y27Var.c(Integer.class, Drawable.class, po1Var3);
        y27Var.c(Uri.class, InputStream.class, new po1(applicationContext, 7));
        y27Var.c(Uri.class, AssetFileDescriptor.class, new po1(applicationContext, 6));
        bx4 r67Var = new r67(resources, 2);
        bx4 r67Var2 = new r67(resources, 0);
        bx4 r67Var3 = new r67(resources, 1);
        y27Var.c(Integer.class, Uri.class, r67Var);
        y27Var.c(cls2, Uri.class, r67Var);
        y27Var.c(Integer.class, AssetFileDescriptor.class, r67Var2);
        y27Var.c(cls2, AssetFileDescriptor.class, r67Var2);
        y27Var.c(Integer.class, InputStream.class, r67Var3);
        y27Var.c(cls2, InputStream.class, r67Var3);
        y27Var.c(String.class, InputStream.class, new fb9(1));
        y27Var.c(Uri.class, InputStream.class, new fb9(1));
        y27Var.c(String.class, InputStream.class, new ux8(6));
        y27Var.c(String.class, cls, new ux8(5));
        y27Var.c(String.class, AssetFileDescriptor.class, new ux8(4));
        y27Var.c(Uri.class, InputStream.class, new rw(applicationContext.getAssets(), 1));
        y27Var.c(Uri.class, AssetFileDescriptor.class, new rw(applicationContext.getAssets(), 0));
        y27Var.c(Uri.class, InputStream.class, new po1(applicationContext, 4));
        y27Var.c(Uri.class, InputStream.class, new po1(applicationContext, 5));
        if (i >= 29) {
            y27Var.c(Uri.class, InputStream.class, new oo6(applicationContext, InputStream.class));
            y27Var.c(Uri.class, cls, new oo6(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) pt2Var.b).containsKey(dt2.class);
        ContentResolver contentResolver3 = contentResolver;
        y27Var.c(Uri.class, InputStream.class, new i09(contentResolver3, zContainsKey, 2));
        y27Var.c(Uri.class, cls, new i09(contentResolver3, zContainsKey, 1));
        y27Var.c(Uri.class, AssetFileDescriptor.class, new i09(contentResolver3, zContainsKey, 0));
        y27Var.c(Uri.class, InputStream.class, new ux8(8));
        y27Var.c(URL.class, InputStream.class, new ux8(7));
        y27Var.c(Uri.class, File.class, new po1(applicationContext, 3));
        y27Var.c(ot2.class, InputStream.class, new fb9(2));
        y27Var.c(byte[].class, ByteBuffer.class, new ux8(1));
        y27Var.c(byte[].class, InputStream.class, new ux8(2));
        y27Var.c(Uri.class, Uri.class, bx4Var);
        y27Var.c(Drawable.class, Drawable.class, bx4Var);
        y27Var.d("legacy_append", Drawable.class, Drawable.class, new fb2(2));
        y27Var.k(Bitmap.class, BitmapDrawable.class, new r79(9, resources));
        y27Var.k(Bitmap.class, byte[].class, dc0Var);
        y27Var.k(Drawable.class, byte[].class, new wv8(pc0Var3, dc0Var, gvVar, 23));
        y27Var.k(ns2.class, byte[].class, gvVar);
        j67 bVar2 = new com.bumptech.glide.load.resource.bitmap.b(pc0Var3, new xs8());
        y27Var.d("legacy_append", ByteBuffer.class, Bitmap.class, bVar2);
        y27Var.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new ec0(resources, bVar2));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VolleyGlideModule volleyGlideModule = (VolleyGlideModule) it.next();
            try {
                volleyGlideModule.a(applicationContext, aVar, y27Var);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(volleyGlideModule.getClass().getName()), e);
            }
        }
        if (za9Var != null) {
            za9Var.E(applicationContext, aVar, y27Var);
        }
        return y27Var;
    }

    public static String f() {
        StringBuilder sb = new StringBuilder("[Thread id:");
        Thread threadCurrentThread = Thread.currentThread();
        sb.append(threadCurrentThread.getId());
        sb.append(" name:");
        sb.append(threadCurrentThread.getName());
        sb.append("]");
        return sb.toString();
    }

    public static final x79 g(View view) {
        js3.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(hr6.view_tree_view_model_store_owner);
            x79 x79Var = tag instanceof x79 ? (x79) tag : null;
            if (x79Var != null) {
                return x79Var;
            }
            Object objJ = h27.j(view);
            view = objJ instanceof View ? (View) objJ : null;
        }
        return null;
    }

    public static boolean h(Context context, int i) {
        if (m(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                nu2 nu2VarA = nu2.a(context);
                nu2VarA.getClass();
                if (packageInfo != null) {
                    if (!nu2.c(packageInfo, false)) {
                        if (nu2.c(packageInfo, true)) {
                            if (!lu2.a(nu2VarA.a)) {
                                t0.m("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public static boolean i(byte b2) {
        return b2 > -65;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
    
        r0 = defpackage.a77.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e1, code lost:
    
        defpackage.m91.i(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.le8 k(defpackage.mb7 r29, java.lang.String r30) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z27.k(mb7, java.lang.String):le8");
    }

    public static final void l(View view, x79 x79Var) {
        js3.p(view, "<this>");
        view.setTag(hr6.view_tree_view_model_store_owner, x79Var);
    }

    public static boolean m(int i, Context context, String str) {
        k30 k30VarA = sg9.a(context);
        k30VarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) k30VarA.a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public abstract void j(Object obj);
}
