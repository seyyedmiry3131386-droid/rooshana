package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.LifecycleService;
import com.getkeepsafe.relinker.MissingLibraryException;
import com.google.android.datatransport.Priority;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.EncodingException;
import io.sentry.config.a;
import ir.mservices.market.social.list.common.ProfileAddListToOwnProfileDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.SingleChoiceDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
public class sk6 implements rm1, ed7, l51, ou, ta8, at5 {
    public static sk6 e;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ sk6(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public static void B(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static sk6 C(Context context, AttributeSet attributeSet, int[] iArr) {
        return new sk6(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static sk6 D(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new sk6(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [do3] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [do3] */
    public void A(Context context) throws Throwable {
        ?? r16;
        ?? R;
        String[] strArrS;
        ?? r8;
        char c;
        boolean z;
        ?? r82;
        ?? inputStream;
        ?? r13;
        ?? r10;
        FileOutputStream fileOutputStreamK;
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if ("patch_tools_lite".length() == 0) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        int i = 1;
        boolean z2 = false;
        B("Beginning load of %s...", "patch_tools_lite");
        rl3 rl3Var = (rl3) this.c;
        HashSet hashSet = (HashSet) this.b;
        if (hashSet.contains("patch_tools_lite")) {
            B("%s already loaded previously!", "patch_tools_lite");
            return;
        }
        Object obj = null;
        try {
            rl3Var.getClass();
            System.loadLibrary("patch_tools_lite");
            hashSet.add("patch_tools_lite");
            B("%s (%s) was loaded normally!", "patch_tools_lite", null);
        } catch (UnsatisfiedLinkError e2) {
            B("Loading the library normally failed: %s", Log.getStackTraceString(e2));
            B("%s (%s) was not loaded normally, re-linking...", "patch_tools_lite", null);
            ?? Y = y(context);
            if (Y.exists()) {
                r8 = 1;
                c = 0;
                r16 = 0;
            } else {
                File dir = context.getDir("lib", 0);
                File fileY = y(context);
                rl3Var.getClass();
                File[] fileArrListFiles = dir.listFiles(new th5(System.mapLibraryName("patch_tools_lite"), 1));
                if (fileArrListFiles != null) {
                    int length = fileArrListFiles.length;
                    int i2 = 0;
                    while (i2 < length) {
                        File file = fileArrListFiles[i2];
                        Object obj2 = obj;
                        if (!file.getAbsolutePath().equals(fileY.getAbsolutePath())) {
                            file.delete();
                        }
                        i2++;
                        obj = obj2;
                    }
                }
                r16 = obj;
                hy2 hy2Var = (hy2) this.d;
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr.length <= 0) {
                    String str = Build.CPU_ABI2;
                    strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                }
                String strMapLibraryName = System.mapLibraryName("patch_tools_lite");
                hy2Var.getClass();
                try {
                    R = hy2.r(context, strArr, strMapLibraryName);
                    try {
                        if (R == 0) {
                            try {
                                strArrS = hy2.s(context, strMapLibraryName);
                            } catch (Exception e3) {
                                strArrS = new String[]{e3.toString()};
                            }
                            StringBuilder sbN = t61.n("Could not find '", strMapLibraryName, "'. Looked for: ");
                            sbN.append(Arrays.toString(strArr));
                            sbN.append(", but only found: ");
                            throw new MissingLibraryException(dw1.s(sbN, Arrays.toString(strArrS), "."));
                        }
                        ZipFile zipFile = (ZipFile) R.a;
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (i3 < 5) {
                                Object[] objArr = new Object[i];
                                objArr[z2 ? 1 : 0] = strMapLibraryName;
                                B("Found %s! Extracting...", objArr);
                                if (Y.exists() || Y.createNewFile()) {
                                    try {
                                        inputStream = zipFile.getInputStream((ZipEntry) R.b);
                                        try {
                                            fileOutputStreamK = a.k(new FileOutputStream((File) Y), Y);
                                        } catch (FileNotFoundException unused) {
                                            r82 = i;
                                            z = z2 ? 1 : 0;
                                            r13 = r16;
                                            r10 = inputStream;
                                        } catch (IOException unused2) {
                                            r82 = i;
                                            z = z2 ? 1 : 0;
                                            r13 = r16;
                                            r10 = inputStream;
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        try {
                                            byte[] bArr = new byte[4096];
                                            long j = 0;
                                            i = i;
                                            while (true) {
                                                int i5 = inputStream.read(bArr);
                                                if (i5 == -1) {
                                                    break;
                                                }
                                                fileOutputStreamK.write(bArr, z2 ? 1 : 0, i5);
                                                boolean z3 = z2 ? 1 : 0;
                                                j += (long) i5;
                                                i = i == true ? 1 : 0;
                                                z2 = z3 ? 1 : 0;
                                            }
                                            fileOutputStreamK.flush();
                                            fileOutputStreamK.getFD().sync();
                                            if (j == Y.length()) {
                                                hy2.a(inputStream);
                                                hy2.a(fileOutputStreamK);
                                                Y.setReadable(i, z2);
                                                Y.setExecutable(i, z2);
                                                Y.setWritable(i);
                                                try {
                                                    zipFile.close();
                                                } catch (IOException unused3) {
                                                }
                                                r8 = i;
                                                c = z2 ? 1 : 0;
                                                break;
                                            }
                                            hy2.a(inputStream);
                                            hy2.a(fileOutputStreamK);
                                            r82 = i;
                                            z = z2;
                                        } catch (FileNotFoundException unused4) {
                                            r82 = i;
                                            z = z2;
                                            r10 = inputStream;
                                            r13 = fileOutputStreamK;
                                            hy2.a(r10);
                                            hy2.a(r13);
                                            i = r82;
                                            i3 = i4;
                                            z2 = z;
                                        } catch (IOException unused5) {
                                            r82 = i;
                                            z = z2;
                                            r10 = inputStream;
                                            r13 = fileOutputStreamK;
                                            hy2.a(r10);
                                            hy2.a(r13);
                                            i = r82;
                                            i3 = i4;
                                            z2 = z;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r16 = fileOutputStreamK;
                                            hy2.a(inputStream);
                                            hy2.a(r16);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused6) {
                                        r82 = i;
                                        z = z2 ? 1 : 0;
                                        ?? r102 = r16;
                                        r13 = r102;
                                        r10 = r102;
                                    } catch (IOException unused7) {
                                        r82 = i;
                                        z = z2 ? 1 : 0;
                                        ?? r103 = r16;
                                        r13 = r103;
                                        r10 = r103;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStream = r16;
                                    }
                                } else {
                                    r82 = i;
                                    z = z2;
                                }
                                i = r82;
                                i3 = i4;
                                z2 = z;
                            } else {
                                r8 = i;
                                c = z2 ? 1 : 0;
                                try {
                                    zipFile.close();
                                    break;
                                } catch (IOException unused8) {
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (R != 0) {
                            try {
                                ((ZipFile) R.a).close();
                            } catch (IOException unused9) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    R = r16;
                }
            }
            String absolutePath = Y.getAbsolutePath();
            rl3Var.getClass();
            System.load(absolutePath);
            hashSet.add("patch_tools_lite");
            ?? r0 = new Object[2];
            r0[c] = "patch_tools_lite";
            r0[r8] = r16;
            B("%s (%s) was re-linked!", r0);
        }
    }

    public void E(Activity activity2, xf9 xf9Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.d;
        js3.p(activity2, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.c;
        reentrantLock.lock();
        try {
            if (xf9Var.equals((xf9) weakHashMap.get(activity2))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((aw7) ((c35) this.b).b).b.iterator();
            js3.o(it, "iterator(...)");
            while (it.hasNext()) {
                zv7 zv7Var = (zv7) it.next();
                if (zv7Var.a.equals(activity2)) {
                    zv7Var.d = xf9Var;
                    zv7Var.b.execute(new lo4(zv7Var, xf9Var, 25));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void F(Lifecycle$Event lifecycle$Event) {
        np7 np7Var = (np7) this.d;
        if (np7Var != null) {
            np7Var.run();
        }
        np7 np7Var2 = new np7((i64) this.b, lifecycle$Event);
        this.d = np7Var2;
        ((Handler) this.c).postAtFrontOfQueue(np7Var2);
    }

    public void G() {
        ((TypedArray) this.c).recycle();
    }

    public void H(k20 k20Var) {
        p58 p58Var = new p58(18);
        es8 es8Var = (es8) this.d;
        d30 d30Var = (d30) this.b;
        u12 u12Var = (u12) this.c;
        df7 df7Var = es8Var.c;
        wv8 wv8VarA = d30.a();
        wv8VarA.L(d30Var.a);
        wv8VarA.d = Priority.a;
        wv8VarA.b = d30Var.b;
        d30 d30VarL = wv8VarA.l();
        on onVar = new on();
        onVar.f = new HashMap();
        onVar.d = Long.valueOf(es8Var.a.a());
        onVar.e = Long.valueOf(es8Var.b.a());
        onVar.a = "FCM_CLIENT_EVENT_LOGGING";
        hv4 hv4Var = k20Var.a;
        sk6 sk6Var = cn6.a;
        sk6Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            sk6Var.r(hv4Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        onVar.c = new o12(u12Var, byteArrayOutputStream.toByteArray());
        onVar.b = null;
        vg1 vg1Var = (vg1) df7Var;
        vg1Var.b.execute(new ii(vg1Var, d30VarL, p58Var, onVar.f()));
    }

    public void I(Object obj) {
        long jC = o37.c();
        if (jC == al8.a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            vk8 vk8Var = (vk8) ((AtomicReference) this.b).get();
            int iA = vk8Var.a(jC);
            if (iA < 0) {
                ((AtomicReference) this.b).set(vk8Var.b(jC, obj));
            } else {
                vk8Var.c[iA] = obj;
            }
        }
    }

    public void J(int i, String[] strArr, int[] iArr, int[] iArr2) {
        ((String[][]) this.b)[i] = strArr;
        ((int[][]) this.c)[i] = iArr;
        ((int[][]) this.d)[i] = iArr2;
    }

    public void K() {
        rb5 rb5Var = (rb5) this.b;
        String str = (String) this.c;
        List list = (List) rb5Var.k(str);
        if (list != null) {
            list.remove((bp2) this.d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        rb5Var.m(str, list);
    }

    public void L(String str, Object obj) {
        sk6 sk6Var = new sk6(24, (byte) 0);
        ((sk6) this.d).d = sk6Var;
        this.d = sk6Var;
        sk6Var.c = obj;
        sk6Var.b = str;
    }

    @Override // defpackage.ta8
    public int a(long j) {
        long[] jArr = (long[]) this.d;
        int iA = j29.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.ou
    public void b(int i, Object obj) {
        ((h) this.d).N(i, (h) obj);
    }

    @Override // defpackage.ou
    public void c(Object obj) {
        ((ArrayList) this.c).add(this.d);
        this.d = obj;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.a) {
            case 22:
                sk6 sk6Var = new sk6(((xj9) this.b).clone());
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) sk6Var.d).add(((xj9) it.next()).clone());
                }
                return sk6Var;
            default:
                return super.clone();
        }
    }

    @Override // defpackage.ou
    public void d() {
        androidx.compose.ui.spatial.a rectManager;
        androidx.compose.ui.autofill.a aVar;
        androidx.compose.ui.spatial.a rectManager2;
        h hVar = (h) this.d;
        z4 z4Var = hVar.H;
        if (!hVar.U()) {
            rn3.a("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = hVar.q;
        if (androidViewHolder != null) {
            View view = androidViewHolder.b;
            if (view.getParent() != androidViewHolder) {
                androidViewHolder.addView(view);
            } else {
                androidViewHolder.f.invoke();
            }
        }
        g gVar = hVar.I;
        if (gVar != null) {
            gVar.i(false);
        }
        hVar.v = false;
        if (hVar.R) {
            hVar.R = false;
        } else {
            gx4 gx4Var = (ue8) hVar.H.f;
            for (gx4 gx4Var2 = gx4Var; gx4Var2 != null; gx4Var2 = gx4Var2.e) {
                if (gx4Var2.n) {
                    gx4Var2.x0();
                }
            }
            for (gx4 gx4Var3 = gx4Var; gx4Var3 != null; gx4Var3 = gx4Var3.e) {
                if (gx4Var3.n) {
                    gx4Var3.z0();
                }
            }
            while (gx4Var != null) {
                if (gx4Var.n) {
                    gx4Var.r0();
                }
                gx4Var = gx4Var.e;
            }
        }
        int i = hVar.b;
        Owner owner = hVar.p;
        if (owner != null && (rectManager2 = owner.getRectManager()) != null) {
            rectManager2.g(hVar);
        }
        hVar.b = hn7.a.addAndGet(1);
        Owner owner2 = hVar.p;
        if (owner2 != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) owner2;
            androidComposeView.getLayoutNodes().g(i);
            androidComposeView.getLayoutNodes().h(hVar.b, hVar);
        }
        for (gx4 gx4Var4 = (gx4) z4Var.g; gx4Var4 != null; gx4Var4 = gx4Var4.f) {
            gx4Var4.q0();
        }
        z4Var.h();
        if (z4Var.f(8)) {
            hVar.S();
        }
        h.t0(hVar);
        Owner owner3 = hVar.p;
        if (owner3 != null) {
            AndroidComposeView androidComposeView2 = (AndroidComposeView) owner3;
            if (AndroidComposeView.f() && (aVar = androidComposeView2.L) != null) {
                AndroidComposeView androidComposeView3 = aVar.c;
                k30 k30Var = aVar.a;
                za5 za5Var = aVar.h;
                if (za5Var.e(i)) {
                    k30Var.h(androidComposeView3, i, false);
                }
                en7 en7VarH = hVar.H();
                if (en7VarH != null && en7VarH.a.b(d.q)) {
                    za5Var.a(hVar.b);
                    k30Var.h(androidComposeView3, hVar.b, true);
                }
            }
        }
        Owner owner4 = hVar.p;
        if (owner4 == null || (rectManager = owner4.getRectManager()) == null) {
            return;
        }
        rectManager.e(hVar, true);
    }

    @Override // defpackage.ta8
    public long e(int i) {
        long[] jArr = (long[]) this.d;
        vy2.j(i >= 0);
        vy2.j(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.ou
    public void f(int i, int i2, int i3) {
        ((h) this.d).f0(i, i2, i3);
    }

    @Override // defpackage.ou
    public void g(int i, int i2) {
        ((h) this.d).n0(i, i2);
    }

    @Override // defpackage.ta8
    public List h(long j) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                gd9 gd9Var = (gd9) list.get(i);
                l81 l81Var = gd9Var.a;
                if (l81Var.e == -3.4028235E38f) {
                    arrayList2.add(gd9Var);
                } else {
                    arrayList.add(l81Var);
                }
            }
        }
        Collections.sort(arrayList2, new mh(25));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            k81 k81VarA = ((gd9) arrayList2.get(i3)).a.a();
            k81VarA.e = (-1) - i3;
            k81VarA.f = 1;
            arrayList.add(k81VarA.a());
        }
        return arrayList;
    }

    @Override // defpackage.l51
    public Object i(Object obj) throws IOException {
        Object d87Var;
        Object objK;
        js3.p(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        nm5 nm5Var = (nm5) this.d;
        dt4 dt4Var = (dt4) this.b;
        px3 px3Var = (px3) this.c;
        tv3 tv3Var = (tv3) nm5Var.b;
        if (Build.VERSION.SDK_INT >= 24) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            jx9 jx9Var = new jx9();
            jx9Var.b = byteArrayOutputStream;
            jx9Var.c = yi0.c.c(512);
            jx9Var.d = op0.c.d(128);
            byte[] bArr = (byte[]) jx9Var.c;
            try {
                y40.p(tv3Var, jx9Var, px3Var, obj);
                jx9Var.g();
                op0 op0Var = op0.c;
                char[] cArr = (char[]) jx9Var.d;
                op0Var.getClass();
                js3.p(cArr, "array");
                op0Var.b(cArr);
                yi0 yi0Var = yi0.c;
                yi0Var.getClass();
                js3.p(bArr, "array");
                yi0Var.a(bArr);
                int i = b57.a;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                js3.o(byteArray, "toByteArray(...)");
                d87Var = new e87(ol3.m(byteArray, dt4Var, byteArrayOutputStream.size(), 2));
            } catch (Throwable th) {
                jx9Var.g();
                op0 op0Var2 = op0.c;
                char[] cArr2 = (char[]) jx9Var.d;
                op0Var2.getClass();
                js3.p(cArr2, "array");
                op0Var2.b(cArr2);
                yi0 yi0Var2 = yi0.c;
                yi0Var2.getClass();
                js3.p(bArr, "array");
                yi0Var2.a(bArr);
                throw th;
            }
        } else {
            d87Var = new d87();
        }
        if (d87Var instanceof d87) {
            int i2 = b57.a;
            objK = ol3.k(tv3Var.c(px3Var, obj), dt4Var);
        } else {
            objK = ((e87) d87Var).a;
        }
        return (b57) objK;
    }

    @Override // defpackage.ou
    public void j() {
        this.d = ((ArrayList) this.c).remove(r0.size() - 1);
    }

    @Override // defpackage.ta8
    public int k() {
        return ((long[]) this.d).length;
    }

    @Override // defpackage.at5
    public void l(bf8 bf8Var) {
        fb7 fb7Var = (fb7) this.b;
        String str = (String) this.c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        synchronized (fb7Var.a) {
            fb7Var.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // defpackage.ou
    public /* bridge */ /* synthetic */ void m(int i, Object obj) {
    }

    @Override // defpackage.ou
    public void n() {
        Owner owner = ((h) this.b).p;
        if (owner != null) {
            ((AndroidComposeView) owner).x();
        }
    }

    @Override // defpackage.ou
    public void o(qp2 qp2Var, Object obj) {
        qp2Var.invoke(u(), obj);
    }

    @Override // defpackage.rm1
    public void onCancel() {
        switch (this.a) {
            case 0:
                ProfileAddListToOwnProfileDialogFragment profileAddListToOwnProfileDialogFragment = (ProfileAddListToOwnProfileDialogFragment) this.d;
                profileAddListToOwnProfileDialogFragment.b1 = true;
                profileAddListToOwnProfileDialogFragment.R0(DialogResult.b, new Bundle());
                break;
            default:
                ((SingleChoiceDialogFragment) this.c).R0(DialogResult.b, new Bundle());
                break;
        }
    }

    @Override // defpackage.rm1
    public void onCommit() {
        switch (this.a) {
            case 0:
                ((DialogButtonComponent) this.b).setStateCommit(MyketProgressState.c);
                MyketTextView myketTextView = ((vn1) this.c).x;
                js3.o(myketTextView, "errorMessage");
                myketTextView.setVisibility(4);
                ((ProfileAddListToOwnProfileDialogFragment) this.d).R0(DialogResult.a, new Bundle());
                break;
            default:
                SingleChoiceDialogFragment singleChoiceDialogFragment = (SingleChoiceDialogFragment) this.c;
                MyketProgressState myketProgressState = MyketProgressState.c;
                um1 um1Var = singleChoiceDialogFragment.i1;
                js3.m(um1Var);
                um1Var.v.setStateCommit(myketProgressState);
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.d;
                if (ref$IntRef.a >= 0) {
                    DialogResult dialogResult = DialogResult.a;
                    Bundle bundle = new Bundle();
                    bundle.putInt("BUNDLE_KEY_SELECTED_ITEM", ref$IntRef.a);
                    singleChoiceDialogFragment.R0(dialogResult, bundle);
                } else {
                    Context context = ((DialogButtonComponent) this.b).getContext();
                    hh2.H(new hh2(context, context != null ? context.getString(rs6.select_one_of_options) : null));
                }
                break;
        }
    }

    public void p() {
        ((ArrayList) this.c).clear();
        this.d = this.b;
        ((h) this.b).m0();
    }

    public void q(i1 i1Var) {
        HashSet hashSet = (HashSet) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.contains(i1Var)) {
            return;
        }
        if (hashSet.contains(i1Var)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(i1Var);
        i1Var.d(this);
        hashSet.remove(i1Var);
        if (arrayList.contains(i1Var)) {
            return;
        }
        if (r51.class.isAssignableFrom(i1Var.getClass())) {
            arrayList.add(0, i1Var);
        } else {
            arrayList.add(i1Var);
        }
    }

    public void r(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.b;
        kn6 kn6Var = new kn6(byteArrayOutputStream, map, (HashMap) this.c, (uq5) this.d);
        uq5 uq5Var = (uq5) map.get(obj.getClass());
        if (uq5Var != null) {
            uq5Var.a(obj, kn6Var);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public Object s() {
        long jC = o37.c();
        if (jC == al8.a) {
            return this.d;
        }
        vk8 vk8Var = (vk8) ((AtomicReference) this.b).get();
        int iA = vk8Var.a(jC);
        if (iA >= 0) {
            return vk8Var.c[iA];
        }
        return null;
    }

    public ColorStateList t(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = ContextCompat.getColorStateList((Context) this.b, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public String toString() {
        switch (this.a) {
            case 25:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                sk6 sk6Var = (sk6) ((sk6) this.c).d;
                String str = "";
                while (sk6Var != null) {
                    Object obj = sk6Var.c;
                    sb.append(str);
                    String str2 = (String) sk6Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    sk6Var = (sk6) sk6Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public Object u() {
        return this.d;
    }

    public Drawable v(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : rf0.v((Context) this.b, resourceId);
    }

    public Drawable w(int i) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        pn pnVarA = pn.a();
        Context context = (Context) this.b;
        synchronized (pnVarA) {
            drawableG = pnVarA.a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface x(int i, int i2, eo eoVar) throws Exception {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.d) == null) {
            this.d = new TypedValue();
        }
        Context context = (Context) this.b;
        TypedValue typedValue = (TypedValue) this.d;
        ThreadLocal threadLocal = b77.a;
        if (context.isRestricted()) {
            return null;
        }
        return b77.c(context, resourceId, typedValue, i2, eoVar, true, false);
    }

    public File y(Context context) {
        ((rl3) this.c).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("patch_tools_lite"));
    }

    public boolean z() {
        if (((u48) this.b).getValue() != this.d) {
            return true;
        }
        sk6 sk6Var = (sk6) this.c;
        return sk6Var != null && sk6Var.z();
    }

    public /* synthetic */ sk6(String str) {
        this.a = 25;
        sk6 sk6Var = new sk6(24, (byte) 0);
        this.c = sk6Var;
        this.d = sk6Var;
        this.b = str;
    }

    public sk6(xj9 xj9Var) {
        this.a = 22;
        this.b = xj9Var;
        this.c = xj9Var.clone();
        this.d = new ArrayList();
    }

    public sk6(ps1 ps1Var, dp3 dp3Var, ir.mservices.market.version2.manager.a aVar) {
        this.a = 3;
        js3.p(dp3Var, "installManager");
        js3.p(ps1Var, "downloadManager");
        js3.p(aVar, "appManager");
        this.b = ps1Var;
        this.c = aVar;
    }

    public sk6(pr7 pr7Var, AlarmManager alarmManager, Context context) {
        this.a = 7;
        js3.p(pr7Var, "settingsManager");
        js3.p(alarmManager, "alarmManager");
        this.b = pr7Var;
        this.c = alarmManager;
        this.d = context;
    }

    public sk6(int i, ArrayList arrayList) {
        this.a = i;
        switch (i) {
            case 21:
                this.b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
                this.c = new long[arrayList.size() * 2];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    gd9 gd9Var = (gd9) arrayList.get(i2);
                    int i3 = i2 * 2;
                    long[] jArr = (long[]) this.c;
                    jArr[i3] = gd9Var.b;
                    jArr[i3 + 1] = gd9Var.c;
                }
                long[] jArr2 = (long[]) this.c;
                long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
                this.d = jArrCopyOf;
                Arrays.sort(jArrCopyOf);
                break;
            default:
                this.b = arrayList;
                this.c = new ArrayList(arrayList.size());
                this.d = new HashSet(3);
                break;
        }
    }

    public sk6(a97 a97Var, uc8 uc8Var, Context context) {
        this.a = 5;
        js3.p(a97Var, "reviewService");
        js3.p(uc8Var, "surveyService");
        this.b = a97Var;
        this.c = uc8Var;
        this.d = context;
    }

    public sk6(LifecycleService lifecycleService) {
        this.a = 9;
        this.b = new i64(lifecycleService, true);
        this.c = new Handler(Looper.getMainLooper());
    }

    public sk6(d30 d30Var, u12 u12Var, sr4 sr4Var, es8 es8Var) {
        this.a = 15;
        this.b = d30Var;
        this.c = u12Var;
        this.d = es8Var;
    }

    public sk6(int i, byte b) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = new AtomicReference(rf0.e);
                this.c = new Object();
                break;
            case 13:
                this.b = new lg4(8);
                break;
            case 18:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                break;
            case 22:
                this.b = new xj9("", 0L, null);
                this.c = new xj9("", 0L, null);
                this.d = new ArrayList();
                break;
            case 24:
                break;
            default:
                rl3 rl3Var = new rl3();
                hy2 hy2Var = new hy2(26);
                this.b = new HashSet();
                this.c = rl3Var;
                this.d = hy2Var;
                break;
        }
    }

    public sk6(Context context, TypedArray typedArray) {
        this.a = 14;
        this.b = context;
        this.c = typedArray;
    }

    public sk6(Context context, LocationManager locationManager) {
        this.a = 16;
        this.d = new bb8();
        this.b = context;
        this.c = locationManager;
    }

    public sk6(SingleChoiceDialogFragment singleChoiceDialogFragment, Ref$IntRef ref$IntRef, DialogButtonComponent dialogButtonComponent) {
        this.a = 11;
        this.c = singleChoiceDialogFragment;
        this.d = ref$IntRef;
        this.b = dialogButtonComponent;
    }

    public sk6(qv8 qv8Var, sk6 sk6Var) {
        this.a = 17;
        this.b = qv8Var;
        this.c = sk6Var;
        this.d = qv8Var.getValue();
    }

    public sk6(h hVar) {
        this.a = 19;
        this.b = hVar;
        this.c = new ArrayList();
        this.d = hVar;
    }

    public sk6(c35 c35Var) {
        this.a = 10;
        this.b = c35Var;
        this.c = new ReentrantLock();
        this.d = new WeakHashMap();
    }

    public sk6(int i) {
        this.a = 20;
        this.b = new String[i][];
        this.c = new int[i][];
        this.d = new int[i][];
    }
}
