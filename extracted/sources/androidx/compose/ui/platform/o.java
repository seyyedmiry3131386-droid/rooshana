package androidx.compose.ui.platform;

import defpackage.dp2;
import defpackage.tx8;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final dp2 a = new dp2() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        @Override // defpackage.dp2
        public final /* synthetic */ Object invoke(Object obj) {
            if (obj == null) {
                return tx8.a;
            }
            throw new ClassCastException();
        }
    };
}
