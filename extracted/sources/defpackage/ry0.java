package defpackage;

import android.content.ContentResolver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.bumptech.glide.load.engine.b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import com.google.firebase.concurrent.UiExecutor;
import io.sentry.android.core.t0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ry0 implements hy0, cb8 {
    public static final py0 h = new py0(0);
    public static final byte[] i = {0, 7, 8, 15};
    public static final byte[] j = {0, 119, -120, -1};
    public static final byte[] k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public ry0() {
        this.d = new AtomicBoolean();
        this.a = null;
        this.b = new HashMap(16, 1.0f);
        this.c = new HashMap(16, 1.0f);
        this.e = new HashMap(16, 1.0f);
        this.f = new HashMap(16, 1.0f);
        this.g = null;
    }

    public static byte[] a(int i2, int i3, ao0 ao0Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ao0Var.i(i3);
        }
        return bArr;
    }

    public static int[] h() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = j(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = j(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] i() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = j(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = j(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = j(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = j(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = j(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int j(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.k(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static ux1 l(ao0 ao0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 8;
        int i9 = ao0Var.i(8);
        ao0Var.t(8);
        int i10 = 2;
        int i11 = i2 - 2;
        int i12 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrH = h();
        int[] iArrI = i();
        while (i11 > 0) {
            int i13 = ao0Var.i(i8);
            int i14 = ao0Var.i(i8);
            int[] iArr2 = (i14 & 128) != 0 ? iArr : (i14 & 64) != 0 ? iArrH : iArrI;
            if ((i14 & 1) != 0) {
                i6 = ao0Var.i(i8);
                i7 = ao0Var.i(i8);
                i3 = ao0Var.i(i8);
                i5 = ao0Var.i(i8);
                i4 = i11 - 6;
            } else {
                int i15 = ao0Var.i(6) << i10;
                int i16 = ao0Var.i(4) << 4;
                i3 = ao0Var.i(4) << 4;
                i4 = i11 - 4;
                i5 = ao0Var.i(i10) << 6;
                i6 = i15;
                i7 = i16;
            }
            if (i6 == 0) {
                i7 = i12;
                i3 = i7;
                i5 = 255;
            }
            double d = i6;
            double d2 = i7 - 128;
            double d3 = i3 - 128;
            iArr2[i13] = j((byte) (255 - (i5 & 255)), j29.i((int) ((1.402d * d2) + d), 0, 255), j29.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), j29.i((int) ((d3 * 1.772d) + d), 0, 255));
            i11 = i4;
            i12 = 0;
            i9 = i9;
            iArrI = iArrI;
            i8 = 8;
            i10 = 2;
        }
        return new ux1(i9, iArr, iArrH, iArrI);
    }

    public static wx1 n(ao0 ao0Var) {
        byte[] bArr;
        int i2 = ao0Var.i(16);
        ao0Var.t(4);
        int i3 = ao0Var.i(2);
        boolean zH = ao0Var.h();
        ao0Var.t(1);
        byte[] bArr2 = j29.b;
        if (i3 != 1) {
            if (i3 == 0) {
                int i4 = ao0Var.i(16);
                int i5 = ao0Var.i(16);
                if (i4 > 0) {
                    bArr2 = new byte[i4];
                    ao0Var.l(i4, bArr2);
                }
                if (i5 > 0) {
                    bArr = new byte[i5];
                    ao0Var.l(i5, bArr);
                }
            }
            return new wx1(i2, zH, bArr2, bArr);
        }
        ao0Var.t(ao0Var.i(8) * 16);
        bArr = bArr2;
        return new wx1(i2, zH, bArr2, bArr);
    }

    @Override // defpackage.hy0
    public Set b(so6 so6Var) {
        qn6 qn6Var;
        synchronized (this) {
            qn6Var = (d44) ((HashMap) this.c).get(so6Var);
            if (qn6Var == null) {
                qn6Var = h;
            }
        }
        return (Set) qn6Var.get();
    }

    @Override // defpackage.hy0
    public qn6 c(Class cls) {
        return f(so6.a(cls));
    }

    @Override // defpackage.cb8
    public /* synthetic */ ta8 d(byte[] bArr, int i2, int i3) {
        return rm7.e(this, bArr, i3);
    }

    public void e(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            tx0 tx0Var = (tx0) entry.getKey();
            qn6 qn6Var = (qn6) entry.getValue();
            int i2 = tx0Var.d;
            if (i2 == 1 || (i2 == 2 && z)) {
                qn6Var.get();
            }
        }
        u32 u32Var = (u32) this.e;
        synchronized (u32Var) {
            try {
                arrayDeque = u32Var.b;
                if (arrayDeque != null) {
                    u32Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw bl4.o(it);
            }
        }
    }

    @Override // defpackage.hy0
    public synchronized qn6 f(so6 so6Var) {
        c26.p(so6Var, "Null interface requested.");
        return (qn6) ((HashMap) this.b).get(so6Var);
    }

    @Override // defpackage.hy0
    public Object g(so6 so6Var) {
        qn6 qn6VarF = f(so6Var);
        if (qn6VarF == null) {
            return null;
        }
        return qn6VarF.get();
    }

    @Override // defpackage.hy0
    public Object get(Class cls) {
        return g(so6.a(cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0276  */
    @Override // defpackage.cb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(byte[] r44, int r45, int r46, defpackage.bb8 r47, defpackage.n31 r48) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.m(byte[], int, int, bb8, n31):void");
    }

    public void o() {
        for (tx0 tx0Var : ((HashMap) this.a).keySet()) {
            for (vj1 vj1Var : tx0Var.c) {
                if (vj1Var.b == 2 && !((HashMap) this.c).containsKey(vj1Var.a)) {
                    HashMap map = (HashMap) this.c;
                    so6 so6Var = vj1Var.a;
                    Set set = Collections.EMPTY_SET;
                    d44 d44Var = new d44();
                    d44Var.b = null;
                    d44Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    d44Var.a.addAll(set);
                    map.put(so6Var, d44Var);
                } else if (((HashMap) this.b).containsKey(vj1Var.a)) {
                    continue;
                } else {
                    int i2 = vj1Var.b;
                    if (i2 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + tx0Var + ": " + vj1Var.a);
                    }
                    if (i2 != 2) {
                        HashMap map2 = (HashMap) this.b;
                        so6 so6Var2 = vj1Var.a;
                        y45 y45Var = rv5.c;
                        py0 py0Var = rv5.d;
                        rv5 rv5Var = new rv5();
                        rv5Var.a = y45Var;
                        rv5Var.b = py0Var;
                        map2.put(so6Var2, rv5Var);
                    }
                }
            }
        }
    }

    public ArrayList p(ArrayList arrayList) {
        HashMap map = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            tx0 tx0Var = (tx0) it.next();
            if (tx0Var.e == 0) {
                qn6 qn6Var = (qn6) ((HashMap) this.a).get(tx0Var);
                for (so6 so6Var : tx0Var.b) {
                    if (map.containsKey(so6Var)) {
                        arrayList2.add(new g7((rv5) ((qn6) map.get(so6Var)), qn6Var, 7));
                    } else {
                        map.put(so6Var, qn6Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList q() {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            tx0 tx0Var = (tx0) entry.getKey();
            if (tx0Var.e != 0) {
                qn6 qn6Var = (qn6) entry.getValue();
                for (so6 so6Var : tx0Var.b) {
                    if (!map2.containsKey(so6Var)) {
                        map2.put(so6Var, new HashSet());
                    }
                    ((Set) map2.get(so6Var)).add(qn6Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                d44 d44Var = (d44) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new g7(d44Var, (qn6) it.next(), 8));
                }
            } else {
                so6 so6Var2 = (so6) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                d44 d44Var2 = new d44();
                d44Var2.b = null;
                d44Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                d44Var2.a.addAll(set);
                map.put(so6Var2, d44Var2);
            }
        }
        return arrayList;
    }

    public void r(ContentResolver contentResolver) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
        if (((HashMap) this.a) == null) {
            atomicBoolean.set(false);
            this.a = new HashMap(16, 1.0f);
            this.g = new Object();
            contentResolver.registerContentObserver(du9.a, true, new q81(4, this));
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            ((HashMap) this.a).clear();
            ((HashMap) this.b).clear();
            ((HashMap) this.c).clear();
            ((HashMap) this.e).clear();
            ((HashMap) this.f).clear();
            this.g = new Object();
        }
    }

    @Override // defpackage.cb8
    public void reset() {
        ay1 ay1Var = (ay1) this.f;
        ay1Var.c.clear();
        ay1Var.d.clear();
        ay1Var.e.clear();
        ay1Var.f.clear();
        ay1Var.g.clear();
        ay1Var.h = null;
        ay1Var.i = null;
    }

    public ry0(av avVar, lf7 lf7Var, ps0 ps0Var, to6 to6Var, b26 b26Var) {
        js3.p(avVar, "logger");
        js3.p(lf7Var, "scope");
        this.a = avVar;
        this.b = lf7Var;
        this.c = ps0Var;
        this.d = to6Var;
        this.e = b26Var;
        this.f = "t:'" + ax3.a(ps0Var) + "' - q:'" + to6Var + '\'';
    }

    public ry0(ArrayList arrayList, ArrayList arrayList2, gv gvVar) {
        UiExecutor uiExecutor = UiExecutor.a;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        u32 u32Var = new u32();
        this.e = u32Var;
        this.g = gvVar;
        ArrayList<tx0> arrayList3 = new ArrayList();
        int i2 = 0;
        arrayList3.add(tx0.c(u32Var, u32.class, da8.class, vn6.class));
        arrayList3.add(tx0.c(this, ry0.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            tx0 tx0Var = (tx0) it.next();
            if (tx0Var != null) {
                arrayList3.add(tx0Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((qn6) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((gv) this.g).u(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    t0.n("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((tx0) it4.next()).b.toArray();
                int length = array.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        Object obj = array[i3];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.d).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.d).add(obj.toString());
                        }
                        i3++;
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                wu8.r(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                wu8.r(arrayList6);
            }
            for (tx0 tx0Var2 : arrayList3) {
                ((HashMap) this.a).put(tx0Var2, new d24(new qy0(this, tx0Var2, i2)));
            }
            arrayList5.addAll(p(arrayList3));
            arrayList5.addAll(q());
            o();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            e((HashMap) this.a, bool.booleanValue());
        }
    }

    public ry0(List list) {
        h26 h26Var = new h26((byte[]) list.get(0));
        int iD = h26Var.D();
        int iD2 = h26Var.D();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new vx1(719, 575, 0, 719, 0, 575);
        this.e = new ux1(0, new int[]{0, -1, -16777216, -8421505}, h(), i());
        this.f = new ay1(iD, iD2);
    }

    public ry0(it2 it2Var, it2 it2Var2, it2 it2Var3, it2 it2Var4, b bVar, b bVar2) {
        this.g = ml9.y(150, new r79(18, this));
        this.a = it2Var;
        this.b = it2Var2;
        this.c = it2Var3;
        this.d = it2Var4;
        this.e = bVar;
        this.f = bVar2;
    }
}
