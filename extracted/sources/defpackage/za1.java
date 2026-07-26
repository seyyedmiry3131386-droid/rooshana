package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import com.airbnb.lottie.LottieAnimationView;
import io.sentry.SentryLevel;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.k0;
import io.sentry.android.core.m0;
import io.sentry.android.core.t0;
import io.sentry.clientreport.b;
import io.sentry.h5;
import io.sentry.i1;
import io.sentry.i6;
import io.sentry.k4;
import io.sentry.k5;
import io.sentry.u0;
import io.sentry.u4;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class za1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ za1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ServiceInfo serviceInfo;
        String str;
        int i;
        int i2 = -1;
        int i3 = 0;
        String str2 = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        str2 = null;
        switch (this.a) {
            case 0:
                ab1 ab1Var = (ab1) this.b;
                byte[] bArr2 = (byte[]) this.c;
                return gu9.m(bArr2, bArr2.length, ab1Var.c);
            case 1:
                ab1 ab1Var2 = (ab1) this.b;
                Uri uri = (Uri) this.c;
                xa1 xa1VarK = ab1Var2.b.k();
                int i4 = ab1Var2.c;
                try {
                    db1 db1Var = new db1(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0);
                    ae1 ae1Var = (ae1) xa1VarK;
                    ae1Var.b(db1Var);
                    byte[] bArrCopyOf = new byte[1024];
                    int i5 = 0;
                    while (i3 != -1) {
                        if (i5 == bArrCopyOf.length) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                        }
                        i3 = ae1Var.read(bArrCopyOf, i5, bArrCopyOf.length - i5);
                        if (i3 != -1) {
                            i5 += i3;
                        }
                    }
                    byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i5);
                    Bitmap bitmapM = gu9.m(bArrCopyOf2, bArrCopyOf2.length, i4);
                    ae1Var.close();
                    return bitmapM;
                } catch (Throwable th) {
                    ((ae1) xa1VarK).close();
                    throw th;
                }
            case 2:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                vp7 vp7VarT = vp7.T();
                ((ArrayDeque) vp7VarT.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (vp7VarT) {
                    try {
                        String str3 = (String) vp7VarT.b;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                t0.d("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                t0.d("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str.startsWith(".")) {
                                    vp7VarT.b = context.getPackageName() + serviceInfo.name;
                                } else {
                                    vp7VarT.b = serviceInfo.name;
                                }
                                str2 = (String) vp7VarT.b;
                            }
                        }
                    } finally {
                    }
                }
                if (str2 != null) {
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if ((vp7VarT.a0(context) ? jc9.d(context, intent2) : context.startService(intent2)) == null) {
                        t0.d("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i2 = 404;
                    }
                } catch (IllegalStateException e) {
                    t0.d("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                    i2 = i;
                } catch (SecurityException e2) {
                    t0.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = ErrorDTO.CODE_SERVER_SING_OUT;
                    i2 = i;
                }
                return Integer.valueOf(i2);
            case 3:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b;
                String str4 = (String) this.c;
                if (!lottieAnimationView.m) {
                    return lf4.b(lottieAnimationView.getContext(), str4, null);
                }
                Context context2 = lottieAnimationView.getContext();
                HashMap map = lf4.a;
                return lf4.b(context2, str4, "asset_" + str4);
            case 4:
                return lf4.d((InputStream) this.b, (String) this.c);
            case 5:
                return lf4.g(null, (ZipInputStream) this.b, (String) this.c);
            case 6:
                i1 i1Var = (i1) this.b;
                k5 k5Var = (k5) this.c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, u4.d));
                    try {
                        i1Var.a(k5Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } finally {
                        try {
                            bufferedWriter.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            case 7:
                i1 i1Var2 = (i1) this.b;
                k4 k4Var = (k4) this.c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, u4.d));
                    try {
                        i1Var2.a(k4Var, bufferedWriter2);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } finally {
                        try {
                            bufferedWriter2.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream2.close();
                        throw th;
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                }
            case 8:
                i1 i1Var3 = (i1) this.b;
                b bVar = (b) this.c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, u4.d));
                    try {
                        i1Var3.a(bVar, bufferedWriter3);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } finally {
                        try {
                            bufferedWriter3.close();
                            throw th;
                        } catch (Throwable th6) {
                            th.addSuppressed(th6);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                    }
                }
            case 9:
                i1 i1Var4 = (i1) this.b;
                i6 i6Var = (i6) this.c;
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, u4.d));
                    try {
                        i1Var4.a(i6Var, bufferedWriter4);
                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                        bufferedWriter4.close();
                        byteArrayOutputStream4.close();
                        return byteArray4;
                    } finally {
                        try {
                            bufferedWriter4.close();
                            throw th;
                        } catch (Throwable th8) {
                            th.addSuppressed(th8);
                        }
                    }
                } finally {
                }
            case 10:
                i1 i1Var5 = (i1) this.b;
                h5 h5Var = (h5) this.c;
                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter5 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream5, u4.d));
                    try {
                        i1Var5.a(h5Var, bufferedWriter5);
                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                        bufferedWriter5.close();
                        byteArrayOutputStream5.close();
                        return byteArray5;
                    } finally {
                    }
                } finally {
                }
            case 11:
                return m0.c(((k0) this.b).a, (SentryAndroidOptions) this.c);
            default:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                u0 logger = screenshotEventProcessor.a.getLogger();
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream6);
                            bitmap.recycle();
                            if (byteArrayOutputStream6.size() <= 0) {
                                logger.i(SentryLevel.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream6.close();
                            } else {
                                byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                bArr = byteArray6;
                            }
                        } finally {
                        }
                    } catch (Throwable th9) {
                        logger.f(SentryLevel.ERROR, "Compressing bitmap failed.", th9);
                    }
                    break;
                }
                return bArr;
        }
    }
}
