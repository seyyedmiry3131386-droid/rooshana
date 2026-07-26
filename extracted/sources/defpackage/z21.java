package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import io.sentry.android.core.t0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z21 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public static String d(xc2 xc2Var) {
        xc2Var.a();
        dd2 dd2Var = xc2Var.c;
        String str = dd2Var.e;
        if (str != null) {
            return str;
        }
        xc2Var.a();
        String str2 = dd2Var.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            ew.A0(jArr, jArr2, 0, 0, jArr.length);
            ew.B0(0, 0, 14, (int[]) this.d, iArr);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int length2 = ((int[]) this.e).length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            ew.B0(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int i7 = this.b;
        int[] iArr3 = (int[]) this.e;
        this.b = iArr3[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (js3.s(jArr3[i8], j) <= 0) {
                break;
            }
            i(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public synchronized String b() {
        try {
            if (((String) this.d) == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.d;
    }

    public synchronized String c() {
        try {
            if (((String) this.e) == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.e;
    }

    public PackageInfo e(String str) {
        try {
            return ((Context) this.c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            t0.m("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.b     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7f
        La:
            java.lang.Object r0 = r5.c     // Catch: java.lang.Throwable -> L27
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L27
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L27
            r4 = -1
            if (r3 != r4) goto L29
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            io.sentry.android.core.t0.d(r0, r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r2
            goto L7f
        L27:
            r0 = move-exception
            goto L83
        L29:
            boolean r3 = defpackage.wn5.R()     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L4c
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L4c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            if (r3 <= 0) goto L4c
            r5.b = r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r1
            goto L7f
        L4c:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L27
            r3 = 2
            if (r0 == 0) goto L6a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L27
            if (r0 <= 0) goto L6a
            r5.b = r3     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r3
            goto L7f
        L6a:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            io.sentry.android.core.t0.m(r0, r4)     // Catch: java.lang.Throwable -> L27
            boolean r0 = defpackage.wn5.R()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L7a
            r5.b = r3     // Catch: java.lang.Throwable -> L27
            goto L7c
        L7a:
            r5.b = r1     // Catch: java.lang.Throwable -> L27
        L7c:
            int r0 = r5.b     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
        L7f:
            if (r0 == 0) goto L82
            return r1
        L82:
            return r2
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z21.f():boolean");
    }

    public void g(Context context, XmlResourceParser xmlResourceParser) {
        d dVar = new d();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        t0.d("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.n(context, xmlResourceParser);
                ((SparseArray) this.e).put(identifier, dVar);
                return;
            }
        }
    }

    public synchronized void h() {
        PackageInfo packageInfoE = e(((Context) this.c).getPackageName());
        if (packageInfoE != null) {
            this.d = Integer.toString(packageInfoE.versionCode);
            this.e = packageInfoE.versionName;
        }
    }

    public void i(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void j(float f, float f2, int i) {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.c;
        SparseArray sparseArray = (SparseArray) this.d;
        int i2 = this.a;
        int i3 = 0;
        if (i2 != i) {
            this.a = i;
            x21 x21Var = (x21) sparseArray.get(i);
            ArrayList arrayList = x21Var.b;
            while (true) {
                if (i3 >= arrayList.size()) {
                    i3 = -1;
                    break;
                } else if (((y21) arrayList.get(i3)).a(f, f2)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList2 = x21Var.b;
            d dVar = i3 == -1 ? x21Var.d : ((y21) arrayList2.get(i3)).f;
            if (i3 != -1) {
                int i4 = ((y21) arrayList2.get(i3)).e;
            }
            if (dVar == null) {
                return;
            }
            this.b = i3;
            dVar.b(constraintLayout);
            return;
        }
        x21 x21Var2 = i == -1 ? (x21) sparseArray.valueAt(0) : (x21) sparseArray.get(i2);
        int i5 = this.b;
        if (i5 == -1 || !((y21) x21Var2.b.get(i5)).a(f, f2)) {
            ArrayList arrayList3 = x21Var2.b;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    i3 = -1;
                    break;
                } else if (((y21) arrayList3.get(i3)).a(f, f2)) {
                    break;
                } else {
                    i3++;
                }
            }
            ArrayList arrayList4 = x21Var2.b;
            if (this.b == i3) {
                return;
            }
            d dVar2 = i3 == -1 ? null : ((y21) arrayList4.get(i3)).f;
            if (i3 != -1) {
                int i6 = ((y21) arrayList4.get(i3)).e;
            }
            if (dVar2 == null) {
                return;
            }
            this.b = i3;
            dVar2.b(constraintLayout);
        }
    }
}
