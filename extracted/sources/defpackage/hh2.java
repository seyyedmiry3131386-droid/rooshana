package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import androidx.collection.c;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.common.collect.ImmutableList;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.js3;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.home.ui.recycler.HomeVideoData;
import ir.mservices.market.app.home.ui.recycler.d;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.PermissionReasonDialogFragment;
import ir.mservices.market.version2.webapi.requestdto.AuthorizeRequestDto;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.MyketVideoView;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.a;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public class hh2 implements hg5, gb8, u98, lv5, rm1 {
    public static WeakReference d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ hh2(char c, int i) {
        this.a = i;
    }

    public static void H(hh2 hh2Var) {
        LottieAnimationView lottieAnimationView;
        Toast toast;
        Toast toast2 = (Toast) hh2Var.b;
        if (toast2 == null) {
            return;
        }
        WeakReference weakReference = d;
        if (weakReference != null && (toast = (Toast) weakReference.get()) != null) {
            toast.cancel();
        }
        d = new WeakReference(toast2);
        toast2.show();
        pm8 pm8Var = (pm8) hh2Var.c;
        if (pm8Var == null || (lottieAnimationView = pm8Var.w) == null) {
            return;
        }
        lottieAnimationView.postDelayed(new u03(10, hh2Var), 500L);
    }

    public static void i(h hVar) {
        if (hVar.Q > 0) {
            hVar.i();
            hVar.P = false;
            zb5 zb5VarL = hVar.L();
            Object[] objArr = zb5VarL.a;
            int i = zb5VarL.c;
            for (int i2 = 0; i2 < i; i2++) {
                i((h) objArr[i2]);
            }
        }
    }

    public p14 A() {
        g gVar = (g) this.b;
        h hVar = (h) gVar.j.g(this.c);
        if (hVar != null) {
            return (p14) gVar.f.g(hVar);
        }
        return null;
    }

    public Object B(xf4 xf4Var) {
        return (jw7) this.c;
    }

    public Object C(float f, float f2, Object obj, Object obj2, float f3, float f4, float f5) {
        xf4 xf4Var = (xf4) this.b;
        xf4Var.a = f;
        xf4Var.b = f2;
        xf4Var.c = obj;
        xf4Var.d = obj2;
        xf4Var.e = f3;
        xf4Var.f = f4;
        xf4Var.g = f5;
        return B(xf4Var);
    }

    public void D() {
        try {
            lw.d(null, null, (WifiManager.WifiLock) this.b);
            lw.d(null, null, (PowerManager.WakeLock) this.c);
            lw.f(null, null, ((PowerManager.WakeLock) this.c).isHeld());
            lw.f(null, null, ((WifiManager.WifiLock) this.b).isHeld());
            ((PowerManager.WakeLock) this.c).release();
            this.c = null;
            ((WifiManager.WifiLock) this.b).release();
            this.b = null;
        } catch (Exception e) {
            e.printStackTrace();
            I();
            lw.g(e, "Exception in unlocking", null);
        }
    }

    public void E(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.b).send(messageObtain);
    }

    public void F(int i) {
        MyketTextView myketTextView;
        Context context;
        Resources resources;
        pm8 pm8Var = (pm8) this.c;
        if (pm8Var == null || (myketTextView = pm8Var.x) == null || (context = myketTextView.getContext()) == null || (resources = context.getResources()) == null) {
            return;
        }
        LottieAnimationView lottieAnimationView = pm8Var.w;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setAnimation(i);
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(pq6.space_12);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(pq6.space_m);
        int dimensionPixelSize3 = (dimensionPixelSize2 * 2) + resources.getDimensionPixelSize(pq6.toast_icon);
        if (myketTextView != null) {
            myketTextView.setPaddingRelative(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        }
    }

    public void G() {
        Toast toast = (Toast) this.b;
        if (toast != null) {
            toast.setDuration(1);
        }
    }

    public void I() {
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    ((PowerManager.WakeLock) this.c).release();
                }
            } catch (Exception unused) {
            }
            this.c = null;
        }
        WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.b;
        if (wifiLock != null) {
            try {
                if (wifiLock.isHeld()) {
                    ((WifiManager.WifiLock) this.b).release();
                }
            } catch (Exception unused2) {
            }
            this.b = null;
        }
    }

    public void J(lz4 lz4Var) {
        rb5 rb5Var = (rb5) this.b;
        Object objG = ((rb5) this.c).g(lz4Var);
        if (objG != null) {
            if (!(objG instanceof mb5)) {
                ba5.c(rb5Var, (jz4) objG, new z45(7, lz4Var));
                return;
            }
            c cVar = (c) objG;
            Object[] objArr = cVar.a;
            int i = cVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[i2];
                js3.n(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                ba5.c(rb5Var, (jz4) obj, new z45(7, lz4Var));
            }
        }
    }

    @Override // defpackage.lv5
    public List a(Integer num) {
        List listA = ((lv5) this.b).a(null);
        fz7 fz7Var = (fz7) this.c;
        int i = fz7Var.v;
        return i < 0 ? listA : a.z0(listA, wn5.c(fz7Var, num, i, Integer.valueOf(fz7Var.G(fz7Var.b, i))));
    }

    @Override // defpackage.u98
    public v98 apply() {
        g gVar = (g) this.b;
        p14 p14VarA = A();
        if (p14VarA != null) {
            gVar.d(p14VarA, false);
        }
        return gVar.f(this.c);
    }

    public void b(Context context) {
        try {
            lw.e((PowerManager.WakeLock) this.c);
            lw.e((WifiManager.WifiLock) this.b);
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "myket:MyketWakeLock");
            this.c = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire();
            WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock(1, "MyketWifiLock");
            this.b = wifiLockCreateWifiLock;
            wifiLockCreateWifiLock.acquire();
        } catch (Exception e) {
            e.printStackTrace();
            I();
            lw.g(e, "Exception in locking", null);
        }
    }

    @Override // defpackage.u98
    public boolean c() {
        w36 w36Var;
        p14 p14VarA = A();
        if (p14VarA == null || (w36Var = p14VarA.f) == null) {
            return true;
        }
        return w36Var.c();
    }

    @Override // defpackage.u98
    public void cancel() {
        p14 p14VarA = A();
        if ((p14VarA != null ? p14VarA.f : null) != null) {
            g.c((g) this.b, this.c);
        }
    }

    public void d(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(bl4.z(new StringBuilder(length + 1 + strValueOf.length()), str, SimpleComparison.EQUAL_TO_OPERATION, strValueOf));
    }

    @Override // defpackage.hg5
    public void e() {
        d dVar = (d) this.b;
        og5 og5Var = dVar.x;
        if (og5Var != null) {
            MyketVideoView myketVideoView = dVar.z().x;
            js3.o(myketVideoView, "videoView");
            og5Var.m(myketVideoView, dVar, (HomeVideoData) this.c);
        }
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 19:
                if (!(obj instanceof h16)) {
                    return false;
                }
                h16 h16Var = (h16) obj;
                Object obj2 = h16Var.a;
                String str = (String) this.b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = h16Var.b;
                String str2 = (String) this.c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.u98
    public boolean f(ur4 ur4Var) {
        p14 p14VarA = A();
        w36 w36Var = p14VarA != null ? p14VarA.f : null;
        if (w36Var == null || w36Var.c()) {
            return true;
        }
        g gVar = (g) this.b;
        c08 c08VarK = ql3.k();
        dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
        c08 c08VarM = ql3.m(c08VarK);
        try {
            h hVar = gVar.a;
            hVar.s = true;
            try {
                boolean zE = w36Var.e(ur4Var);
                hVar.s = false;
                return zE;
            } catch (Throwable th) {
                p14VarA.getClass();
                throw th;
            }
        } finally {
            ql3.u(c08VarK, c08VarM, dp2VarE);
        }
    }

    public void g() {
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.hg5
    public void h() {
        String id;
        f70 f70Var;
        VideoRowDto videoRowDto = ((HomeVideoData) this.c).a;
        if (videoRowDto == null || (id = videoRowDto.getId()) == null || (f70Var = ((d) this.b).y) == null) {
            return;
        }
        f70Var.g(id);
    }

    public int hashCode() {
        switch (this.a) {
            case 19:
                String str = (String) this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = (String) this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public void j(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.d dVar2 = ((androidx.fragment.app.g) this.b).z;
        if (dVar2 != null) {
            dVar2.J().p.j(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = ll2Var.a;
            }
        }
    }

    public void k(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        FragmentActivity fragmentActivity = gVar.x.t;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.k(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.a(gVar, dVar, fragmentActivity);
            }
        }
    }

    public void l(androidx.fragment.app.d dVar, Bundle bundle, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.l(dVar, bundle, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.b(gVar, dVar);
            }
        }
    }

    public void m(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.m(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.c(gVar, dVar);
            }
        }
    }

    public void n(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.n(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.d(gVar, dVar);
            }
        }
    }

    public void o(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.o(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.e(gVar, dVar);
            }
        }
    }

    @Override // defpackage.rm1
    public void onCancel() {
        ((PermissionReasonDialogFragment) this.c).N0(DialogResult.b, new Bundle());
    }

    @Override // defpackage.rm1
    public void onCommit() {
        String str = ((PermissionReason) this.b).e;
        if (!TextUtils.isEmpty(str)) {
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b(str);
            clickEventBuilder.a();
        }
        ((PermissionReasonDialogFragment) this.c).N0(DialogResult.a, new Bundle());
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        if (((String) this.b).equalsIgnoreCase(((AuthorizeRequestDto) obj).getHash())) {
            return;
        }
        ((LaunchContentActivity) this.c).M0.b("");
    }

    public void p(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        FragmentActivity fragmentActivity = gVar.x.t;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.p(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = ll2Var.a;
            }
        }
    }

    public void q(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.d dVar2 = ((androidx.fragment.app.g) this.b).z;
        if (dVar2 != null) {
            dVar2.J().p.q(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                FragmentManager$FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks = ll2Var.a;
            }
        }
    }

    public void r(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.r(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.f(gVar, dVar);
            }
        }
    }

    public void s(androidx.fragment.app.d dVar, Bundle bundle, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.s(dVar, bundle, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.g(gVar, dVar, bundle);
            }
        }
    }

    public void t(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.t(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.h(gVar, dVar);
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 6:
                return "ImageSize{width=" + ((r70) this.b) + ", height=" + ((r70) this.c) + '}';
            case 11:
                StringBuilder sbA = o40.A(128, "LoaderManager{");
                sbA.append(Integer.toHexString(System.identityHashCode(this)));
                sbA.append(" in ");
                Class<?> cls = ((g64) this.b).getClass();
                sbA.append(cls.getSimpleName());
                sbA.append("{");
                sbA.append(Integer.toHexString(System.identityHashCode(cls)));
                sbA.append("}}");
                return sbA.toString();
            case 19:
                StringBuilder sb = new StringBuilder("Pair{");
                sb.append(this.b);
                sb.append(" ");
                sb.append(this.c);
                sb.append("}");
                return sb.toString();
            case 23:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb2.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 29:
                String string = "[ ";
                if (((m18) this.b) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        StringBuilder sbC = bl4.C(string);
                        sbC.append(((m18) this.b).h[i2]);
                        sbC.append(" ");
                        string = sbC.toString();
                    }
                }
                StringBuilder sbE = bl4.E(string, "] ");
                sbE.append((m18) this.b);
                return sbE.toString();
            default:
                return super.toString();
        }
    }

    public void u(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.u(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.i(gVar, dVar);
            }
        }
    }

    public void v(androidx.fragment.app.d dVar, View view, Bundle bundle, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        js3.p(view, "v");
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.v(dVar, view, bundle, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.j(gVar, dVar, view);
            }
        }
    }

    public void w(androidx.fragment.app.d dVar, boolean z) {
        js3.p(dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME);
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.b;
        androidx.fragment.app.d dVar2 = gVar.z;
        if (dVar2 != null) {
            dVar2.J().p.w(dVar, true);
        }
        for (ll2 ll2Var : (CopyOnWriteArrayList) this.c) {
            if (!z || ll2Var.b) {
                ll2Var.a.k(gVar, dVar);
            }
        }
    }

    public void x(String str, PrintWriter printWriter) {
        va4 va4Var = (va4) this.c;
        if (va4Var.b.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < va4Var.b.f(); i++) {
                ta4 ta4Var = (ta4) va4Var.b.g(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(va4Var.b.d(i));
                printWriter.print(": ");
                printWriter.println(ta4Var.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(ta4Var.l);
                fj9 fj9Var = ta4Var.l;
                String str3 = str2 + "  ";
                fj9Var.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(fj9Var.a);
                if (fj9Var.b || fj9Var.e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(fj9Var.b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(fj9Var.e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (fj9Var.c || fj9Var.d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(fj9Var.c);
                    printWriter.print(" mReset=");
                    printWriter.println(fj9Var.d);
                }
                if (fj9Var.g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(fj9Var.g);
                    printWriter.print(" waiting=");
                    fj9Var.g.getClass();
                    printWriter.println(false);
                }
                if (fj9Var.h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(fj9Var.h);
                    printWriter.print(" waiting=");
                    fj9Var.h.getClass();
                    printWriter.println(false);
                }
                if (ta4Var.n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(ta4Var.n);
                    ua4 ua4Var = ta4Var.n;
                    ua4Var.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(ua4Var.b);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                fj9 fj9Var2 = ta4Var.l;
                Object obj = ta4Var.e;
                Object obj2 = obj != bb5.k ? obj : null;
                fj9Var2.getClass();
                StringBuilder sb = new StringBuilder(64);
                if (obj2 == null) {
                    sb.append(Ssh2PublicKeyAlgorithmName.NULL);
                } else {
                    Class<?> cls = obj2.getClass();
                    sb.append(cls.getSimpleName());
                    sb.append("{");
                    sb.append(Integer.toHexString(System.identityHashCode(cls)));
                    sb.append("}");
                }
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(ta4Var.c > 0);
            }
        }
    }

    public synchronized ArrayList y(Class cls) {
        return ((vp7) this.b).Q(cls);
    }

    public cl4 z() {
        return (cl4) ((s08) ((wb5) this.c)).getValue();
    }

    public /* synthetic */ hh2(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public hh2(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = 26;
        this.b = parcelFileDescriptor;
        this.c = null;
    }

    public /* synthetic */ hh2(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ hh2(Object obj) {
        this.a = 23;
        this.c = obj;
        this.b = new ArrayList();
    }

    public hh2(c75 c75Var, k65 k65Var) {
        this.a = 18;
        js3.p(c75Var, "movieService");
        js3.p(k65Var, "movieSearchHistoryDao");
        this.b = c75Var;
        this.c = k65Var;
    }

    public hh2(m54 m54Var, o5 o5Var) {
        this.a = 10;
        js3.p(m54Var, "levelService");
        js3.p(o5Var, "achievementService");
        this.b = m54Var;
        this.c = o5Var;
    }

    public hh2(Context context, CharSequence charSequence) {
        this.a = 20;
        if (context != null) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
            int i = pm8.y;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            pm8 pm8Var = (pm8) fa1.c(layoutInflaterFrom, js6.toast, null, false);
            ConstraintLayout constraintLayout = pm8Var.v;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(pq6.space_16);
            if (context instanceof LaunchContentActivity) {
                LaunchContentActivity launchContentActivity = (LaunchContentActivity) context;
                if (((NavigationBarView) launchContentActivity.w1.c).getVisibility() == 0) {
                    dimensionPixelSize += launchContentActivity.getResources().getDimensionPixelSize(pq6.bottom_navigation_height);
                }
            }
            constraintLayout.setPadding(0, 0, 0, dimensionPixelSize);
            MyketTextView myketTextView = pm8Var.x;
            myketTextView.setText(charSequence);
            ea7 ea7Var = new ea7(context);
            ea7Var.c(context.getResources().getDimensionPixelSize(pq6.round_drawable_default_border_radius));
            ea7Var.h = 0;
            ea7Var.m = 0;
            ea7Var.b = sj8.b().r;
            ea7Var.j = true;
            myketTextView.setBackground(ea7Var.a());
            myketTextView.setTextColor(sj8.b().s);
            LottieAnimationView lottieAnimationView = pm8Var.w;
            js3.o(lottieAnimationView, "icon");
            ir.mservices.market.core.ext.a.j(lottieAnimationView, sj8.b().s);
            this.c = pm8Var;
            Toast toast = new Toast(context);
            toast.setGravity(87, 0, 0);
            toast.setDuration(0);
            toast.setView(pm8Var.l);
            this.b = toast;
        }
    }

    public hh2(na6 na6Var, Context context) {
        this.a = 28;
        js3.p(na6Var, "detailService");
        this.b = na6Var;
        this.c = context;
    }

    public hh2(androidx.fragment.app.g gVar) {
        this.a = 2;
        this.b = gVar;
        this.c = new CopyOnWriteArrayList();
    }

    public hh2(wv8 wv8Var) {
        this.a = 16;
        vp7 vp7Var = new vp7(wv8Var);
        this.c = new nm5(29);
        this.b = vp7Var;
    }

    public hh2(h hVar, cl4 cl4Var) {
        this.a = 7;
        this.b = hVar;
        this.c = androidx.compose.runtime.g.h(cl4Var);
    }

    public hh2(int i, byte b) {
        this.a = i;
        switch (i) {
            case 17:
                this.b = new f49(0);
                this.c = new f49(0);
                break;
            case 22:
                this.b = new rb5();
                this.c = new rb5();
                break;
            case 24:
                this.b = new zb5(0, new h[16]);
                break;
            default:
                this.b = new xf4();
                this.c = null;
                break;
        }
    }

    public hh2(jw7 jw7Var) {
        this.a = 12;
        this.b = new xf4();
        this.c = jw7Var;
    }

    public hh2(fk6 fk6Var) {
        this.a = 29;
        this.c = fk6Var;
    }

    public hh2(g64 g64Var, u79 u79Var) {
        this.a = 11;
        this.b = g64Var;
        js3.p(u79Var, "store");
        j71 j71Var = j71.b;
        js3.p(j71Var, "defaultCreationExtras");
        o77 o77Var = new o77(u79Var, va4.d, j71Var);
        ps0 ps0VarA = g27.a(va4.class);
        String strB = ps0VarA.b();
        if (strB != null) {
            this.c = (va4) o77Var.u(ps0VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public hh2(int i) {
        this.a = 0;
        final Typeface typefaceB = b77.b(ApplicationLauncher.o.getApplicationContext(), i);
        if (typefaceB == null) {
            typefaceB = Typeface.DEFAULT;
            js3.o(typefaceB, "DEFAULT");
        }
        this.b = typefaceB;
        this.c = new TypefaceSpan(typefaceB) { // from class: ir.mservices.market.core.Font$CustomTypefaceSpan
            public final Typeface a;

            {
                super("");
                this.a = typefaceB;
            }

            public static void a(TextPaint textPaint, Typeface typeface) {
                Typeface typeface2 = textPaint.getTypeface();
                int style = typeface2 != null ? typeface2.getStyle() : 0;
                if (typeface != null) {
                    int i2 = style & (~typeface.getStyle());
                    if ((i2 & 1) != 0) {
                        textPaint.setFakeBoldText(true);
                    }
                    if ((i2 & 2) != 0) {
                        textPaint.setTextSkewX(-0.25f);
                    }
                    textPaint.setTypeface(typeface);
                }
            }

            @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                js3.p(textPaint, "textPaint");
                a(textPaint, this.a);
            }

            @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
            public final void updateMeasureState(TextPaint textPaint) {
                js3.p(textPaint, "paint");
                a(textPaint, this.a);
            }
        };
    }

    public hh2(ArrayList arrayList, ArrayList arrayList2) {
        this.a = 3;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public hh2(int i, int i2) {
        this.a = 3;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public hh2(int i, int i2, int i3) {
        this.a = 3;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public hh2(List list, int[] iArr) {
        this.a = 21;
        this.b = ImmutableList.n(list);
        this.c = iArr;
    }

    public hh2(go4 go4Var, Looper looper) {
        this.a = 15;
        this.c = go4Var;
        this.b = new Handler(looper, new p94(1, this));
    }
}
