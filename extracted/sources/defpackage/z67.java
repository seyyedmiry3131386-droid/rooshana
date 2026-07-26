package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.nearby.zzhg;
import com.google.android.gms.internal.nearby.zzhk;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.ProtocolException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Protocol;

/* JADX INFO: loaded from: classes.dex */
public abstract class z67 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static File c;

    public static Object a(bf8 bf8Var) throws InterruptedException {
        rq4.m("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        rq4.o(bf8Var, "Task must not be null");
        if (bf8Var.e()) {
            return o(bf8Var);
        }
        ut4 ut4Var = new ut4(21);
        Executor executor = df8.b;
        bf8Var.b(executor, ut4Var);
        bf8Var.a(executor, ut4Var);
        ox9 ox9Var = (ox9) bf8Var;
        ox9Var.b.h(new aq9(executor, (zs5) ut4Var));
        ox9Var.q();
        ((CountDownLatch) ut4Var.b).await();
        return o(bf8Var);
    }

    public static Object b(bf8 bf8Var, long j, TimeUnit timeUnit) throws TimeoutException {
        rq4.m("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        rq4.o(bf8Var, "Task must not be null");
        rq4.o(timeUnit, "TimeUnit must not be null");
        if (bf8Var.e()) {
            return o(bf8Var);
        }
        ut4 ut4Var = new ut4(21);
        Executor executor = df8.b;
        bf8Var.b(executor, ut4Var);
        bf8Var.a(executor, ut4Var);
        ox9 ox9Var = (ox9) bf8Var;
        ox9Var.b.h(new aq9(executor, (zs5) ut4Var));
        ox9Var.q();
        if (((CountDownLatch) ut4Var.b).await(j, timeUnit)) {
            return o(bf8Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static ox9 c(Executor executor, Callable callable) {
        rq4.o(executor, "Executor must not be null");
        ox9 ox9Var = new ox9();
        executor.execute(new zh9(ox9Var, callable, 10));
        return ox9Var;
    }

    public static byte e(long j) {
        wn5.f(j, "out of range: %s", (j >> 8) == 0);
        return (byte) j;
    }

    public static void f(qf3 qf3Var) {
        if (qf3Var != null) {
            try {
                qf3Var.b();
            } catch (RemoteException unused) {
            }
        }
    }

    public static ox9 g(Object obj) {
        ox9 ox9Var = new ox9();
        ox9Var.m(obj);
        return ox9Var;
    }

    public static zc9 h(Bundle bundle) {
        if (!t61.B(bundle, "bundle", zc9.class, "url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("url");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("shareLink")) {
            throw new IllegalArgumentException("Required argument \"shareLink\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("shareLink");
        if (!bundle.containsKey("showBottomNavigation")) {
            throw new IllegalArgumentException("Required argument \"showBottomNavigation\" is missing and does not have an android:defaultValue");
        }
        boolean z2 = bundle.getBoolean("showBottomNavigation");
        if (!bundle.containsKey("openByWebView")) {
            throw new IllegalArgumentException("Required argument \"openByWebView\" is missing and does not have an android:defaultValue");
        }
        boolean z3 = bundle.getBoolean("openByWebView");
        if (!bundle.containsKey("launchViewIntent")) {
            throw new IllegalArgumentException("Required argument \"launchViewIntent\" is missing and does not have an android:defaultValue");
        }
        boolean z4 = bundle.getBoolean("launchViewIntent");
        if (bundle.containsKey("finishOnBackPress")) {
            return new zc9(string, string2, z, z2, z3, z4, bundle.getBoolean("finishOnBackPress"));
        }
        throw new IllegalArgumentException("Required argument \"finishOnBackPress\" is missing and does not have an android:defaultValue");
    }

    public static final int i(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static pg l(String str) throws ProtocolException {
        Protocol protocol;
        int i;
        String strSubstring;
        js3.p(str, "statusLine");
        if (m88.Z(str, "HTTP/1.", false)) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.c;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.d;
            }
        } else if (m88.Z(str, "ICY ", false)) {
            protocol = Protocol.c;
            i = 4;
        } else {
            if (!m88.Z(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.d;
            i = 12;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i, i2);
        js3.o(strSubstring2, "substring(...)");
        Integer numA0 = m88.a0(strSubstring2);
        if (numA0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numA0.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
            js3.o(strSubstring, "substring(...)");
        }
        return new pg(iIntValue, 18, protocol, strSubstring);
    }

    public static ox9 m(zv zvVar) {
        if (zvVar.isEmpty()) {
            return g(null);
        }
        sv svVar = new sv(zvVar);
        while (svVar.hasNext()) {
            if (((bf8) svVar.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        ox9 ox9Var = new ox9();
        hk9 hk9Var = new hk9(zvVar.c, ox9Var);
        sv svVar2 = new sv(zvVar);
        while (svVar2.hasNext()) {
            bf8 bf8Var = (bf8) svVar2.next();
            ko9 ko9Var = df8.b;
            bf8Var.b(ko9Var, hk9Var);
            bf8Var.a(ko9Var, hk9Var);
            ox9 ox9Var2 = (ox9) bf8Var;
            ox9Var2.b.h(new aq9((Executor) ko9Var, (zs5) hk9Var));
            ox9Var2.q();
        }
        return ox9Var;
    }

    public static z36 n(Context context, zzhk zzhkVar) {
        long j = zzhkVar.a;
        int i = zzhkVar.b;
        if (i == 1) {
            zzhg zzhgVar = zzhkVar.k;
            byte[] bArr = zzhgVar != null ? zzhgVar.a : zzhkVar.c;
            if (bArr != null) {
                return new z36(j, 1, bArr, null, null);
            }
            throw new NullPointerException("Payload bytes cannot be null if type is BYTES.");
        }
        if (i != 2) {
            if (i != 3) {
                t0.m("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", Long.valueOf(j), Integer.valueOf(zzhkVar.b)));
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptor = zzhkVar.d;
            if (parcelFileDescriptor != null) {
                return new z36(j, 3, null, null, new hh2(parcelFileDescriptor));
            }
            throw new NullPointerException("Data ParcelFileDescriptor cannot be null for type STREAM");
        }
        String str = zzhkVar.e;
        Uri uri = zzhkVar.h;
        if (str == null || uri == null) {
            if (uri != null && zzhkVar.d == null) {
                return z36.c(new lz1(null, null, zzhkVar.l, uri), j);
            }
            ParcelFileDescriptor parcelFileDescriptor2 = zzhkVar.d;
            if (parcelFileDescriptor2 != null) {
                return z36.c(new lz1(null, parcelFileDescriptor2, parcelFileDescriptor2.getStatSize(), null), j);
            }
            throw new NullPointerException("Data ParcelFileDescriptor cannot be null for type FILE");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                t0.m("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", uri));
                return null;
            }
            int i2 = cq9.a;
            z36 z36VarC = z36.c(new lz1(new File(str), parcelFileDescriptorOpenFileDescriptor, zzhkVar.f, uri), j);
            if (!TextUtils.isEmpty(zzhkVar.n)) {
                z36VarC.b(zzhkVar.n);
            }
            if (!TextUtils.isEmpty(zzhkVar.m)) {
                z36VarC.a(zzhkVar.m);
            }
            return z36VarC;
        } catch (FileNotFoundException e) {
            t0.n("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e);
            return null;
        } catch (SecurityException e2) {
            t0.n("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e2);
            return null;
        }
    }

    public static Object o(bf8 bf8Var) throws ExecutionException {
        if (bf8Var.f()) {
            return bf8Var.d();
        }
        if (((ox9) bf8Var).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(bf8Var.c());
    }

    public void d(int i) {
        new Handler(Looper.getMainLooper()).post(new zl(i, 8, this));
    }

    public abstract void j(int i);

    public abstract void k(Typeface typeface);
}
