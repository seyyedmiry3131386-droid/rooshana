package androidx.compose.ui.node;

import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import defpackage.y40;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final dp2 a = null;
    public static final dp2 b = new dp2() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            final b bVar = (b) obj;
            if (bVar.n) {
                bVar.p.clear();
                p snapshotObserver = y40.I(bVar).getSnapshotObserver();
                snapshotObserver.a.d(bVar, c.b, new bp2() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                    {
                        super(0);
                    }

                    @Override // defpackage.bp2
                    public final Object invoke() {
                        js3.n(bVar.o, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                        throw new ClassCastException();
                    }
                });
            }
            return tx8.a;
        }
    };
}
