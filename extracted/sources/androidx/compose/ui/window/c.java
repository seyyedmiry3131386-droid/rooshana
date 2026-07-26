package androidx.compose.ui.window;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bl4;
import defpackage.cl4;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.es3;
import defpackage.tx8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c implements cl4 {
    public final /* synthetic */ PopupLayout a;
    public final /* synthetic */ LayoutDirection b;

    public c(PopupLayout popupLayout, LayoutDirection layoutDirection) {
        this.a = popupLayout;
        this.b = layoutDirection;
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int b(es3 es3Var, List list, int i) {
        return bl4.c(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final dl4 d(el4 el4Var, List list, long j) {
        this.a.setParentLayoutDirection(this.b);
        return el4Var.D(0, 0, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1$1
            @Override // defpackage.dp2
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return tx8.a;
            }
        });
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int e(es3 es3Var, List list, int i) {
        return bl4.e(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int g(es3 es3Var, List list, int i) {
        return bl4.b(this, es3Var, list, i);
    }

    @Override // defpackage.cl4
    public final /* synthetic */ int i(es3 es3Var, List list, int i) {
        return bl4.d(this, es3Var, list, i);
    }
}
