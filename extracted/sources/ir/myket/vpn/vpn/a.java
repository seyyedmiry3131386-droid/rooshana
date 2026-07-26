package ir.myket.vpn.vpn;

import android.app.PendingIntent;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import defpackage.br9;
import defpackage.cw;
import defpackage.d70;
import defpackage.js3;
import defpackage.li1;
import defpackage.lw;
import defpackage.mb9;
import defpackage.pb9;
import defpackage.rq1;
import defpackage.ub9;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final VpnManagerService a;
    public final VpnManagerService b;
    public final PendingIntent c;
    public final String d;
    public final ArrayList e;
    public final LinkedList f;
    public final cw g;
    public final rq1 h;
    public li1 i;
    public FileDescriptor j;
    public FileDescriptor k;

    public a(VpnManagerService vpnManagerService, VpnManagerService vpnManagerService2, PendingIntent pendingIntent, String str) {
        js3.p(pendingIntent, d70.KEY_PENDING_INTENT);
        js3.p(str, "type");
        this.a = vpnManagerService;
        this.b = vpnManagerService2;
        this.c = pendingIntent;
        this.d = str;
        this.e = new ArrayList();
        this.f = new LinkedList();
        this.g = new cw(5);
        this.h = new rq1(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009c -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ir.myket.vpn.vpn.a r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            java.lang.String r0 = r11.d
            boolean r1 = r12 instanceof ir.myket.vpn.vpn.VpnThread$run$1
            if (r1 == 0) goto L15
            r1 = r12
            ir.myket.vpn.vpn.VpnThread$run$1 r1 = (ir.myket.vpn.vpn.VpnThread$run$1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            ir.myket.vpn.vpn.VpnThread$run$1 r1 = new ir.myket.vpn.vpn.VpnThread$run$1
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r1.d
            r4 = 5
            r5 = 1
            tx8 r6 = defpackage.tx8.a
            if (r3 == 0) goto L38
            if (r3 != r5) goto L30
            int r3 = r1.a
            kotlin.b.b(r12)     // Catch: java.util.concurrent.CancellationException -> La6
        L2d:
            r12 = r3
            goto L9f
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            kotlin.b.b(r12)
            rq1 r12 = r11.h     // Catch: java.lang.InterruptedException -> Lb2
            java.util.ArrayList r3 = r11.e     // Catch: java.lang.InterruptedException -> Lb2
            r12.getClass()     // Catch: java.lang.InterruptedException -> Lb2
            java.lang.String r7 = "upstreamServers"
            defpackage.js3.p(r3, r7)     // Catch: java.lang.InterruptedException -> Lb2
            r12.c = r3     // Catch: java.lang.InterruptedException -> Lb2
            kotlinx.coroutines.flow.l r12 = defpackage.ub9.a
            qb9 r12 = new qb9
            r12.<init>(r0)
            defpackage.ub9.a(r12)
            r12 = r4
        L54:
            ir.myket.vpn.vpn.VpnManagerService r3 = r11.b
            boolean r3 = defpackage.js3.C(r3)
            if (r3 == 0) goto La6
            long r7 = java.lang.System.currentTimeMillis()
            r11.d()     // Catch: java.lang.Throwable -> L65
            r3 = r6
            goto L6a
        L65:
            r3 = move-exception
            kotlin.Result$Failure r3 = kotlin.b.a(r3)
        L6a:
            boolean r9 = r3 instanceof kotlin.Result.Failure
            if (r9 != 0) goto L79
            kotlinx.coroutines.flow.l r11 = defpackage.ub9.a
            sb9 r11 = new sb9
            r11.<init>(r0)
            defpackage.ub9.a(r11)
            goto La6
        L79:
            java.lang.Throwable r3 = kotlin.Result.a(r3)
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto La6
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r7
            r7 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 < 0) goto L8f
            r3 = r4
            goto L90
        L8f:
            r3 = r12
        L90:
            long r7 = (long) r3
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            r1.a = r3     // Catch: java.util.concurrent.CancellationException -> La6
            r1.d = r5     // Catch: java.util.concurrent.CancellationException -> La6
            java.lang.Object r12 = kotlinx.coroutines.a.e(r7, r1)     // Catch: java.util.concurrent.CancellationException -> La6
            if (r12 != r2) goto L2d
            goto Lba
        L9f:
            r3 = 120(0x78, float:1.68E-43)
            if (r12 >= r3) goto L54
            int r12 = r12 * 2
            goto L54
        La6:
            kotlinx.coroutines.flow.l r11 = defpackage.ub9.a
            rb9 r11 = new rb9
            r11.<init>(r0)
            defpackage.ub9.a(r11)
        Lb0:
            r2 = r6
            goto Lba
        Lb2:
            r11 = move-exception
            java.lang.String r12 = "VpnThread interrupted"
            r0 = 0
            defpackage.lw.g(r11, r12, r0)
            goto Lb0
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.vpn.vpn.a.a(ir.myket.vpn.vpn.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ParcelFileDescriptor b() throws UnknownHostException {
        String str;
        int i;
        int i2;
        String str2;
        Object objA;
        Object objA2;
        LinkProperties linkProperties;
        int i3;
        int i4;
        Object objA3;
        Iterable iterable = (Iterable) mb9.f.a.getValue();
        ArrayList<InetAddress> arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                objA3 = InetAddress.getByName((String) it.next());
            } catch (Throwable th) {
                objA3 = b.a(th);
            }
            InetAddress inetAddress = (InetAddress) (objA3 instanceof Result.Failure ? null : objA3);
            if (inetAddress != null) {
                arrayList.add(inetAddress);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        VpnManagerService vpnManagerService = this.a;
        int i5 = 0;
        int i6 = 1;
        if (arrayList == null) {
            Object systemService = vpnManagerService.getSystemService("connectivity");
            js3.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList2 = new ArrayList();
            List listC = br9.C(1, 0, 3, 4);
            Network[] allNetworks = connectivityManager.getAllNetworks();
            js3.o(allNetworks, "getAllNetworks(...)");
            int length = allNetworks.length;
            int i7 = 0;
            while (i7 < length) {
                Network network = allNetworks[i7];
                NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities2 == null || (linkProperties = connectivityManager.getLinkProperties(network)) == null) {
                    i3 = i5;
                    i4 = i6;
                } else {
                    if (networkCapabilities != null) {
                        if (listC == null || !listC.isEmpty()) {
                            Iterator it2 = listC.iterator();
                            while (it2.hasNext()) {
                                i3 = i5;
                                int iIntValue = ((Number) it2.next()).intValue();
                                if (!networkCapabilities.hasTransport(iIntValue) || !networkCapabilities2.hasTransport(iIntValue)) {
                                    i5 = i3;
                                }
                            }
                        }
                        i3 = i5;
                        i4 = i6;
                    } else {
                        i3 = i5;
                    }
                    List<InetAddress> dnsServers = linkProperties.getDnsServers();
                    js3.o(dnsServers, "getDnsServers(...)");
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : dnsServers) {
                        int i8 = i6;
                        if (linkedHashSet.add((InetAddress) obj)) {
                            arrayList3.add(obj);
                        }
                        i6 = i8;
                    }
                    i4 = i6;
                    arrayList2.addAll(arrayList3);
                }
                i7++;
                i6 = i4;
                i5 = i3;
            }
            i = i5;
            i2 = i6;
            if (arrayList2.isEmpty()) {
                InetAddress byName = InetAddress.getByName("8.8.8.8");
                js3.o(byName, "getByName(...)");
                arrayList2.add(byName);
            }
            arrayList = arrayList2;
        } else {
            i = 0;
            i2 = 1;
        }
        VpnService.Builder builder = new VpnService.Builder(vpnManagerService);
        for (String str3 : (Iterable) mb9.d.a.getValue()) {
            try {
                objA2 = builder.addAllowedApplication(str3);
            } catch (Throwable th2) {
                objA2 = b.a(th2);
            }
            if (Result.a(objA2) != null) {
                lw.g(null, "Invalid package for allowed app: " + str3, null);
            }
        }
        String[] strArr = {"192.0.2", "198.51.100", "203.0.113"};
        int i9 = i;
        while (true) {
            if (i9 >= 3) {
                str2 = null;
                break;
            }
            String str4 = strArr[i9];
            try {
                builder.addAddress(str4 + ".1", 24);
                objA = str4 + ".%d";
            } catch (Throwable th3) {
                objA = b.a(th3);
            }
            boolean z = objA instanceof Result.Failure;
            Object obj2 = objA;
            if (z) {
                obj2 = null;
            }
            str2 = (String) obj2;
            if (str2 != null) {
                break;
            }
            i9++;
        }
        if (str2 == null) {
            builder.addAddress("192.168.50.1", 24);
        } else {
            str = str2;
        }
        ArrayList arrayList4 = this.e;
        arrayList4.clear();
        for (InetAddress inetAddress2 : arrayList) {
            try {
                if ((inetAddress2 instanceof Inet4Address) && str != null) {
                    arrayList4.add(inetAddress2);
                    Locale locale = Locale.ENGLISH;
                    int i10 = i2;
                    Object[] objArr = new Object[i10];
                    objArr[i] = Integer.valueOf(arrayList4.size() + 1);
                    String str5 = String.format(locale, str, Arrays.copyOf(objArr, i10));
                    builder.addDnsServer(str5);
                    builder.addRoute(str5, 32);
                }
            } catch (Throwable th4) {
                b.a(th4);
            }
            i2 = 1;
        }
        builder.setBlocking(i2);
        builder.allowBypass();
        builder.allowFamily(OsConstants.AF_INET);
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setMetered(i);
        }
        return builder.setSession("Myket VPN").setConfigureIntent(this.c).establish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0296, code lost:
    
        if (r13.intValue() != r2) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.io.FileInputStream r17, java.io.FileOutputStream r18, byte[] r19) throws ir.myket.vpn.vpn.VpnThread$VpnNetworkException, java.lang.InterruptedException, java.io.IOException, android.system.ErrnoException {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.vpn.vpn.a.c(java.io.FileInputStream, java.io.FileOutputStream, byte[]):boolean");
    }

    public final void d() throws ErrnoException {
        byte[] bArr = new byte[32767];
        FileDescriptor[] fileDescriptorArrPipe = Os.pipe();
        this.k = fileDescriptorArrPipe[0];
        this.j = fileDescriptorArrPipe[1];
        try {
            ParcelFileDescriptor parcelFileDescriptorB = b();
            if (parcelFileDescriptorB == null) {
                return;
            }
            try {
                FileDescriptor fileDescriptor = parcelFileDescriptorB.getFileDescriptor();
                FileInputStream fileInputStreamH = io.sentry.config.a.h(new FileInputStream(fileDescriptor), fileDescriptor);
                try {
                    FileDescriptor fileDescriptor2 = parcelFileDescriptorB.getFileDescriptor();
                    FileOutputStream fileOutputStreamL = io.sentry.config.a.l(new FileOutputStream(fileDescriptor2), fileDescriptor2);
                    try {
                        l lVar = ub9.a;
                        ub9.a(new pb9(System.currentTimeMillis(), this.d));
                        do {
                        } while (c(fileInputStreamH, fileOutputStreamL, bArr));
                        fileOutputStreamL.close();
                        fileInputStreamH.close();
                        parcelFileDescriptorB.close();
                        FileDescriptor fileDescriptor3 = this.j;
                        if (fileDescriptor3 != null) {
                            try {
                                Os.close(fileDescriptor3);
                            } catch (ErrnoException unused) {
                            }
                        }
                        this.j = null;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            FileDescriptor fileDescriptor4 = this.j;
            if (fileDescriptor4 != null) {
                try {
                    Os.close(fileDescriptor4);
                } catch (ErrnoException unused2) {
                }
            }
            this.j = null;
        }
    }
}
