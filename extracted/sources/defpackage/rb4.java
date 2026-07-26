package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigationrail.NavigationRailView;
import io.sentry.android.core.t0;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.version2.ApplicationLauncher;
import j$.util.DesugarCollections;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes.dex */
public class rb4 implements n16, ta8 {
    public static final Object g = new Object();
    public static rb4 h;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ rb4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public static rb4 m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        rb4 rb4Var = new rb4(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) rb4Var.e)) {
            try {
                ((ArrayDeque) rb4Var.e).clear();
                String string = ((SharedPreferences) rb4Var.b).getString((String) rb4Var.c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) rb4Var.d)) {
                    String[] strArrSplit = string.split((String) rb4Var.d, -1);
                    if (strArrSplit.length == 0) {
                        t0.d("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) rb4Var.e).add(str);
                        }
                    }
                    return rb4Var;
                }
                return rb4Var;
            } finally {
            }
        }
    }

    public static rb4 w(Context context) {
        rb4 rb4Var;
        synchronized (g) {
            try {
                if (h == null) {
                    h = new rb4(context.getApplicationContext());
                }
                rb4Var = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rb4Var;
    }

    public int A() {
        NavigationBarView navigationBarView = (NavigationBarView) this.c;
        if ((navigationBarView instanceof NavigationRailView) && navigationBarView.getVisibility() == 0) {
            return s().getResources().getDimensionPixelOffset(pq6.side_navigation_margin);
        }
        return 0;
    }

    public void B(String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ((ay2) this.d).j(str, str2);
    }

    public void C(by2 by2Var) {
        js3.p(by2Var, "headers");
        this.d = by2Var.d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup, es0] */
    public boolean D() {
        if (((ViewGroup) this.b).l()) {
            ds0 ds0Var = (ds0) this.e;
            if (ds0Var == null || ds0Var.c == Float.MAX_VALUE) {
                return true;
            }
        }
        return false;
    }

    public int E(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.b).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((js3.r(cCharAt, 8192) < 0 || js3.r(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    public void F(String str, b57 b57Var) {
        js3.p(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (b57Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                throw new IllegalArgumentException(o40.y("method ", str, " must have a request body.").toString());
            }
        } else if (!m91.A(str)) {
            throw new IllegalArgumentException(o40.y("method ", str, " must not have a request body.").toString());
        }
        this.c = str;
        this.e = b57Var;
    }

    public void G() {
        switch (this.a) {
            case 10:
                wl4 wl4Var = new wl4(this, (MediaBrowserServiceCompat) this.f);
                this.b = wl4Var;
                wl4Var.onCreate();
                break;
            default:
                wl4 wl4Var2 = new wl4(this, (androidx.media.MediaBrowserServiceCompat) this.f, (char) 0);
                this.b = wl4Var2;
                wl4Var2.onCreate();
                break;
        }
    }

    public String H() {
        String str;
        synchronized (((ArrayDeque) this.e)) {
            str = (String) ((ArrayDeque) this.e).peek();
        }
        return str;
    }

    public boolean I(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.e)) {
            zRemove = ((ArrayDeque) this.e).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f).execute(new u03(26, this));
            }
        }
        return zRemove;
    }

    public void J(Object obj, String str) {
        js3.p(str, "key");
        ((LinkedHashMap) this.b).put(str, obj);
        xb5 xb5Var = (xb5) ((LinkedHashMap) this.d).get(str);
        if (xb5Var != null) {
            ((l) xb5Var).o(obj);
        }
        xb5 xb5Var2 = (xb5) ((LinkedHashMap) this.e).get(str);
        if (xb5Var2 != null) {
            ((l) xb5Var2).o(obj);
        }
    }

    public void K(Drawable drawable) {
        this.f = drawable;
        ((ViewGroup) this.c).invalidate();
    }

    public void L(int i) {
        ((Paint) this.d).setColor(i);
        ((ViewGroup) this.c).invalidate();
    }

    public void M(LaunchContentActivity launchContentActivity, int i) {
        NavigationBarView navigationBarView = (NavigationBarView) this.c;
        if ((navigationBarView instanceof BottomNavigationView) && navigationBarView.getVisibility() == 0) {
            i = sj8.b().p;
        }
        a.k(launchContentActivity, i, sj8.g);
    }

    public void N() {
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[0]}, new int[]{sj8.b().c, sj8.b().n});
        NavigationBarView navigationBarView = (NavigationBarView) this.c;
        navigationBarView.setBackgroundColor(navigationBarView instanceof BottomNavigationView ? sj8.b().p : sj8.b().l);
        navigationBarView.setItemIconTintList(colorStateList);
        navigationBarView.setItemTextColor(colorStateList);
    }

    public void O(ds0 ds0Var) {
        ViewGroup viewGroup = (ViewGroup) this.c;
        if (ds0Var == null) {
            this.e = null;
        } else {
            ds0 ds0Var2 = (ds0) this.e;
            if (ds0Var2 == null) {
                this.e = new ds0(ds0Var);
            } else {
                float f = ds0Var.a;
                float f2 = ds0Var.b;
                float f3 = ds0Var.c;
                ds0Var2.a = f;
                ds0Var2.b = f2;
                ds0Var2.c = f3;
            }
            if (ds0Var.c + 1.0E-4f >= yq2.X(ds0Var.a, ds0Var.b, viewGroup.getWidth(), viewGroup.getHeight())) {
                ((ds0) this.e).c = Float.MAX_VALUE;
            }
        }
        viewGroup.invalidate();
    }

    public void P(String str) {
        js3.p(str, "url");
        if (m88.Z(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            js3.o(strSubstring, "substring(...)");
            str = "http:".concat(strSubstring);
        } else if (m88.Z(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            js3.o(strSubstring2, "substring(...)");
            str = "https:".concat(strSubstring2);
        }
        js3.p(str, "<this>");
        re3 re3Var = new re3(0);
        re3Var.e(null, str);
        this.b = re3Var.b();
    }

    public void Q() {
        Iterator it = ((ArrayList) this.e).iterator();
        while (it.hasNext()) {
            int i = ((ui5) it.next()).a;
            if (q(i) == null) {
                int i2 = wi5.f;
                StringBuilder sbN = t61.n("Navigation destination ", m91.s((jc0) this.c, i), " cannot be found in the navigation graph ");
                sbN.append((fj5) this.f);
                throw new IllegalArgumentException(sbN.toString());
            }
        }
    }

    @Override // defpackage.ta8
    public int a(long j) {
        long[] jArr = (long[]) this.e;
        int iA = j29.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.n16
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((m16) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // defpackage.n16
    public float c() {
        return ((Number) this.d.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    @Override // defpackage.n16
    public float d() {
        return ((Number) this.f.getValue()).floatValue();
    }

    @Override // defpackage.ta8
    public long e(int i) {
        return ((long[]) this.e)[i];
    }

    public void f(qi qiVar, ps0 ps0Var) {
        ((ArrayList) this.b).add(new Pair(qiVar, ps0Var));
    }

    public void g(ua2 ua2Var, ps0 ps0Var) {
        ((ArrayList) this.d).add(new d(ua2Var, ps0Var, 15));
    }

    @Override // defpackage.ta8
    public List h(long j) {
        ht8 ht8Var = (ht8) this.b;
        Map map = (Map) this.f;
        HashMap map2 = (HashMap) this.c;
        HashMap map3 = (HashMap) this.d;
        ArrayList<android.util.Pair> arrayList = new ArrayList();
        ht8Var.g(j, ht8Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        ht8Var.i(j, false, ht8Var.h, treeMap);
        ht8Var.h(j, map, map2, ht8Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (android.util.Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                jt8 jt8Var = (jt8) map2.get(pair.first);
                jt8Var.getClass();
                arrayList2.add(new l81(null, null, null, bitmapDecodeByteArray, jt8Var.c, 0, jt8Var.e, jt8Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, jt8Var.f, jt8Var.g, false, -16777216, jt8Var.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            jt8 jt8Var2 = (jt8) map2.get(entry.getKey());
            jt8Var2.getClass();
            k81 k81Var = (k81) entry.getValue();
            CharSequence charSequence = k81Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ij1 ij1Var : (ij1[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ij1.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ij1Var), spannableStringBuilder.getSpanEnd(ij1Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = jt8Var2.c;
            int i9 = jt8Var2.d;
            k81Var.e = f;
            k81Var.f = i9;
            k81Var.g = jt8Var2.e;
            k81Var.h = jt8Var2.b;
            k81Var.l = jt8Var2.f;
            float f2 = jt8Var2.i;
            int i10 = jt8Var2.h;
            k81Var.k = f2;
            k81Var.j = i10;
            k81Var.p = jt8Var2.j;
            arrayList2.add(k81Var.a());
        }
        return arrayList2;
    }

    public pm0 i(e40 e40Var, bp2 bp2Var) {
        int i;
        int i2;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.a = -1;
        synchronized (this.b) {
            Throwable th = (Throwable) this.c;
            if (th != null) {
                e40Var.b(th);
                return eq.t;
            }
            AtomicInt atomicInt = (AtomicInt) this.d;
            do {
                i = atomicInt.get();
                i2 = i + 1;
            } while (!atomicInt.compareAndSet(i, i2));
            boolean z = true;
            if ((134217727 & i2) != 1) {
                z = false;
            }
            ref$IntRef.a = (i2 >>> 27) & 15;
            ((mb5) this.e).g(e40Var);
            if (z && bp2Var != null) {
                try {
                    bp2Var.invoke();
                } catch (Throwable th2) {
                    p(th2);
                }
            }
            return new nc2(new f8(e40Var, this, ref$IntRef, 6));
        }
    }

    public void j(String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ((ay2) this.d).a(str, str2);
    }

    @Override // defpackage.ta8
    public int k() {
        return ((long[]) this.e).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.text.Bidi l(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.b
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.y(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb4.l(int):java.text.Bidi");
    }

    public hf8 n() {
        ArrayList arrayList = (ArrayList) this.e;
        Intent intent = (Intent) this.d;
        fj5 fj5Var = (fj5) this.f;
        if (fj5Var == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        wi5 wi5Var = null;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                intent.putExtra("android-support-nav:controller:deepLinkIds", kotlin.collections.a.O0(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                hf8 hf8Var = new hf8((Context) this.b);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(hf8Var.b.getPackageManager());
                }
                if (component != null) {
                    hf8Var.a(component);
                }
                ArrayList arrayList4 = hf8Var.a;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i < size) {
                    Intent intent3 = (Intent) arrayList4.get(i);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i++;
                }
                return hf8Var;
            }
            ui5 ui5Var = (ui5) it.next();
            int i2 = ui5Var.a;
            Bundle bundle = ui5Var.b;
            wi5 wi5VarQ = q(i2);
            if (wi5VarQ == null) {
                int i3 = wi5.f;
                throw new IllegalArgumentException("Navigation destination " + m91.s((jc0) this.c, i2) + " cannot be found in the navigation graph " + fj5Var);
            }
            int[] iArrC = wi5VarQ.c(wi5Var);
            int length = iArrC.length;
            while (i < length) {
                arrayList2.add(Integer.valueOf(iArrC[i]));
                arrayList3.add(bundle);
                i++;
            }
            wi5Var = wi5VarQ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup, es0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(android.graphics.Canvas r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            r6 = r0
            android.graphics.Paint r6 = (android.graphics.Paint) r6
            java.lang.Object r0 = r7.b
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.Object r1 = r7.c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            java.lang.Object r2 = r7.e
            ds0 r2 = (defpackage.ds0) r2
            if (r2 == 0) goto L1f
            float r2 = r2.c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            goto L20
        L1f:
            r2 = 1
        L20:
            if (r2 != 0) goto L42
            r0.k(r8)
            int r0 = r6.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L40
            int r0 = r1.getWidth()
            float r4 = (float) r0
            int r0 = r1.getHeight()
            float r5 = (float) r0
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L5f
        L40:
            r1 = r8
            goto L5f
        L42:
            r0.k(r8)
            int r0 = r6.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L40
            int r0 = r1.getWidth()
            float r4 = (float) r0
            int r0 = r1.getHeight()
            float r5 = (float) r0
            r2 = 0
            r3 = 0
            r1 = r8
            r1.drawRect(r2, r3, r4, r5, r6)
        L5f:
            java.lang.Object r8 = r7.f
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            if (r8 == 0) goto L9a
            java.lang.Object r0 = r7.e
            ds0 r0 = (defpackage.ds0) r0
            if (r0 == 0) goto L9a
            android.graphics.Rect r8 = r8.getBounds()
            java.lang.Object r0 = r7.e
            ds0 r0 = (defpackage.ds0) r0
            float r0 = r0.a
            int r2 = r8.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r0 = r0 - r2
            java.lang.Object r2 = r7.e
            ds0 r2 = (defpackage.ds0) r2
            float r2 = r2.b
            int r8 = r8.height()
            float r8 = (float) r8
            float r8 = r8 / r3
            float r2 = r2 - r8
            r1.translate(r0, r2)
            java.lang.Object r8 = r7.f
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r8.draw(r1)
            float r8 = -r0
            float r0 = -r2
            r1.translate(r8, r0)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rb4.o(android.graphics.Canvas):void");
    }

    public void p(Throwable th) {
        int i;
        synchronized (this.b) {
            try {
                if (((Throwable) this.c) != null) {
                    return;
                }
                this.c = th;
                mb5 mb5Var = (mb5) this.e;
                Object[] objArr = mb5Var.a;
                int i2 = mb5Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((e40) objArr[i3]).b(th);
                }
                ((mb5) this.e).j();
                AtomicInt atomicInt = (AtomicInt) this.d;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public wi5 q(int i) {
        ov ovVar = new ov();
        fj5 fj5Var = (fj5) this.f;
        js3.m(fj5Var);
        ovVar.addLast(fj5Var);
        while (!ovVar.isEmpty()) {
            wi5 wi5Var = (wi5) ovVar.removeFirst();
            if (wi5Var.b.a == i) {
                return wi5Var;
            }
            if (wi5Var instanceof fj5) {
                Iterator it = ((fj5) wi5Var).iterator();
                while (true) {
                    gj5 gj5Var = (gj5) it;
                    if (gj5Var.hasNext()) {
                        ovVar.addLast((wi5) gj5Var.next());
                    }
                }
            }
        }
        return null;
    }

    public void r(dp2 dp2Var) {
        int i;
        synchronized (this.b) {
            try {
                mb5 mb5Var = (mb5) this.e;
                this.e = (mb5) this.f;
                this.f = mb5Var;
                AtomicInt atomicInt = (AtomicInt) this.d;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = mb5Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    dp2Var.invoke(mb5Var.b(i3));
                }
                mb5Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context s() {
        Context context = (Context) this.b;
        if (context != null) {
            return context;
        }
        js3.V("context");
        throw null;
    }

    public jr4 t() {
        tl4 tl4Var = ((MediaBrowserServiceCompat) this.d).f;
        if (tl4Var != null) {
            return tl4Var.d;
        }
        throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
    }

    public float u(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float v(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iE = i;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return u(i, z);
        }
        int iN = wn5.N(layout, iE, z2);
        int lineStart = layout.getLineStart(iN);
        int lineEnd = layout.getLineEnd(iN);
        if (iE != lineStart && iE != lineEnd) {
            return u(i, z);
        }
        if (iE == 0 || iE == layout.getText().length()) {
            return u(i, z);
        }
        int iX = x(iE, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(y(iX))) == -1;
        int iE2 = E(lineEnd, lineStart);
        int iY = y(iX);
        int i4 = lineStart - iY;
        int i5 = iE2 - iY;
        Bidi bidiL = l(iX);
        Bidi bidiCreateLineBidi = bidiL != null ? bidiL.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return iE == lineStart ? z3 : !z3 ? layout.getLineLeft(iN) : layout.getLineRight(iN);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        z04[] z04VarArr = new z04[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            z04VarArr[i6] = new z04(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, z04VarArr, 0, runCount);
        if (iE == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (z04VarArr[i8].a == iE) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == z04VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iN) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(z04VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(z04VarArr[i3 + 1].a) : layout.getLineRight(iN);
        }
        if (iE > iE2) {
            iE = E(iE, lineStart);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (z04VarArr[i9].b == iE) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == z04VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iN) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(z04VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(z04VarArr[i2 + 1].b) : layout.getLineRight(iN);
    }

    public int x(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.e;
        int iP = br9.p(arrayList, Integer.valueOf(i));
        int i2 = iP < 0 ? -(iP + 1) : iP + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int y(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.e).get(i - 1)).intValue();
    }

    public ds0 z() {
        ds0 ds0Var = (ds0) this.e;
        if (ds0Var == null) {
            return null;
        }
        ds0 ds0Var2 = new ds0(ds0Var);
        if (ds0Var2.c == Float.MAX_VALUE) {
            float f = ds0Var2.a;
            float f2 = ds0Var2.b;
            ViewGroup viewGroup = (ViewGroup) this.c;
            ds0Var2.c = yq2.X(f, f2, viewGroup.getWidth(), viewGroup.getHeight());
        }
        return ds0Var2;
    }

    public /* synthetic */ rb4(boolean z) {
        this.a = 15;
    }

    public rb4(Map map) {
        this.a = 16;
        this.b = b.U(map);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new yx0(6, this);
    }

    public rb4(int i) {
        this.a = i;
        switch (i) {
            case 15:
                this.f = j12.d;
                this.c = "GET";
                this.d = new ay2(0);
                break;
            default:
                this.b = new Object();
                this.d = new AtomicInt(0);
                this.e = new mb5();
                this.f = new mb5();
                break;
        }
    }

    public rb4(Drawable.Callback callback) {
        this.a = 6;
        this.b = new hh2((char) 0, 19);
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = ".ttf";
        if (!(callback instanceof View)) {
            qd4.b("LottieDrawable must be inside of a view for images to work.");
            this.e = null;
        } else {
            this.e = ((View) callback).getContext().getAssets();
        }
    }

    public rb4(Layout layout) {
        this.a = 8;
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iK0 = f88.k0('\n', length, 4, ((Layout) this.b).getText());
            length = iK0 < 0 ? ((Layout) this.b).getText().length() : iK0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.b).getText().length());
        this.e = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[((ArrayList) this.e).size()];
        ((ArrayList) this.e).size();
    }

    public rb4(go8 go8Var) {
        this.a = 9;
        this.b = (ui4) go8Var.a;
        this.c = (ol3) go8Var.c;
        this.d = (sl3) go8Var.d;
        this.e = (cv) go8Var.e;
        this.f = (r79) go8Var.g;
    }

    public rb4(ht8 ht8Var, HashMap map, HashMap map2, HashMap map3) {
        this.a = 19;
        this.b = ht8Var;
        this.c = map2;
        this.d = map3;
        this.f = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ht8Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.e = jArr;
    }

    public rb4(NavigationBarView navigationBarView, ImageView imageView) {
        this.a = 14;
        js3.p(navigationBarView, "navigationView");
        this.c = navigationBarView;
        this.d = imageView;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.e = (lw8) w91Var.E.get();
        this.f = (d04) w91Var.p.get();
        pr7 pr7Var = (pr7) w91Var.s.get();
        this.b = w91Var.a.a;
        if (pr7Var != null) {
            if (pr7Var.a.b(lu7.z0, false)) {
                MenuItem menuItemFindItem = navigationBarView.getMenu().findItem(rr6.mainFeature);
                menuItemFindItem.setTitle(rs6.bn_kidshome);
                menuItemFindItem.setIcon(yq6.animated_kidshome_selector);
                return;
            }
            return;
        }
        js3.V("settingsManager");
        throw null;
    }

    public rb4(ll llVar, gj8 gj8Var, List list, qj1 qj1Var, oh2 oh2Var) {
        int i;
        String strSubstring;
        int i2;
        String str;
        List list2;
        int i3;
        List list3;
        int i4;
        ll llVar2 = llVar;
        gj8 gj8Var2 = gj8Var;
        this.a = 12;
        this.b = llVar2;
        this.c = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final int i5 = 0;
        this.d = kotlin.a.b(lazyThreadSafetyMode, new bp2(this) { // from class: r95
            public final /* synthetic */ rb4 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i5) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.b.e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((m16) obj3).a.c();
                            int iY = br9.y(arrayList);
                            int i6 = 1;
                            if (1 <= iY) {
                                while (true) {
                                    Object obj4 = arrayList.get(i6);
                                    float fC2 = ((m16) obj4).a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i6 != iY) {
                                        i6++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        m16 m16Var = (m16) obj;
                        return Float.valueOf(m16Var != null ? m16Var.a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.b.e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC3 = ((m16) obj5).a.i.c();
                            int iY2 = br9.y(arrayList2);
                            int i7 = 1;
                            if (1 <= iY2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i7);
                                    float fC4 = ((m16) obj6).a.i.c();
                                    if (Float.compare(fC3, fC4) < 0) {
                                        obj5 = obj6;
                                        fC3 = fC4;
                                    }
                                    if (i7 != iY2) {
                                        i7++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        m16 m16Var2 = (m16) obj2;
                        return Float.valueOf(m16Var2 != null ? m16Var2.a.i.c() : 0.0f);
                }
            }
        });
        final int i6 = 1;
        this.f = kotlin.a.b(lazyThreadSafetyMode, new bp2(this) { // from class: r95
            public final /* synthetic */ rb4 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i6) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.b.e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((m16) obj3).a.c();
                            int iY = br9.y(arrayList);
                            int i62 = 1;
                            if (1 <= iY) {
                                while (true) {
                                    Object obj4 = arrayList.get(i62);
                                    float fC2 = ((m16) obj4).a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i62 != iY) {
                                        i62++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        m16 m16Var = (m16) obj;
                        return Float.valueOf(m16Var != null ? m16Var.a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.b.e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fC3 = ((m16) obj5).a.i.c();
                            int iY2 = br9.y(arrayList2);
                            int i7 = 1;
                            if (1 <= iY2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i7);
                                    float fC4 = ((m16) obj6).a.i.c();
                                    if (Float.compare(fC3, fC4) < 0) {
                                        obj5 = obj6;
                                        fC3 = fC4;
                                    }
                                    if (i7 != iY2) {
                                        i7++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        m16 m16Var2 = (m16) obj2;
                        return Float.valueOf(m16Var2 != null ? m16Var2.a.i.c() : 0.0f);
                }
            }
        });
        p16 p16Var = gj8Var2.b;
        ll llVar3 = ml.a;
        ArrayList arrayList = llVar2.d;
        String str2 = llVar2.b;
        List listJ0 = (arrayList == null || (listJ0 = kotlin.collections.a.J0(arrayList, new yg2(7))) == null) ? EmptyList.a : listJ0;
        ArrayList arrayList2 = new ArrayList();
        ov ovVar = new ov();
        int size = listJ0.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            kl klVar = (kl) listJ0.get(i7);
            kl klVar2 = new kl((14 & 2) != 0 ? klVar.b : i5, (14 & 4) != 0 ? klVar.c : i5, (14 & i6) != 0 ? klVar.a : p16Var.a((p16) klVar.a), klVar.d);
            while (true) {
                i3 = klVar2.b;
                if (i8 >= i3 || ovVar.isEmpty()) {
                    break;
                }
                kl klVar3 = (kl) ovVar.last();
                int i9 = klVar3.c;
                Object obj = klVar3.a;
                if (i3 < i9) {
                    arrayList2.add(new kl(i8, i3, obj));
                    i8 = i3;
                } else {
                    arrayList2.add(new kl(i8, i9, obj));
                    i8 = klVar3.c;
                    while (!ovVar.isEmpty() && i8 == ((kl) ovVar.last()).c) {
                        ovVar.removeLast();
                    }
                }
            }
            if (i8 < i3) {
                arrayList2.add(new kl(i8, i3, p16Var));
                i8 = i3;
            }
            kl klVar4 = (kl) ovVar.j();
            Object obj2 = klVar2.a;
            int i10 = klVar2.c;
            if (klVar4 != null) {
                int i11 = klVar4.c;
                list3 = listJ0;
                Object obj3 = klVar4.a;
                int i12 = klVar4.b;
                if (i12 == i3 && i11 == i10) {
                    ovVar.removeLast();
                    ovVar.addLast(new kl(i3, i10, ((p16) obj3).a((p16) obj2)));
                    i4 = size;
                } else if (i12 == i11) {
                    i4 = size;
                    arrayList2.add(new kl(i12, i11, obj3));
                    ovVar.removeLast();
                    ovVar.addLast(new kl(i3, i10, obj2));
                } else {
                    i4 = size;
                    if (i11 >= i10) {
                        ovVar.addLast(new kl(i3, i10, ((p16) obj3).a((p16) obj2)));
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else {
                list3 = listJ0;
                i4 = size;
                ovVar.addLast(new kl(i3, i10, obj2));
            }
            i7++;
            listJ0 = list3;
            size = i4;
            i5 = 0;
            i6 = 1;
        }
        while (i8 <= str2.length() && !ovVar.isEmpty()) {
            kl klVar5 = (kl) ovVar.last();
            Object obj4 = klVar5.a;
            int i13 = klVar5.c;
            arrayList2.add(new kl(i8, i13, obj4));
            while (!ovVar.isEmpty() && i13 == ((kl) ovVar.last()).c) {
                ovVar.removeLast();
            }
            i8 = i13;
        }
        if (i8 < str2.length()) {
            arrayList2.add(new kl(i8, str2.length(), p16Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new kl(0, 0, p16Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i14 = i;
        while (i14 < size2) {
            kl klVar6 = (kl) arrayList2.get(i14);
            int i15 = klVar6.b;
            int i16 = klVar6.c;
            if (i15 != i16) {
                strSubstring = str2.substring(i15, i16);
                js3.o(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listA = ml.a(llVar2, i15, i16, new k7(3));
            ll llVar4 = new ll(strSubstring, listA == null ? EmptyList.a : listA);
            p16 p16Var2 = (p16) klVar6.a;
            if (p16Var2.b == 0) {
                i2 = size2;
                str = str2;
                p16Var2 = new p16(p16Var2.a, p16Var.b, p16Var2.c, p16Var2.d, p16Var2.e, p16Var2.f, p16Var2.g, p16Var2.h, p16Var2.i);
            } else {
                i2 = size2;
                str = str2;
            }
            gj8 gj8Var3 = new gj8(gj8Var2.a, p16Var.a(p16Var2));
            List list4 = llVar4.a;
            List list5 = list4 == null ? EmptyList.a : list4;
            List list6 = (List) this.c;
            ArrayList arrayList4 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                kl klVar7 = (kl) list6.get(i17);
                int i18 = klVar7.b;
                p16 p16Var3 = p16Var;
                int i19 = klVar7.c;
                if (ml.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        sn3.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list6;
                    arrayList4.add(new kl(i18 - i15, i19 - i15, klVar7.a));
                } else {
                    list2 = list6;
                }
                i17++;
                list6 = list2;
                p16Var = p16Var3;
            }
            arrayList3.add(new m16(new ch(strSubstring, gj8Var3, list5, arrayList4, oh2Var, qj1Var), i15, i16));
            i14++;
            llVar2 = llVar;
            gj8Var2 = gj8Var;
            str2 = str;
            size2 = i2;
        }
        this.e = arrayList3;
    }

    public rb4(ij5 ij5Var) {
        Intent launchIntentForPackage;
        this.a = 13;
        js3.p(ij5Var, "navController");
        Context context = ij5Var.a;
        this.b = context;
        this.c = new jc0(context);
        oc2 oc2Var = new oc2(mo7.v(mo7.s(new i25(19), context), new i25(20)));
        Activity activity2 = (Activity) (!oc2Var.hasNext() ? null : oc2Var.next());
        if (activity2 != null) {
            launchIntentForPackage = new Intent(context, activity2.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.d = launchIntentForPackage;
        this.e = new ArrayList();
        this.f = ij5Var.b.g();
    }

    public rb4(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 18;
        this.e = new ArrayDeque();
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.d = ",";
        this.f = scheduledThreadPoolExecutor;
    }

    public rb4(Context context) {
        this.a = 0;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.b = context;
        this.f = new hd(this, context.getMainLooper(), 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rb4(es0 es0Var) {
        this.a = 3;
        this.b = (ViewGroup) es0Var;
        View view = (View) es0Var;
        this.c = (ViewGroup) view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(0);
    }

    public rb4(oy0 oy0Var) {
        this.a = 4;
        this.e = kotlin.collections.a.Q0(oy0Var.a);
        this.b = kotlin.collections.a.Q0(oy0Var.b);
        this.c = kotlin.collections.a.Q0(oy0Var.c);
        List list = (List) oy0Var.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new x2(15, (Pair) it.next()));
        }
        this.d = arrayList;
        List list2 = (List) oy0Var.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ny0((ac1) it2.next(), 0));
        }
        this.f = arrayList2;
    }

    public rb4(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.a = 10;
        this.f = mediaBrowserServiceCompat;
        this.a = 10;
        this.d = mediaBrowserServiceCompat;
        this.e = new ArrayList();
    }

    public rb4(androidx.media.MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.a = 11;
        this.f = mediaBrowserServiceCompat;
        this.a = 11;
        this.d = mediaBrowserServiceCompat;
        this.e = new ArrayList();
    }

    public rb4(gf8 gf8Var) {
        this.a = 7;
        js3.p(gf8Var, "taskRunner");
        this.b = gf8Var;
        this.e = xd3.a;
        this.f = af2.a;
    }
}
