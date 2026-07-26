package defpackage;

import android.graphics.Paint;
import android.os.Bundle;
import androidx.compose.foundation.gestures.i;
import androidx.compose.foundation.gestures.o;
import androidx.compose.foundation.text.input.internal.a;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rg(c cVar, rr5 rr5Var, zh8 zh8Var, x44 x44Var, k18 k18Var) {
        this.a = 4;
        this.c = cVar;
        this.d = rr5Var;
        this.b = zh8Var;
        this.e = x44Var;
        this.f = k18Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        List listSubList;
        int i;
        int i2 = this.a;
        tx8 tx8Var = tx8.a;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i2) {
            case 0:
                y44 y44Var = (y44) obj;
                q44 q44Var = ((a) obj6).a;
                y44Var.h = (zh8) obj2;
                y44Var.i = (cj3) obj5;
                y44Var.c = (vt) obj4;
                y44Var.d = (dp2) obj3;
                y44Var.e = q44Var != null ? q44Var.p : null;
                y44Var.f = q44Var != null ? q44Var.q : null;
                y44Var.g = q44Var != null ? (v69) y97.t(q44Var, l.s) : null;
                break;
            case 1:
                break;
            case 2:
                i iVar = (i) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj6;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj5;
                o oVar = (o) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                iz4 iz4VarE = i.e(iVar.e);
                if (iz4VarE != null) {
                    iVar.f(iz4VarE);
                    iz4 iz4VarA = ((iz4) ref$ObjectRef.a).a(iz4VarE);
                    ref$ObjectRef.a = iz4VarA;
                    ref$FloatRef.a = oVar.i(oVar.e(iz4VarA.a));
                    ref$BooleanRef.a = !hz4.a(r3 - fFloatValue);
                }
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj6;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj5;
                ni5 ni5Var = (ni5) obj4;
                Bundle bundle = (Bundle) obj3;
                ei5 ei5Var = (ei5) obj;
                js3.p(ei5Var, "entry");
                ((Ref$BooleanRef) obj2).a = true;
                int iIndexOf = arrayList.indexOf(ei5Var);
                if (iIndexOf != -1) {
                    int i3 = iIndexOf + 1;
                    listSubList = arrayList.subList(ref$IntRef.a, i3);
                    ref$IntRef.a = i3;
                } else {
                    listSubList = EmptyList.a;
                }
                ni5Var.a(ei5Var.b, bundle, ei5Var, listSubList);
                break;
            default:
                rr5 rr5Var = (rr5) obj5;
                zh8 zh8Var = (zh8) obj2;
                x44 x44Var = (x44) obj4;
                k18 k18Var = (k18) obj3;
                androidx.compose.ui.node.i iVar2 = (androidx.compose.ui.node.i) obj;
                iVar2.a();
                vm0 vm0Var = iVar2.a;
                float fH = ((c) obj6).c.h();
                if (fH != 0.0f) {
                    long j = zh8Var.b;
                    int i4 = zi8.c;
                    int iQ = rr5Var.q((int) (j >> 32));
                    si8 si8VarD = x44Var.d();
                    sy6 sy6VarC = si8VarD != null ? si8VarD.a.c(iQ) : new sy6(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(iVar2.S(eh8.a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2;
                    float f2 = sy6VarC.a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (vm0Var.b.A() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sy6VarC.b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(sy6VarC.d)) & 4294967295L);
                    tm0 tm0Var = vm0Var.a.c;
                    jx9 jx9VarC = vm0Var.d;
                    if (jx9VarC == null) {
                        jx9VarC = dt2.c();
                        jx9VarC.x(1);
                        vm0Var.d = jx9VarC;
                    }
                    Paint paint = (Paint) jx9VarC.b;
                    k18Var.a(fH, vm0Var.b.A(), jx9VarC);
                    if (!js3.i((tc0) jx9VarC.d, null)) {
                        jx9VarC.q(null);
                    }
                    if (jx9VarC.a != 3) {
                        jx9VarC.o(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        jx9VarC.w(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (jx9VarC.i() == 0) {
                        i = 0;
                    } else {
                        i = 0;
                        jx9VarC.u(0);
                    }
                    if (jx9VarC.j() != 0) {
                        jx9VarC.v(i);
                    }
                    if (!paint.isFilterBitmap()) {
                        jx9VarC.r(1);
                    }
                    tm0Var.p(jFloatToRawIntBits, jFloatToRawIntBits2, jx9VarC);
                }
                break;
        }
        return tx8Var;
    }

    public /* synthetic */ rg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
