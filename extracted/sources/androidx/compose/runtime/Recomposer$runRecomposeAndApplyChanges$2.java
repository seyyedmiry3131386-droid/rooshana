package androidx.compose.runtime;

import defpackage.g51;
import defpackage.lz4;
import defpackage.qx4;
import defpackage.rp2;
import defpackage.sb5;
import defpackage.tb1;
import defpackage.tx8;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {598, 609}, m = "invokeSuspend", v = 1)
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements rp2 {
    public List a;
    public List b;
    public List c;
    public sb5 d;
    public sb5 e;
    public sb5 f;
    public Set g;
    public sb5 h;
    public int i;
    public /* synthetic */ qx4 j;
    public final /* synthetic */ k k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(k kVar, g51 g51Var) {
        super(3, g51Var);
        this.k = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(androidx.compose.runtime.k r22, java.util.List r23, java.util.List r24, java.util.List r25, defpackage.sb5 r26, defpackage.sb5 r27, defpackage.sb5 r28, defpackage.sb5 r29) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.l(androidx.compose.runtime.k, java.util.List, java.util.List, java.util.List, sb5, sb5, sb5, sb5):void");
    }

    public static final void o(List list, k kVar) {
        list.clear();
        synchronized (kVar.c) {
            try {
                ArrayList arrayList = kVar.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((lz4) arrayList.get(i));
                }
                kVar.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.k, (g51) obj3);
        recomposer$runRecomposeAndApplyChanges$2.j = (qx4) obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f1 -> B:24:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01ed -> B:12:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
