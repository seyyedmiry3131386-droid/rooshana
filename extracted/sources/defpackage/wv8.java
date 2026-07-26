package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.SortedSet;
import androidx.compose.ui.node.h;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.widget.b;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.startup.StartupException;
import com.google.android.datatransport.Priority;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.a;
import com.google.common.reflect.d;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.gson.reflect.TypeToken;
import io.sentry.android.core.t0;
import ir.mservices.market.app.home.data.AddaxBoxDto;
import ir.mservices.market.common.ui.recycler.AddaxBoxData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView;
import ir.mservices.market.version2.webapi.requestdto.UploadImageRequestDto;
import ir.mservices.market.version2.webapi.responsedto.AvatarDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class wv8 implements og5, c18, w67, b72, bi6 {
    public static volatile wv8 e;
    public static final Object f = new Object();
    public static final Object g = new Object();
    public static final ca4 h = new ca4(0, -9223372036854775807L, false);
    public static final ca4 i = new ca4(2, -9223372036854775807L, false);
    public static final ca4 j = new ca4(3, -9223372036854775807L, false);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ wv8(int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }

    public static Boolean Q(gb6 gb6Var, DoubleTapPlayerView doubleTapPlayerView, float f2) {
        js3.p(gb6Var, "player");
        js3.p(doubleTapPlayerView, "playerView");
        if (gb6Var.e() == 7 || gb6Var.e() == 0 || gb6Var.e() == 1) {
            kr1 kr1Var = doubleTapPlayerView.I;
            kr1Var.b.removeCallbacks(kr1Var.c);
            kr1Var.e = false;
            return null;
        }
        if (gb6Var.d0() > 500 && f2 < ((double) doubleTapPlayerView.getWidth()) * 0.35d) {
            return Boolean.FALSE;
        }
        if (gb6Var.d0() >= gb6Var.getDuration() || f2 <= ((double) doubleTapPlayerView.getWidth()) * 0.65d) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static ie1 q(cp4 cp4Var) {
        aj0 aj0Var = new aj0(2, (byte) 0);
        aj0Var.e = null;
        Uri uri = cp4Var.b;
        ry ryVar = new ry(uri == null ? null : uri.toString(), cp4Var.f, aj0Var);
        zx8 it = cp4Var.c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) ryVar.e)) {
                ((HashMap) ryVar.e).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = xj0.a;
        fv fvVar = new fv(12);
        UUID uuid2 = cp4Var.a;
        uuid2.getClass();
        boolean z = cp4Var.d;
        boolean z2 = cp4Var.e;
        int[] iArrG = a.g(cp4Var.g);
        for (int i2 : iArrG) {
            boolean z3 = true;
            if (i2 != 2 && i2 != 1) {
                z3 = false;
            }
            vy2.j(z3);
        }
        ie1 ie1Var = new ie1(uuid2, ryVar, map, z, (int[]) iArrG.clone(), z2, fvVar);
        byte[] bArr = cp4Var.h;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        vy2.s(ie1Var.l.isEmpty());
        ie1Var.u = bArrCopyOf;
        return ie1Var;
    }

    public static boolean r(Editable editable, KeyEvent keyEvent, boolean z) {
        mv8[] mv8VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (mv8VarArr = (mv8[]) editable.getSpans(selectionStart, selectionEnd, mv8.class)) != null && mv8VarArr.length > 0) {
                for (mv8 mv8Var : mv8VarArr) {
                    int spanStart = editable.getSpanStart(mv8Var);
                    int spanEnd = editable.getSpanEnd(mv8Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static wv8 y(Context context) {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new wv8(context);
                    }
                } finally {
                }
            }
        }
        return e;
    }

    public long A() {
        return ((vm0) this.d).a.d;
    }

    public boolean B() {
        zh3 zh3Var;
        IconCompat iconCompat;
        if (((hl5) this.d).d("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String strK = ((hl5) this.d).k("gcm.n.image");
        if (TextUtils.isEmpty(strK)) {
            zh3Var = null;
        } else {
            try {
                zh3Var = new zh3(new URL(strK));
            } catch (MalformedURLException unused) {
                t0.m("FirebaseMessaging", "Not downloading image, bad URL: " + strK);
                zh3Var = null;
            }
        }
        if (zh3Var != null) {
            ExecutorService executorService = (ExecutorService) this.b;
            cf8 cf8Var = new cf8();
            zh3Var.b = executorService.submit(new g7(zh3Var, cf8Var, 26));
            zh3Var.c = cf8Var.a;
        }
        qq4 qq4VarA = ax0.a((FirebaseMessagingService) this.c, (hl5) this.d);
        fp5 fp5Var = (fp5) qq4VarA.a;
        if (zh3Var != null) {
            try {
                ox9 ox9Var = zh3Var.c;
                rq4.n(ox9Var);
                Bitmap bitmap = (Bitmap) z67.b(ox9Var, 5L, TimeUnit.SECONDS);
                fp5Var.e(bitmap);
                cp5 cp5Var = new cp5(5, false);
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                }
                cp5Var.c = iconCompat;
                cp5Var.d = null;
                cp5Var.e = true;
                fp5Var.g(cp5Var);
            } catch (InterruptedException unused2) {
                t0.m("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                zh3Var.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                t0.m("FirebaseMessaging", "Failed to download image: " + e2.getCause());
            } catch (TimeoutException unused3) {
                t0.m("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                zh3Var.close();
            }
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify((String) qq4VarA.b, 0, ((fp5) qq4VarA.a).b());
        return true;
    }

    public boolean C(CharSequence charSequence, int i2, int i3, lv8 lv8Var) {
        if ((lv8Var.c & 3) == 0) {
            wz1 wz1Var = (wz1) this.d;
            nv4 nv4VarB = lv8Var.b();
            int iA = nv4VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) nv4VarB.d).getShort(iA + nv4VarB.a);
            }
            se1 se1Var = (se1) wz1Var;
            se1Var.getClass();
            ThreadLocal threadLocal = se1.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = se1Var.a;
            String string = sb.toString();
            int i4 = f16.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i5 = lv8Var.c & 4;
            lv8Var.c = zHasGlyph ? i5 | 2 : i5 | 1;
        }
        return (lv8Var.c & 3) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D(defpackage.xa1 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.rm6 r15) throws androidx.media3.exoplayer.source.UnrecognizedInputFormatException {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv8.D(xa1, android.net.Uri, java.util.Map, long, long, rm6):void");
    }

    public boolean E() {
        return ((qa4) this.c) != null;
    }

    public boolean F() {
        return !(((SortedSet) ((pt2) this.b).b).isEmpty() && ((SortedSet) ((pt2) this.d).b).isEmpty() && ((SortedSet) ((pt2) this.c).b).isEmpty());
    }

    public boolean G(int i2, fa0 fa0Var, f31 f31Var) {
        ea0 ea0Var = (ea0) this.c;
        ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = f31Var.U;
        int[] iArr = f31Var.t;
        ea0Var.a = constraintWidget$DimensionBehaviourArr[0];
        ea0Var.b = constraintWidget$DimensionBehaviourArr[1];
        ea0Var.c = f31Var.r();
        ea0Var.d = f31Var.l();
        ea0Var.i = false;
        ea0Var.j = i2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ea0Var.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.c;
        boolean z = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2;
        boolean z2 = ea0Var.b == constraintWidget$DimensionBehaviour2;
        boolean z3 = z && f31Var.Y > 0.0f;
        boolean z4 = z2 && f31Var.Y > 0.0f;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.a;
        if (z3 && iArr[0] == 4) {
            ea0Var.a = constraintWidget$DimensionBehaviour3;
        }
        if (z4 && iArr[1] == 4) {
            ea0Var.b = constraintWidget$DimensionBehaviour3;
        }
        ((b) fa0Var).b(f31Var, ea0Var);
        f31Var.P(ea0Var.e);
        f31Var.M(ea0Var.f);
        f31Var.E = ea0Var.h;
        f31Var.J(ea0Var.g);
        ea0Var.j = 0;
        return ea0Var.i;
    }

    @Override // defpackage.og5
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m(View view, rc rcVar, AddaxBoxData addaxBoxData) {
        FragmentActivity fragmentActivity = (FragmentActivity) this.b;
        js3.p(view, "view");
        js3.p(rcVar, "viewHolder");
        js3.p(addaxBoxData, "recyclerData");
        AddaxBoxDto addaxBoxDto = addaxBoxData.a;
        if ("NOTIFICATION".equalsIgnoreCase(addaxBoxDto.getType())) {
            d56 d56Var = (d56) this.d;
            if (d56Var != null) {
                d56Var.h(fragmentActivity, (t7) this.c, 9898);
                return;
            } else {
                js3.V("permissionHelper");
                throw null;
            }
        }
        if ("INTENT".equalsIgnoreCase(addaxBoxDto.getType())) {
            String actionIntent = addaxBoxDto.getActionIntent();
            if (actionIntent != null) {
                t61.w(actionIntent, "parse(...)", fragmentActivity, null, null);
                return;
            }
            return;
        }
        if ("LOW_STORAGE".equalsIgnoreCase(addaxBoxDto.getType())) {
            try {
                d56 d56Var2 = (d56) this.d;
                if (d56Var2 != null) {
                    d56Var2.e(fragmentActivity, 4);
                } else {
                    js3.V("permissionHelper");
                    throw null;
                }
            } catch (Exception unused) {
                Intent intent = new Intent("android.settings.SETTINGS");
                if (gu9.v(fragmentActivity, intent) != null) {
                    fragmentActivity.startActivity(intent);
                } else {
                    hh2.H(new hh2(fragmentActivity, fragmentActivity.getString(rs6.uncatchable_intent)));
                }
            }
        }
    }

    public Object I(CharSequence charSequence, int i2, int i3, int i4, boolean z, j02 j02Var) {
        int i5;
        char c;
        m02 m02Var = new m02((qv4) ((vp7) this.c).d);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean zG = true;
        int iCharCount = i2;
        loop0: while (true) {
            i5 = iCharCount;
            while (iCharCount < i3 && i6 < i4 && zG) {
                SparseArray sparseArray = m02Var.c.a;
                qv4 qv4Var = sparseArray == null ? null : (qv4) sparseArray.get(iCodePointAt);
                if (m02Var.a == 2) {
                    if (qv4Var != null) {
                        m02Var.c = qv4Var;
                        m02Var.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            m02Var.a();
                        } else if (iCodePointAt != 65039) {
                            qv4 qv4Var2 = m02Var.c;
                            if (qv4Var2.b != null) {
                                if (m02Var.f != 1) {
                                    m02Var.d = qv4Var2;
                                    m02Var.a();
                                } else if (m02Var.b()) {
                                    m02Var.d = m02Var.c;
                                    m02Var.a();
                                } else {
                                    m02Var.a();
                                }
                                c = 3;
                            } else {
                                m02Var.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (qv4Var == null) {
                    m02Var.a();
                    c = 1;
                } else {
                    m02Var.a = 2;
                    m02Var.c = qv4Var;
                    m02Var.f = 1;
                    c = 2;
                }
                m02Var.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !C(charSequence, i5, iCharCount, m02Var.d.b)) {
                        zG = j02Var.g(charSequence, i5, iCharCount, m02Var.d.b);
                        i6++;
                    }
                }
            }
            break loop0;
        }
        if (m02Var.a == 2 && m02Var.c.b != null && ((m02Var.f > 1 || m02Var.b()) && i6 < i4 && zG && (z || !C(charSequence, i5, iCharCount, m02Var.c.b)))) {
            j02Var.g(charSequence, i5, iCharCount, m02Var.c.b);
        }
        return j02Var.a();
    }

    public void J(String str, Bitmap bitmap) {
        synchronized (g) {
            ((yf4) ((Map) this.d).get(str)).f = bitmap;
        }
    }

    public void K(sa4 sa4Var) {
        k37 k37Var = (k37) this.b;
        qa4 qa4Var = (qa4) this.c;
        if (qa4Var != null) {
            qa4Var.a(true);
        }
        if (sa4Var != null) {
            k37Var.execute(new q6(23, sa4Var));
        }
        k37Var.b.accept(k37Var.a);
    }

    public void L(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.c = str;
    }

    public void M(tm0 tm0Var) {
        ((vm0) this.d).a.c = tm0Var;
    }

    public void N(qj1 qj1Var) {
        ((vm0) this.d).a.a = qj1Var;
    }

    public void O(LayoutDirection layoutDirection) {
        ((vm0) this.d).a.b = layoutDirection;
    }

    public void P(long j2) {
        ((vm0) this.d).a.d = j2;
    }

    public void R(g31 g31Var, int i2, int i3, int i4) {
        g31Var.getClass();
        int i5 = g31Var.d0;
        int i6 = g31Var.e0;
        g31Var.d0 = 0;
        g31Var.e0 = 0;
        g31Var.P(i3);
        g31Var.M(i4);
        if (i5 < 0) {
            g31Var.d0 = 0;
        } else {
            g31Var.d0 = i5;
        }
        if (i6 < 0) {
            g31Var.e0 = 0;
        } else {
            g31Var.e0 = i6;
        }
        g31 g31Var2 = (g31) this.d;
        g31Var2.x0 = i2;
        g31Var2.V();
    }

    public void S(ra4 ra4Var, pa4 pa4Var, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        vy2.t(looperMyLooper);
        this.d = null;
        qa4 qa4Var = new qa4(this, looperMyLooper, ra4Var, pa4Var, i2, SystemClock.elapsedRealtime());
        vy2.s(((qa4) this.c) == null);
        this.c = qa4Var;
        qa4Var.b();
    }

    public void T(g31 g31Var) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = g31Var.u0.size();
        for (int i2 = 0; i2 < size; i2++) {
            f31 f31Var = (f31) g31Var.u0.get(i2);
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = f31Var.U;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ConstraintWidget$DimensionBehaviour.c;
            if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviourArr[1] == constraintWidget$DimensionBehaviour2) {
                arrayList.add(f31Var);
            }
        }
        g31Var.w0.b = true;
    }

    public Object U(String str, Object obj, SuspendLambda suspendLambda) {
        byte[] bArrA;
        ((g76) this.c).getClass();
        try {
            bArrA = g76.a(str);
        } catch (Exception unused) {
            bArrA = null;
        }
        if (bArrA == null) {
            return new h99(new ErrorDTO(-1, "Convert file to byte array failed", ((Context) this.d).getString(rs6.image_failed)));
        }
        wc5 wc5Var = (wc5) this.b;
        wc5Var.getClass();
        LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair("Connection", "keep-alive"), new Pair("Content-Type", "multipart/form-data"));
        linkedHashMapO.put("uploaded_file", str);
        UploadImageRequestDto uploadImageRequestDto = new UploadImageRequestDto(bArrA);
        z57 z57VarCreateRequestUrl = wc5Var.createRequestUrl("social", "v1/profiles/own/info/Avatar", null, wc5Var.getCommonQueryParam());
        Type type = new TypeToken<AvatarDto>() { // from class: ir.mservices.market.myAccount.services.MyAccountService$uploadAvatar$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        Map<String, String> headers = wc5Var.getHeaders(linkedHashMapO);
        js3.o(headers, "getHeaders(...)");
        return dy3.H(wc5Var, type, z57VarCreateRequestUrl, uploadImageRequestDto, obj, headers, suspendLambda);
    }

    @Override // defpackage.b72
    public int a() {
        int i2 = ((ExtendedFloatingActionButton) this.d).z0;
        return i2 == -1 ? ((qq4) this.b).a() : (i2 == 0 || i2 == -2) ? ((ExtendedFloatingActionButton) ((ql4) this.c).b).getMeasuredHeight() : i2;
    }

    @Override // defpackage.b72
    public int b() {
        int i2 = ((ExtendedFloatingActionButton) this.d).y0;
        return i2 == -1 ? ((qq4) this.b).b() : (i2 == 0 || i2 == -2) ? ((ql4) this.c).b() : i2;
    }

    @Override // defpackage.c18
    public t18 c() {
        return (tv6) this.c;
    }

    @Override // defpackage.bi6
    public boolean d(Object obj) {
        if (obj instanceof g82) {
            ((g82) obj).b().a = true;
        }
        ((h82) this.c).m(obj);
        return ((di6) this.d).d(obj);
    }

    @Override // defpackage.bi6
    public Object e() {
        Object objE = ((di6) this.d).e();
        if (objE == null) {
            objE = ((f82) this.b).g();
            if (Log.isLoggable("FactoryPools", 2)) {
                objE.getClass().toString();
            }
        }
        if (objE instanceof g82) {
            ((g82) objE).b().a = false;
        }
        return objE;
    }

    public boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                GenericDeclaration genericDeclaration = (GenericDeclaration) this.b;
                String str = (String) this.c;
                if (vv8.a) {
                    if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof xv8)) {
                        wv8 wv8Var = ((xv8) Proxy.getInvocationHandler(obj)).a;
                        if (str.equals((String) wv8Var.c) && genericDeclaration.equals((GenericDeclaration) wv8Var.b) && ((ImmutableList) this.d).equals((ImmutableList) wv8Var.d)) {
                            return true;
                        }
                    }
                } else if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (str.equals(typeVariable.getName()) && genericDeclaration.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // defpackage.w67
    public g67 f(g67 g67Var, sv5 sv5Var) {
        Drawable drawable = (Drawable) g67Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((dc0) this.c).f(qc0.b((pc0) this.b, ((BitmapDrawable) drawable).getBitmap()), sv5Var);
        }
        if (drawable instanceof ns2) {
            return ((gv) this.d).f(g67Var, sv5Var);
        }
        return null;
    }

    public void g(h hVar, Invalidation invalidation) {
        pt2 pt2Var = (pt2) this.b;
        pt2 pt2Var2 = (pt2) this.c;
        pt2 pt2Var3 = (pt2) this.d;
        int iOrdinal = invalidation.ordinal();
        if (iOrdinal == 0) {
            pt2Var.r(hVar);
            pt2Var3.r(hVar);
            return;
        }
        if (iOrdinal == 1) {
            pt2Var2.r(hVar);
            pt2Var3.r(hVar);
            return;
        }
        if (iOrdinal == 2) {
            if (hVar.j != null) {
                pt2Var3.r(hVar);
                return;
            } else {
                pt2Var.r(hVar);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (hVar.j != null) {
            pt2Var3.r(hVar);
        } else {
            pt2Var2.r(hVar);
        }
    }

    @Override // defpackage.b72
    public int h() {
        return ((ExtendedFloatingActionButton) this.d).S;
    }

    public int hashCode() {
        switch (this.a) {
            case 0:
                return ((GenericDeclaration) this.b).hashCode() ^ ((String) this.c).hashCode();
            default:
                return super.hashCode();
        }
    }

    public void i(ps0 ps0Var, dp2 dp2Var, Map map, androidx.compose.runtime.internal.a aVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (!linkedHashMap.containsKey(ps0Var)) {
            linkedHashMap.put(ps0Var, new l22(ps0Var, dp2Var, map, aVar));
            return;
        }
        throw new IllegalArgumentException(("An `entry` with the same `clazz` has already been added: " + ps0Var.d() + '.').toString());
    }

    @Override // defpackage.c18
    public by7 j() {
        return (sv6) this.d;
    }

    @Override // defpackage.b72
    public ViewGroup.LayoutParams k() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.d;
        int i2 = extendedFloatingActionButton.y0;
        if (i2 == 0) {
            i2 = -2;
        }
        int i3 = extendedFloatingActionButton.z0;
        return new ViewGroup.LayoutParams(i2, i3 != 0 ? i3 : -2);
    }

    public d30 l() {
        String strConcat = ((String) this.c) == null ? " backendName" : "";
        if (((Priority) this.d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new d30((String) this.c, (byte[]) this.b, (Priority) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public void n() {
        qa4 qa4Var = (qa4) this.c;
        vy2.t(qa4Var);
        qa4Var.a(false);
    }

    public boolean o(h hVar) {
        return !(hVar.j == null) && (((SortedSet) ((pt2) this.b).b).contains(hVar) || ((SortedSet) ((pt2) this.c).b).contains(hVar));
    }

    @Override // defpackage.b72
    public int p() {
        return ((ExtendedFloatingActionButton) this.d).R;
    }

    public void s(Bundle bundle) {
        HashSet hashSet = (HashSet) this.c;
        String string = ((Context) this.d).getString(ct6.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (mn3.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    t((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public Object t(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.b;
        if (ia7.h()) {
            try {
                ia7.d(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                mn3 mn3Var = (mn3) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = mn3Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            t(cls2, hashSet);
                        }
                    }
                }
                objB = mn3Var.b((Context) this.d);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return (String) this.c;
            default:
                return super.toString();
        }
    }

    public vw1 u(jp4 jp4Var) {
        ie1 ie1Var;
        jp4Var.b.getClass();
        cp4 cp4Var = jp4Var.b.c;
        if (cp4Var == null) {
            return vw1.i0;
        }
        synchronized (this.b) {
            try {
                if (!cp4Var.equals((cp4) this.c)) {
                    this.c = cp4Var;
                    this.d = q(cp4Var);
                }
                ie1Var = (ie1) this.d;
                ie1Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ie1Var;
    }

    public tm0 v() {
        return ((vm0) this.d).a.c;
    }

    public long w() {
        oe1 oe1Var = (oe1) this.d;
        if (oe1Var != null) {
            return oe1Var.d;
        }
        return -1L;
    }

    public qj1 x() {
        return ((vm0) this.d).a.a;
    }

    public LayoutDirection z() {
        return ((vm0) this.d).a.b;
    }

    public /* synthetic */ wv8(int i2, boolean z) {
        this.a = i2;
    }

    public /* synthetic */ wv8(Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ wv8(Object obj, Object obj2, Object obj3, boolean z, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public wv8(wc5 wc5Var, g76 g76Var, Context context) {
        this.a = 6;
        js3.p(wc5Var, "myAccountService");
        js3.p(g76Var, "photoUtils");
        this.b = wc5Var;
        this.c = g76Var;
        this.d = context;
    }

    public wv8(FragmentActivity fragmentActivity, t7 t7Var) {
        this.a = 4;
        this.b = fragmentActivity;
        this.c = t7Var;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.d = (d56) w91Var.U.get();
    }

    public wv8(n72 n72Var, wt wtVar, rn6 rn6Var) {
        this.a = 28;
        js3.p(wtVar, "appUpdateRepository");
        this.b = n72Var;
        this.c = wtVar;
        this.d = rn6Var;
    }

    public wv8(Drawable.Callback callback, String str, Map map) {
        this.a = 2;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.c = str.concat("/");
        } else {
            this.c = str;
        }
        this.d = map;
        if (!(callback instanceof View)) {
            this.b = null;
        } else {
            this.b = ((View) callback).getContext().getApplicationContext();
        }
    }

    public wv8(vp7 vp7Var) {
        this.a = 9;
        this.b = vp7Var;
        this.c = rf0.j((zg1) vp7Var.d);
        this.d = rf0.i((yg1) vp7Var.e);
    }

    public wv8(int i2) {
        this.a = i2;
        switch (i2) {
            case 21:
                this.b = new pt2(18);
                this.c = new pt2(18);
                this.d = new pt2(18);
                break;
            default:
                this.b = new Object();
                break;
        }
    }

    public wv8(dp2 dp2Var) {
        this.a = 26;
        this.b = dp2Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public wv8(FirebaseMessagingService firebaseMessagingService, hl5 hl5Var, ExecutorService executorService) {
        this.a = 22;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = hl5Var;
    }

    public wv8(vm0 vm0Var) {
        this.a = 13;
        this.d = vm0Var;
        this.b = new nm5(10, this);
    }

    public wv8(Context context) {
        this.a = 1;
        this.d = context.getApplicationContext();
        this.c = new HashSet();
        this.b = new HashMap();
    }

    public wv8(g31 g31Var) {
        this.a = 8;
        this.b = new ArrayList();
        this.c = new ea0();
        this.d = g31Var;
    }

    public wv8(byte[] bArr, n94 n94Var) {
        this.a = 12;
        this.b = bArr;
        this.c = null;
        this.d = n94Var;
    }

    public wv8(Uri uri, n94 n94Var) {
        this.a = 12;
        this.b = null;
        this.c = uri;
        this.d = n94Var;
    }

    public wv8(vp7 vp7Var, cv cvVar, se1 se1Var, Set set) {
        this.a = 24;
        this.b = cvVar;
        this.c = vp7Var;
        this.d = se1Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            l02 l02Var = new l02();
            l02Var.a = str;
            I(str, 0, str.length(), 1, true, l02Var);
        }
    }

    public wv8(g00[] g00VarArr) {
        this.a = 19;
        dw7 dw7Var = new dw7();
        o18 o18Var = new o18();
        o18Var.c = 1.0f;
        o18Var.d = 1.0f;
        f00 f00Var = f00.e;
        o18Var.e = f00Var;
        o18Var.f = f00Var;
        o18Var.g = f00Var;
        o18Var.h = f00Var;
        ByteBuffer byteBuffer = g00.a;
        o18Var.k = byteBuffer;
        o18Var.l = byteBuffer.asShortBuffer();
        o18Var.m = byteBuffer;
        o18Var.b = -1;
        g00[] g00VarArr2 = new g00[g00VarArr.length + 2];
        this.b = g00VarArr2;
        System.arraycopy(g00VarArr, 0, g00VarArr2, 0, g00VarArr.length);
        this.c = dw7Var;
        this.d = o18Var;
        g00VarArr2[g00VarArr.length] = dw7Var;
        g00VarArr2[g00VarArr.length + 1] = o18Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wv8(String str) {
        this.a = 3;
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = j29.a;
        this(3, new k37(Executors.newSingleThreadExecutor(new v01(strConcat, 1)), new vj3(7)));
    }

    public wv8(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        this.a = 0;
        d.a(typeArr, "bound for type variable");
        genericDeclaration.getClass();
        this.b = genericDeclaration;
        str.getClass();
        this.c = str;
        this.d = ImmutableList.o(typeArr);
    }

    public wv8(URL url, h20 h20Var, String str) {
        this.a = 14;
        this.b = url;
        this.d = h20Var;
        this.c = str;
    }

    public wv8(com.bumptech.glide.load.engine.b bVar, com.bumptech.glide.request.a aVar, com.bumptech.glide.load.engine.d dVar) {
        this.a = 25;
        this.d = bVar;
        this.c = aVar;
        this.b = dVar;
    }
}
