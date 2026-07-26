package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.KeyEvent;
import android.view.View;
import androidx.media3.session.MediaSessionService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.sentry.SentryLevel;
import io.sentry.android.core.t0;
import io.sentry.u0;
import io.sentry.util.c;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class dc0 implements w67, d4, yr3, wm4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public /* synthetic */ dc0(char c, int i) {
        this.a = i;
    }

    public static void h(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = js3.r(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        t0.m("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            t0.n("SupportSQLite", "delete failed: ", e);
        }
    }

    @Override // defpackage.yr3
    public void a(char c) {
        j(this.b, 1);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.d4
    public boolean b(View view) {
        ((BottomSheetBehavior) this.c).O(this.b);
        return true;
    }

    @Override // defpackage.wm4
    public MediaCodecInfo c(int i) {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c)[i];
    }

    @Override // defpackage.yr3
    public void d(String str) {
        byte b;
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        j(this.b, str.length() + 2);
        char[] cArr = (char[]) this.c;
        int i = this.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = y78.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    j(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = y78.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) this.c)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = y78.a[cCharAt];
                            js3.m(str2);
                            j(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) this.c, i4);
                            int length3 = str2.length() + i4;
                            this.b = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) this.c;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            this.b = i4;
                        }
                    }
                }
                j(i4, 1);
                ((char[]) this.c)[i4] = '\"';
                this.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        this.b = i3 + 1;
    }

    @Override // defpackage.yr3
    public void e(String str) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        int length = str.length();
        if (length == 0) {
            return;
        }
        j(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    @Override // defpackage.w67
    public g67 f(g67 g67Var, sv5 sv5Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) g67Var.get()).compress((Bitmap.CompressFormat) this.c, this.b, byteArrayOutputStream);
        g67Var.a();
        return new vj0(byteArrayOutputStream.toByteArray());
    }

    public void g() {
        WeakReference weakReference;
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = ((LinkedHashMap) this.c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    jw6 jw6Var = (jw6) a.p0(arrayList);
                    if (((jw6Var == null || (weakReference = jw6Var.a) == null) ? null : (wh3) weakReference.get()) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((jw6) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // defpackage.wm4
    public boolean i(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public void j(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            js3.o(cArrCopyOf, "copyOf(...)");
            this.c = cArrCopyOf;
        }
    }

    public Intent k(jq4 jq4Var, int i) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(jq4Var.a.b);
        MediaSessionService mediaSessionService = (MediaSessionService) this.c;
        intent.setComponent(new ComponentName(mediaSessionService, mediaSessionService.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        return intent;
    }

    public boolean l() {
        return ((ex1) this.c) != null;
    }

    public void m(int i, ox oxVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            ox oxVar2 = ((ox[]) this.c)[i2];
            js3.m(oxVar2);
            if (js3.s(0L, oxVar.g - oxVar2.g) <= 0) {
                break;
            }
            oxVar2.f = i;
            ((ox[]) this.c)[i] = oxVar2;
            i = i2;
        }
        ((ox[]) this.c)[i] = oxVar;
        oxVar.f = i;
    }

    public HashMap n(Map map, u0 u0Var) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), u(u0Var, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    @Override // defpackage.wm4
    public boolean o(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // defpackage.wm4
    public int p() {
        if (((MediaCodecInfo[]) this.c) == null) {
            this.c = new MediaCodecList(this.b).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.c).length;
    }

    public void q(oo2 oo2Var, int i, int i2) {
        ((xj1) this.c).k(new androidx.sqlite.driver.a(oo2Var), i, i2);
    }

    public long r(oe1 oe1Var) {
        h26 h26Var = (h26) this.c;
        int i = 0;
        oe1Var.e(h26Var.a, 0, 1, false);
        int i2 = h26Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        oe1Var.e(h26Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (h26Var.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    @Override // defpackage.wm4
    public boolean s() {
        return true;
    }

    public void t(ox oxVar) {
        ox oxVar2;
        int i = oxVar.f;
        if (i == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = this.b;
        ox oxVar3 = ((ox[]) this.c)[i2];
        js3.m(oxVar3);
        oxVar.f = -1;
        ((ox[]) this.c)[i2] = null;
        this.b = i2 - 1;
        if (oxVar == oxVar3) {
            return;
        }
        int iS = js3.s(0L, oxVar3.g - oxVar.g);
        if (iS == 0) {
            ((ox[]) this.c)[i] = oxVar3;
            oxVar3.f = i;
            return;
        }
        if (iS >= 0) {
            m(i, oxVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                oxVar2 = ((ox[]) this.c)[i3];
                js3.m(oxVar2);
            } else {
                oxVar2 = ((ox[]) this.c)[i3];
                js3.m(oxVar2);
                ox oxVar4 = ((ox[]) this.c)[i4];
                js3.m(oxVar4);
                if (js3.s(0L, oxVar4.g - oxVar2.g) >= 0) {
                    oxVar2 = oxVar4;
                }
            }
            if (js3.s(0L, oxVar2.g - oxVar3.g) <= 0) {
                break;
            }
            int i6 = oxVar2.f;
            oxVar2.f = i;
            ((ox[]) this.c)[i] = oxVar2;
            i = i6;
        }
        ((ox[]) this.c)[i] = oxVar3;
        oxVar3.f = i;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public Object u(u0 u0Var, Object obj) {
        Object objV;
        HashSet hashSet = (HashSet) this.c;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = c.a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
                i++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return c.b((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (hashSet.contains(obj)) {
            u0Var.i(SentryLevel.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        hashSet.add(obj);
        try {
            if (hashSet.size() > this.b) {
                hashSet.remove(obj);
                u0Var.i(SentryLevel.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
                if (obj.getClass().isArray()) {
                    Object[] objArr = (Object[]) obj;
                    objV = new ArrayList();
                    int length2 = objArr.length;
                    while (i < length2) {
                        objV.add(u(u0Var, objArr[i]));
                        i++;
                    }
                } else if (obj instanceof Collection) {
                    objV = new ArrayList();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        objV.add(u(u0Var, it.next()));
                    }
                } else if (obj instanceof Map) {
                    objV = n((Map) obj, u0Var);
                } else {
                    objV = v(u0Var, obj);
                    if (objV.isEmpty()) {
                        objV = obj.toString();
                    }
                }
                hashSet.remove(obj);
                return objV;
            } catch (Exception e) {
                u0Var.f(SentryLevel.INFO, "Not serializing object due to throwing sub-path.", e);
                hashSet.remove(obj);
                return null;
            }
        } catch (Throwable th) {
            hashSet.remove(obj);
            throw th;
        }
    }

    public HashMap v(u0 u0Var, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, u(u0Var, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    u0Var.i(SentryLevel.INFO, o40.y("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    public void w(ht4 ht4Var, wh3 wh3Var, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object arrayList = linkedHashMap.get(ht4Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(ht4Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        jw6 jw6Var = new jw6(new WeakReference(wh3Var), map, j);
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                jw6 jw6Var2 = (jw6) arrayList2.get(i);
                if (j < jw6Var2.c) {
                    i++;
                } else if (jw6Var2.a.get() == wh3Var) {
                    arrayList2.set(i, jw6Var);
                } else {
                    arrayList2.add(i, jw6Var);
                }
            }
        } else {
            arrayList2.add(jw6Var);
        }
        g();
    }

    @Override // defpackage.yr3
    public void writeLong(long j) {
        e(String.valueOf(j));
    }

    public /* synthetic */ dc0(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public dc0(int i, byte b) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = 0;
                this.c = new StringBuilder();
                break;
            case 8:
                this.b = 255;
                this.c = null;
                break;
            case 11:
                this.c = new LinkedHashMap();
                break;
            case 13:
                this.c = new h26(8);
                break;
            default:
                this.c = Bitmap.CompressFormat.JPEG;
                this.b = 100;
                break;
        }
    }

    public dc0(MediaSessionService mediaSessionService) {
        this.a = 3;
        this.b = 0;
        this.c = mediaSessionService;
    }

    public dc0(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 15:
                this.c = new HashSet();
                this.b = i;
                break;
            default:
                this.b = i;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dc0(xj1 xj1Var, int i) {
        this(i, 12);
        this.a = 12;
        this.c = xj1Var;
    }

    public dc0(int i, Notification notification) {
        this.a = 7;
        this.b = i;
        notification.getClass();
        this.c = notification;
    }

    public dc0(boolean z, boolean z2, boolean z3) {
        this.a = 6;
        this.b = (z || z2 || z3) ? 1 : 0;
    }
}
