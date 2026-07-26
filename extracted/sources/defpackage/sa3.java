package defpackage;

import android.view.View;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class sa3 extends ua3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2, int i) {
        super(view, graphicUtils$Dimension, z);
        switch (i) {
            case 3:
                js3.p(graphicUtils$Dimension, "dimension");
                super(view, graphicUtils$Dimension, z);
                this.M = og5Var;
                this.N = og5Var2;
                break;
            case 4:
                js3.p(graphicUtils$Dimension, "dimension");
                super(view, graphicUtils$Dimension, z);
                this.M = og5Var;
                this.N = og5Var2;
                break;
            case 5:
                js3.p(graphicUtils$Dimension, "dimension");
                js3.p(og5Var, "onAppClickListener");
                js3.p(og5Var2, "onMultiAppClickListener");
                super(view, graphicUtils$Dimension, z);
                this.M = og5Var;
                this.N = og5Var2;
                break;
            case 6:
                js3.p(graphicUtils$Dimension, "dimension");
                super(view, graphicUtils$Dimension, z);
                this.M = og5Var;
                this.N = og5Var2;
                break;
            case 7:
                js3.p(graphicUtils$Dimension, "dimension");
                super(view, graphicUtils$Dimension, z);
                this.M = og5Var;
                this.N = og5Var2;
                break;
            default:
                js3.p(graphicUtils$Dimension, "dimension");
                this.M = og5Var;
                this.N = og5Var2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa3(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, int i) {
        super(view, graphicUtils$Dimension, z);
        switch (i) {
            case 1:
                js3.p(graphicUtils$Dimension, "dimension");
                js3.p(og5Var, "onDigestedAppClickListener");
                super(view, graphicUtils$Dimension, z);
                this.L = og5Var;
                break;
            default:
                js3.p(graphicUtils$Dimension, "dimension");
                this.L = og5Var;
                break;
        }
    }
}
