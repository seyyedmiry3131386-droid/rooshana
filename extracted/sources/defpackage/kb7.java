package defpackage;

import androidx.constraintlayout.core.widgets.analyzer.a;
import androidx.constraintlayout.core.widgets.analyzer.c;
import androidx.constraintlayout.core.widgets.analyzer.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kb7 {
    public f a;
    public ArrayList b;

    public static long a(a aVar, long j) {
        f fVar = aVar.d;
        ArrayList arrayList = aVar.k;
        if (fVar instanceof c) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            wj1 wj1Var = (wj1) arrayList.get(i);
            if (wj1Var instanceof a) {
                a aVar2 = (a) wj1Var;
                if (aVar2.d != fVar) {
                    jMin = Math.min(jMin, a(aVar2, ((long) aVar2.f) + j));
                }
            }
        }
        a aVar3 = fVar.i;
        a aVar4 = fVar.h;
        if (aVar != aVar3) {
            return jMin;
        }
        long j2 = j - fVar.j();
        return Math.min(Math.min(jMin, a(aVar4, j2)), j2 - ((long) aVar4.f));
    }

    public static long b(a aVar, long j) {
        f fVar = aVar.d;
        ArrayList arrayList = aVar.k;
        if (fVar instanceof c) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            wj1 wj1Var = (wj1) arrayList.get(i);
            if (wj1Var instanceof a) {
                a aVar2 = (a) wj1Var;
                if (aVar2.d != fVar) {
                    jMax = Math.max(jMax, b(aVar2, ((long) aVar2.f) + j));
                }
            }
        }
        a aVar3 = fVar.h;
        a aVar4 = fVar.i;
        if (aVar != aVar3) {
            return jMax;
        }
        long j2 = fVar.j() + j;
        return Math.max(Math.max(jMax, b(aVar4, j2)), j2 - ((long) aVar4.f));
    }
}
