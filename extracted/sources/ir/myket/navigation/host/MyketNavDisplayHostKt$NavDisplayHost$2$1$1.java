package ir.myket.navigation.host;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.dl5;
import defpackage.dp2;
import defpackage.er;
import defpackage.hr;
import defpackage.js3;
import defpackage.kr;
import defpackage.tx8;
import kotlin.collections.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class MyketNavDisplayHostKt$NavDisplayHost$2$1$1 extends FunctionReferenceImpl implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        kr krVar = (kr) obj;
        js3.p(krVar, "p0");
        dl5 dl5Var = (dl5) this.receiver;
        dl5Var.getClass();
        SnapshotStateList snapshotStateList = dl5Var.a;
        if (js3.i(a.v0(snapshotStateList), hr.INSTANCE)) {
            snapshotStateList.add(krVar);
        } else {
            dl5Var.a(new er(krVar));
        }
        return tx8.a;
    }
}
