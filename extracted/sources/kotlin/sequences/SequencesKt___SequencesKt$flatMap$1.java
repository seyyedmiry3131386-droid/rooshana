package kotlin.sequences;

import defpackage.dp2;
import defpackage.js3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$1 extends FunctionReferenceImpl implements dp2 {
    static {
        new SequencesKt___SequencesKt$flatMap$1();
    }

    public SequencesKt___SequencesKt$flatMap$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Iterable iterable = (Iterable) obj;
        js3.p(iterable, "p0");
        return iterable.iterator();
    }
}
