package kotlin.sequences;

import defpackage.dp2;
import defpackage.ho7;
import defpackage.js3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2 extends FunctionReferenceImpl implements dp2 {
    static {
        new SequencesKt___SequencesKt$flatMapIndexed$2();
    }

    public SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, ho7.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ho7 ho7Var = (ho7) obj;
        js3.p(ho7Var, "p0");
        return ho7Var.iterator();
    }
}
