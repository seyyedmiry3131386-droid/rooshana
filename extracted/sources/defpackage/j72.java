package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.g;
import com.google.protobuf.j;
import com.google.protobuf.o;
import com.google.protobuf.u;
import com.google.protobuf.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j72 {
    public static Object a(Object obj, g gVar, ir2 ir2Var, h72 h72Var, bb2 bb2Var, Object obj2, v vVar) throws InvalidProtocolBufferException {
        Object objValueOf;
        Object obj3;
        List arrayList;
        hr2 hr2Var = ir2Var.d;
        ev4 ev4Var = ir2Var.c;
        int i = hr2Var.a;
        WireFormat$FieldType wireFormat$FieldType = hr2Var.b;
        if (hr2Var.c && hr2Var.d) {
            switch (wireFormat$FieldType.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    gVar.g(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    gVar.l(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    gVar.n(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    gVar.v(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    gVar.m(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    gVar.k(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    gVar.j(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    gVar.d(arrayList);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + hr2Var.b);
                case 12:
                    arrayList = new ArrayList();
                    gVar.u(arrayList);
                    break;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    gVar.h(arrayList2);
                    obj2 = u.j(obj, i, arrayList2, null, obj2, vVar);
                    arrayList = arrayList2;
                    break;
                case 14:
                    arrayList = new ArrayList();
                    gVar.p(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    gVar.q(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    gVar.r(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    gVar.s(arrayList);
                    break;
            }
            bb2Var.o(hr2Var, arrayList);
            return obj2;
        }
        if (wireFormat$FieldType == WireFormat$FieldType.f) {
            gVar.x(0);
            gVar.a.u();
            throw null;
        }
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                gVar.x(1);
                objValueOf = Double.valueOf(gVar.a.o());
                break;
            case 1:
                gVar.x(5);
                objValueOf = Float.valueOf(gVar.a.s());
                break;
            case 2:
                gVar.x(0);
                objValueOf = Long.valueOf(gVar.a.v());
                break;
            case 3:
                gVar.x(0);
                objValueOf = Long.valueOf(gVar.a.H());
                break;
            case 4:
                gVar.x(0);
                objValueOf = Integer.valueOf(gVar.a.u());
                break;
            case 5:
                gVar.x(1);
                objValueOf = Long.valueOf(gVar.a.r());
                break;
            case 6:
                gVar.x(5);
                objValueOf = Integer.valueOf(gVar.a.q());
                break;
            case 7:
                gVar.x(0);
                objValueOf = Boolean.valueOf(gVar.a.m());
                break;
            case 8:
                gVar.x(2);
                objValueOf = gVar.a.D();
                break;
            case 9:
                if (!hr2Var.c) {
                    Object obj4 = bb2Var.a.get(hr2Var);
                    if (obj4 instanceof o) {
                        gn6 gn6Var = gn6.c;
                        gn6Var.getClass();
                        gf7 gf7VarA = gn6Var.a(obj4.getClass());
                        if (!((o) obj4).isMutable()) {
                            Object objD = gf7VarA.d();
                            gf7VarA.a(objD, obj4);
                            bb2Var.o(hr2Var, objD);
                            obj4 = objD;
                        }
                        gVar.x(3);
                        gVar.b(obj4, gf7VarA, h72Var);
                        return obj2;
                    }
                }
                Class<?> cls = ev4Var.getClass();
                gVar.x(3);
                gf7 gf7VarA2 = gn6.c.a(cls);
                Object objD2 = gf7VarA2.d();
                gVar.b(objD2, gf7VarA2, h72Var);
                gf7VarA2.b(objD2);
                objValueOf = objD2;
                break;
            case 10:
                if (!hr2Var.c) {
                    Object obj5 = bb2Var.a.get(hr2Var);
                    if (obj5 instanceof o) {
                        gn6 gn6Var2 = gn6.c;
                        gn6Var2.getClass();
                        gf7 gf7VarA3 = gn6Var2.a(obj5.getClass());
                        if (!((o) obj5).isMutable()) {
                            Object objD3 = gf7VarA3.d();
                            gf7VarA3.a(objD3, obj5);
                            bb2Var.o(hr2Var, objD3);
                            obj5 = objD3;
                        }
                        gVar.x(2);
                        gVar.c(obj5, gf7VarA3, h72Var);
                        return obj2;
                    }
                }
                objValueOf = gVar.o(ev4Var.getClass(), h72Var);
                break;
            case 11:
                objValueOf = gVar.e();
                break;
            case 12:
                gVar.x(0);
                objValueOf = Integer.valueOf(gVar.a.G());
                break;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 14:
                gVar.x(5);
                objValueOf = Integer.valueOf(gVar.a.z());
                break;
            case 15:
                gVar.x(1);
                objValueOf = Long.valueOf(gVar.a.A());
                break;
            case 16:
                gVar.x(0);
                objValueOf = Integer.valueOf(gVar.a.B());
                break;
            case 17:
                gVar.x(0);
                objValueOf = Long.valueOf(gVar.a.C());
                break;
            default:
                objValueOf = null;
                break;
        }
        if (hr2Var.c) {
            bb2Var.a(hr2Var, objValueOf);
            return obj2;
        }
        int iOrdinal = hr2Var.b.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (obj3 = bb2Var.a.get(hr2Var)) != null) {
            objValueOf = ((ev4) obj3).toBuilder().mergeFrom((ev4) objValueOf).buildPartial();
        }
        bb2Var.o(hr2Var, objValueOf);
        return obj2;
    }

    public static void b(qm5 qm5Var, Map.Entry entry) {
        hr2 hr2Var = (hr2) entry.getKey();
        boolean z = hr2Var.c;
        WireFormat$FieldType wireFormat$FieldType = hr2Var.b;
        boolean z2 = hr2Var.d;
        int i = hr2Var.a;
        if (z) {
            switch (wireFormat$FieldType.ordinal()) {
                case 0:
                    u.o(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 1:
                    u.s(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 2:
                    u.v(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 3:
                    u.D(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 4:
                    u.u(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 5:
                    u.r(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 6:
                    u.q(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 7:
                    u.m(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 8:
                    u.B(i, (List) entry.getValue(), qm5Var);
                    break;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        u.t(i, (List) entry.getValue(), qm5Var, gn6.c.a(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        u.w(i, (List) entry.getValue(), qm5Var, gn6.c.a(list2.get(0).getClass()));
                        break;
                    }
                    break;
                case 11:
                    u.n(i, (List) entry.getValue(), qm5Var);
                    break;
                case 12:
                    u.C(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 13:
                    u.u(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 14:
                    u.x(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 15:
                    u.y(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 16:
                    u.z(i, (List) entry.getValue(), qm5Var, z2);
                    break;
                case 17:
                    u.A(i, (List) entry.getValue(), qm5Var, z2);
                    break;
            }
        }
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) entry.getValue()).doubleValue();
                j jVar = (j) qm5Var.b;
                jVar.getClass();
                jVar.o0(i, Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) entry.getValue()).floatValue();
                j jVar2 = (j) qm5Var.b;
                jVar2.getClass();
                jVar2.m0(i, Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                ((j) qm5Var.b).B0(i, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                ((j) qm5Var.b).B0(i, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((j) qm5Var.b).q0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                ((j) qm5Var.b).o0(i, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                ((j) qm5Var.b).m0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                ((j) qm5Var.b).i0(i, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                ((j) qm5Var.b).w0(i, (String) entry.getValue());
                break;
            case 9:
                qm5Var.v(i, entry.getValue(), gn6.c.a(entry.getValue().getClass()));
                break;
            case 10:
                Object value = entry.getValue();
                ((j) qm5Var.b).s0(i, (ev4) value, gn6.c.a(entry.getValue().getClass()));
                break;
            case 11:
                ((j) qm5Var.b).k0(i, (ByteString) entry.getValue());
                break;
            case 12:
                ((j) qm5Var.b).z0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((j) qm5Var.b).q0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                ((j) qm5Var.b).m0(i, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((j) qm5Var.b).o0(i, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) entry.getValue()).intValue();
                ((j) qm5Var.b).z0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) entry.getValue()).longValue();
                ((j) qm5Var.b).B0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }
}
