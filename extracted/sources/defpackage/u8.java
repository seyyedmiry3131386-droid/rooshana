package defpackage;

import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u8 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb5 b;

    public /* synthetic */ u8(wb5 wb5Var, int i) {
        this.a = i;
        this.b = wb5Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                p64 p64Var = (p64) obj;
                js3.p(p64Var, "$this$LifecycleStartEffect");
                wb5 wb5Var = this.b;
                gb6 gb6Var = (ExoPlayer) wb5Var.getValue();
                if (gb6Var != null) {
                    ((o80) gb6Var).K();
                }
                break;
            case 1:
                l64 l64Var = (l64) obj;
                js3.p(l64Var, "$this$LifecycleResumeEffect");
                wb5 wb5Var2 = this.b;
                gb6 gb6Var2 = (ExoPlayer) wb5Var2.getValue();
                if (gb6Var2 != null) {
                    ((o80) gb6Var2).K();
                }
                break;
            case 2:
                this.b.setValue((v04) obj);
                break;
            case 3:
                this.b.setValue((v04) obj);
                break;
            case 4:
                this.b.setValue((v04) obj);
                break;
            case 5:
                String str = (String) obj;
                js3.p(str, "it");
                this.b.setValue(str);
                break;
            case 6:
                View view = (View) obj;
                js3.p(view, "it");
                this.b.setValue(view);
                break;
            case 7:
                long j = ((zq3) obj).a;
                this.b.setValue(new ey7((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (j & 4294967295L))))));
                break;
            case 8:
                Float f = (Float) obj;
                f.getClass();
                break;
            case 9:
                ((dp2) this.b.getValue()).invoke((nr5) obj);
                break;
            default:
                this.b.setValue((v04) obj);
                break;
        }
        return tx8.a;
    }
}
