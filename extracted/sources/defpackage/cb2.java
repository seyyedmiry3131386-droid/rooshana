package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.f;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cb2 {
    public static final /* synthetic */ int c = 0;
    public final oz7 a = oz7.f();
    public boolean b;

    static {
        new cb2(0);
    }

    public cb2() {
    }

    public static void b(e eVar, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.d) {
            eVar.s0(i, 3);
            ((a) obj).b(eVar);
            eVar.s0(i, 4);
        }
        eVar.s0(i, wireFormat$FieldType.b);
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                eVar.m0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                eVar.k0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                eVar.w0(((Long) obj).longValue());
                break;
            case 3:
                eVar.w0(((Long) obj).longValue());
                break;
            case 4:
                eVar.o0(((Integer) obj).intValue());
                break;
            case 5:
                eVar.m0(((Long) obj).longValue());
                break;
            case 6:
                eVar.k0(((Integer) obj).intValue());
                break;
            case 7:
                eVar.e0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    eVar.r0((String) obj);
                } else {
                    eVar.i0((ByteString) obj);
                }
                break;
            case 9:
                ((a) obj).b(eVar);
                break;
            case 10:
                a aVar = (a) obj;
                eVar.getClass();
                eVar.u0(((f) aVar).a(null));
                aVar.b(eVar);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    eVar.u0(length);
                    eVar.f0(bArr, 0, length);
                } else {
                    eVar.i0((ByteString) obj);
                }
                break;
            case 12:
                eVar.u0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof mr3)) {
                    eVar.o0(((Integer) obj).intValue());
                } else {
                    eVar.o0(((mr3) obj).getNumber());
                }
                break;
            case 14:
                eVar.k0(((Integer) obj).intValue());
                break;
            case 15:
                eVar.m0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                eVar.u0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                eVar.w0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.b) {
            return;
        }
        oz7 oz7Var = this.a;
        int size = oz7Var.a.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entryC = oz7Var.c(i);
            if (entryC.getValue() instanceof f) {
                f fVar = (f) entryC.getValue();
                fVar.getClass();
                hn6 hn6Var = hn6.c;
                hn6Var.getClass();
                hn6Var.a(fVar.getClass()).b(fVar);
                fVar.h();
            }
        }
        if (!oz7Var.c) {
            if (oz7Var.a.size() > 0) {
                oz7Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = oz7Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!oz7Var.c) {
            oz7Var.b = oz7Var.b.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(oz7Var.b);
            oz7Var.e = oz7Var.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(oz7Var.e);
            oz7Var.c = true;
        }
        this.b = true;
    }

    public final Object clone() {
        cb2 cb2Var = new cb2();
        oz7 oz7Var = this.a;
        if (oz7Var.a.size() > 0) {
            Map.Entry entryC = oz7Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = oz7Var.d().iterator();
        if (!it.hasNext()) {
            return cb2Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cb2) {
            return this.a.equals(((cb2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public cb2(int i) {
        a();
        a();
    }
}
