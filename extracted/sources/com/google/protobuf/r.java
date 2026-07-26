package com.google.protobuf;

import defpackage.bb2;
import defpackage.dv4;
import defpackage.ev4;
import defpackage.gf7;
import defpackage.h72;
import defpackage.hr2;
import defpackage.ir2;
import defpackage.j72;
import defpackage.lu0;
import defpackage.qm5;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements gf7 {
    public final ev4 a;
    public final v b;
    public final boolean c;
    public final j72 d;

    public r(v vVar, j72 j72Var, ev4 ev4Var) {
        this.b = vVar;
        j72Var.getClass();
        this.c = ev4Var instanceof GeneratedMessageLite$ExtendableMessage;
        this.d = j72Var;
        this.a = ev4Var;
    }

    @Override // defpackage.gf7
    public final void a(Object obj, Object obj2) {
        u.k(this.b, obj, obj2);
        if (this.c) {
            this.d.getClass();
            bb2 bb2Var = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (bb2Var.a.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().m(bb2Var);
        }
    }

    @Override // defpackage.gf7
    public final void b(Object obj) {
        ((x) this.b).getClass();
        w wVar = ((o) obj).unknownFields;
        if (wVar.e) {
            wVar.e = false;
        }
        this.d.getClass();
        ((GeneratedMessageLite$ExtendableMessage) obj).extensions.l();
    }

    @Override // defpackage.gf7
    public final boolean c(Object obj) {
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.i();
    }

    @Override // defpackage.gf7
    public final Object d() {
        ev4 ev4Var = this.a;
        return ev4Var instanceof o ? ((o) ev4Var).newMutableInstance() : ev4Var.newBuilderForType().buildPartial();
    }

    @Override // defpackage.gf7
    public final void e(Object obj, g gVar, h72 h72Var) {
        v vVar = this.b;
        w wVarA = vVar.a(obj);
        j72 j72Var = this.d;
        j72Var.getClass();
        bb2 bb2VarEnsureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (gVar.a() != Integer.MAX_VALUE) {
            try {
                g gVar2 = gVar;
                h72 h72Var2 = h72Var;
                if (!k(gVar2, h72Var2, j72Var, bb2VarEnsureExtensionsAreMutable, vVar, wVarA)) {
                    break;
                }
                gVar = gVar2;
                h72Var = h72Var2;
            } finally {
                ((o) obj).unknownFields = wVarA;
            }
        }
    }

    @Override // defpackage.gf7
    public final void f(Object obj, qm5 qm5Var) {
        this.d.getClass();
        Iterator itK = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.k();
        while (itK.hasNext()) {
            Map.Entry entry = (Map.Entry) itK.next();
            hr2 hr2Var = (hr2) entry.getKey();
            if (hr2Var.b.a != WireFormat$JavaType.MESSAGE || hr2Var.c || hr2Var.d) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            int i = hr2Var.a;
            Object value = entry.getValue();
            j jVar = (j) qm5Var.b;
            if (value instanceof ByteString) {
                jVar.v0(i, (ByteString) value);
            } else {
                jVar.u0(i, (ev4) value);
            }
        }
        ((x) this.b).getClass();
        w wVar = ((o) obj).unknownFields;
        wVar.getClass();
        qm5Var.getClass();
        for (int i2 = 0; i2 < wVar.a; i2++) {
            int i3 = wVar.b[i2] >>> 3;
            Object obj2 = wVar.c[i2];
            j jVar2 = (j) qm5Var.b;
            if (obj2 instanceof ByteString) {
                jVar2.v0(i3, (ByteString) obj2);
            } else {
                jVar2.u0(i3, (ev4) obj2);
            }
        }
    }

    @Override // defpackage.gf7
    public final int g(o oVar) {
        ((x) this.b).getClass();
        int iHashCode = oVar.unknownFields.hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) oVar).extensions.a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.gf7
    public final int h(o oVar) {
        ((x) this.b).getClass();
        w wVar = oVar.unknownFields;
        int i = wVar.d;
        if (i == -1) {
            int iE0 = 0;
            for (int i2 = 0; i2 < wVar.a; i2++) {
                int i3 = wVar.b[i2] >>> 3;
                ByteString byteString = (ByteString) wVar.c[i2];
                int iE02 = j.e0(i3) + j.d0(2) + (j.d0(1) * 2);
                int iD0 = j.d0(3);
                int size = byteString.size();
                iE0 += j.e0(size) + size + iD0 + iE02;
            }
            wVar.d = iE0;
            i = iE0;
        }
        if (!this.c) {
            return i;
        }
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) oVar).extensions.f() + i;
    }

    @Override // defpackage.gf7
    public final boolean i(o oVar, o oVar2) {
        x xVar = (x) this.b;
        xVar.getClass();
        w wVar = oVar.unknownFields;
        xVar.getClass();
        if (!wVar.equals(oVar2.unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) oVar).extensions.equals(((GeneratedMessageLite$ExtendableMessage) oVar2).extensions);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    @Override // defpackage.gf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.Object r17, byte[] r18, int r19, int r20, defpackage.nv r21) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r.j(java.lang.Object, byte[], int, int, nv):void");
    }

    public final boolean k(g gVar, h72 h72Var, j72 j72Var, bb2 bb2Var, v vVar, w wVar) throws InvalidProtocolBufferException {
        int i = gVar.b;
        ev4 ev4Var = this.a;
        if (i != 11) {
            if ((i & 7) != 2) {
                return gVar.y();
            }
            j72Var.getClass();
            ir2 ir2VarA = h72Var.a(i >>> 3, ev4Var);
            if (ir2VarA == null) {
                return vVar.b(wVar, gVar);
            }
            bb2Var.o(ir2VarA.d, gVar.o(ir2VarA.c.getClass(), h72Var));
            return true;
        }
        ir2 ir2VarA2 = null;
        ByteString byteStringE = null;
        int iG = 0;
        while (gVar.a() != Integer.MAX_VALUE) {
            int i2 = gVar.b;
            if (i2 == 16) {
                gVar.x(0);
                iG = gVar.a.G();
                j72Var.getClass();
                ir2VarA2 = h72Var.a(iG, ev4Var);
            } else if (i2 == 26) {
                if (ir2VarA2 != null) {
                    j72Var.getClass();
                    bb2Var.o(ir2VarA2.d, gVar.o(ir2VarA2.c.getClass(), h72Var));
                } else {
                    byteStringE = gVar.e();
                }
            } else if (!gVar.y()) {
                break;
            }
        }
        if (gVar.b != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (byteStringE != null) {
            if (ir2VarA2 != null) {
                j72Var.getClass();
                dv4 dv4VarNewBuilderForType = ir2VarA2.c.newBuilderForType();
                lu0 lu0VarP = byteStringE.p();
                dv4VarNewBuilderForType.mergeFrom(lu0VarP, h72Var);
                bb2Var.o(ir2VarA2.d, dv4VarNewBuilderForType.buildPartial());
                lu0VarP.a(0);
                return true;
            }
            ((x) vVar).getClass();
            wVar.f((iG << 3) | 2, byteStringE);
        }
        return true;
    }
}
