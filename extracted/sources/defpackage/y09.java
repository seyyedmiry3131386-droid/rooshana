package defpackage;

import android.view.View;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class y09 extends e70 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y09(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, int i) {
        super(view, graphicUtils$Dimension, z);
        switch (i) {
            case 1:
                js3.p(graphicUtils$Dimension, "dimension");
                super(view, graphicUtils$Dimension, z);
                this.M = og5Var;
                break;
            case 2:
                js3.p(graphicUtils$Dimension, "dimension");
                super(view, graphicUtils$Dimension, z);
                this.M = og5Var;
                break;
            case 3:
                js3.p(graphicUtils$Dimension, "dimension");
                js3.p(og5Var, "onUserClickListener");
                super(view, graphicUtils$Dimension, z);
                this.L = og5Var;
                break;
            default:
                js3.p(graphicUtils$Dimension, "dimension");
                this.M = og5Var;
                break;
        }
    }
}
