package defpackage;

import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes.dex */
public final class av7 extends tt9 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av7(int i) {
        super(7);
        this.c = i;
        switch (i) {
            case 1:
                super(7);
                break;
            default:
                ((bv7) this.b).p = true;
                break;
        }
    }

    @Override // defpackage.tt9
    public tt9 h(TypedArray typedArray) {
        switch (this.c) {
            case 1:
                bv7 bv7Var = (bv7) this.b;
                super.h(typedArray);
                if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_base_color)) {
                    bv7Var.e = (typedArray.getColor(wt6.ShimmerFrameLayout_shimmer_base_color, bv7Var.e) & 16777215) | (bv7Var.e & (-16777216));
                }
                if (typedArray.hasValue(wt6.ShimmerFrameLayout_shimmer_highlight_color)) {
                    bv7Var.d = typedArray.getColor(wt6.ShimmerFrameLayout_shimmer_highlight_color, bv7Var.d);
                }
                return this;
            default:
                return super.h(typedArray);
        }
    }

    @Override // defpackage.tt9
    public final tt9 l() {
        int i = this.c;
        return this;
    }
}
